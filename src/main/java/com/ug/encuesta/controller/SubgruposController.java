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
import com.ug.encuesta.dominio.Subgrupo;
import com.ug.encuesta.repository.SubgrupoRepository;

@RestController
public class SubgruposController {
	
	@Autowired
	private SubgrupoRepository SubgrupoRepository;
	
	// Ingresar Datos
	
	@RequestMapping (value="/subgrupos", method=RequestMethod.POST)
	public ResponseEntity<?> save(@RequestBody Subgrupo subgrupo)
	{
		SubgrupoRepository.save(subgrupo);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	// Obtener Datos de todos 
	@RequestMapping (value="/subgrupos", method=RequestMethod.GET)
	public ResponseEntity<?> findAll (@RequestParam(defaultValue="true") boolean control) {
			Iterable<Subgrupo> subgrupos;
			
			if (control)
				subgrupos = SubgrupoRepository.findAll();
				else
				subgrupos = SubgrupoRepository.getSubgrupo();
			return new ResponseEntity<>(subgrupos,HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	@RequestMapping (value="/grupos/{grupo_id}/subgrupos", method=RequestMethod.GET)
	public Iterable<Subgrupo> getSubGrupoByGrupo(@PathVariable int grupo_id) {
		
		return SubgrupoRepository.getSubGrupoByGrupo(grupo_id);
		
	}
	
	
	// Metodo Iterable
	
	@RequestMapping (value="/subgrupos", method=RequestMethod.GET)
	public Iterable<Subgrupo> findAll(){
		return SubgrupoRepository.findAll();
		
	}
	
	
	// Metodo ResponseEntity
	
	//@RequestMapping (value="/subgrupos", method=RequestMethod.GET)
	//public ResponseEntity<?> findAll() {
	//		Iterable<Subgrupo> subgrupos= SubgrupoRepository.findAll();
	//		return new ResponseEntity<>(subgrupos,HttpStatus.OK);
	//}
	
	


	
	@RequestMapping (value="/subgrupos/{subgrupo_id}", method=RequestMethod.GET)
	public ResponseEntity<?> findOne(@PathVariable int subgrupo_id) {
			
		Subgrupo  subgrupos= SubgrupoRepository.findOne(subgrupo_id);
			
			return new ResponseEntity<>(subgrupos,HttpStatus.OK);
			
	}
	

	// Obtener Datos por Literal
	
	@RequestMapping(value="/subgrupos/{literal}",method=RequestMethod.GET)
	public ResponseEntity<?> findByLiteral(@PathVariable String literal){
		Iterable<Subgrupo> subgrupos= SubgrupoRepository.findByLiteral(literal);
		return new ResponseEntity<>(subgrupos,HttpStatus.OK);
	}
	
	// Obtener Datos por Descripcion
	@RequestMapping(value="/subgrupos/{literal}/{descripcion}",method=RequestMethod.GET)
	public ResponseEntity<?> findByLiteral(@PathVariable String literal,@PathVariable String descripcion){
		Iterable<Subgrupo> subgrupos= SubgrupoRepository.findByLiteralOrDescripcion(literal,descripcion);
		return new ResponseEntity<>(subgrupos,HttpStatus.OK);
	}
	
	
	
	
}
