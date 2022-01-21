package com.inti.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("presentiel")
public class Presentiel extends Cours implements Serializable {

	private String salle;

	public Presentiel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Presentiel(String nomCours, String nomMatiere, Double nbrHeure) {
		super(nomCours, nomMatiere, nbrHeure);
		// TODO Auto-generated constructor stub
	}

	public Presentiel(String nomCours, String nomMatiere, Double nbrHeure, Set<Evaluation> evaluations, Set<Examen> examens,
			String salle) {
		super(nomCours, nomMatiere, nbrHeure, evaluations, examens);

		this.salle = salle;
	}

	public Presentiel(String nomCours, String nomMatiere, Double nbrHeure, String salle) {
		super(nomCours, nomMatiere, nbrHeure);
		this.salle = salle;
	}

	public String getSalle() {
		return salle;
	}

	public void setSalle(String salle) {
		this.salle = salle;
	}

	@Override
	public String toString() {
		return "Presentiel [salle=" + salle + "]";
	}

}
