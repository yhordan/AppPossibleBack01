package com.possible.corp.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.possible.corp.dao.CatalogoDao;
import com.possible.corp.modelo.Catalogos;

@Service
public class CatalogoImp implements CatalogoServicio {
	
	@Autowired
	CatalogoDao catDao;

	@Override
	public Catalogos save(Catalogos cat) {
		// TODO Auto-generated method stub
		return catDao.save(cat);
	}

	@Override
	public Catalogos finById(int id) {
		// TODO Auto-generated method stub
		return catDao.findById(id).orElse(null);
	}

	@Override
	public List<Catalogos> findAll() {
		return catDao.findAll();
	}

	@Override
	public void delete(int id) {
		catDao.deleteById(id);
		
	}
	
	

}
