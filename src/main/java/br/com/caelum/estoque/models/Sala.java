package br.com.caelum.estoque.models;

public class Sala {
	
	private String nome;
	private Cinema cinema;
	
	public Sala(String nome, Cinema cinema) {
		this.nome = nome;
		this.cinema = cinema;
	}

	public String getNome() {
		return nome;
	}

	public Cinema getCinema() {
		return cinema;
	}
	
}
