package com.etec.AgendaCultural.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Escola {

	//-- escola = {codescola, nomeescola, email, codruafk, codbairrobairrofk, codcepfk, 
	//codcidadefk, codnumerofk, celular}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codescola;
	
	@Column
	@Size (min = 2 , max = 80 ) 
	@NotNull(message = "O nome da escola deve ter um valor!")
    private String nomeescola;
	
	@Column
	@Size (min = 2 , max = 80 ) 
	@NotNull(message = "O e-mail deve ter um valor!")
    private String email;
	
	@ManyToOne
	@JoinColumn(name = "codruafk")
	private Rua rua;
	
	@ManyToOne
	@JoinColumn(name = "codbairrofk")
	private Bairro bairro;
	
	@ManyToOne
	@JoinColumn(name = "codcepfk")
	private Cep cep;
	
	@ManyToOne
	@JoinColumn(name = "codcidadefk")
	private Cidade cidade;
	
	@ManyToOne
	@JoinColumn(name = "codnumerofk")
	private Numero numero;
	
	@Column
	@Size (min = 2 , max = 80 ) 
	@NotNull(message = "O celular deve ter um valor!")
    private String celular;

	public Long getCodescola() {
		return codescola;
	}

	public void setCodescola(Long codescola) {
		this.codescola = codescola;
	}

	public String getNomeescola() {
		return nomeescola;
	}

	public void setNomeescola(String nomeescola) {
		this.nomeescola = nomeescola;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Rua getRua() {
		return rua;
	}

	public void setRua(Rua rua) {
		this.rua = rua;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public Cep getCep() {
		return cep;
	}

	public void setCep(Cep cep) {
		this.cep = cep;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Numero getNumero() {
		return numero;
	}

	public void setNumero(Numero numero) {
		this.numero = numero;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Escola(Long codescola,
			@Size(min = 2, max = 80) @NotNull(message = "O nome da escola deve ter um valor!") String nomeescola,
			@Size(min = 2, max = 80) @NotNull(message = "O e-mail deve ter um valor!") String email, Rua rua,
			Bairro bairro, Cep cep, Cidade cidade, Numero numero,
			@Size(min = 2, max = 80) @NotNull(message = "O celular deve ter um valor!") String celular) {
		super();
		this.codescola = codescola;
		this.nomeescola = nomeescola;
		this.email = email;
		this.rua = rua;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.numero = numero;
		this.celular = celular;
	}

	public Escola() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
