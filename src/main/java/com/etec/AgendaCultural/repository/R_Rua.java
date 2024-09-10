package com.etec.AgendaCultural.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etec.AgendaCultural.model.Rua;


public interface R_Rua extends JpaRepository<Rua, Long> {
	Rua findByNomerua(String nomerua);
}
