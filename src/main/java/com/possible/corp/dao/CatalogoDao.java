package com.possible.corp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.possible.corp.modelo.Catalogos;

public interface CatalogoDao extends JpaRepository<Catalogos, Integer> {

}
