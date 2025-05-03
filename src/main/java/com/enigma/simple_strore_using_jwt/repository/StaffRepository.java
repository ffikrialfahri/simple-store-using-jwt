package com.enigma.simple_strore_using_jwt.repository;

import com.enigma.simple_strore_using_jwt.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, String> {

}
