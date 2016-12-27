package br.com.caelum.estoque.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Filme {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String genero;
	private double duracao;

	public Filme(String nome, String genero, double duracao) {
		this.nome = nome;
		this.genero = genero;
		this.duracao = duracao;
	}
	public Filme() {
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	public String getGenero() {
		return genero;
	}
	
	public double getDuracao() {
		return duracao;
	}
	
}
