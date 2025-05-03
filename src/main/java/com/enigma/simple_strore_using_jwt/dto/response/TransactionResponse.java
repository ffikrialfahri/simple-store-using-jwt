package com.enigma.simple_strore_using_jwt.dto.response;

import com.enigma.simple_strore_using_jwt.constant.OrderStatus;
import com.enigma.simple_strore_using_jwt.entity.Customer;
import com.enigma.simple_strore_using_jwt.entity.Staff;
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
public class TransactionResponse {
    private String id;
    private LocalDateTime transactionTime;
    private BigDecimal netAmount; // Total sebelum pajak
    private BigDecimal totalTax; // Total pajak
    private BigDecimal totalAmount; // Total sesudah pajak
    private OrderStatus paymentStatus;
    private String paymentMethod;

    private List<TransactionDetailResponse> transactionDetails;
    private CustomerResponse customer;
    private StaffResponse staff;
}
