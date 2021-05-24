package com.administrador.turnos.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.administrador.turnos.entity.Turno;

@Repository
public interface TurnoRepository extends CrudRepository<Turno, Integer>{
	public abstract Optional<Turno> findById(Integer id);
	//Buscar todos los turnos de un día determinado
	//Buscar todos los turnos de un paciente por DNI
	public abstract List<Turno> findByIdPacienteDni(Integer dni);					//Id_paciente -> IdPaciente
	//Buscar todos los turnos de un paciente por Apellido
	public abstract List<Turno> findByIdPacienteApellido(String apellido);					//Id_paciente -> IdPaciente
	//Buscar turnos libres de un determinado día
	public abstract List<Turno> findByFechaAndIdPacienteId(Date fecha,Integer id_paciente);	//Id_paciente -> IdPaciente
	
	//Buscar turnos de un cliente de un determinado día
}
