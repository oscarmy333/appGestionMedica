package com.omy.gmedica.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omy.gmedica.model.Especialidad;
import com.omy.gmedica.service.IEspecialidadService;

@RestController
@RequestMapping(value = "/api/especialidades")
public class EspecialidadController {

	@Autowired
	private IEspecialidadService service;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Especialidad>> listar() {
		List<Especialidad> especialidades = service.listar();

		return new ResponseEntity<>(especialidades, HttpStatus.OK);
	}
	
	@PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> registrar(@Valid @RequestBody Especialidad especialidad){
		service.registrar(especialidad);
		
		return new ResponseEntity<Object> (HttpStatus.OK);
	}

	@PostMapping(value = "/actualizar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> actualizar(@RequestBody Especialidad especialidad) {

		service.modificar(especialidad);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}