package com.administrador.turnos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.administrador.turnos.entity.Paciente;

@Repository
public interface PacienteRepository extends CrudRepository<Paciente, Integer>{
	public abstract Optional<Paciente> findById(Integer id);
	
	//Buscar paciente por numero de dni
	public abstract Optional<Paciente> findByDni(Integer dni); 
	
	//Buscar paciente por apellido
	public abstract List<Paciente> findByApellido(String apellido); 
}
