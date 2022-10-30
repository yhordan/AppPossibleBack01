package com.possible.corp.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Parametros")
public class Parametros {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_parametro;

	@Column(name = "codigo_parametro")
	private String codigo_parametro;

	@Column(name = "tipo_cambio_compra_dolar")
	private Double tipo_cambio_compra_dolar;

	@Column(name = "tipo_cambio_venta_dolar")
	private Double tipo_cambio_venta_dolar;

	@Column(name = "nombre_empresa")
	private String nombre_empresa;

	@Column(name = "ruc")
	private String ruc;

	@Column(name = "valor_igv")
	private Double valor_igv;

	@Column(name = "secuencial_codigo_producto")
	private String secuencial_codigo_producto;

	@Column(name = "monto_asignacion_familia")
	private Double monto_asignacion_familia;

	@Column(name = "logo_empresa")
	private String logo_empresa;

	@Column(name = "serie1_electronica")
	private String serie1_electronica;

	@Column(name = "numero_Serie1")
	private Integer numero_Serie1;

	@Column(name = "serie2_electronica")
	private String serie2_electronica;

	@Column(name = "numero_Serie2")
	private Integer numero_Serie2;

	@Column(name = "serie3_electronica")
	private String serie3_electronica;

	@Column(name = "numero_Serie3")
	private Integer numero_Serie3;

	public int getId_parametro() {
		return id_parametro;
	}

	public void setId_parametro(int id_parametro) {
		this.id_parametro = id_parametro;
	}

	public String getCodigo_parametro() {
		return codigo_parametro;
	}

	public void setCodigo_parametro(String codigo_parametro) {
		this.codigo_parametro = codigo_parametro;
	}

	public Double getTipo_cambio_compra_dolar() {
		return tipo_cambio_compra_dolar;
	}

	public void setTipo_cambio_compra_dolar(Double tipo_cambio_compra_dolar) {
		this.tipo_cambio_compra_dolar = tipo_cambio_compra_dolar;
	}

	public Double getTipo_cambio_venta_dolar() {
		return tipo_cambio_venta_dolar;
	}

	public void setTipo_cambio_venta_dolar(Double tipo_cambio_venta_dolar) {
		this.tipo_cambio_venta_dolar = tipo_cambio_venta_dolar;
	}

	public String getNombre_empresa() {
		return nombre_empresa;
	}

	public void setNombre_empresa(String nombre_empresa) {
		this.nombre_empresa = nombre_empresa;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public Double getValor_igv() {
		return valor_igv;
	}

	public void setValor_igv(Double valor_igv) {
		this.valor_igv = valor_igv;
	}

	public String getSecuencial_codigo_producto() {
		return secuencial_codigo_producto;
	}

	public void setSecuencial_codigo_producto(String secuencial_codigo_producto) {
		this.secuencial_codigo_producto = secuencial_codigo_producto;
	}

	public Double getMonto_asignacion_familia() {
		return monto_asignacion_familia;
	}

	public void setMonto_asignacion_familia(Double monto_asignacion_familia) {
		this.monto_asignacion_familia = monto_asignacion_familia;
	}

	public String getLogo_empresa() {
		return logo_empresa;
	}

	public void setLogo_empresa(String logo_empresa) {
		this.logo_empresa = logo_empresa;
	}

	public String getSerie1_electronica() {
		return serie1_electronica;
	}

	public void setSerie1_electronica(String serie1_electronica) {
		this.serie1_electronica = serie1_electronica;
	}

	public Integer getNumero_Serie1() {
		return numero_Serie1;
	}

	public void setNumero_Serie1(Integer numero_Serie1) {
		this.numero_Serie1 = numero_Serie1;
	}

	public String getSerie2_electronica() {
		return serie2_electronica;
	}

	public void setSerie2_electronica(String serie2_electronica) {
		this.serie2_electronica = serie2_electronica;
	}

	public Integer getNumero_Serie2() {
		return numero_Serie2;
	}

	public void setNumero_Serie2(Integer numero_Serie2) {
		this.numero_Serie2 = numero_Serie2;
	}

	public String getSerie3_electronica() {
		return serie3_electronica;
	}

	public void setSerie3_electronica(String serie3_electronica) {
		this.serie3_electronica = serie3_electronica;
	}

	public Integer getNumero_Serie3() {
		return numero_Serie3;
	}

	public void setNumero_Serie3(Integer numero_Serie3) {
		this.numero_Serie3 = numero_Serie3;
	}

}
