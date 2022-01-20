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
<<<<<<< HEAD
	private Double duree;
=======
	private String duree;
>>>>>>> 26f14e2764a665322accf652aa09c2b9f198d1a6
	@Lob
	private byte[] fichierExamen;

	@ManyToOne
	@JoinColumn(name = "id_matiere")
	private Matiere matiere;


	@OneToOne(mappedBy= "examen")
	@JoinColumn(name = "id_correction")
	private Correction correction;

	public Examen() {

	}

<<<<<<< HEAD
	public Examen(Long idExamen, String nomExamen, Double duree, byte[] fichierExamen, Matiere matiere) {
=======
	public Examen(Long idExamen, String nomExamen, String duree, byte[] fichierExamen, Matiere matiere) {
>>>>>>> 26f14e2764a665322accf652aa09c2b9f198d1a6
		super();
		this.idExamen = idExamen;
		this.nomExamen = nomExamen;
		this.duree = duree;
		this.fichierExamen = fichierExamen;
		this.matiere = matiere;
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

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
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

<<<<<<< HEAD
	public void setDuree(Double duree) {
=======
	public String getDuree() {
		return duree;
	}

	public void setDuree(String duree) {
>>>>>>> 26f14e2764a665322accf652aa09c2b9f198d1a6
		this.duree = duree;
	}

	@Override
	public String toString() {
		return "Examen [idExamen=" + idExamen + ", nomExamen=" + nomExamen + ", duree=" + duree + ", fichierExamen="
				+ Arrays.toString(fichierExamen) + ", matiere=" + matiere + "]";
	}

}
