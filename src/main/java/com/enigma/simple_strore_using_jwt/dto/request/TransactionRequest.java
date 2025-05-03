package com.enigma.simple_strore_using_jwt.dto.request;

import com.enigma.simple_strore_using_jwt.constant.OrderStatus;
import com.enigma.simple_strore_using_jwt.entity.Customer;
import com.enigma.simple_strore_using_jwt.entity.Staff;
import com.enigma.simple_strore_using_jwt.entity.TransactionDetail;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@Builder
public class TransactionRequest {

    @NotBlank(message = "customer ID is required")
    private String customerId;

    @NotBlank(message = "payment method is required")
    private String paymentMethod; // bisa beri nilai defaultnya NOTPAID

    @NotEmpty(message = "transaction must have at least one item")
    @NotNull
    private List<TransactionDetailRequest> items;
}
