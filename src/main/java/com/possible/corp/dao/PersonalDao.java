package com.possible.corp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.possible.corp.modelo.Personal;

public interface PersonalDao extends JpaRepository<Personal, Integer>{

	
}
