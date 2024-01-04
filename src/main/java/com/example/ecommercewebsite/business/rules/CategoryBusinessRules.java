package com.example.ecommercewebsite.business.rules;

import com.example.ecommercewebsite.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryBusinessRules {
    private final CategoryRepository repository;

    public void checkIfCategoryExistsById(int id){
        if (!repository.existsById(id)){
            throw new RuntimeException("CATEGORY_NOT_EXISTS");
        }
    }

    public void checkIfCategoryExistsByName(String name){
        if (repository.existsCategoryByNameIgnoreCase(name)){
            throw new RuntimeException("CATEGORY_ALREADY_EXISTS");
        }
    }
}
