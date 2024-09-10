package com.etec.AgendaCultural.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etec.AgendaCultural.model.Pessoa;


public interface R_Pessoa extends JpaRepository<Pessoa, Long>{
	Pessoa findByNomepessoa(String nomepessoa);
}
