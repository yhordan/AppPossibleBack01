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
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Clientes")
public class Clientes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_Cliente;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "id_tipo_identificacion")
	private Catalogos id_tipo_identificacion;
	@Column(name = "numero_identificacion")
	private String numero_identificacion;
	@Column(name = "primer_nombre")
	private String primer_nombre;
	@Column(name = "segundo_nombre")
	private String segundo_nombre;
	@Column(name = "apellido_paterno")
	private String apellido_paterno;
	@Column(name = "apellido_materno")
	private String apellido_materno;
	@Column(name = "apellido_casada")
	private String apellido_casada;
	@Column(name = "nombre_razon_social")
	private String nombre_razon_social;
	@Column(name = "nombre_comercial")
	private String nombre_comercial;
	@Column(name = "fecha_nacimiento")
	private String fecha_nacimiento;
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "id_grado_instruccion")
	private Catalogos id_grado_instruccion;
	@Column(name = "celular")
	private String celular;
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "id_estado_civil")
	private Catalogos id_estado_civil;
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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
	@Column(name = "ultimo_estado")
	@NotNull
	private Boolean ultimo_estado;
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "id_sexo")
	private Catalogos id_sexo;
	@Column(name = "calificacion_sf")
	private String calificacion_sf;
	@Column(name = "fecha_alineamiento")
	private String fecha_alineamiento;
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "id_cod_pais")
	private Catalogos id_cod_pais;
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "id_tipo_identificacion_rl")
	private Catalogos id_tipo_identificacion_rl;
	@Column(name = "numero_identificacion_rl")
	private String numero_identificacion_rl;
	@Column(name = "apellido_paterno_rl")
	private String apellido_paterno_rl;
	@Column(name = "apellido_materno_rl")
	private String apellido_materno_rl;
	@Column(name = "nombres_representantes_rl")
	private String nombres_representantes_rl;
	@Column(name = "direccion_domicilio")
	private String direccion_domicilio;
	@Column(name = "telefono_domicilio")
	private String telefono_domicilio;
	@Column(name = "ubicacion_domicilio")
	private String ubicacion_domicilio;
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
	

	public int getId_Cliente() {
		return id_Cliente;
	}

	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}

	public Catalogos getId_tipo_identificacion() {
		return id_tipo_identificacion;
	}

	public void setId_tipo_identificacion(Catalogos id_tipo_identificacion) {
		this.id_tipo_identificacion = id_tipo_identificacion;
	}

	public String getNumero_identificacion() {
		return numero_identificacion;
	}

	public void setNumero_identificacion(String numero_identificacion) {
		this.numero_identificacion = numero_identificacion;
	}

	public String getPrimer_nombre() {
		return primer_nombre;
	}

	public void setPrimer_nombre(String primer_nombre) {
		this.primer_nombre = primer_nombre;
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

	public String getNombre_razon_social() {
		return nombre_razon_social;
	}

	public void setNombre_razon_social(String nombre_razon_social) {
		this.nombre_razon_social = nombre_razon_social;
	}

	public String getNombre_comercial() {
		return nombre_comercial;
	}

	public void setNombre_comercial(String nombre_comercial) {
		this.nombre_comercial = nombre_comercial;
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

	public Boolean getUltimo_estado() {
		return ultimo_estado;
	}

	public void setUltimo_estado(Boolean ultimo_estado) {
		this.ultimo_estado = ultimo_estado;
	}

	public Catalogos getId_sexo() {
		return id_sexo;
	}

	public void setId_sexo(Catalogos id_sexo) {
		this.id_sexo = id_sexo;
	}

	public String getCalificacion_sf() {
		return calificacion_sf;
	}

	public void setCalificacion_sf(String calificacion_sf) {
		this.calificacion_sf = calificacion_sf;
	}

	public String getFecha_alineamiento() {
		return fecha_alineamiento;
	}

	public void setFecha_alineamiento(String fecha_alineamiento) {
		this.fecha_alineamiento = fecha_alineamiento;
	}

	public Catalogos getId_cod_pais() {
		return id_cod_pais;
	}

	public void setId_cod_pais(Catalogos id_cod_pais) {
		this.id_cod_pais = id_cod_pais;
	}

	public Catalogos getId_tipo_identificacion_rl() {
		return id_tipo_identificacion_rl;
	}

	public void setId_tipo_identificacion_rl(Catalogos id_tipo_identificacion_rl) {
		this.id_tipo_identificacion_rl = id_tipo_identificacion_rl;
	}

	public String getNumero_identificacion_rl() {
		return numero_identificacion_rl;
	}

	public void setNumero_identificacion_rl(String numero_identificacion_rl) {
		this.numero_identificacion_rl = numero_identificacion_rl;
	}

	public String getApellido_paterno_rl() {
		return apellido_paterno_rl;
	}

	public void setApellido_paterno_rl(String apellido_paterno_rl) {
		this.apellido_paterno_rl = apellido_paterno_rl;
	}

	public String getApellido_materno_rl() {
		return apellido_materno_rl;
	}

	public void setApellido_materno_rl(String apellido_materno_rl) {
		this.apellido_materno_rl = apellido_materno_rl;
	}

	public String getNombres_representantes_rl() {
		return nombres_representantes_rl;
	}

	public void setNombres_representantes_rl(String nombres_representantes_rl) {
		this.nombres_representantes_rl = nombres_representantes_rl;
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
