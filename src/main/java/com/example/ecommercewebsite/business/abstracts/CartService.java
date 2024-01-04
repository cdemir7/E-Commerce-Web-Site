package com.example.ecommercewebsite.business.abstracts;

import com.example.ecommercewebsite.business.dto.requests.create.CreateCartRequest;
import com.example.ecommercewebsite.business.dto.requests.update.UpdateCartRequest;
import com.example.ecommercewebsite.business.dto.responses.create.CreateCartResponse;
import com.example.ecommercewebsite.business.dto.responses.get.GetAllCartsResponse;
import com.example.ecommercewebsite.business.dto.responses.update.UpdateCartResponse;

import java.util.List;

public interface CartService {
    List<GetAllCartsResponse> getAll();
    CreateCartResponse add(CreateCartRequest request);
    UpdateCartResponse update(int id, UpdateCartRequest request);
    void delete(int id);
}
