package com.inti.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("enseignant")
public class Enseignant extends Personne implements Serializable {
	
	private Double salaire;

	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enseignant(String nomPersonne, String prenomPersonne, Date dateNaissancePersonne, String username,
			String password, String email, boolean enabled, byte[] photoProfil, Set<Role> roles, Set<Cours> courss) {
		super(nomPersonne, prenomPersonne, dateNaissancePersonne, username, password, email, enabled, photoProfil, roles,
				courss);
		// TODO Auto-generated constructor stub
	}

	public Enseignant(String nomPersonne, String prenomPersonne, Date dateNaissancePersonne, String username,
			String password, String email, boolean enabled, byte[] photoProfil) {
		super(nomPersonne, prenomPersonne, dateNaissancePersonne, username, password, email, enabled, photoProfil);
		// TODO Auto-generated constructor stub
	}

	public Enseignant(String nomPersonne, String prenomPersonne, Date dateNaissancePersonne, String username,
			String password, String email, boolean enabled, byte[] photoProfil, Set<Role> roles, Set<Cours> courss,
			Double salaire) {
		super(nomPersonne, prenomPersonne, dateNaissancePersonne, username, password, email, enabled, photoProfil,
				roles, courss);
		this.salaire = salaire;
	}

	public Enseignant(String nomPersonne, String prenomPersonne, Date dateNaissancePersonne, String username,
			String password, String email, boolean enabled, byte[] photoProfil, Double salaire) {
		super(nomPersonne, prenomPersonne, dateNaissancePersonne, username, password, email, enabled, photoProfil);
		this.salaire = salaire;
	}

	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Enseignant [salaire=" + salaire + "]";
	}

	

}
