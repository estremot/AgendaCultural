package com.etec.AgendaCultural.model;

import java.sql.Date;
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
public class Eventos {
//-- eventos = {codevento, nomeevento, data, horario, coddatacomemorativafk, codescolafk}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codevento;
	
	@Column
	@Size (min = 2 , max = 80 ) 
	@NotNull(message = "O nome do evento deve ter um valor!")
    private String nomeevento;
	
	@Column
	@Size (min = 2 , max = 80 ) 
	@NotNull(message = "A data do evento deve ter um valor!")
    private Date data;
	
	@Column
	@Size (min = 2 , max = 80 ) 
	@NotNull(message = "O horário do evento deve ter um valor!")
    private Time horario;
	
	@ManyToOne
	@JoinColumn(name = "coddatacomemorativafk")
	private Datacomemorativa datacomemorativa;
	
	@ManyToOne
	@JoinColumn(name = "codescolafk")
	private Escola escola;

	public Long getCodevento() {
		return codevento;
	}

	public void setCodevento(Long codevento) {
		this.codevento = codevento;
	}

	public String getNomeevento() {
		return nomeevento;
	}

	public void setNomeevento(String nomeevento) {
		this.nomeevento = nomeevento;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Time getHorario() {
		return horario;
	}

	public void setHorario(Time horario) {
		this.horario = horario;
	}

	public Datacomemorativa getDatacomemorativa() {
		return datacomemorativa;
	}

	public void setDatacomemorativa(Datacomemorativa datacomemorativa) {
		this.datacomemorativa = datacomemorativa;
	}

	public Escola getEscola() {
		return escola;
	}

	public void setEscola(Escola escola) {
		this.escola = escola;
	}

	public Eventos(Long codevento,
			@Size(min = 2, max = 80) @NotNull(message = "O nome do evento deve ter um valor!") String nomeevento,
			@Size(min = 2, max = 80) @NotNull(message = "A data do evento deve ter um valor!") Date data,
			@Size(min = 2, max = 80) @NotNull(message = "O horário do evento deve ter um valor!") Time horario,
			Datacomemorativa datacomemorativa, Escola escola) {
		super();
		this.codevento = codevento;
		this.nomeevento = nomeevento;
		this.data = data;
		this.horario = horario;
		this.datacomemorativa = datacomemorativa;
		this.escola = escola;
	}

	public Eventos() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
