package com.david.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.auth.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
