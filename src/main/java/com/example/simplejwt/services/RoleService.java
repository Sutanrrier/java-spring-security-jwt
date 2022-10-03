package com.example.simplejwt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.simplejwt.entities.Role;
import com.example.simplejwt.repositories.RoleRepository;

@Service
public class RoleService {

	@Autowired
	private RoleRepository roleRepository;
	
	public Role salvarRole(Role role) {
		return roleRepository.save(role);
	}
}
