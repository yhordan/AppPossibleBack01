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
import com.possible.corp.modelo.Productos;
import com.possible.corp.servicio.CatalogoServicio;
import com.possible.corp.servicio.ProductosServicio;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/Productos")
public class ProductosController {

	@Autowired
	private ProductosServicio proServicio;
	@Autowired
	private CatalogoServicio catServicio;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Productos>> listarProductos(){
		return new ResponseEntity<>(proServicio.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("/listarCat")
	public ResponseEntity<List<Catalogos>> listarCatalogos() {
		return new ResponseEntity<>(catServicio.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Productos> obtenerProductos(@PathVariable int id){
		return new ResponseEntity<>(proServicio.finById(id), HttpStatus.OK);
	}
	
	@PostMapping("/crear")
	public ResponseEntity<Productos> crearProductos(@RequestBody Productos pro){
		return new ResponseEntity<>(proServicio.save(pro),HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar/{id}")
	public ResponseEntity<Productos> actualizarProductos(@PathVariable int id,@RequestBody Productos pro){
		Productos productoEncontrado = proServicio.finById(id);
		
		if(productoEncontrado == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}try {
			productoEncontrado.setCodigo(pro.getCodigo());
			productoEncontrado.setId_codigo_rubro(pro.getId_codigo_rubro());
			productoEncontrado.setUnidad(pro.getUnidad());
			productoEncontrado.setDescripcion_detallada(pro.getDescripcion_detallada());
			productoEncontrado.setDescripcion_breve(pro.getDescripcion_breve());
			productoEncontrado.setSaldo_cantidad(pro.getSaldo_cantidad());
			productoEncontrado.setSaldo_valor(pro.getSaldo_valor());
			
			return new ResponseEntity<>(proServicio.save(productoEncontrado),HttpStatus.CREATED);
		}catch (DataAccessException ex) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<?> eliminarProducto(@PathVariable int id){
		proServicio.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
