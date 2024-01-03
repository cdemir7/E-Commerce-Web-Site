package com.example.ecommercewebsite.api.controllers;

import com.example.ecommercewebsite.business.abstracts.ProductService;
import com.example.ecommercewebsite.business.dto.requests.create.CreateProductRequest;
import com.example.ecommercewebsite.business.dto.requests.update.UpdateProductRequest;
import com.example.ecommercewebsite.business.dto.responses.create.CreateProductResponse;
import com.example.ecommercewebsite.business.dto.responses.get.GetAllProductsResponse;
import com.example.ecommercewebsite.business.dto.responses.get.GetProductResponse;
import com.example.ecommercewebsite.business.dto.responses.update.UpdateProductResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/products")
public class ProductController {
    private final ProductService service;

    @GetMapping
    public List<GetAllProductsResponse> getAll(){
        return service.getAll();
    }

    @GetMapping("{id}")
    public GetProductResponse getById(@PathVariable int id){
        return service.getById(id);
    }

    @PostMapping
    public CreateProductResponse add(CreateProductRequest request){
        return service.add(request);
    }

    @PutMapping("{id}")
    public UpdateProductResponse update(@PathVariable int id, UpdateProductRequest request){
        return service.update(id, request);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        service.delete(id);
    }
}
