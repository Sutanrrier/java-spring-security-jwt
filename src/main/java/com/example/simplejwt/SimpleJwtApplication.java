package com.example.simplejwt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.simplejwt.entities.Role;
import com.example.simplejwt.entities.Usuario;
import com.example.simplejwt.services.RoleService;
import com.example.simplejwt.services.UsuarioService;

@SpringBootApplication
public class SimpleJwtApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SimpleJwtApplication.class, args);
		
		System.out.println("Teste Jenkins");
	}

	@Bean
	CommandLineRunner run(UsuarioService usuarioService, RoleService roleService) {
		return args -> {
			Role role1 = new Role(null, "ROLE_USER");
			Role role2 = new Role(null, "ROLE_ADMIN");
			roleService.salvarRole(role1);
			roleService.salvarRole(role2);
			
			List<Role> lista1 = new ArrayList<>();
			lista1.add(role1);
			usuarioService.salvarUsuario(new Usuario(null, "dani", "0000", lista1));
			
			List<Role> lista2 = new ArrayList<>();
			lista2.add(role2);
			usuarioService.salvarUsuario(new Usuario(null, "pablo", "1234", lista2));
		};
	}
}
