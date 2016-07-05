package com.ug.encuesta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.ug.encuesta.dominio.Subgrupo;

public interface SubgrupoRepository extends CrudRepository<Subgrupo, Integer> {

	@Query("select s from subgrupos s where s.grupo.grupo_id=?1")
	//@Query(value="select s.* from subgrupos s where s.grupo_id=?1",nativeQuery=true)
	List<Subgrupo> getSubGrupoByGrupo(int grupo_id);
	
	@Query("select new com.ug.encuesta.dominio.Subgrupo(g.subgrupo_id,g.literal,g.descripcion) from subgrupos g")	
	public List<Subgrupo> getSubgrupo();
	
	public List<Subgrupo> findByLiteral (String arg);
	public List<Subgrupo> findByLiteralAndDescripcion (String arg ,String des);
	public List<Subgrupo> findByLiteralOrDescripcion (String arg ,String des);	
	
	
}
