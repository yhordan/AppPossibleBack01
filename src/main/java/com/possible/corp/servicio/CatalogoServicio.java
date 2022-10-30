package com.possible.corp.servicio;

import java.util.List;

import com.possible.corp.modelo.Catalogos;

public interface CatalogoServicio {
	
	public Catalogos save(Catalogos cat);
	
	public Catalogos finById(int id);
	
	public List<Catalogos> findAll();
	
	public void delete(int id);

}
