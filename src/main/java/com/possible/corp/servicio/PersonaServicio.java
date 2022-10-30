package com.possible.corp.servicio;

import java.util.List;

import com.possible.corp.modelo.Personal;

public interface PersonaServicio {
	
	public Personal save(Personal per);
	
	public Personal finById(int id);
	
	public List<Personal> findAll();
	
	public void delete(int id);

}
