package br.com.caelum.estoque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.caelum.estoque.dao.FilmeDao;
import br.com.caelum.estoque.models.Filme;

@Controller
public class FilmeController {

	@Autowired
	private FilmeDao dao;
	
	@RequestMapping(value="/filme",method=RequestMethod.GET)
	public String filme(){
		return "filme";
	}
	
	@RequestMapping(value="/filme",method=RequestMethod.POST)
	public void salva(Filme filme, BindingResult result){
		System.out.println(filme.getNome());
		dao.adiciona(filme);
	}
}
