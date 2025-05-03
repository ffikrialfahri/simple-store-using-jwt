package com.enigma.simple_strore_using_jwt.dto.response;

import com.enigma.simple_strore_using_jwt.entity.Transaction;
import com.enigma.simple_strore_using_jwt.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@Builder
public class StaffResponse {
    private String id;
    private String position;
    private String username;
    private String email;
}
