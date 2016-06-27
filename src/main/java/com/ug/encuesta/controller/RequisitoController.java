package com.ug.encuesta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ug.encuesta.dominio.Requisito;
import com.ug.encuesta.repository.RequisitoRepository;

@RestController
public class RequisitoController {

	
	@Autowired
	private RequisitoRepository RequisitoRepository;
	
	
	@RequestMapping (value="/requisitos", method=RequestMethod.POST)
	public ResponseEntity<?> save(@RequestBody Requisito subgrupo)
	{
		RequisitoRepository.save(subgrupo);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	
	
	@RequestMapping (value="/requisitos", method=RequestMethod.GET)
	public ResponseEntity<?> findAll() {
			Iterable<Requisito> requisitos= RequisitoRepository.findAll();
			return new ResponseEntity<>(requisitos,HttpStatus.OK);
	}
	
	
	@RequestMapping (value="/requisitos/{requisito_id}", method=RequestMethod.GET)
	public ResponseEntity<?> findOne(@PathVariable int requisito_id) {
			
		Requisito  requisitos= RequisitoRepository.findOne(requisito_id);
			
			return new ResponseEntity<>(requisitos,HttpStatus.OK);
			
	}
	
	
}
