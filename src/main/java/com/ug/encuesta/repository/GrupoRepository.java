package com.ug.encuesta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.ug.encuesta.dominio.Grupo;


public interface GrupoRepository extends CrudRepository<Grupo, Integer> {

	@Query("select new com.ug.encuesta.dominio.Grupo(g.grupo_id,g.literal,g.descripcion) from grupos g")
	public List<Grupo> getGrupo();

	public List<Grupo> findByLiteral (String arg);
	public List<Grupo> findByLiteralAndDescripcion (String arg ,String des);
	public List<Grupo> findByLiteralOrDescripcion (String arg ,String des);	
	
	
}
