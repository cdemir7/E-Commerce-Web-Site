package com.example.ecommercewebsite.business.concretes;

import com.example.ecommercewebsite.business.abstracts.ProductService;
import com.example.ecommercewebsite.business.dto.requests.create.CreateProductRequest;
import com.example.ecommercewebsite.business.dto.requests.update.UpdateProductRequest;
import com.example.ecommercewebsite.business.dto.responses.create.CreateProductResponse;
import com.example.ecommercewebsite.business.dto.responses.get.GetAllProductsResponse;
import com.example.ecommercewebsite.business.dto.responses.get.GetProductResponse;
import com.example.ecommercewebsite.business.dto.responses.update.UpdateProductResponse;
import com.example.ecommercewebsite.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductManager implements ProductService {
    private final ProductRepository repository;
    @Override
    public List<GetAllProductsResponse> getAll() {
        return null;
    }

    @Override
    public GetProductResponse getById(int id) {
        return null;
    }

    @Override
    public CreateProductResponse add(CreateProductRequest request) {
        return null;
    }

    @Override
    public UpdateProductResponse update(int id, UpdateProductRequest request) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
