package com.example.ecommercewebsite.business.rules;

import com.example.ecommercewebsite.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductBusinessRules {
    private final ProductRepository repository;

    public void checkIfProductExistsById(int id){
        if (!repository.existsById(id)){
            throw new RuntimeException("PRODUCT_NOT_EXISTS");
        }
    }

    public void checkIfProductExistsByName(String name){
        if (repository.existsProductByNameIgnoreCase(name)){
            throw new RuntimeException("PRODUCT_ALREADY_EXISTS");
        }
    }
}
