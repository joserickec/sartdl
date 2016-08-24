package com.ug.encuesta.dominio;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name="subgrupos")
public class Subgrupo {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int subgrupo_id;
	
	private String literal;
	
	private String descripcion;
	
	public Subgrupo() {
	
	}
	

	public Subgrupo(int subgrupo_id, String literal, String descripcion) {
		super();
		this.subgrupo_id = subgrupo_id;
		this.literal = literal;
		this.descripcion = descripcion;
	
	}
	
	
	@OneToMany(mappedBy="subgrupo")
	@JsonManagedReference
	private List<Requisito> requisitos;
	
	
	
	
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
