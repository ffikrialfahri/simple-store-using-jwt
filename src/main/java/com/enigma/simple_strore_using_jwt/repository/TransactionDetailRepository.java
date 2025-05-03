package com.enigma.simple_strore_using_jwt.repository;

import com.enigma.simple_strore_using_jwt.entity.TransactionDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionDetailRepository extends JpaRepository<TransactionDetail, String> {
    List<TransactionDetail> findByProductId(String productId);
}
