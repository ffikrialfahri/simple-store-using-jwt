package com.enigma.simple_strore_using_jwt.dto.response;

import com.enigma.simple_strore_using_jwt.entity.Role;

import java.util.List;

public class LoginResponse {
    private String username;
    private String email;
    private List<String> roles;
    private String token;
    private Boolean isActive;
}
