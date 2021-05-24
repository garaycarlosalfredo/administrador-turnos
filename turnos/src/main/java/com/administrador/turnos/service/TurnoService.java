package com.administrador.turnos.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.administrador.turnos.entity.Turno;
import com.administrador.turnos.repository.TurnoRepository;

@Service
public class TurnoService {
	@Autowired
	TurnoRepository turnoRepository;
	

	//[Crud]
	public List<Turno> obtenerTurnos(){
		return (List<Turno>) turnoRepository.findAll();
	}
	
	public Turno agregarTurno(Turno turno) {
		return turnoRepository.save(turno);
	}
	
	public Turno modificarTurno(Turno turno) {
		return turnoRepository.save(turno);
	}
	
	public Boolean eliminarTurnoPorId(Integer id) {
		try {
			turnoRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	//[Custom]
	//Buscar por paciente
	public List<Turno> obtenerTurnosDePacientePorDni(Integer dni){
		return turnoRepository.findByIdPacienteDni(dni);
	}
	
	//Buscar por paciente
	public List<Turno> obtenerTurnosDePacientePorApellido(String apellido){
		return turnoRepository.findByIdPacienteApellido(apellido);
	}
	
	//Buscar por fecha y id paciente
	public List<Turno> obtenerTurnoPorFechaCliente(Date fecha,Integer id_paciente){
		return turnoRepository.findByFechaAndIdPacienteId(fecha, id_paciente);
	}
}
