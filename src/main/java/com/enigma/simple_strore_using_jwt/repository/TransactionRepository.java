package com.enigma.simple_strore_using_jwt.repository;

import com.enigma.simple_strore_using_jwt.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TransactionRepository extends JpaRepository<Transaction, Long>, JpaSpecificationExecutor
        <Transaction> {

}
