package com.administrador.turnos.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.administrador.turnos.entity.Rol;

@Repository
public interface RolRepository extends CrudRepository<Rol, Integer>{
	public abstract Optional<Rol> findById(Integer id);
}
