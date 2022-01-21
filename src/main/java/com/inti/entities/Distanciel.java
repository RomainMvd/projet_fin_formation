package com.inti.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("distanciel")
public class Distanciel extends Cours implements Serializable {

	private String lienZoom;

	public Distanciel(String nomMatiere, Double nbrHeure, Set<Evaluation> evaluations, Set<Examen> examens) {
		super(nomMatiere, nbrHeure, evaluations, examens);
		// TODO Auto-generated constructor stub
	}

	public Distanciel(String nomMatiere, Double nbrHeure) {
		super(nomMatiere, nbrHeure);
		// TODO Auto-generated constructor stub
	}

	public Distanciel(String nomMatiere, Double nbrHeure, Set<Evaluation> evaluations, Set<Examen> examens,
			String lienZoom) {
		super(nomMatiere, nbrHeure, evaluations, examens);
		this.lienZoom = lienZoom;
	}

	public Distanciel(String nomMatiere, Double nbrHeure, String lienZoom) {
		super(nomMatiere, nbrHeure);
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
