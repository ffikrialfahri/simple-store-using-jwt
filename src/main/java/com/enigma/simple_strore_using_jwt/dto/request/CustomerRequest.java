package com.enigma.simple_strore_using_jwt.dto.request;

import com.enigma.simple_strore_using_jwt.entity.Transaction;
import com.enigma.simple_strore_using_jwt.entity.User;
import jakarta.validation.constraints.*;
import lombok.*;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@Builder
public class CustomerRequest {
    @NotBlank(message = "customer name is required")
    private String name;

    @NotBlank(message = "phone number is required")
    private String phone;

    @NotNull(message = "birthdate is required")
    @Past(message = "birthdate must be in the past")
    private LocalDate birthdate;

    @NotBlank(message = "birthplace is required")
    private String birthplace;

    @NotBlank(message = "username is required")
    private String username;

    @NotBlank(message = "email is required")
    @Email(message = "invalid email format")
    private String email;

    @NotBlank(message = "password is required")
    @Size(min = 6, message = "password must be at least 6 characters")
    private String password;
}
