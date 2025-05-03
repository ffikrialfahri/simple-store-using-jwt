package com.enigma.simple_strore_using_jwt.dto.response;

import com.enigma.simple_strore_using_jwt.entity.Tax;
import com.enigma.simple_strore_using_jwt.entity.TransactionDetail;
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
public class ProductResponse {
    private String id;
    private String name;
    private String description;
    private BigDecimal price; // Harga sebelum pajak

    private List<TaxResponse> taxes;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
