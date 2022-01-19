package com.inti.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Matiere implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMatiere;
	private String nomMatiere;

	@OneToMany(mappedBy = "matiere")
	private Set<Examen> examen = new HashSet<>();

	@OneToMany(mappedBy = "matiere")
	private Set<Cours> cours = new HashSet<>();

	public Matiere() {

	}

	public Matiere(Long idMatiere, String nomMatiere) {
		super();
		this.idMatiere = idMatiere;
		this.nomMatiere = nomMatiere;
	}

	public Long getIdMatiere() {
		return idMatiere;
	}

	public void setIdMatiere(Long idMatiere) {
		this.idMatiere = idMatiere;
	}

	public String getNomMatiere() {
		return nomMatiere;
	}

	public void setNomMatiere(String nomMatiere) {
		this.nomMatiere = nomMatiere;
	}

	public Set<Examen> getExamen() {
		return examen;
	}

	public void setExamen(Set<Examen> examen) {
		this.examen = examen;
	}

	public Set<Cours> getCours() {
		return cours;
	}

	public void setCours(Set<Cours> cours) {
		this.cours = cours;
	}

	@Override
	public String toString() {
		return "Matiere [idMatiere=" + idMatiere + ", nomMatiere=" + nomMatiere + "]";
	}
}
