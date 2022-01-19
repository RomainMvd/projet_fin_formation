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

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "Profil", joinColumns = @JoinColumn(name = "id_Role", referencedColumnName = "idRole"), inverseJoinColumns = @JoinColumn(name = "id_Personne", referencedColumnName = "idPersonne"))
	private Set<Personne> personnes = new HashSet<>();

	public Role() {
	}

	public Role(Long idRole, String nomRole) {
		super();
		this.idRole = idRole;
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

	public Set<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(Set<Personne> personnes) {
		this.personnes = personnes;
	}

	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", nomRole=" + nomRole + "]";
	}


}
