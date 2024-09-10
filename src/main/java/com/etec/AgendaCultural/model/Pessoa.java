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
public class Pessoa {

	//-- pessoas = {codpessoa, nomepessoa, emailpessoa, foto}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codpessoa;
	
	@Column
	@Size (min = 2 , max = 80 ) 
	@NotNull(message = "O nome a pessoa deve ter uma valor!")
    private String nomepessoa;
	
	@Column
	@Size (min = 2 , max = 80 ) 
	@NotNull(message = "O e-mail da pessoa deve ter uma valor!")
    private String email;
	
	@Column
	private byte[] foto;

	public Long getCodpessoa() {
		return codpessoa;
	}

	public void setCodpessoa(Long codpessoa) {
		this.codpessoa = codpessoa;
	}

	public String getNomepessoa() {
		return nomepessoa;
	}

	public void setNomepessoa(String nomepessoa) {
		this.nomepessoa = nomepessoa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Pessoa(Long codpessoa,
			@Size(min = 2, max = 80) @NotNull(message = "O nome a pessoa deve ter uma valor!") String nomepessoa,
			@Size(min = 2, max = 80) @NotNull(message = "O e-mail da pessoa deve ter uma valor!") String email,
			byte[] foto) {
		super();
		this.codpessoa = codpessoa;
		this.nomepessoa = nomepessoa;
		this.email = email;
		this.foto = foto;
	}

	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
