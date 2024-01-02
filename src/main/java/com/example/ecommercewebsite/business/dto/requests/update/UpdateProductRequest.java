package com.example.ecommercewebsite.business.dto.requests.update;

import com.example.ecommercewebsite.entities.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductRequest {
    private String name;
    private double unitPrice;
    private int quantity;
    private String description;
    private Status status;
}
