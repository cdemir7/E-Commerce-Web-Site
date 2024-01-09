package com.example.ecommercewebsite.business.dto.requests.create;

import com.example.ecommercewebsite.entities.enums.Status;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateCartRequest {
    @NotNull
    private int productId;

    @NotBlank
    @Length(min = 2, max = 30)
    private String name;

    @NotNull
    @Min(1)
    private double unitPrice;

    private String description;

    @NotBlank
    private Status status;
}

