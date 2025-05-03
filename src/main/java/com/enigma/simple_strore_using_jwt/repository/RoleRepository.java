package com.enigma.simple_strore_using_jwt.repository;

import com.enigma.simple_strore_using_jwt.constant.UserRole;
import com.enigma.simple_strore_using_jwt.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
    Optional<Role> findByRole (UserRole role);
}
