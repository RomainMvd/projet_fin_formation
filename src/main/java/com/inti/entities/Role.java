package com.inti.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Role implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRole;
	private String nomRole;

<<<<<<< HEAD
<<<<<<< HEAD
	public Role() {
	}

	public Role(Long idRole, String nomRole) {
		this.idRole = idRole;
=======
=======

>>>>>>> f4431345407cb4f45afc84bf214a0899ad06906a
//	@ManyToMany(fetch = FetchType.EAGER)
//	@JoinTable(name = "Profil", joinColumns = @JoinColumn(name = "id_Role", referencedColumnName = "idRole"), inverseJoinColumns = @JoinColumn(name = "id_Personne", referencedColumnName = "idPersonne"))
//	private Set<Personne> personnes = new HashSet<>();

	/*
	 * @ManyToMany(fetch = FetchType.EAGER)
	 * 
	 * @JoinTable(name = "Profil", joinColumns = @JoinColumn(name = "id_Role",
	 * referencedColumnName = "idRole"), inverseJoinColumns = @JoinColumn(name =
	 * "id_Personne", referencedColumnName = "idPersonne")) private Set<Personne>
	 * personnes = new HashSet<>();
	 */

	public Role() {
	}

	public Role(String nomRole) {
<<<<<<< HEAD
>>>>>>> localRomain
=======

	public Role() {
	}

	public Role(Long idRole, String nomRole) {
		this.idRole = idRole;
>>>>>>> f4431345407cb4f45afc84bf214a0899ad06906a
		this.nomRole = nomRole;
	}

	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	public String getNomRole() {
		return nomRole;
	}

	public void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	}

<<<<<<< HEAD
<<<<<<< HEAD
=======
=======

>>>>>>> f4431345407cb4f45afc84bf214a0899ad06906a
//	public Set<Personne> getPersonnes() {
//		return personnes;
//	}
//
//	public void setPersonnes(Set<Personne> personnes) {
//		this.personnes = personnes;
//	}

	/*
	 * public Set<Personne> getPersonnes() { return personnes; }
	 * 
	 * public void setPersonnes(Set<Personne> personnes) { this.personnes =
	 * personnes; }
	 */

<<<<<<< HEAD
>>>>>>> localRomain
=======
>>>>>>> f4431345407cb4f45afc84bf214a0899ad06906a
	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", nomRole=" + nomRole + "]";
	}

}
