package com.enigma.simple_strore_using_jwt.dto.response;

import com.enigma.simple_strore_using_jwt.entity.Transaction;
import com.enigma.simple_strore_using_jwt.entity.User;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@Builder
public class CustomerResponse {
    private String id;
    private String name;
    private String phone;
    private LocalDate birthdate;
    private String birthplace;
    private String address;
    private String username;
    private String email;
    private String createdBy;
    private String updatedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
