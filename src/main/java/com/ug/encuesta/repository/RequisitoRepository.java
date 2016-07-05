package com.ug.encuesta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ug.encuesta.dominio.Requisito;


public interface RequisitoRepository extends CrudRepository<Requisito, Integer>{

	
	//@Query("select s from requisitos s where s.requisitos.requisito_id=?1")
	@Query(value="select s.* from requisitos s where s.requisito_id=?1",nativeQuery=true)
	List<Requisito> getRequisitoBySubGrupo(int subgrupo_id);
	
	
	
	
	
	
}
