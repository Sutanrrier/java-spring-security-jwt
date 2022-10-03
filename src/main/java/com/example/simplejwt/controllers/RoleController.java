package com.example.simplejwt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.simplejwt.entities.Role;
import com.example.simplejwt.services.RoleService;

@RestController
@RequestMapping(value = "/api/roles")
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@PostMapping
	public ResponseEntity<Role> salvarRole(@RequestBody Role role){
		return ResponseEntity.ok().body(roleService.salvarRole(role));
	}
	
}
