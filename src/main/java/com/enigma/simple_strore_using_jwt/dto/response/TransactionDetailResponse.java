package com.enigma.simple_strore_using_jwt.dto.response;

import com.enigma.simple_strore_using_jwt.entity.Product;
import com.enigma.simple_strore_using_jwt.entity.Transaction;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@Builder
public class TransactionDetailResponse {
    private String id;

    private ProductResponse product;
    private Integer quantity;
    private BigDecimal pricePerUnit;
    private BigDecimal taxPerUnit;
    private BigDecimal totalPrice; // Total item ini (qty * (price + tax))

}
