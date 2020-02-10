package com.omy.gmedica.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omy.gmedica.model.DetalleConsulta;

public interface IDetalleConsultaDao extends JpaRepository<DetalleConsulta, Integer> {
	List<DetalleConsulta> findByIdConsulta(Long idConsulta);
}
