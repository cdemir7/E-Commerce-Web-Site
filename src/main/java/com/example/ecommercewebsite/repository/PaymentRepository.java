package com.example.ecommercewebsite.repository;

import com.example.ecommercewebsite.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
    boolean existsByCartId(int id);
}
