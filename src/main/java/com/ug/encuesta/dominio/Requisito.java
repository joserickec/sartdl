package com.ug.encuesta.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name="requisitos")
public class Requisito {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int requisito_id;
	
	//private int subgrupo_id;
	private String literal;
	private String descripcion;
	private Boolean tiene_sangria;
	private Boolean es_calificable;
	private Double peso_relativo;
	
	@ManyToOne
	@JoinColumn(name="subgrupo_id")
	@JsonBackReference
	private Subgrupo subgrupo;

	
	
	public int getRequisito_id() {
		return requisito_id;
	}
	public void setRequisito_id(int requisito_id) {
		this.requisito_id = requisito_id;
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
	public Boolean getTiene_sangria() {
		return tiene_sangria;
	}
	public void setTiene_sangria(Boolean tiene_sangria) {
		this.tiene_sangria = tiene_sangria;
	}
	public Boolean getEs_calificable() {
		return es_calificable;
	}
	public void setEs_calificable(Boolean es_calificable) {
		this.es_calificable = es_calificable;
	}
	public Double getPeso_relativo() {
		return peso_relativo;
	}
	public void setPeso_relativo(Double peso_relativo) {
		this.peso_relativo = peso_relativo;
	}
	public Subgrupo getSubgrupo() {
		return subgrupo;
	}
	public void setSubgrupo(Subgrupo subgrupo) {
		this.subgrupo = subgrupo;
	}

	
	
	
}
