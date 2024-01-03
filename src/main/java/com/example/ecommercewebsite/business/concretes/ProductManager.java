package com.example.ecommercewebsite.business.concretes;

import com.example.ecommercewebsite.business.abstracts.ProductService;
import com.example.ecommercewebsite.business.dto.requests.create.CreateProductRequest;
import com.example.ecommercewebsite.business.dto.requests.update.UpdateProductRequest;
import com.example.ecommercewebsite.business.dto.responses.create.CreateProductResponse;
import com.example.ecommercewebsite.business.dto.responses.get.GetAllProductsResponse;
import com.example.ecommercewebsite.business.dto.responses.get.GetProductResponse;
import com.example.ecommercewebsite.business.dto.responses.update.UpdateProductResponse;
import com.example.ecommercewebsite.entities.Product;
import com.example.ecommercewebsite.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductManager implements ProductService {
    private final ProductRepository repository;
    private final ModelMapper mapper;
    @Override
    public List<GetAllProductsResponse> getAll() {
        List<Product>products =repository.findAll();
        List<GetAllProductsResponse> response = products
                .stream()
                .map(product -> mapper.map(product, GetAllProductsResponse.class))
                .toList();

        return response;
    }

    @Override
    public GetProductResponse getById(int id) {
        var product = repository.findById(id).orElseThrow();
        GetProductResponse response = mapper.map(product, GetProductResponse.class);

        return response;
    }

    @Override
    public CreateProductResponse add(CreateProductRequest request) {
        var product = mapper.map(request, Product.class);
        product.setId(0);
        var createdProduct = repository.save(product);

        CreateProductResponse response = mapper.map(createdProduct, CreateProductResponse.class);

        return response;
    }

    @Override
    public UpdateProductResponse update(int id, UpdateProductRequest request) {
        var product = mapper.map(request, Product.class);
        product.setId(id);
        var updatedProduct = repository.save(product);
        UpdateProductResponse response = mapper.map(updatedProduct, UpdateProductResponse.class);

        return response;
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
