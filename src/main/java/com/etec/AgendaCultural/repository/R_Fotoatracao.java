package com.etec.AgendaCultural.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etec.AgendaCultural.model.Fotoatracao;


public interface R_Fotoatracao extends JpaRepository<Fotoatracao,Long> {
	Fotoatracao findByDescricao(String descricao);
}
