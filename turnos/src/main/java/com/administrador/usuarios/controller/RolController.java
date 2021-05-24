package com.administrador.usuarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.administrador.usuarios.entity.Rol;
import com.administrador.usuarios.service.RolService;

@RestController

@RequestMapping("/roles")
public class RolController {
	@Autowired
	RolService rolService;
	
	@GetMapping
	public List<Rol> obtenerRoles(){
		return rolService.obtenerRoles();
	}

}
