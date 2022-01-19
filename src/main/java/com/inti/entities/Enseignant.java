package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("enseignant")
public class Enseignant extends Personne implements Serializable {
	private double salaire;

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public Enseignant(String nomPersonne, String prenomPersonne, Date dateNaissance, String username, String password,
			String email, double salaire) {
		super(nomPersonne, prenomPersonne, dateNaissance, username, password, email);
		this.salaire = salaire;
	}

	public Enseignant() {
		super();
	}

}
