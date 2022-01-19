package com.inti.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;

@Entity
public class Etudiant extends Personne implements Serializable {
	private double moyenne;

	public double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}

	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etudiant(String nomPersonne, String prenomPersonne, Date dateNaissance, String username, String password,
			String email, Set<Matiere> matieres, Set<Role> roles, Classe classe) {
		super(nomPersonne, prenomPersonne, dateNaissance, username, password, email, matieres, roles, classe);
		// TODO Auto-generated constructor stub
	}

	public Etudiant(String nomPersonne, String prenomPersonne, Date dateNaissance, String username, String password,
			String email) {
		super(nomPersonne, prenomPersonne, dateNaissance, username, password, email);
		// TODO Auto-generated constructor stub
	}

	public Etudiant(String nomPersonne, String prenomPersonne, Date dateNaissance, String username, String password,
			String email, double moyenne) {
		super(nomPersonne, prenomPersonne, dateNaissance, username, password, email);
		this.moyenne = moyenne;
	}

}
