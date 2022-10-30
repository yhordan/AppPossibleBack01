package com.possible.corp.servicio;

import java.util.List;

import com.possible.corp.modelo.Productos;

public interface ProductosServicio {
	
	public Productos save(Productos pro);
	
	public Productos finById(int id);
	
	public List<Productos> findAll();
	
	public void delete(int id);

}
