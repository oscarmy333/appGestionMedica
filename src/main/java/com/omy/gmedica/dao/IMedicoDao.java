package com.omy.gmedica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omy.gmedica.model.Medico;

public interface IMedicoDao extends JpaRepository<Medico, Integer> {

}
