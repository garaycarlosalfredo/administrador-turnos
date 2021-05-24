package com.administrador.turnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.administrador.turnos.entity.Medico;
import com.administrador.turnos.repository.MedicoRepository;


@Service
public class MedicoService {
	@Autowired
	MedicoRepository medicoRepository; 
	
	public List<Medico> obtenerMedicos(){					//GET - ver todos los medicos
		return (List<Medico>) medicoRepository.findAll();
	}
	
	public Medico guardarMedico(Medico medico) {			//POST - agregar un medico 
		return medicoRepository.save(medico);
	}
	
	public Medico actualizarMedico(Medico medico) {			//PUT - actualizar un medico
		return medicoRepository.save(medico);
	}
	
	public Boolean borrarMedico(Integer id) {				//DELETE - borrar por id
		try {
			medicoRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	//[Custom]
	public Optional<Medico> obtenerMedicoPorDni(Integer dni){
		return medicoRepository.findByDni(dni);
	}
}
