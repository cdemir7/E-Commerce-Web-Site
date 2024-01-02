package com.example.ecommercewebsite.business.dto.responses.create;

import com.example.ecommercewebsite.entities.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductResponse {
    private int id;
    private String name;
    private double unitPrice;
    private int quantity;
    private String description;
    private Status status;
}

