package com.omy.gmedica.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omy.gmedica.dao.IConsultaDao;
import com.omy.gmedica.model.Consulta;
import com.omy.gmedica.service.IConsultaService;

@Service
public class IConsultaServiceImpl implements IConsultaService {

	@Autowired
	private IConsultaDao dao;

	@Override
	public Consulta registrar(Consulta consulta) {
		// TODO Auto-generated method stub
		return dao.save(consulta);
	}

	@Override
	public void modificar(Consulta consulta) {
		// TODO Auto-generated method stub
		dao.save(consulta);
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	public Consulta listarID(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public List<Consulta> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}