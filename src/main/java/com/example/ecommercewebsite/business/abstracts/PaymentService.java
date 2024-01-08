package com.example.ecommercewebsite.business.abstracts;

import com.example.ecommercewebsite.business.dto.requests.create.CreatePaymentRequest;
import com.example.ecommercewebsite.business.dto.requests.update.UpdatePaymentRequest;
import com.example.ecommercewebsite.business.dto.responses.create.CreatePaymentResponse;
import com.example.ecommercewebsite.business.dto.responses.get.GetAllPaymentsResponse;
import com.example.ecommercewebsite.business.dto.responses.get.GetPaymentResponse;
import com.example.ecommercewebsite.business.dto.responses.update.UpdatePaymentResponse;

import java.util.List;

public interface PaymentService {
    List<GetAllPaymentsResponse> getAll();
    GetPaymentResponse getById(int id);
    CreatePaymentResponse add(CreatePaymentRequest request);
    UpdatePaymentResponse update(int id, UpdatePaymentRequest request);
    void delete(int id);
}
