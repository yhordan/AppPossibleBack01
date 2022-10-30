package com.possible.corp.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Productos")
public class Productos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_productos;

	@Column(name = "codigo")
	private String codigo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JoinColumn(name = "id_codigo_rubro")
	private Catalogos id_codigo_rubro;

	@Column(name = "unidad")
	private String unidad;

	@Column(name = "descripcion_detallada")
	private String descripcion_detallada;

	@Column(name = "descripcion_breve")
	private String descripcion_breve;

	@Column(name = "saldo_cantidad")
	private Double saldo_cantidad;

	@Column(name = "saldo_valor")
	private Double saldo_valor;

	public int getId_productos() {
		return id_productos;
	}

	public void setId_productos(int id_productos) {
		this.id_productos = id_productos;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Catalogos getId_codigo_rubro() {
		return id_codigo_rubro;
	}

	public void setId_codigo_rubro(Catalogos id_codigo_rubro) {
		this.id_codigo_rubro = id_codigo_rubro;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public String getDescripcion_detallada() {
		return descripcion_detallada;
	}

	public void setDescripcion_detallada(String descripcion_detallada) {
		this.descripcion_detallada = descripcion_detallada;
	}

	public String getDescripcion_breve() {
		return descripcion_breve;
	}

	public void setDescripcion_breve(String descripcion_breve) {
		this.descripcion_breve = descripcion_breve;
	}

	public Double getSaldo_cantidad() {
		return saldo_cantidad;
	}

	public void setSaldo_cantidad(Double saldo_cantidad) {
		this.saldo_cantidad = saldo_cantidad;
	}

	public Double getSaldo_valor() {
		return saldo_valor;
	}

	public void setSaldo_valor(Double saldo_valor) {
		this.saldo_valor = saldo_valor;
	}

}
