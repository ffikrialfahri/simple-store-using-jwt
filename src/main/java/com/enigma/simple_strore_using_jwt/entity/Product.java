package com.enigma.simple_strore_using_jwt.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "nama", nullable = false)
    private String nama;
    @Column(name = "deskripsi", columnDefinition = "TEXT")
    private String deskripsi;
    @Column(name = "price", nullable = false)
    private Double price;

}
