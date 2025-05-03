package com.enigma.simple_strore_using_jwt.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal; // Gunakan BigDecimal untuk nilai uang/rate
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "m_tax")
public class Tax {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "rate", nullable = false, precision = 5, scale = 2)
    private BigDecimal rate;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @ManyToMany(mappedBy = "taxes", fetch = FetchType.LAZY)
    private List<Product> products;

}