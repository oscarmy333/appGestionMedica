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

import com.omy.gmedica.model.DetalleConsulta;
import com.omy.gmedica.service.IDetalleConsultaService;



@RestController
@RequestMapping(value = "/api/detalleConsultas")
public class DetalleConsultaController {

	@Autowired
	private IDetalleConsultaService service;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<DetalleConsulta>> listar() {

		List<DetalleConsulta> consultas = service.listar();

		return new ResponseEntity<>(consultas, HttpStatus.OK);
	}
	
	@PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> registrar(@Valid @RequestBody DetalleConsulta detalleConsulta){
		service.registrar(detalleConsulta);
		
		return new ResponseEntity<Object> (HttpStatus.OK);
	}

	@PostMapping(value = "/actualizar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> actualizar(@RequestBody DetalleConsulta detalleConsulta) {

		service.modificar(detalleConsulta);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}