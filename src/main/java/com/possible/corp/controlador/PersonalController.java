package com.possible.corp.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.possible.corp.modelo.Catalogos;
import com.possible.corp.modelo.Personal;
import com.possible.corp.servicio.CatalogoServicio;
import com.possible.corp.servicio.PersonaServicio;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/Personal")
public class PersonalController {
	
	@Autowired
	private PersonaServicio perServicio;
	@Autowired
	private CatalogoServicio catServ;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Personal>> listarPersonal(){
		return new ResponseEntity<>(perServicio.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("/listarCat")
	public ResponseEntity<List<Catalogos>> listarCatalogos() {
		return new ResponseEntity<>(catServ.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Personal> obtenerPersoal(@PathVariable int id){
		return new ResponseEntity<>(perServicio.finById(id), HttpStatus.OK);
	}
	
	@PostMapping("/crear")
	public ResponseEntity<Personal> crearPersonal(@RequestBody Personal per){
		return new ResponseEntity<>(perServicio.save(per),HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar/{id}")
	public ResponseEntity<Personal> actualizarPersonal(@PathVariable int id,@RequestBody Personal pe){
		Personal personalEncontrado = perServicio.finById(id);
		
		if(personalEncontrado == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}try {
			personalEncontrado.setId_tipo_identificacion(pe.getId_tipo_identificacion());
			personalEncontrado.setNumero_ruc(pe.getNumero_ruc());
			personalEncontrado.setPrimero_nombre(pe.getPrimero_nombre());
			personalEncontrado.setSegundo_nombre(pe.getSegundo_nombre());
			personalEncontrado.setApellido_paterno(pe.getApellido_paterno());
			personalEncontrado.setApellido_materno(pe.getApellido_materno());
			personalEncontrado.setApellido_casada(pe.getApellido_casada());
			personalEncontrado.setFecha_nacimiento(pe.getFecha_nacimiento());
			personalEncontrado.setId_grado_instruccion(pe.getId_grado_instruccion());
			personalEncontrado.setCelular(pe.getCelular());
			personalEncontrado.setId_estado_civil(pe.getId_estado_civil());
			personalEncontrado.setId_tipo_identificacion_conyuge(pe.getId_tipo_identificacion_conyuge());
			personalEncontrado.setNumero_identificacion_conyuge(pe.getNumero_identificacion_conyuge());
			personalEncontrado.setApellido_paterno_conyuge(pe.getApellido_paterno_conyuge());
			personalEncontrado.setApellido_materno_conyuge(pe.getApellido_materno_conyuge());
			personalEncontrado.setNombre_conyuge(pe.getNombre_conyuge());
			personalEncontrado.setFecha_nacimiento_conyuge(pe.getFecha_nacimiento_conyuge());
			personalEncontrado.setEstado(pe.getEstado());
			personalEncontrado.setCalificacion_Sf(pe.getCalificacion_Sf());
			personalEncontrado.setId_codigo_pais(pe.getId_codigo_pais());
			personalEncontrado.setDireccion_domicilio(pe.getDireccion_domicilio());
			personalEncontrado.setTelefono_domicilio(pe.getTelefono_domicilio());
			personalEncontrado.setUbicacion_domicilio(pe.getUbicacion_domicilio());
			personalEncontrado.setCodigo_onp(pe.getCodigo_onp());
			personalEncontrado.setCodigo_afp(pe.getCodigo_afp());
			personalEncontrado.setNumero_afp(pe.getNumero_afp());
			personalEncontrado.setId_area(pe.getId_area());
			personalEncontrado.setId_cargo(pe.getId_cargo());
			personalEncontrado.setId_profesion(pe.getId_profesion());
			personalEncontrado.setNumero_hijos(pe.getNumero_hijos());
			personalEncontrado.setAsignacion_familiar(pe.getAsignacion_familiar());
			personalEncontrado.setLugar_nacimiento(pe.getLugar_nacimiento());
			personalEncontrado.setFecha_ingreso(pe.getFecha_ingreso());
			personalEncontrado.setFecha_salida(pe.getFecha_salida());
			personalEncontrado.setSeguro_vida(pe.getSeguro_vida());
			personalEncontrado.setCompania_seguro_vida(pe.getCompania_seguro_vida());
			personalEncontrado.setRemuneracion(pe.getRemuneracion());
			personalEncontrado.setBanco(pe.getBanco());
			personalEncontrado.setCuenta_ahorro(pe.getCuenta_ahorro());
			personalEncontrado.setVencimiento_contrato(pe.getVencimiento_contrato());
			personalEncontrado.setFecha_registro(pe.getFecha_registro());
			personalEncontrado.setHora_registro(pe.getHora_registro());
			personalEncontrado.setUsuario_registro(pe.getUsuario_registro());

			return new ResponseEntity<>(perServicio.save(personalEncontrado),HttpStatus.CREATED);
		}catch (DataAccessException ex) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<?> eliminarPersonal(@PathVariable int id){
		perServicio.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
