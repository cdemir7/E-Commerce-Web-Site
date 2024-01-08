package com.example.ecommercewebsite.business.concretes;

import com.example.ecommercewebsite.business.abstracts.PaymentService;
import com.example.ecommercewebsite.business.dto.requests.create.CreatePaymentRequest;
import com.example.ecommercewebsite.business.dto.requests.update.UpdatePaymentRequest;
import com.example.ecommercewebsite.business.dto.responses.create.CreatePaymentResponse;
import com.example.ecommercewebsite.business.dto.responses.get.GetAllPaymentsResponse;
import com.example.ecommercewebsite.business.dto.responses.get.GetPaymentResponse;
import com.example.ecommercewebsite.business.dto.responses.update.UpdatePaymentResponse;
import com.example.ecommercewebsite.entities.Payment;
import com.example.ecommercewebsite.repository.PaymentRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PaymentManager implements PaymentService {
    private final PaymentRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<GetAllPaymentsResponse> getAll() {
        List<Payment> payments = repository.findAll();
        List<GetAllPaymentsResponse> response = payments
                .stream()
                .map(payment -> mapper.map(payment, GetAllPaymentsResponse.class))
                .toList();

        return response;
    }

    @Override
    public GetPaymentResponse getById(int id) {
        var payment = repository.findById(id).orElseThrow();
        GetPaymentResponse response = mapper.map(payment, GetPaymentResponse.class);

        return response;
    }

    @Override
    public CreatePaymentResponse add(CreatePaymentRequest request) {
        var payment = mapper.map(request, Payment.class);
        payment.setId(0);
        payment.setBalance(availableBalanceCreate(request));
        var createdPayment = repository.save(payment);
        CreatePaymentResponse response = mapper.map(createdPayment, CreatePaymentResponse.class);

        return response;
    }

    @Override
    public UpdatePaymentResponse update(int id, UpdatePaymentRequest request) {
        var payment = mapper.map(request, Payment.class);
        payment.setId(id);
        payment.setBalance(availableBalanceUpdate(request));
        var updatedPayment = repository.save(payment);
        UpdatePaymentResponse response = mapper.map(updatedPayment, UpdatePaymentResponse.class);

        return response;
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }



    //
    public double availableBalanceCreate(CreatePaymentRequest request){
        double result = request.getBalance() - request.getUnitPrice();
        return result;
    }
    public double availableBalanceUpdate(UpdatePaymentRequest request){
        double result = request.getBalance() - request.getUnitPrice();
        return result;
    }
}
