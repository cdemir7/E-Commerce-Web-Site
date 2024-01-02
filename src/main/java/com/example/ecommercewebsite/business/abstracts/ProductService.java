package com.example.ecommercewebsite.business.abstracts;

import com.example.ecommercewebsite.business.dto.requests.create.CreateProductRequest;
import com.example.ecommercewebsite.business.dto.requests.update.UpdateProductRequest;
import com.example.ecommercewebsite.business.dto.responses.create.CreateProductResponse;
import com.example.ecommercewebsite.business.dto.responses.get.GetAllProductsResponse;
import com.example.ecommercewebsite.business.dto.responses.get.GetProductResponse;
import com.example.ecommercewebsite.business.dto.responses.update.UpdateProductResponse;

import java.util.List;

public interface ProductService {
    List<GetAllProductsResponse> getAll();
    GetProductResponse getById(int id);
    CreateProductResponse add(CreateProductRequest request);
    UpdateProductResponse update(int id, UpdateProductRequest request);
    void delete(int id);
}
