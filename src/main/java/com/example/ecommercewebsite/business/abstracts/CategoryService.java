package com.example.ecommercewebsite.business.abstracts;

import com.example.ecommercewebsite.business.dto.requests.create.CreateCategoryRequest;
import com.example.ecommercewebsite.business.dto.requests.update.UpdateCategoryRequest;
import com.example.ecommercewebsite.business.dto.responses.create.CreateCategoryResponse;
import com.example.ecommercewebsite.business.dto.responses.get.GetAllCategoriesResponse;
import com.example.ecommercewebsite.business.dto.responses.get.GetCategoryResponse;
import com.example.ecommercewebsite.business.dto.responses.update.UpdateCategoryResponse;

import java.util.List;

public interface CategoryService {
    List<GetAllCategoriesResponse> getAll();
    GetCategoryResponse getById(int id);
    CreateCategoryResponse add(CreateCategoryRequest request);
    UpdateCategoryResponse update(int id, UpdateCategoryRequest request);
    void delete(int id);
}
