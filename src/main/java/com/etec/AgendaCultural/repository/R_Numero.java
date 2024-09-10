package com.etec.AgendaCultural.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etec.AgendaCultural.model.Numero;


public interface R_Numero extends JpaRepository<Numero, Long>{
	Numero findByNumero(String numero);
}
