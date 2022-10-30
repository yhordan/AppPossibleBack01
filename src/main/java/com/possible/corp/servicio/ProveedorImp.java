package com.possible.corp.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.possible.corp.dao.ProveedoresDao;
import com.possible.corp.modelo.Proveedores;

@Service
public class ProveedorImp implements ProveedoresServicio{
	
	@Autowired
	ProveedoresDao proDao;

	@Override
	public Proveedores save(Proveedores pro) {
		// TODO Auto-generated method stub
		return proDao.save(pro);
	}

	@Override
	public Proveedores finById(int id) {
		// TODO Auto-generated method stub
		return proDao.findById(id).orElse(null);
	}

	@Override
	public List<Proveedores> findAll() {
		// TODO Auto-generated method stub
		return proDao.findAll();
	}

	@Override
	public void delete(int id) {
		proDao.deleteById(id);
		
	}
	


}
