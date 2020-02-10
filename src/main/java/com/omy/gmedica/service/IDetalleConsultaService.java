package com.omy.gmedica.service;

import java.util.List;

import com.omy.gmedica.model.DetalleConsulta;

public interface IDetalleConsultaService {
	DetalleConsulta registrar(DetalleConsulta detalleConsulta);

	void modificar(DetalleConsulta detalleConsulta);

	void eliminar(int id);

	DetalleConsulta listarID(int id);

	List<DetalleConsulta> listar();
}
