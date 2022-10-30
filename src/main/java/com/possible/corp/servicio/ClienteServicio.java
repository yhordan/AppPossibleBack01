package com.possible.corp.servicio;

import java.util.List;

import com.possible.corp.modelo.Clientes;

public interface ClienteServicio {

	public Clientes save(Clientes cli);
	
	public Clientes finById(int id);
	
	public List<Clientes> findAll();
	
	public void delete(int id);
	
}
