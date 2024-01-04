package com.example.ecommercewebsite.repository;

import com.example.ecommercewebsite.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    boolean existsProductByNameIgnoreCase(String name);
}
