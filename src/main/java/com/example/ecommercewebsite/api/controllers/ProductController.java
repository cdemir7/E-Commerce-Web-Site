package com.example.ecommercewebsite.api.controllers;

import com.example.ecommercewebsite.business.abstracts.ProductService;
import com.example.ecommercewebsite.business.dto.requests.create.CreateProductRequest;
import com.example.ecommercewebsite.business.dto.requests.update.UpdateProductRequest;
import com.example.ecommercewebsite.business.dto.responses.create.CreateProductResponse;
import com.example.ecommercewebsite.business.dto.responses.get.GetAllProductsResponse;
import com.example.ecommercewebsite.business.dto.responses.get.GetProductResponse;
import com.example.ecommercewebsite.business.dto.responses.update.UpdateProductResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
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
    @ResponseStatus(HttpStatus.CREATED)
    public CreateProductResponse add(@Valid @RequestBody CreateProductRequest request){
        return service.add(request);
    }

    @PutMapping("{id}")
    public UpdateProductResponse update(@PathVariable int id, @Valid @RequestBody UpdateProductRequest request){
        return service.update(id, request);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        service.delete(id);
    }
}
