package com.possible.corp.servicio;

import java.util.List;

import com.possible.corp.modelo.Proveedores;

public interface ProveedoresServicio {

	public Proveedores save(Proveedores pro);

	public Proveedores finById(int id);

	public List<Proveedores> findAll();

	public void delete(int id);
}
