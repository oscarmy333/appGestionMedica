package com.omy.gmedica.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medico")
public class Medico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMedico;

	@Column(name = "nombres", nullable = false, length = 255)
	private String nombres;

	@Column(name = "apellidos", nullable = false, length = 255)
	private String apellidos;

	@Column(name = "cmp", nullable = false, length = 80)
	private String cmp;

	/**
	 * @return the idMedico
	 */
	public int getIdMedico() {
		return idMedico;
	}

	/**
	 * @param idMedico the idMedico to set
	 */
	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
	}

	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}

	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the cmp
	 */
	public String getCmp() {
		return cmp;
	}

	/**
	 * @param cargo the cmp to set
	 */
	public void setCmp(String cmp) {
		this.cmp = cmp;
	}
}
