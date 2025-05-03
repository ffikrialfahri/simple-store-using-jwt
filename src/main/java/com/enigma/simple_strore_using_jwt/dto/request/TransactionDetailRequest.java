package com.enigma.simple_strore_using_jwt.dto.request;

import com.enigma.simple_strore_using_jwt.entity.Product;
import com.enigma.simple_strore_using_jwt.entity.Transaction;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
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
public class TransactionDetailRequest {
    @NotBlank(message = "product ID is required")
    private String productId;

    @NotNull(message = "quantity is required")
    @Min(value = 1, message = "quantity must be at least 1")
    private Integer quantity;
}
