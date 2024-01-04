package com.example.ecommercewebsite.business.rules;

import com.example.ecommercewebsite.repository.CartRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CartBusinessRules {
    private final CartRepository repository;
}
