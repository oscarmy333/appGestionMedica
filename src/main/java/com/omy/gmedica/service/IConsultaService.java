package com.omy.gmedica.service;

import java.util.List;

import com.omy.gmedica.model.Consulta;

public interface IConsultaService {
	Consulta registrar(Consulta consulta);

	void modificar(Consulta consulta);

	void eliminar(Long id);

	Consulta listarID(Long id);

	List<Consulta> listar();
}
