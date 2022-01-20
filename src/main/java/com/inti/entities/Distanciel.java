package com.inti.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("distanciel")
public class Distanciel extends Cours implements Serializable {

	private String lienZoom;

	public Distanciel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Distanciel(String nomCours, String nomMatiere, Double nbrHeure, Set<Evaluation> evaluations,
			Set<Examen> examens) {
		super(nomCours, nomMatiere, nbrHeure, evaluations, examens);
		// TODO Auto-generated constructor stub
	}

	public Distanciel(String nomCours, String nomMatiere, Double nbrHeure) {
		super(nomCours, nomMatiere, nbrHeure);
		// TODO Auto-generated constructor stub
	}

	public Distanciel(String nomCours, String nomMatiere, Double nbrHeure, Set<Evaluation> evaluations,
			Set<Examen> examens, String lienZoom) {
		super(nomCours, nomMatiere, nbrHeure, evaluations, examens);
		this.lienZoom = lienZoom;
	}

	public Distanciel(String nomCours, String nomMatiere, Double nbrHeure, String lienZoom) {
		super(nomCours, nomMatiere, nbrHeure);
		this.lienZoom = lienZoom;
	}

	public String getLienZoom() {
		return lienZoom;
	}

	public void setLienZoom(String lienZoom) {
		this.lienZoom = lienZoom;
	}

	@Override
	public String toString() {
		return "Distanciel [lienZoom=" + lienZoom + "]";
	}

	
	
}
