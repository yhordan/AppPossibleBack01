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
@Table(name = "Personal")
public class Personal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_personal;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JoinColumn(name = "id_tipo_identificacion")
	private Catalogos id_tipo_identificacion;
	@Column(name = "numero_ruc")
	private String numero_ruc;
	@Column(name = "primero_nombre")
	private String primero_nombre;
	@Column(name = "segundo_nombre")
	private String segundo_nombre;
	@Column(name = "apellido_paterno")
	private String apellido_paterno;
	@Column(name = "apellido_materno")
	private String apellido_materno;
	@Column(name = "apellido_casada")
	private String apellido_casada;
	@Column(name = "fecha_nacimiento")
	private String fecha_nacimiento;
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JoinColumn(name = "id_grado_instruccion")
	private Catalogos id_grado_instruccion;
	
	
	@Column(name = "celular")
	private String celular;
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JoinColumn(name = "id_estado_civil")
	private Catalogos id_estado_civil;
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JoinColumn(name = "id_tipo_identificacion_conyuge")
	private Catalogos id_tipo_identificacion_conyuge;
	@Column(name = "numero_identificacion_conyuge")
	private String numero_identificacion_conyuge;
	@Column(name = "apellido_paterno_conyuge")
	private String apellido_paterno_conyuge;
	@Column(name = "apellido_materno_conyuge")
	private String apellido_materno_conyuge;
	@Column(name = "nombre_conyuge")
	private String nombre_conyuge;
	@Column(name = "fecha_nacimiento_conyuge")
	private String fecha_nacimiento_conyuge;
	@Column(name = "estado")
	private Boolean estado;
	@Column(name = "calificacion_Sf")
	private String calificacion_Sf;
	
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JoinColumn(name = "id_codigo_pais")
	private Catalogos id_codigo_pais;
	@Column(name = "direccion_domicilio")
	private String direccion_domicilio;
	@Column(name = "telefono_domicilio")
	private String telefono_domicilio;
	@Column(name = "ubicacion_domicilio")
	private String ubicacion_domicilio;
	@Column(name = "codigo_onp")
	private String codigo_onp;
	@Column(name = "codigo_afp")
	private String codigo_afp;
	@Column(name = "numero_afp")
	private String numero_afp;
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JoinColumn(name = "id_area")
	private Catalogos id_area;
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JoinColumn(name = "id_cargo")
	private Catalogos id_cargo;
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JoinColumn(name = "id_profesion")
	private Catalogos id_profesion;
	
	
	@Column(name = "numero_hijos")
	private int numero_hijos;
	@Column(name = "asignacion_familiar")
	private String asignacion_familiar;
	@Column(name = "lugar_nacimiento")
	private String lugar_nacimiento;
	@Column(name = "fecha_ingreso")
	private String fecha_ingreso;
	@Column(name = "fecha_salida")
	private String fecha_salida;
	@Column(name = "seguro_vida")
	private String seguro_vida;
	@Column(name = "compania_seguro_vida")
	private String compania_seguro_vida;
	@Column(name = "remuneracion")
	private Double remuneracion;
	@Column(name = "banco")
	private String banco;
	@Column(name = "cuenta_ahorro")
	private String cuenta_ahorro;
	
	@Column(name = "vencimiento_contrato")
	private String vencimiento_contrato;
	@Column(name = "fecha_registro")
	private String fecha_registro;
	@Column(name = "hora_registro")
	private String hora_registro;
	@Column(name = "usuario_registro")
	private String usuario_registro;

	public int getId_personal() {
		return id_personal;
	}

	public void setId_personal(int id_personal) {
		this.id_personal = id_personal;
	}

	public Catalogos getId_tipo_identificacion() {
		return id_tipo_identificacion;
	}

	public void setId_tipo_identificacion(Catalogos id_tipo_identificacion) {
		this.id_tipo_identificacion = id_tipo_identificacion;
	}

	public String getNumero_ruc() {
		return numero_ruc;
	}

	public void setNumero_ruc(String numero_ruc) {
		this.numero_ruc = numero_ruc;
	}

	public String getPrimero_nombre() {
		return primero_nombre;
	}

	public void setPrimero_nombre(String primero_nombre) {
		this.primero_nombre = primero_nombre;
	}

	public String getSegundo_nombre() {
		return segundo_nombre;
	}

	public void setSegundo_nombre(String segundo_nombre) {
		this.segundo_nombre = segundo_nombre;
	}

	public String getApellido_paterno() {
		return apellido_paterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return apellido_materno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	public String getApellido_casada() {
		return apellido_casada;
	}

	public void setApellido_casada(String apellido_casada) {
		this.apellido_casada = apellido_casada;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public Catalogos getId_grado_instruccion() {
		return id_grado_instruccion;
	}

	public void setId_grado_instruccion(Catalogos id_grado_instruccion) {
		this.id_grado_instruccion = id_grado_instruccion;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Catalogos getId_estado_civil() {
		return id_estado_civil;
	}

	public void setId_estado_civil(Catalogos id_estado_civil) {
		this.id_estado_civil = id_estado_civil;
	}

	public Catalogos getId_tipo_identificacion_conyuge() {
		return id_tipo_identificacion_conyuge;
	}

	public void setId_tipo_identificacion_conyuge(Catalogos id_tipo_identificacion_conyuge) {
		this.id_tipo_identificacion_conyuge = id_tipo_identificacion_conyuge;
	}

	public String getNumero_identificacion_conyuge() {
		return numero_identificacion_conyuge;
	}

	public void setNumero_identificacion_conyuge(String numero_identificacion_conyuge) {
		this.numero_identificacion_conyuge = numero_identificacion_conyuge;
	}

	public String getApellido_paterno_conyuge() {
		return apellido_paterno_conyuge;
	}

	public void setApellido_paterno_conyuge(String apellido_paterno_conyuge) {
		this.apellido_paterno_conyuge = apellido_paterno_conyuge;
	}

	public String getApellido_materno_conyuge() {
		return apellido_materno_conyuge;
	}

	public void setApellido_materno_conyuge(String apellido_materno_conyuge) {
		this.apellido_materno_conyuge = apellido_materno_conyuge;
	}

	public String getNombre_conyuge() {
		return nombre_conyuge;
	}

	public void setNombre_conyuge(String nombre_conyuge) {
		this.nombre_conyuge = nombre_conyuge;
	}

	public String getFecha_nacimiento_conyuge() {
		return fecha_nacimiento_conyuge;
	}

	public void setFecha_nacimiento_conyuge(String fecha_nacimiento_conyuge) {
		this.fecha_nacimiento_conyuge = fecha_nacimiento_conyuge;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getCalificacion_Sf() {
		return calificacion_Sf;
	}

	public void setCalificacion_Sf(String calificacion_Sf) {
		this.calificacion_Sf = calificacion_Sf;
	}

	public Catalogos getId_codigo_pais() {
		return id_codigo_pais;
	}

	public void setId_codigo_pais(Catalogos id_codigo_pais) {
		this.id_codigo_pais = id_codigo_pais;
	}

	public String getDireccion_domicilio() {
		return direccion_domicilio;
	}

	public void setDireccion_domicilio(String direccion_domicilio) {
		this.direccion_domicilio = direccion_domicilio;
	}

	public String getTelefono_domicilio() {
		return telefono_domicilio;
	}

	public void setTelefono_domicilio(String telefono_domicilio) {
		this.telefono_domicilio = telefono_domicilio;
	}

	public String getUbicacion_domicilio() {
		return ubicacion_domicilio;
	}

	public void setUbicacion_domicilio(String ubicacion_domicilio) {
		this.ubicacion_domicilio = ubicacion_domicilio;
	}

	public String getCodigo_onp() {
		return codigo_onp;
	}

	public void setCodigo_onp(String codigo_onp) {
		this.codigo_onp = codigo_onp;
	}

	public String getCodigo_afp() {
		return codigo_afp;
	}

	public void setCodigo_afp(String codigo_afp) {
		this.codigo_afp = codigo_afp;
	}

	public String getNumero_afp() {
		return numero_afp;
	}

	public void setNumero_afp(String numero_afp) {
		this.numero_afp = numero_afp;
	}

	public Catalogos getId_area() {
		return id_area;
	}

	public void setId_area(Catalogos id_area) {
		this.id_area = id_area;
	}

	public Catalogos getId_cargo() {
		return id_cargo;
	}

	public void setId_cargo(Catalogos id_cargo) {
		this.id_cargo = id_cargo;
	}

	public Catalogos getId_profesion() {
		return id_profesion;
	}

	public void setId_profesion(Catalogos id_profesion) {
		this.id_profesion = id_profesion;
	}

	public int getNumero_hijos() {
		return numero_hijos;
	}

	public void setNumero_hijos(int numero_hijos) {
		this.numero_hijos = numero_hijos;
	}

	public String getAsignacion_familiar() {
		return asignacion_familiar;
	}

	public void setAsignacion_familiar(String asignacion_familiar) {
		this.asignacion_familiar = asignacion_familiar;
	}

	public String getLugar_nacimiento() {
		return lugar_nacimiento;
	}

	public void setLugar_nacimiento(String lugar_nacimiento) {
		this.lugar_nacimiento = lugar_nacimiento;
	}

	public String getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(String fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	public String getFecha_salida() {
		return fecha_salida;
	}

	public void setFecha_salida(String fecha_salida) {
		this.fecha_salida = fecha_salida;
	}

	public String getSeguro_vida() {
		return seguro_vida;
	}

	public void setSeguro_vida(String seguro_vida) {
		this.seguro_vida = seguro_vida;
	}

	public String getCompania_seguro_vida() {
		return compania_seguro_vida;
	}

	public void setCompania_seguro_vida(String compania_seguro_vida) {
		this.compania_seguro_vida = compania_seguro_vida;
	}

	public Double getRemuneracion() {
		return remuneracion;
	}

	public void setRemuneracion(Double remuneracion) {
		this.remuneracion = remuneracion;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getCuenta_ahorro() {
		return cuenta_ahorro;
	}

	public void setCuenta_ahorro(String cuenta_ahorro) {
		this.cuenta_ahorro = cuenta_ahorro;
	}

	public String getVencimiento_contrato() {
		return vencimiento_contrato;
	}

	public void setVencimiento_contrato(String vencimiento_contrato) {
		this.vencimiento_contrato = vencimiento_contrato;
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
