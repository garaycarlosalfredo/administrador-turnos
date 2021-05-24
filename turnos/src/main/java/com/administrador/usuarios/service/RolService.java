package com.administrador.usuarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.administrador.usuarios.entity.Rol;
import com.administrador.usuarios.repository.RolRepository;

@Service
public class RolService {
	@Autowired
	RolRepository rolRepository;

	public List<Rol> obtenerRoles(){
		return (List<Rol>) rolRepository.findAll();
	}
}
