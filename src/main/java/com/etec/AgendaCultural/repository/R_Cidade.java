package com.etec.AgendaCultural.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etec.AgendaCultural.model.Cidade;

public interface R_Cidade extends JpaRepository<Cidade, Long> {
	Cidade findByNomecidade(String nomecidade);
}
