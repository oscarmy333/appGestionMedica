package com.omy.gmedica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omy.gmedica.model.Paciente;
import com.omy.gmedica.service.IPacienteService;



@RestController
@RequestMapping(value = "/api/pacientes")
public class PacienteController {

	@Autowired
	private IPacienteService service;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Paciente>> listar() {

		List<Paciente> pacientes = service.listar();

		return new ResponseEntity<>(pacientes, HttpStatus.OK);
	}

	@PostMapping(value = "/actualizar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> actualizar(@RequestBody Paciente paciente) {

		service.modificar(paciente);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
