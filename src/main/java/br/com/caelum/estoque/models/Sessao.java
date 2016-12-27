package br.com.caelum.estoque.models;

import java.time.LocalTime;

import javax.persistence.Entity;

public class Sessao {

	private LocalTime horario;
	private Sala sala;
	
	public Sessao(LocalTime horario, Sala sala) {
		this.horario = horario;
		this.sala = sala;
	}
	
	public LocalTime getHorario() {
		return horario;
	}
	
	public Sala getSala() {
		return sala;
	}
	
	
	
}
