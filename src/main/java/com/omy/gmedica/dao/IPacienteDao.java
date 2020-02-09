package com.omy.gmedica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omy.gmedica.model.Paciente;

public interface IPacienteDao extends JpaRepository<Paciente, Integer> {

}
