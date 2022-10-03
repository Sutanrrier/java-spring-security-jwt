package com.example.simplejwt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.simplejwt.entities.Usuario;
import com.example.simplejwt.services.UsuarioService;

@RestController
@RequestMapping(value = "/api/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping
	public ResponseEntity<Usuario> salvarUsuario(@RequestBody Usuario usuario){
		return ResponseEntity.ok().body(usuarioService.salvarUsuario(usuario));
	}
	
	@GetMapping(value = "/listar")
	public ResponseEntity<List<Usuario>> listarUsuarios(){
		return ResponseEntity.ok().body(usuarioService.listarUsuarios());
	}
	
	@GetMapping(value = "/admin")
	public ResponseEntity<String> endPointAdmin(){
		return ResponseEntity.ok().body("Você acessou um endpoint de admin");
	}
}
