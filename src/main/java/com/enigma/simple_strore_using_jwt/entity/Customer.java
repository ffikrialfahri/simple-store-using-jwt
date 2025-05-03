package com.enigma.simple_strore_using_jwt.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.Date;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String phone;
    @Column(nullable = false)
    private Date birthdate;
    @Column(nullable = false)
    private String birthplace;
    @Column(columnDefinition = "TEXT")
    private String address;
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private String createdBy;
    @Column(nullable = false)
    private String updatedBy;
    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime createdAt;
    @Column(nullable = false)
    private LocalDateTime updatedAt;
}
