package com.example.ecommercewebsite.business.concretes;

import com.example.ecommercewebsite.business.abstracts.CartService;
import com.example.ecommercewebsite.business.dto.requests.create.CreateCartRequest;
import com.example.ecommercewebsite.business.dto.requests.update.UpdateCartRequest;
import com.example.ecommercewebsite.business.dto.responses.create.CreateCartResponse;
import com.example.ecommercewebsite.business.dto.responses.get.GetAllCartsResponse;
import com.example.ecommercewebsite.business.dto.responses.update.UpdateCartResponse;
import com.example.ecommercewebsite.business.rules.CartBusinessRules;
import com.example.ecommercewebsite.entities.Cart;
import com.example.ecommercewebsite.repository.CartRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CartManager implements CartService {
    private final CartRepository repository;
    private final ModelMapper mapper;
    private final CartBusinessRules rules;

    @Override
    public List<GetAllCartsResponse> getAll() {
        List<Cart> carts = repository.findAll();
        List<GetAllCartsResponse> response = carts
                .stream()
                .map(cart -> mapper.map(cart, GetAllCartsResponse.class))
                .toList();

        return response;
    }

    @Override
    public CreateCartResponse add(CreateCartRequest request) {

        var cart = mapper.map(request, Cart.class);
        cart.setId(0);
        var createdCart = repository.save(cart);
        CreateCartResponse response = mapper.map(createdCart, CreateCartResponse.class);

        return response;
    }

    @Override
    public UpdateCartResponse update(int id, UpdateCartRequest request) {
        var cart = mapper.map(request, Cart.class);
        cart.setId(id);
        var updatedCart = repository.save(cart);
        UpdateCartResponse response = mapper.map(updatedCart, UpdateCartResponse.class);

        return response;
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
