package com.enigma.simple_strore_using_jwt.repository;

import com.enigma.simple_strore_using_jwt.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

}
