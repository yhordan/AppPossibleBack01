package com.possible.corp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.possible.corp.modelo.Clientes;

public interface ClienteDao extends JpaRepository<Clientes, Integer> {

}
