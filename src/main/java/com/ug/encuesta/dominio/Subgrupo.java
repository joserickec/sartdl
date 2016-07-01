package com.ug.encuesta.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name="subgrupos")
public class Subgrupo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int subgrupo_id;
	//private int grupo_id;
	private String literal;
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name="grupo_id")
	@JsonBackReference
	private Grupo grupo;
	
	
	public int getSubgrupo_id() {
		return subgrupo_id;
	}
	public void setSubgrupo_id(int subgrupo_id) {
		this.subgrupo_id = subgrupo_id;
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
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	
	
	
}
