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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.administrador.turnos.entity.Paciente;
import com.administrador.turnos.service.PacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
	@Autowired
	PacienteService pacienteService;
	
	@GetMapping()
	public List<Paciente> obtenerPaciente() {
		return pacienteService.obtenerPacientes();
	}
	
	@PostMapping()
	public Paciente agregarPaciente(@RequestBody Paciente paciente) {
		return pacienteService.agregarPaciente(paciente);
	}
	
	@PutMapping()
	public Paciente actualizarPaciente(@RequestBody Paciente paciente) {
		return pacienteService.actualizarPaciente(paciente);
	}
	
	@DeleteMapping(path = "/{id}")
	public String eliminarPacientePorId(@PathVariable("id") Integer id) {
		boolean ok = pacienteService.eliminarPacientePorId(id);
		if (ok) {return "peciente eliminado id = "+id;} else { return "no se pudo eliminar el paciente"+id;}
	}
	
	//[Custom]
	@GetMapping("/documento/{dni}")
	public Optional<Paciente> obtenerPacientePorDni(@PathVariable("dni") Integer dni) {
		return pacienteService.obtenerPacientePorDni(dni);
	}
	
	@GetMapping("/apellido/query")
	public List<Paciente> obtenerPacientePorDni(@RequestParam("apellido") String apellido) {
		return pacienteService.obtenerPacientePorApellido(apellido);
	}
}
