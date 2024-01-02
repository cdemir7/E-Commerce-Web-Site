package com.example.ecommercewebsite.business.dto.responses.update;

import com.example.ecommercewebsite.entities.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductResponse {
    private int id;
    private String name;
    private double unitPrice;
    private int quantity;
    private String description;
    private Status status;
}
