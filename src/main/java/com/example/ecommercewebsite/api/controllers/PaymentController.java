package com.example.ecommercewebsite.api.controllers;

import com.example.ecommercewebsite.business.abstracts.PaymentService;
import com.example.ecommercewebsite.business.dto.requests.create.CreatePaymentRequest;
import com.example.ecommercewebsite.business.dto.requests.update.UpdatePaymentRequest;
import com.example.ecommercewebsite.business.dto.responses.create.CreatePaymentResponse;
import com.example.ecommercewebsite.business.dto.responses.get.GetAllPaymentsResponse;
import com.example.ecommercewebsite.business.dto.responses.get.GetPaymentResponse;
import com.example.ecommercewebsite.business.dto.responses.update.UpdatePaymentResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/payments")
public class PaymentController {
    private final PaymentService service;

    @GetMapping
    public List<GetAllPaymentsResponse> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public GetPaymentResponse getById(@PathVariable int id){
        return service.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreatePaymentResponse add(@RequestBody CreatePaymentRequest request){
        return service.add(request);
    }

    @PutMapping("/{id}")
    public UpdatePaymentResponse update(@PathVariable int id, @RequestBody UpdatePaymentRequest request){
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        service.delete(id);
    }
}
