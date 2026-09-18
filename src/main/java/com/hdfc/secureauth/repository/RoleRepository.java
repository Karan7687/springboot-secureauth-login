package com.hdfc.secureauth.repository;

import com.hdfc.secureauth.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(String name);
}

/*
 -RoleRepository is used to perform the database operations on Roles table and Long is primary key in Roles table
 -JpaRepository is provided by spring and has save(), findAll(),findById(1)
*/