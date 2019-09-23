package com.david.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
