package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Classe implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClasse;
	private String nomClasse;

	@OneToMany(targetEntity = Personne.class, mappedBy = "classe")
	private List<Personne> personnes = new ArrayList<>();

	public Classe() {
	}

	public Classe(Long idClasse, String nomClasse) {
		super();
		this.idClasse = idClasse;
		this.nomClasse = nomClasse;
	}

	public Long getIdClasse() {
		return idClasse;
	}

	public void setIdClasse(Long idClasse) {
		this.idClasse = idClasse;
	}

	public String getNomClasse() {
		return nomClasse;
	}

	public void setNomClasse(String nomClasse) {
		this.nomClasse = nomClasse;
	}

	
	public List<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}

	@Override
	public String toString() {
		return "Classe [idClasse=" + idClasse + ", nomClasse=" + nomClasse + "]";
	}


}
