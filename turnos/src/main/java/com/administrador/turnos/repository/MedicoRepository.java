package com.administrador.turnos.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.administrador.turnos.entity.Medico;

@Repository
public interface MedicoRepository extends CrudRepository<Medico, Integer>{
	public abstract Optional<Medico> findById(Integer id);
	
	//buscar medico
	public abstract Optional<Medico> findByDni(Integer dni);
	
}
