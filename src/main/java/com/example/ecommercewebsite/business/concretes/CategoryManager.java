package com.example.ecommercewebsite.business.concretes;

import com.example.ecommercewebsite.business.abstracts.CategoryService;
import com.example.ecommercewebsite.business.dto.requests.create.CreateCategoryRequest;
import com.example.ecommercewebsite.business.dto.requests.update.UpdateCategoryRequest;
import com.example.ecommercewebsite.business.dto.responses.create.CreateCategoryResponse;
import com.example.ecommercewebsite.business.dto.responses.get.GetAllCategoriesResponse;
import com.example.ecommercewebsite.business.dto.responses.get.GetCategoryResponse;
import com.example.ecommercewebsite.business.dto.responses.update.UpdateCategoryResponse;
import com.example.ecommercewebsite.entities.Category;
import com.example.ecommercewebsite.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryManager implements CategoryService {
    private final CategoryRepository repository;
    private final ModelMapper mapper;
    @Override
    public List<GetAllCategoriesResponse> getAll() {
        List<Category> categories = repository.findAll();
        List<GetAllCategoriesResponse> response = categories
                .stream()
                .map(category -> mapper.map(category, GetAllCategoriesResponse.class))
                .toList();

        return response;
    }

    @Override
    public GetCategoryResponse getById(int id) {
        var category = repository.findById(id).orElseThrow();
        GetCategoryResponse response = mapper.map(category, GetCategoryResponse.class);

        return response;
    }

    @Override
    public CreateCategoryResponse add(CreateCategoryRequest request) {
        var category = mapper.map(request, Category.class);
        category.setId(0);
        var createdCategory = repository.save(category);
        CreateCategoryResponse response = mapper.map(createdCategory, CreateCategoryResponse.class);

        return response;
    }

    @Override
    public UpdateCategoryResponse update(int id, UpdateCategoryRequest request) {
        var category = mapper.map(request, Category.class);
        category.setId(id);
        var updatedCategory = repository.save(category);
        UpdateCategoryResponse response = mapper.map(updatedCategory, UpdateCategoryResponse.class);

        return response;
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
