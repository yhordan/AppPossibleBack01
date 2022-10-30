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
import com.possible.corp.modelo.Proveedores;
import com.possible.corp.servicio.CatalogoServicio;
import com.possible.corp.servicio.ProveedoresServicio;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/Proveedor")
public class ProveedoreController {
	
	@Autowired
	private ProveedoresServicio proServ;
	@Autowired
	private CatalogoServicio catServ;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Proveedores>> listarPersonal(){
		return new ResponseEntity<>(proServ.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("/listarCat")
	public ResponseEntity<List<Catalogos>> listarCatalogos() {
		return new ResponseEntity<>(catServ.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Proveedores> obtenerPersoal(@PathVariable int id){
		return new ResponseEntity<>(proServ.finById(id), HttpStatus.OK);
	}
	
	@PostMapping("/crear")
	public ResponseEntity<Proveedores> crearPersonal(@RequestBody Proveedores per){
		return new ResponseEntity<>(proServ.save(per),HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar/{id}")
	public ResponseEntity<Proveedores> actualizarPersonal(@PathVariable int id,@RequestBody Proveedores pe){
		Proveedores personalEncontrado = proServ.finById(id);

		if(personalEncontrado == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}try {
			personalEncontrado.setId_area(pe.getId_area());
			personalEncontrado.setNumero_identificacion(pe.getNumero_identificacion());
			personalEncontrado.setRazon_social(pe.getRazon_social());
			personalEncontrado.setNombre_comercial(pe.getNombre_comercial());
			personalEncontrado.setRepresentante_primer_nombre(pe.getRepresentante_primer_nombre());
			personalEncontrado.setRepresentante_segundo_nombre(pe.getRepresentante_segundo_nombre());
			personalEncontrado.setRepresentante_apellido_paterno(pe.getRepresentante_apellido_paterno());
			personalEncontrado.setRepresentante_apellido_materno(pe.getRepresentante_apellido_materno());
			personalEncontrado.setRepresentante_apellido_casada(pe.getRepresentante_apellido_casada());
			personalEncontrado.setCelular_representante(pe.getCelular_representante());
			personalEncontrado.setFecha_inscripcion(pe.getFecha_inscripcion());
			personalEncontrado.setUltimo_estado(pe.getUltimo_estado());
			personalEncontrado.setDireccion_pyme(pe.getDireccion_pyme());
			personalEncontrado.setUbicacion_pyme(pe.getUbicacion_pyme());
			personalEncontrado.setTelefono_pyme(pe.getTelefono_pyme());
			personalEncontrado.setFecha_registro(pe.getFecha_registro());
			personalEncontrado.setHora_registro(pe.getHora_registro());
			personalEncontrado.setUsuario_registro(pe.getUsuario_registro());

			return new ResponseEntity<>(proServ.save(personalEncontrado),HttpStatus.CREATED);
		}catch (DataAccessException ex) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<?> eliminarPersonal(@PathVariable int id){
		proServ.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
