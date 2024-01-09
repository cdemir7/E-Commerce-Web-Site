package com.example.ecommercewebsite.business.dto.requests.update;

import com.example.ecommercewebsite.entities.enums.Status;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductRequest {
    @NotBlank
    private String name;

    @NotNull
    @Min(1)
    private double unitPrice;

    @NotNull
    @Min(0)
    private int quantity;
    private String description;
    private Status status;
}
