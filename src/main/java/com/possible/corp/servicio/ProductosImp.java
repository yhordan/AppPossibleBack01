package com.possible.corp.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.possible.corp.dao.ProductosDao;
import com.possible.corp.modelo.Productos;

@Service
public class ProductosImp implements ProductosServicio{
	
	@Autowired
	private ProductosDao dao;

	@Override
	public Productos save(Productos pro) {
		// TODO Auto-generated method stub
		return dao.save(pro);
	}

	@Override
	public Productos finById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).orElse(null);
	}

	@Override
	public List<Productos> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void delete(int id) {
		dao.deleteById(id);
		
	}


}
