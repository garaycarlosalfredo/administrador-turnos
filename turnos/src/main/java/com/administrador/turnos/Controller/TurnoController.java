package com.administrador.turnos.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.administrador.turnos.entity.Turno;
import com.administrador.turnos.service.TurnoService;

@RestController
@RequestMapping("/turnos")
public class TurnoController {
	@Autowired
	TurnoService turnoService;
	
	//[CRUD]
	@GetMapping()
	public List<Turno> obtenerTurnos(){
		return turnoService.obtenerTurnos();
	}
	
	@PostMapping()
	public Turno agregarTurno(@RequestBody Turno turno) {
		return turnoService.modificarTurno(turno);
	}
	
	@PutMapping()
	public Turno modificarTurno(@RequestBody Turno turno) {
		return turnoService.modificarTurno(turno);
	}
	
	@DeleteMapping(path = "/{id}")
	public String eliminarTurnoPorId(@PathVariable("id") Integer id) {
		boolean ok = turnoService.eliminarTurnoPorId(id);
		if (ok) {return "Se eliminó el turno id = "+id;} else { return "no se pudo eliminar el turno id = "+id;}
	}

	//[Custom]
	
	@GetMapping("/dni/query")	//Busqueda de turno por fecha y cliente
	public List<Turno> obtenerTurnosDePacientePorDni(@RequestParam("dni") Integer dni){			
		return this.turnoService.obtenerTurnosDePacientePorDni(dni);
	}
	
	@GetMapping("/apellido/query")	//Busqueda de turno por fecha y cliente
	public List<Turno> obtenerTurnosDePacientePorApellido(@RequestParam("apellido") String apellido){			
		return this.turnoService.obtenerTurnosDePacientePorApellido(apellido);
	}
	
	@GetMapping("/query")	//Busqueda de turno por fecha y cliente
	public List<Turno> obtenerTurnoPorFechaCliente(												//El formato debería verlo en el formulario y cuando vea como viene la info revisar
			@RequestParam("fecha") @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  Date fecha,	//DATE_TIME: yyyy-MM-dd'T'HH:mm:ss.SSSXXX, example 2019-03-28T01:30:00.000+07:00
			@RequestParam("id_paciente") Integer id_paciente){			
		return this.turnoService.obtenerTurnoPorFechaCliente(fecha, id_paciente);
	}
	
}
