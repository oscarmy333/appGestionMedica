package com.omy.gmedica.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omy.gmedica.dao.IPacienteDao;
import com.omy.gmedica.model.Paciente;
import com.omy.gmedica.service.IPacienteService;

@Service
public class IPacienteServiceImpl implements IPacienteService {

	@Autowired
	private IPacienteDao dao;

	@Override
	public Paciente registrar(Paciente paciente) {
		// TODO Auto-generated method stub
		return dao.save(paciente);
	}

	@Override
	public void modificar(Paciente paciente) {
		// TODO Auto-generated method stub
		dao.save(paciente);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	public Paciente listarID(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public List<Paciente> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}