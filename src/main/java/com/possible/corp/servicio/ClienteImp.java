package com.possible.corp.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.possible.corp.dao.ClienteDao;
import com.possible.corp.modelo.Clientes;

@Service
public class ClienteImp implements ClienteServicio {

	@Autowired
	private ClienteDao cliDao;
	
	@Override
	public Clientes save(Clientes cli) {
		return cliDao.save(cli);
	}

	@Override
	public Clientes finById(int id) {
		return cliDao.findById(id).orElse(null);
	}

	@Override
	public List<Clientes> findAll() {
		return cliDao.findAll();
	}

	@Override
	public void delete(int id) {
		cliDao.deleteById(id);
	}

}
