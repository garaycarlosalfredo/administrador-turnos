package com.garay.backend.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.security.PermitAll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.garay.backend.model.Usuario;
import com.garay.backend.service.UsuarioService;

@RestController

@RequestMapping("/usuarios")
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;
	

	
	@GetMapping()
	public List<Usuario> obtenerPartes(){		
		return usuarioService.obtenerUsuarios();
	}	
	
	@PostMapping()
	public Usuario guardarUsuario(@RequestBody Usuario usuario) {
		return this.usuarioService.guardarUsuario(usuario);
	}
	
	@PutMapping()
	public Usuario actualizarUsuario(@RequestBody Usuario usuario) {
		return this.usuarioService.actualizarUsuario(usuario);
	}
	
	@DeleteMapping( path = "/{id}") 
	public String eliminarUsuarioPorId(@PathVariable("id") Integer id) {
		boolean ok = this.usuarioService.eliminarUsuarioPorId(id);
		if(ok) {
			return "Se eliminó correctamente con id = " + id;
		}else {
			return "No se pudo eliminar correctamente con id = " + id;
		}
	}
	
}
