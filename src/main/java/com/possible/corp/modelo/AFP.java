package com.possible.corp.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AFP")
public class AFP {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_afp;

	@Column(name = "codigo")
	private String codigo;

	@Column(name = "decripcion_afp")
	private String decripcion_afp;

	@Column(name = "aporte_obligatorio")
	private Double aporte_obligatorio;

	@Column(name = "comision_porcentual")
	private Double comision_porcentual;

	@Column(name = "comision_fija")
	private Double comision_fija;

	@Column(name = "seguro")
	private Double seguro;

	public int getId_afp() {
		return id_afp;
	}

	public void setId_afp(int id_afp) {
		this.id_afp = id_afp;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDecripcion_afp() {
		return decripcion_afp;
	}

	public void setDecripcion_afp(String decripcion_afp) {
		this.decripcion_afp = decripcion_afp;
	}

	public Double getAporte_obligatorio() {
		return aporte_obligatorio;
	}

	public void setAporte_obligatorio(Double aporte_obligatorio) {
		this.aporte_obligatorio = aporte_obligatorio;
	}

	public Double getComision_porcentual() {
		return comision_porcentual;
	}

	public void setComision_porcentual(Double comision_porcentual) {
		this.comision_porcentual = comision_porcentual;
	}

	public Double getComision_fija() {
		return comision_fija;
	}

	public void setComision_fija(Double comision_fija) {
		this.comision_fija = comision_fija;
	}

	public Double getSeguro() {
		return seguro;
	}

	public void setSeguro(Double seguro) {
		this.seguro = seguro;
	}

}
