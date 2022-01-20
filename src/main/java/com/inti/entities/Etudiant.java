package com.inti.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("etudiant")
public class Etudiant extends Personne implements Serializable {
	private Double moyenne;

	public Double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(Double moyenne) {
		this.moyenne = moyenne;
	}

	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etudiant(String nomPersonne, String prenomPersonne, Date dateNaissance, String username, String password,
			String email, Set<Cours> courss, Set<Role> roles) {
		super(nomPersonne, prenomPersonne, dateNaissance, username, password, email, courss, roles);
		// TODO Auto-generated constructor stub
	}

	public Etudiant(String nomPersonne, String prenomPersonne, Date dateNaissance, String username, String password,
			String email) {
		super(nomPersonne, prenomPersonne, dateNaissance, username, password, email);
		// TODO Auto-generated constructor stub
	}

	public Etudiant(String nomPersonne, String prenomPersonne, Date dateNaissance, String username, String password,
			String email, Double moyenne) {
		super(nomPersonne, prenomPersonne, dateNaissance, username, password, email);
		this.moyenne = moyenne;
	}

}
