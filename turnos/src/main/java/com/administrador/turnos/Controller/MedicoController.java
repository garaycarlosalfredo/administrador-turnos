package com.administrador.turnos.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.administrador.turnos.entity.Medico;
import com.administrador.turnos.service.MedicoService;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
	
	@Autowired
	MedicoService medicoService;
	
	@GetMapping()
	public List<Medico> obtenerMedicos(){
		return medicoService.obtenerMedicos();
	}
	
	@PostMapping()
	public Medico guardarMedico(@RequestBody Medico medico) {
		return medicoService.guardarMedico(medico);
	}
	
	@PutMapping()
	public Medico modificarMedico(@RequestBody Medico medico) {
		return medicoService.actualizarMedico(medico);
	}
	
	@DeleteMapping( path = "/{id}" )
	public String eliminarMedicoPorId (@PathVariable("id") Integer id ) {
		boolean ok = medicoService.borrarMedico(id);
			if(ok) {
				return "se eliminó el medico id = " + id;
			}else {
				return "no se pudo eliminar el medico id = " + id;
			}
	}
	
	//[Custom]
	@GetMapping("/documento/{dni}")
	public Optional<Medico> obtenerMedicoPorDni(@PathVariable("dni") Integer dni) {
		return medicoService.obtenerMedicoPorDni(dni);
	}
}
