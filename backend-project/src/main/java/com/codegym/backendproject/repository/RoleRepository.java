package com.codegym.backendproject.repository;

import java.util.Optional;

import com.codegym.backendproject.model.Role;
import com.codegym.backendproject.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}