package com.etec.AgendaCultural.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etec.AgendaCultural.model.Bairro;

public interface R_Bairro extends JpaRepository<Bairro, Long>{
	
	Bairro findByNomebairro(String nomebairro);

}
