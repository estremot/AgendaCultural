package com.etec.AgendaCultural.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etec.AgendaCultural.model.Eventos;


public interface R_Eventos extends JpaRepository<Eventos, Long> {
	Eventos findByNomeevento(String nomeevento);
}
