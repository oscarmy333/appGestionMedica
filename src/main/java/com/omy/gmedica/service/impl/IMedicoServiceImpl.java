package com.omy.gmedica.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omy.gmedica.dao.IMedicoDao;
import com.omy.gmedica.model.Medico;
import com.omy.gmedica.service.IMedicoService;

@Service
public class IMedicoServiceImpl implements IMedicoService {

	@Autowired
	private IMedicoDao dao;

	@Override
	public Medico registrar(Medico medico) {
		// TODO Auto-generated method stub
		return dao.save(medico);
	}

	@Override
	public void modificar(Medico medico) {
		// TODO Auto-generated method stub
		dao.save(medico);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	public Medico listarID(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public List<Medico> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
