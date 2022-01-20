package com.inti.entities;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Examen implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idExamen;
	private String nomExamen;
	@Temporal(TemporalType.DATE)
	private Date dateExamen;

	private String duree;
	@Lob
	private byte[] fichierExamen;

	@ManyToOne
	@JoinColumn(name = "id_cours")
	private Cours cours;

	@OneToOne(mappedBy = "examen")
	@JoinColumn(name = "id_correction")
	private Correction correction;

	public Examen() {

	}

	public Examen(String nomExamen, Date dateExamen, String duree, byte[] fichierExamen) {
		super();
		this.nomExamen = nomExamen;
		this.dateExamen = dateExamen;
		this.duree = duree;
		this.fichierExamen = fichierExamen;
	}

	public Long getIdExamen() {
		return idExamen;
	}

	public void setIdExamen(Long idExamen) {
		this.idExamen = idExamen;
	}

	public String getNomExamen() {
		return nomExamen;
	}

	public void setNomExamen(String nomExamen) {
		this.nomExamen = nomExamen;
	}

	public byte[] getFichierExamen() {
		return fichierExamen;
	}

	public void setFichierExamen(byte[] fichierExamen) {
		this.fichierExamen = fichierExamen;
	}

	

	public Cours getCours() {
		return cours;
	}

	public void setCours(Cours cours) {
		this.cours = cours;
	}

	public Correction getCorrection() {
		return correction;
	}

	public void setCorrection(Correction correction) {
		this.correction = correction;
	}

	public Date getDateExamen() {
		return dateExamen;
	}

	public void setDateExamen(Date dateExamen) {
		this.dateExamen = dateExamen;
	}

	public String getDuree() {
		return duree;
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}

	@Override
	public String toString() {
		return "Examen [idExamen=" + idExamen + ", nomExamen=" + nomExamen + ", dateExamen=" + dateExamen + ", duree="
				+ duree + ", fichierExamen=" + Arrays.toString(fichierExamen) + ", cours=" + cours + ", correction="
				+ correction + "]";
	}

	

}
