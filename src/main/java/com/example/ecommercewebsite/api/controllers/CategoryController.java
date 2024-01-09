package com.example.ecommercewebsite.api.controllers;

import com.example.ecommercewebsite.business.abstracts.CategoryService;
import com.example.ecommercewebsite.business.dto.requests.create.CreateCategoryRequest;
import com.example.ecommercewebsite.business.dto.requests.update.UpdateCategoryRequest;
import com.example.ecommercewebsite.business.dto.responses.create.CreateCategoryResponse;
import com.example.ecommercewebsite.business.dto.responses.get.GetAllCategoriesResponse;
import com.example.ecommercewebsite.business.dto.responses.get.GetCategoryResponse;
import com.example.ecommercewebsite.business.dto.responses.update.UpdateCategoryResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/categories")
public class CategoryController {
    private final CategoryService service;

    @GetMapping
    public List<GetAllCategoriesResponse> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public GetCategoryResponse getById(@PathVariable int id){
        return service.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateCategoryResponse add(@Valid @RequestBody CreateCategoryRequest request){
        return service.add(request);
    }

    @PutMapping("/{id}")
    public UpdateCategoryResponse update(@PathVariable int id, @Valid @RequestBody UpdateCategoryRequest request){
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        service.delete(id);
    }
}
