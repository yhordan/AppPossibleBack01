package com.possible.corp.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Catalogos")
public class Catalogos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_catalogos;

	@Column(name = "id_cod_tab")
	private String id_cod_tab;

	@Column(name = "opc_tab")
	private String opc_tab;

	@Column(name = "estado")
	private Boolean estado;

	@Column(name = "descripcion")
	private String descripcion;


	public int getId_catalogos() {
		return id_catalogos;
	}

	public void setId_catalogos(int id_catalogos) {
		this.id_catalogos = id_catalogos;
	}

	public String getId_cod_tab() {
		return id_cod_tab;
	}

	public void setId_cod_tab(String id_cod_tab) {
		this.id_cod_tab = id_cod_tab;
	}

	public String getOpc_tab() {
		return opc_tab;
	}

	public void setOpc_tab(String opc_tab) {
		this.opc_tab = opc_tab;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
