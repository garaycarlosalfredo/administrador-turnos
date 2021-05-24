package com.administrador.turnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.administrador.turnos.entity.Paciente;
import com.administrador.turnos.repository.PacienteRepository;

@Service
public class PacienteService {
	@Autowired
	PacienteRepository pacienteRepository; 
	
	public List<Paciente> obtenerPacientes(){
		return (List<Paciente>) pacienteRepository.findAll();
	}
	
	public Paciente agregarPaciente(Paciente paciente) {
		return pacienteRepository.save(paciente);
	}
	
	public Paciente actualizarPaciente(Paciente paciente) {
		return pacienteRepository.save(paciente);
	}
	
	public Boolean eliminarPacientePorId(Integer id) {
		try {
			pacienteRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Optional<Paciente> obtenerPacientePorDni(Integer dni) {
		return pacienteRepository.findByDni(dni);
	}
	
	public List<Paciente> obtenerPacientePorApellido(String apellido) {
		return (List<Paciente>) pacienteRepository.findByApellido(apellido);
	}
}
