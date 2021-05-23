package com.administrador.turnos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.administrador.turnos.entity.Rol;
import com.administrador.turnos.repository.RolRepository;

@Service
public class RolService {
	@Autowired
	RolRepository rolRepository;

	public List<Rol> obtenerRoles(){
		return (List<Rol>) rolRepository.findAll();
	}
}
