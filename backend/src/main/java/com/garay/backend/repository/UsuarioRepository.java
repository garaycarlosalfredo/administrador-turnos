package com.garay.backend.repository;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.garay.backend.model.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository <Usuario, Integer>{
	public abstract Optional<Usuario> findById(Integer id);
}
