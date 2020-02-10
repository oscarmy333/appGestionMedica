package com.omy.gmedica.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omy.gmedica.dao.IDetalleConsultaDao;
import com.omy.gmedica.model.DetalleConsulta;
import com.omy.gmedica.service.IDetalleConsultaService;


@Service
public class IDetalleConsultaServiceImpl implements IDetalleConsultaService {

	@Autowired
	private IDetalleConsultaDao dao;

	@Override
	public DetalleConsulta registrar(DetalleConsulta detalleConsulta) {
		// TODO Auto-generated method stub
		return dao.save(detalleConsulta);
	}

	@Override
	public void modificar(DetalleConsulta detalleConsulta) {
		// TODO Auto-generated method stub
		dao.save(detalleConsulta);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	public DetalleConsulta listarID(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public List<DetalleConsulta> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}