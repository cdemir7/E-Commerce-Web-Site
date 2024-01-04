package com.example.ecommercewebsite.repository;

import com.example.ecommercewebsite.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    boolean existsCategoryByNameIgnoreCase(String name);
}
