package com.enigma.simple_strore_using_jwt.dto.response;

import com.enigma.simple_strore_using_jwt.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@Builder
public class TaxResponse {
    private String id;
    private String name;
    private BigDecimal rate;
    private String description;
}
