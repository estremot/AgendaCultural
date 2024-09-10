package com.etec.AgendaCultural.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etec.AgendaCultural.model.Atracoes;

public interface R_Atracoes extends JpaRepository<Atracoes, Long> {
	Atracoes findByDescricao(String descricao);
}
