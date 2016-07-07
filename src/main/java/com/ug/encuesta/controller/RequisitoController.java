package com.ug.encuesta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ug.encuesta.dominio.Requisito;
import com.ug.encuesta.repository.RequisitoRepository;

@RestController
public class RequisitoController {

	
	@Autowired
	private RequisitoRepository requisitoRepository;
	
	// Ingresar Datos
	@RequestMapping(value="/requisitos",method=RequestMethod.POST)
	public ResponseEntity<?> save(@RequestBody Requisito requisitos){
		requisitoRepository.save(requisitos);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	// Obtener Datos
	@RequestMapping(value="/requisitos",method=RequestMethod.GET)
	public ResponseEntity<?> findAll(@RequestParam(defaultValue="true") boolean control){
		Iterable<Requisito> requisitos;
		
		if(control)
			requisitos= requisitoRepository.findAll();
		else
			requisitos= requisitoRepository.getRequisito();
		
		return new ResponseEntity<>(requisitos,HttpStatus.OK);
	}
	
	
	
	
	/*
	
	
	@RequestMapping(value="/requisitos",method=RequestMethod.GET)
	public Iterable<Requisito> findAll(){
		return requisitoRepository.findAll();
	}
	*/
	
	@RequestMapping(value="/subgrupos/{subgrupo_id}/requisitos",method=RequestMethod.GET)
	public Iterable<Requisito> getRequisitoBySubGrupo(@PathVariable int subgrupo_id){
		return requisitoRepository.getRequisitoBySubGrupo(subgrupo_id);
	}
	
}
