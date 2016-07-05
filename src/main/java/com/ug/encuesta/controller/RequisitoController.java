package com.ug.encuesta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ug.encuesta.dominio.Requisito;
import com.ug.encuesta.repository.RequisitoRepository;

@RestController
public class RequisitoController {

	
	@Autowired
	private RequisitoRepository requisitoRepository;
	
	@RequestMapping(value="/requisitos",method=RequestMethod.GET)
	public Iterable<Requisito> findAll(){
		return requisitoRepository.findAll();
	}
	
	@RequestMapping(value="/subgrupos/{subgrupo_id}/requisitos",method=RequestMethod.GET)
	public Iterable<Requisito> getRequisitoBySubGrupo(@PathVariable int subgrupo_id){
		return requisitoRepository.getRequisitoBySubGrupo(subgrupo_id);
	}
	
}
