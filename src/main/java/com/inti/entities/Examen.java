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
	private String duree; // DOUBLE OU STRING ?
	@Temporal(TemporalType.DATE)
	private Date dateExamen;
	@Lob
	private byte[] fichierExamen;
	@Lob
	private byte[] fichierReponseExamen;

	@ManyToOne

	@JoinColumn(name = "id_cours")
	private Cours cours;

	@OneToOne(mappedBy = "examen")
	@JoinColumn(name = "id_correction")
	private Correction correction;

	public Examen(String nomExamen, String duree, Date dateExamen, byte[] fichierExamen, byte[] fichierReponseExamen,
			Cours cours, Correction correction) {

		this.nomExamen = nomExamen;
		this.duree = duree;
		this.dateExamen = dateExamen;
		this.fichierExamen = fichierExamen;
		this.fichierReponseExamen = fichierReponseExamen;
		this.cours = cours;
		this.correction = correction;
	}

	public Examen(String nomExamen, String duree, Date dateExamen, byte[] fichierExamen, byte[] fichierReponseExamen) {

		this.nomExamen = nomExamen;
		this.dateExamen = dateExamen;
		this.duree = duree;
		this.dateExamen = dateExamen;
		this.fichierExamen = fichierExamen;

		this.fichierReponseExamen = fichierReponseExamen;
	}

	public Examen() {

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

	public String getDuree() {
		return duree;
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}

	public Date getDateExamen() {
		return dateExamen;
	}

	public void setDateExamen(Date dateExamen) {
		this.dateExamen = dateExamen;
	}

	public byte[] getFichierExamen() {
		return fichierExamen;
	}

	public void setFichierExamen(byte[] fichierExamen) {
		this.fichierExamen = fichierExamen;
	}

	public byte[] getFichierReponseExamen() {
		return fichierReponseExamen;
	}

	public void setFichierReponseExamen(byte[] fichierReponseExamen) {
		this.fichierReponseExamen = fichierReponseExamen;
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

	@Override
	public String toString() {
		return "Examen [idExamen=" + idExamen + ", nomExamen=" + nomExamen + ", duree=" + duree + ", dateExamen="
				+ dateExamen + ", fichierExamen=" + Arrays.toString(fichierExamen) + ", fichierReponseExamen="
				+ Arrays.toString(fichierReponseExamen) + ", cours=" + cours + ", correction=" + correction + "]";
	}

}
/*
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long idExamen;
 * private String nomExamen;
 * 
 * @Temporal(TemporalType.DATE) private Date dateExamen;
 * 
 * private String duree;
 * 
 * @Lob private byte[] fichierExamen;
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name = "id_matiere") private Matiere matiere;
 * 
 * 
 * @OneToOne(mappedBy= "examen")
 * 
 * @JoinColumn(name = "id_correction") private Correction correction;
 * 
 * public Examen() {
 * 
 * }
 * 
 * 
 * public Examen(Long idExamen, String nomExamen, String duree, byte[]
 * fichierExamen, Matiere matiere) { this.idExamen = idExamen; this.nomExamen =
 * nomExamen; this.duree = duree; this.fichierExamen = fichierExamen;
 * this.matiere = matiere; }
 * 
 * public Long getIdExamen() { return idExamen; }
 * 
 * public void setIdExamen(Long idExamen) { this.idExamen = idExamen; }
 * 
 * public String getNomExamen() { return nomExamen; }
 * 
 * public void setNomExamen(String nomExamen) { this.nomExamen = nomExamen; }
 * 
 * 
 * public byte[] getFichierExamen() { return fichierExamen; }
 * 
 * public void setFichierExamen(byte[] fichierExamen) { this.fichierExamen =
 * fichierExamen; }
 * 
 * public Matiere getMatiere() { return matiere; }
 * 
 * public void setMatiere(Matiere matiere) { this.matiere = matiere; }
 * 
 * public Correction getCorrection() { return correction; }
 * 
 * public void setCorrection(Correction correction) { this.correction =
 * correction; }
 * 
 * public Date getDateExamen() { return dateExamen; }
 * 
 * public void setDateExamen(Date dateExamen) { this.dateExamen = dateExamen; }
 * 
 * 
 * 
 * public String getDuree() { return duree; }
 * 
 * 
 * public void setDuree(String duree) { this.duree = duree; }
 * 
 * 
 * @Override public String toString() { return "Examen [idExamen=" + idExamen +
 * ", nomExamen=" + nomExamen + ", duree=" + duree + ", fichierExamen=" +
 * Arrays.toString(fichierExamen) + ", matiere=" + matiere + "]"; }
 * 
 * }
 */