package com.etec.AgendaCultural.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Datacomemorativa {

	//-- datacomemorativa = {coddatacomemorativa, descricaodatacomemorativa}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long coddatacomemorativa;
	
	@Column
	@Size (min = 2 , max = 80 ) 
	@NotNull(message = "A Descrição da Data Comemorativa deve ter um valor!")
    private String descricaodatacomemorativa;

	public Long getCoddatacomemorativa() {
		return coddatacomemorativa;
	}

	public void setCoddatacomemorativa(Long coddatacomemorativa) {
		this.coddatacomemorativa = coddatacomemorativa;
	}

	public String getDescricaodatacomemorativa() {
		return descricaodatacomemorativa;
	}

	public void setDescricaodatacomemorativa(String descricaodatacomemorativa) {
		this.descricaodatacomemorativa = descricaodatacomemorativa;
	}

	public Datacomemorativa(Long coddatacomemorativa,
			@Size(min = 2, max = 80) @NotNull(message = "A Descrição da Data Comemorativa deve ter um valor!") String descricaodatacomemorativa) {
		super();
		this.coddatacomemorativa = coddatacomemorativa;
		this.descricaodatacomemorativa = descricaodatacomemorativa;
	}

	public Datacomemorativa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
