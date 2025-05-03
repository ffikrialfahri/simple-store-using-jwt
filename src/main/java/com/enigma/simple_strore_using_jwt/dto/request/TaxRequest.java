package com.enigma.simple_strore_using_jwt.dto.request;

import com.enigma.simple_strore_using_jwt.entity.Product;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@Builder
public class TaxRequest {
    private String id;

    @NotBlank(message = "tax name is required")
    private String name;

    @NotNull(message = "tax rate is required")
    @DecimalMin(value = "0.0", inclusive = true, message = "tax rate cannot be negative")
    @DecimalMax(value = "1.0", inclusive = true, message = "tax rate cannot exceed 1.0 (100%)")
    private BigDecimal rate;

    private String description;
}
