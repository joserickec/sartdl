package com.ug.encuesta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.ug.encuesta.dominio.Requisito;


public interface RequisitoRepository extends CrudRepository<Requisito, Integer>{

	
	//@Query("select s from requisitos s where s.requisitos.requisito_id=?1")
	@Query(value="select s.* from requisitos s where s.requisito_id=?1",nativeQuery=true)
	List<Requisito> getRequisitoBySubGrupo(int subgrupo_id);
	
	
	@Query("select new com.ug.encuesta.dominio.Requisito(r.requisito_id,r.literal,r.descripcion) from requisitos r")	
	public List<Requisito> getRequisito();
	
	public List<Requisito> findByLiteral (String arg);
	public List<Requisito> findByLiteralAndDescripcion (String arg ,String des);
	public List<Requisito> findByLiteralOrDescripcion (String arg ,String des);	
	
	
	
}
