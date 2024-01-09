package com.example.ecommercewebsite.business.dto.requests.update;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePaymentRequest {
    @NotNull
    private int cartId;

    @NotNull
    @Min(1)
    private double unitPrice;

    @NotBlank
    @Pattern(regexp = "^(\\d{4}\\s){3}\\d{4}$")
    private String cardNumber;

    @NotBlank
    private String cardHolder;

    @NotNull
    @Min(2013)
    private int cardExpirationYear;

    @NotNull
    @Min(1)
    @Max(12)
    private int cardExpirationMonth;

    @NotBlank
    @Pattern(regexp = "^[1-9]\\d{2}$")
    private String cardCvv;

    @NotNull
    @Min(0)
    private double balance;
}
