package com.example.simplejwt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.simplejwt.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}