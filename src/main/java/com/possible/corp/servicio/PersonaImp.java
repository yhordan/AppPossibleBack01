package com.possible.corp.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.possible.corp.dao.PersonalDao;
import com.possible.corp.modelo.Personal;

@Service
public class PersonaImp implements PersonaServicio {
	
	@Autowired
	private PersonalDao dao;

	@Override
	public Personal save(Personal per) {
		// TODO Auto-generated method stub
		return dao.save(per);
	}

	@Override
	public Personal finById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).orElse(null);
	}

	@Override
	public List<Personal> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void delete(int id) {
		dao.deleteById(id);
		
	}

}
