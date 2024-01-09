package com.example.ecommercewebsite.business.rules;

import com.example.ecommercewebsite.business.dto.requests.create.CreateCartRequest;
import com.example.ecommercewebsite.repository.CartRepository;
import com.example.ecommercewebsite.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CartBusinessRules {
    private final CartRepository cartRepository;
    private final ProductRepository productRepository;

    public void checkIfProduct(CreateCartRequest request){
        if (!productRepository.existsById(request.getProductId())){
            throw new RuntimeException("Böyle bir ürün yok.");
        }
    }

}
