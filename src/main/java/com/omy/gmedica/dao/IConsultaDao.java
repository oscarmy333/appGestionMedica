package com.omy.gmedica.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omy.gmedica.model.Consulta;
import com.omy.gmedica.model.Especialidad;
import com.omy.gmedica.model.Medico;
import com.omy.gmedica.model.Paciente;

@Repository
public interface IConsultaDao extends JpaRepository<Consulta, Long> {
	/*List<Consulta> findByIdPaciente(int idPaciente);

	List<Consulta> findByIdEspecialidad(int idEspecialidad);

	List<Consulta> findByIdMedico(int idMedico);*/
	
	List<Consulta> findByPaciente(Paciente paciente);

	List<Consulta> findByEspecialidad(Especialidad especialidad);

	List<Consulta> findByMedico(Medico medico);
}