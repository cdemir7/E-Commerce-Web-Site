package com.example.ecommercewebsite.business.rules;

import com.example.ecommercewebsite.business.dto.requests.create.CreatePaymentRequest;
import com.example.ecommercewebsite.repository.CartRepository;
import com.example.ecommercewebsite.repository.PaymentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PaymentBusinessRules {
    private final PaymentRepository paymentRepository;

    public void checkIfCart(CreatePaymentRequest request){
        if (request.getBalance() < request.getUnitPrice()){
            throw new RuntimeException("Bakiye Yetersiz.");
        }
    }
}
