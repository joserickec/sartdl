package com.ug.encuesta.dominio;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name="grupos")
public class Grupo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int grupo_id;
	private String literal;
	private String descripcion;
	
	
	public Grupo(){
		
	}
	
	
	public Grupo(int grupo_id, String literal, String descripcion) {
		super();
		this.grupo_id = grupo_id;
		this.literal = literal;
		this.descripcion = descripcion;
	}
	
	
	@OneToMany(mappedBy="grupo")
	@JsonManagedReference
	private List<Subgrupo> subgrupos;
	
	
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
	public List<Subgrupo> getSubgrupos() {
		return subgrupos;
	}
	public void setSubgrupos(List<Subgrupo> subgrupos) {
		this.subgrupos = subgrupos;
	}
	
	
	
	
}
