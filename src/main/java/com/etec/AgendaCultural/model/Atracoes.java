package com.etec.AgendaCultural.model;

import java.sql.Time;

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
public class Atracoes {
	
	//-- atrações = {codatração, descrição, codeventofk, duração}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codatracao;
	
	@Column
	@Size (min = 2 , max = 80 ) 
	@NotNull(message = "A Descrição da Atração deve ter um valor!")
    private String descricao;

	@ManyToOne
	@JoinColumn(name = "codeventofk")
	private Eventos eventos;
	
	@Column
	@Size (min = 2 , max = 80 ) 
	@NotNull(message = "A Descrição da Atração deve ter um valor!")
    private Time duracao;

	public Long getCodatracao() {
		return codatracao;
	}

	public void setCodatracao(Long codatracao) {
		this.codatracao = codatracao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Eventos getEventos() {
		return eventos;
	}

	public void setEventos(Eventos eventos) {
		this.eventos = eventos;
	}

	public Time getDuracao() {
		return duracao;
	}

	public void setDuracao(Time duracao) {
		this.duracao = duracao;
	}

	public Atracoes(Long codatracao,
			@Size(min = 2, max = 80) @NotNull(message = "A Descrição da Atração deve ter um valor!") String descricao,
			Eventos eventos,
			@Size(min = 2, max = 80) @NotNull(message = "A Descrição da Atração deve ter um valor!") Time duracao) {
		super();
		this.codatracao = codatracao;
		this.descricao = descricao;
		this.eventos = eventos;
		this.duracao = duracao;
	}

	public Atracoes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
