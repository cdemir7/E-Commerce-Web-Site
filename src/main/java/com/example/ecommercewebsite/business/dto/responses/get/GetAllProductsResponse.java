package com.example.ecommercewebsite.business.dto.responses.get;

import com.example.ecommercewebsite.entities.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProductsResponse {
    private int id;
    private String name;
    private double unitPrice;
    private int quantity;
    private String description;
    private Status status;
}
