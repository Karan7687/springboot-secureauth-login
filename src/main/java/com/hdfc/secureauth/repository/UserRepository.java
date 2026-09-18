package com.hdfc.secureauth.repository;

import com.hdfc.secureauth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);

    boolean existsByUsername(String username);

    Optional<User> findByEmail();

    Optional<User> findByUsername();

    // if found Optional contains the user , if not found Optional becomes empty()
    /*
    existsByEmail() for duplicate email checks.

    existsByUsername() for duplicate username checks.

    findByUsername() for user login in Assignment 2.

    findByEmail() for admin login in Assignment 2.
     */
}


