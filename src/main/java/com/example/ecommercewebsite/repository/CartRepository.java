package com.example.ecommercewebsite.repository;

import com.example.ecommercewebsite.business.dto.requests.create.CreateCartRequest;
import com.example.ecommercewebsite.entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CartRepository extends JpaRepository<Cart, Integer> {
    boolean existsByProductId(int id);
}
