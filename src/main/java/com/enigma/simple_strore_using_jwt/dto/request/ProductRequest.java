package com.enigma.simple_strore_using_jwt.dto.request;

import com.enigma.simple_strore_using_jwt.entity.Tax;
import com.enigma.simple_strore_using_jwt.entity.TransactionDetail;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@Builder
public class ProductRequest {

    private String id;

    @NotBlank(message = "product name is required")
    private String name;

    private String description;

    @NotNull(message = "price is required")
    @DecimalMin(value = "0.0", inclusive = false, message = "price must be positive")
    private BigDecimal price;

    private List<String> taxes;
}
