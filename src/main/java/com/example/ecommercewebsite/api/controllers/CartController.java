package com.example.ecommercewebsite.api.controllers;

import com.example.ecommercewebsite.business.abstracts.CartService;
import com.example.ecommercewebsite.business.dto.requests.create.CreateCartRequest;
import com.example.ecommercewebsite.business.dto.requests.update.UpdateCartRequest;
import com.example.ecommercewebsite.business.dto.responses.create.CreateCartResponse;
import com.example.ecommercewebsite.business.dto.responses.get.GetAllCartsResponse;
import com.example.ecommercewebsite.business.dto.responses.update.UpdateCartResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/carts")
public class CartController {
    private final CartService service;

    @GetMapping
    public List<GetAllCartsResponse> getAll(){
        return service.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateCartResponse add(@RequestBody CreateCartRequest request){
        return service.add(request);
    }

    @PutMapping("/{id}")
    public UpdateCartResponse update(@PathVariable int id, @RequestBody UpdateCartRequest request){
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        service.delete(id);
    }
}
