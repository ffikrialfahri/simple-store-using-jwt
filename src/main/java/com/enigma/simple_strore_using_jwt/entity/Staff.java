package com.enigma.simple_strore_using_jwt.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "m_staff")
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id", unique = true)
    private User user;

    @OneToMany(mappedBy = "staff", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Transaction> transactions;

    @Column(name = "position")
    private String position;
}
