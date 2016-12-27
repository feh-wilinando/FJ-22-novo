package br.com.caelum.estoque.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.caelum.estoque.models.Filme;

@Repository
public class FilmeDao {

	@PersistenceContext
	private EntityManager manager;
	
	public void adiciona(Filme filme){
		manager.persist(filme);
	}
	
}
