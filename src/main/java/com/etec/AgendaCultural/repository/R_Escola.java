package com.etec.AgendaCultural.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etec.AgendaCultural.model.Escola;

public interface R_Escola extends JpaRepository<Escola, Long> {
	Escola findByNomeescola(String nomeescola);
}
