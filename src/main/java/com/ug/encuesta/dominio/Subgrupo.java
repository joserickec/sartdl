package com.ug.encuesta.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="subgrupos")
public class Subgrupo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int subgrupo_id;
	private int grupo_id;
	private String literal;
	private String descripcion;
	public int getSubgrupo_id() {
		return subgrupo_id;
	}
	public void setSubgrupo_id(int subgrupo_id) {
		this.subgrupo_id = subgrupo_id;
	}
	public int getGrupo_id() {
		return grupo_id;
	}
	public void setGrupo_id(int grupo_id) {
		this.grupo_id = grupo_id;
	}
	public String getLiteral() {
		return literal;
	}
	public void setLiteral(String literal) {
		this.literal = literal;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	
	
}
