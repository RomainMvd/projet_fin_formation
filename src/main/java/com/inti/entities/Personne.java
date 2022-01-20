package com.inti.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // Une seule table
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING) // La colonne discriminante
public class Personne implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPersonne;
	private String nomPersonne;
	private String prenomPersonne;
	private Date dateNaissance;
	@Column(unique = true)
	private String username;
	private String password;
	private String email;
	private boolean enabled = true;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "Lecture", joinColumns = @JoinColumn(name = "id_personne", referencedColumnName = "idPersonne"), inverseJoinColumns = @JoinColumn(name = "id_matiere", referencedColumnName = "idMatiere"))
	private Set<Cours> courss = new HashSet<>();

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "Profil", joinColumns = @JoinColumn(name = "id_personnee", referencedColumnName = "idPersonne"), inverseJoinColumns = @JoinColumn(name = "id_rolee", referencedColumnName = "idRole"))
	private Set<Role> roles = new HashSet<>();

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_classe")
	private Classe classe;

	public Personne(String nomPersonne, String prenomPersonne, Date dateNaissance, String username, String password,
			String email) {
		this.nomPersonne = nomPersonne;
		this.prenomPersonne = prenomPersonne;
		this.dateNaissance = dateNaissance;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public Personne() {
	}

	public Personne(String nomPersonne, String prenomPersonne, Date dateNaissance, String username, String password,
			String email, Set<Cours> courss, Set<Role> roles) {
		super();
		this.nomPersonne = nomPersonne;
		this.prenomPersonne = prenomPersonne;
		this.dateNaissance = dateNaissance;
		this.username = username;
		this.password = password;
		this.email = email;
		this.courss = courss;
		this.roles = roles;
	}

	public Long getIdPersonne() {
		return idPersonne;
	}

	public void setIdPersonne(Long idPersonne) {
		this.idPersonne = idPersonne;
	}

	public String getNomPersonne() {
		return nomPersonne;
	}

	public void setNomPersonne(String nomPersonne) {
		this.nomPersonne = nomPersonne;
	}

	public String getPrenomPersonne() {
		return prenomPersonne;
	}

	public void setPrenomPersonne(String prenomPersonne) {
		this.prenomPersonne = prenomPersonne;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Set<Cours> getCourss() {
		return courss;
	}

	public void setCourss(Set<Cours> courss) {
		this.courss = courss;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	@Override
	public String toString() {
		return "Personne [idPersonne=" + idPersonne + ", nomPersonne=" + nomPersonne + ", prenomPersonne="
				+ prenomPersonne + ", dateNaissance=" + dateNaissance + ", username=" + username + ", password="
				+ password + ", email=" + email + ", classe=" + classe + "]";
	}

}
