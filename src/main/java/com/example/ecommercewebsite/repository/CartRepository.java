package com.example.ecommercewebsite.repository;

import com.example.ecommercewebsite.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Integer> {
    boolean existsProductById(int id);
}
