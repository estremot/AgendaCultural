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
public class Fotoatracao {
//-- FotoAtração = {codFotoAtração, descrição, imagemfotoatracao, codatracaofk}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codfotoatracao;
	
	@Column
	@Size (min = 2 , max = 80 ) 
	@NotNull(message = "A Descrição da Atração deve ter um valor!")
    private String descricao;
	
	@Column
    private byte[] imagemfotoatracao;

	@ManyToOne
	@JoinColumn(name = "codatracaofk")
	private Atracoes atracoes;

	public Long getCodfotoatracao() {
		return codfotoatracao;
	}

	public void setCodfotoatracao(Long codfotoatracao) {
		this.codfotoatracao = codfotoatracao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public byte[] getImagemfotoatracao() {
		return imagemfotoatracao;
	}

	public void setImagemfotoatracao(byte[] imagemfotoatracao) {
		this.imagemfotoatracao = imagemfotoatracao;
	}

	public Atracoes getAtracoes() {
		return atracoes;
	}

	public void setAtracoes(Atracoes atracoes) {
		this.atracoes = atracoes;
	}

	public Fotoatracao(Long codfotoatracao,
			@Size(min = 2, max = 80) @NotNull(message = "A Descrição da Atração deve ter um valor!") String descricao,
			byte[] imagemfotoatracao, Atracoes atracoes) {
		super();
		this.codfotoatracao = codfotoatracao;
		this.descricao = descricao;
		this.imagemfotoatracao = imagemfotoatracao;
		this.atracoes = atracoes;
	}

	public Fotoatracao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
