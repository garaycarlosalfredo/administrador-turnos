package com.garay.backend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garay.backend.model.Usuario;
import com.garay.backend.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;

	//Buscar todos los usuarios (GET)
	public List<Usuario> obtenerUsuarios(){
		return (List<Usuario>) usuarioRepository.findAll();
	}

	//Guardar un usuario (POST)
	public Usuario guardarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	//Actualizar usuario por Id (PUT)
	public Usuario actualizarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	//Eliminar usuario por Id (DELETE)
	public boolean eliminarUsuarioPorId(Integer id) {
		try {
			usuarioRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

}
