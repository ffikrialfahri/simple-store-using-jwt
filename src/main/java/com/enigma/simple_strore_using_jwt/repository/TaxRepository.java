package com.enigma.simple_strore_using_jwt.repository;

import com.enigma.simple_strore_using_jwt.entity.Tax;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaxRepository extends JpaRepository<Tax, String> {
    Optional<Tax> findByNameIgnoreCase(String name);
}
