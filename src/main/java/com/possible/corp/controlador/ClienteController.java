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
import com.possible.corp.modelo.Clientes;
import com.possible.corp.servicio.CatalogoServicio;
import com.possible.corp.servicio.ClienteServicio;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/Cliente")
public class ClienteController {
	
	@Autowired
	private ClienteServicio cliServicio;
	@Autowired
	private CatalogoServicio catServ;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Clientes>> listarCliente() {
		return new ResponseEntity<>(cliServicio.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/listarCat")
	public ResponseEntity<List<Catalogos>> listarCatalogos() {
		return new ResponseEntity<>(catServ.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Clientes> obtenerCliente(@PathVariable int id){
		return new ResponseEntity<>(cliServicio.finById(id), HttpStatus.OK);
	}
	
	@PostMapping("/crear")
	public ResponseEntity<Clientes> crearCliente(@RequestBody Clientes cli){
		return new ResponseEntity<>(cliServicio.save(cli), HttpStatus.CREATED);
	}
	
	
	@PutMapping("/actualizar/{id}")
	public ResponseEntity<Clientes> actualizarCliente(@PathVariable int id,@RequestBody Clientes cli){
		Clientes clienteEncontrado = cliServicio.finById(id);
		
		if(clienteEncontrado == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		try {
			clienteEncontrado.setId_tipo_identificacion(cli.getId_tipo_identificacion());
			clienteEncontrado.setNumero_identificacion(cli.getNumero_identificacion());
			clienteEncontrado.setPrimer_nombre(cli.getPrimer_nombre());
			clienteEncontrado.setSegundo_nombre(cli.getSegundo_nombre());
			clienteEncontrado.setApellido_paterno(cli.getApellido_paterno());
			clienteEncontrado.setApellido_materno(cli.getApellido_materno());
			clienteEncontrado.setApellido_casada(cli.getApellido_casada());
			clienteEncontrado.setNombre_razon_social(cli.getNombre_razon_social());
			clienteEncontrado.setNombre_comercial(cli.getNombre_comercial());
			clienteEncontrado.setFecha_nacimiento(cli.getFecha_nacimiento());
			clienteEncontrado.setId_grado_instruccion(cli.getId_grado_instruccion());
			clienteEncontrado.setCelular(cli.getCelular());
			clienteEncontrado.setId_estado_civil(cli.getId_estado_civil());
			clienteEncontrado.setId_tipo_identificacion_conyuge(cli.getId_tipo_identificacion_conyuge());
			clienteEncontrado.setNumero_identificacion_conyuge(cli.getNumero_identificacion_conyuge());
			clienteEncontrado.setNumero_identificacion_rl(cli.getNumero_identificacion_rl());
			clienteEncontrado.setApellido_paterno_conyuge(cli.getApellido_paterno_conyuge());
			clienteEncontrado.setApellido_materno_conyuge(cli.getApellido_materno_conyuge());
			clienteEncontrado.setNombre_conyuge(cli.getNombre_conyuge());
			clienteEncontrado.setFecha_nacimiento_conyuge(cli.getFecha_nacimiento_conyuge());
			clienteEncontrado.setUltimo_estado(cli.getUltimo_estado());
			clienteEncontrado.setId_sexo(cli.getId_sexo());
			clienteEncontrado.setCalificacion_sf(cli.getCalificacion_sf());
			clienteEncontrado.setFecha_alineamiento(cli.getFecha_alineamiento());
			clienteEncontrado.setId_cod_pais(cli.getId_cod_pais());
			clienteEncontrado.setId_tipo_identificacion_rl(cli.getId_tipo_identificacion_rl());
			clienteEncontrado.setNumero_identificacion_rl(cli.getNumero_identificacion_rl());
			clienteEncontrado.setApellido_paterno_rl(cli.getApellido_paterno_rl());
			clienteEncontrado.setApellido_materno_rl(cli.getApellido_materno_rl());
			clienteEncontrado.setNombres_representantes_rl(cli.getNombres_representantes_rl());
			clienteEncontrado.setDireccion_domicilio(cli.getDireccion_domicilio());
			clienteEncontrado.setTelefono_domicilio(cli.getTelefono_domicilio());
			clienteEncontrado.setUbicacion_domicilio(cli.getUbicacion_domicilio());
			clienteEncontrado.setDireccion_pyme(cli.getDireccion_pyme());
			clienteEncontrado.setUbicacion_pyme(cli.getUbicacion_pyme());
			clienteEncontrado.setTelefono_pyme(cli.getTelefono_pyme());
			clienteEncontrado.setFecha_registro(cli.getFecha_registro());
			clienteEncontrado.setHora_registro(cli.getHora_registro());
			clienteEncontrado.setUsuario_registro(cli.getUsuario_registro());
			return new ResponseEntity<>(cliServicio.save(clienteEncontrado),HttpStatus.CREATED);
			
		} catch (DataAccessException ex) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<?> elminarCliente(@PathVariable Integer id){
		cliServicio.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
