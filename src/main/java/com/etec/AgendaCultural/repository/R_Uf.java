package com.etec.AgendaCultural.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etec.AgendaCultural.model.Uf;


public interface R_Uf extends JpaRepository<Uf, Long>{
	Uf findByNomeuf(String nomeuf);
}
