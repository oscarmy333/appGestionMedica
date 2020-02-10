package com.omy.gmedica.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="detalle_consulta")
public class DetalleConsulta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetalle;
	
	@Column(name = "id_consulta", nullable = false)
	@JsonIgnore
	private Long idConsulta;
	
	@Column(name = "diagnostico", nullable = false, length = 255)
	private String diagnostico;
	
	@Column(name = "tratamiento", nullable = false, length = 255)
	private String tratamiento;

	/**
	 * @return the idDetalle
	 */
	public int getIdDetalle() {
		return idDetalle;
	}

	/**
	 * @param idDetalle the idDetalle to set
	 */
	public void setIdDetalle(int idDetalle) {
		this.idDetalle = idDetalle;
	}

	/**
	 * @return the idConsulta
	 */
	public Long getIdConsulta() {
		return idConsulta;
	}

	/**
	 * @param idConsulta the idConsulta to set
	 */
	public void setIdConsulta(Long idConsulta) {
		this.idConsulta = idConsulta;
	}

	/**
	 * @return the diagnostico
	 */
	public String getDiagnostico() {
		return diagnostico;
	}

	/**
	 * @param diagnostico the diagnostico to set
	 */
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	/**
	 * @return the tratamiento
	 */
	public String getTratamiento() {
		return tratamiento;
	}

	/**
	 * @param tratamiento the tratamiento to set
	 */
	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
}
