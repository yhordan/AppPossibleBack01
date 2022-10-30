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
@Table(name = "Proveedores")
public class Proveedores {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_proveedores;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "id_area")
	private Catalogos id_area;
	@Column(name = "numero_identificacion")
	private String numero_identificacion;
	@Column(name = "razon_social")
	private String razon_social;
	@Column(name = "nombre_comercial")
	private String nombre_comercial;
	@Column(name = "representante_primer_nombre")
	private String representante_primer_nombre;
	@Column(name = "representante_segundo_nombre")
	private String representante_segundo_nombre;
	@Column(name = "representante_apellido_paterno")
	private String representante_apellido_paterno;
	@Column(name = "representante_apellido_materno")
	private String representante_apellido_materno;
	@Column(name = "representante_apellido_casada")
	private String representante_apellido_casada;
	@Column(name = "celular_representante")
	private String celular_representante;
	@Column(name = "fecha_inscripcion")
	private String fecha_inscripcion;
	@Column(name = "ultimo_estado")
	private Boolean ultimo_estado;
	@Column(name = "direccion_pyme")
	private String direccion_pyme;
	@Column(name = "ubicacion_pyme")
	private String ubicacion_pyme;
	@Column(name = "telefono_pyme")
	private String telefono_pyme;
	@Column(name = "fecha_registro")
	private String fecha_registro;
	@Column(name = "hora_registro")
	private String hora_registro;
	@Column(name = "usuario_registro")
	private String usuario_registro;

	public int getId_proveedores() {
		return id_proveedores;
	}

	public void setId_proveedores(int id_proveedores) {
		this.id_proveedores = id_proveedores;
	}

	public Catalogos getId_area() {
		return id_area;
	}

	public void setId_area(Catalogos id_area) {
		this.id_area = id_area;
	}

	public String getNumero_identificacion() {
		return numero_identificacion;
	}

	public void setNumero_identificacion(String numero_identificacion) {
		this.numero_identificacion = numero_identificacion;
	}

	public String getRazon_social() {
		return razon_social;
	}

	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}

	public String getNombre_comercial() {
		return nombre_comercial;
	}

	public void setNombre_comercial(String nombre_comercial) {
		this.nombre_comercial = nombre_comercial;
	}

	public String getRepresentante_primer_nombre() {
		return representante_primer_nombre;
	}

	public void setRepresentante_primer_nombre(String representante_primer_nombre) {
		this.representante_primer_nombre = representante_primer_nombre;
	}

	public String getRepresentante_segundo_nombre() {
		return representante_segundo_nombre;
	}

	public void setRepresentante_segundo_nombre(String representante_segundo_nombre) {
		this.representante_segundo_nombre = representante_segundo_nombre;
	}

	public String getRepresentante_apellido_paterno() {
		return representante_apellido_paterno;
	}

	public void setRepresentante_apellido_paterno(String representante_apellido_paterno) {
		this.representante_apellido_paterno = representante_apellido_paterno;
	}

	public String getRepresentante_apellido_materno() {
		return representante_apellido_materno;
	}

	public void setRepresentante_apellido_materno(String representante_apellido_materno) {
		this.representante_apellido_materno = representante_apellido_materno;
	}

	public String getRepresentante_apellido_casada() {
		return representante_apellido_casada;
	}

	public void setRepresentante_apellido_casada(String representante_apellido_casada) {
		this.representante_apellido_casada = representante_apellido_casada;
	}

	public String getCelular_representante() {
		return celular_representante;
	}

	public void setCelular_representante(String celular_representante) {
		this.celular_representante = celular_representante;
	}

	public String getFecha_inscripcion() {
		return fecha_inscripcion;
	}

	public void setFecha_inscripcion(String fecha_inscripcion) {
		this.fecha_inscripcion = fecha_inscripcion;
	}

	public Boolean getUltimo_estado() {
		return ultimo_estado;
	}

	public void setUltimo_estado(Boolean ultimo_estado) {
		this.ultimo_estado = ultimo_estado;
	}

	public String getDireccion_pyme() {
		return direccion_pyme;
	}

	public void setDireccion_pyme(String direccion_pyme) {
		this.direccion_pyme = direccion_pyme;
	}

	public String getUbicacion_pyme() {
		return ubicacion_pyme;
	}

	public void setUbicacion_pyme(String ubicacion_pyme) {
		this.ubicacion_pyme = ubicacion_pyme;
	}

	public String getTelefono_pyme() {
		return telefono_pyme;
	}

	public void setTelefono_pyme(String telefono_pyme) {
		this.telefono_pyme = telefono_pyme;
	}

	public String getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public String getHora_registro() {
		return hora_registro;
	}

	public void setHora_registro(String hora_registro) {
		this.hora_registro = hora_registro;
	}

	public String getUsuario_registro() {
		return usuario_registro;
	}

	public void setUsuario_registro(String usuario_registro) {
		this.usuario_registro = usuario_registro;
	}

}
