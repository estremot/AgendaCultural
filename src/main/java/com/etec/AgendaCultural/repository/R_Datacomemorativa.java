package com.etec.AgendaCultural.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etec.AgendaCultural.model.Datacomemorativa;


public interface R_Datacomemorativa extends JpaRepository<Datacomemorativa, Long> {

	Datacomemorativa findByDescricaodatacomemorativa(String descricaodatacomemorativa);
}
