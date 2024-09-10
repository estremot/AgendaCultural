package com.etec.AgendaCultural.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etec.AgendaCultural.model.Cep;


public interface R_Cep extends JpaRepository<Cep, Long>{
	Cep findByNumerocep(String numerocep);

}
