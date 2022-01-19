package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Presentiel extends Cours implements Serializable{
	
	private String salle;
	

	public Presentiel() {
		super();
	}


	public Presentiel(String chapitre, int nbrHeure, byte [] fichierCours) {
		super(chapitre, nbrHeure, fichierCours);
	}


	public Presentiel(String chapitre, int nbrHeure, byte [] fichierCours, String salle) {
		super(chapitre, nbrHeure, fichierCours);
		this.salle = salle;
	}


	public String getSalle() {
		return salle;
	}


	public void setSalle(String salle) {
		this.salle = salle;
	}
	
	
	
}
