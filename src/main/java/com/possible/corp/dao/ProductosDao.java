package com.possible.corp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.possible.corp.modelo.Productos;

public interface ProductosDao extends JpaRepository<Productos, Integer> {

	
}
