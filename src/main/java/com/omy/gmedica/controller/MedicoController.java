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

import com.omy.gmedica.model.Medico;
import com.omy.gmedica.service.IMedicoService;

@RestController
@RequestMapping(value = "/api/medicos")
public class MedicoController {

	@Autowired
	private IMedicoService service;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Medico>> listar() {

		List<Medico> medicos = service.listar();

		return new ResponseEntity<>(medicos, HttpStatus.OK);
	}

	@PostMapping(value = "/actualizar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> actualizar(@RequestBody Medico medico) {

		service.modificar(medico);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
