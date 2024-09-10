package com.etec.AgendaCultural.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Pessoasatracoes {
//--pessoasAtraçoes = {codpessoasatracoes, codpessoa, codatracao, ...}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codpessoasatracoes;
	
	@ManyToOne
	@JoinColumn(name = "codpessoafk")
    private Pessoa pessoa;
	
	@ManyToOne
	@JoinColumn(name = "codatracaofk")
	private Atracoes atracaoes;

	public Long getCodpessoasatracoes() {
		return codpessoasatracoes;
	}

	public void setCodpessoasatracoes(Long codpessoasatracoes) {
		this.codpessoasatracoes = codpessoasatracoes;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Atracoes getAtracaoes() {
		return atracaoes;
	}

	public void setAtracaoes(Atracoes atracaoes) {
		this.atracaoes = atracaoes;
	}

	public Pessoasatracoes(Long codpessoasatracoes, Pessoa pessoa, Atracoes atracaoes) {
		super();
		this.codpessoasatracoes = codpessoasatracoes;
		this.pessoa = pessoa;
		this.atracaoes = atracaoes;
	}

	public Pessoasatracoes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
