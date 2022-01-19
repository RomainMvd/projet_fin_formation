package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class Correction implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCorrection;
	private Long noteExamen;
	private String nomMatiere;
	private String commentaireProfesseur;
	@Lob
	private byte[] fichierCorrection;

	@OneToOne
	@JoinColumn(name = "id_Examen")
	private Examen examen;

	public Correction() {

	}

	public Correction(Long noteExamen, String nomMatiere, String commentaireProfesseur, byte[] fichierCorrection) {
		this.noteExamen = noteExamen;
		this.nomMatiere = nomMatiere;
		this.commentaireProfesseur = commentaireProfesseur;
		this.fichierCorrection = fichierCorrection;
	}

	public Long getIdCorrection() {
		return idCorrection;
	}

	public void setIdCorrection(Long idCorrection) {
		this.idCorrection = idCorrection;
	}

	public Long getNoteExamen() {
		return noteExamen;
	}

	public void setNoteExamen(Long noteExamen) {
		this.noteExamen = noteExamen;
	}

	public String getNomMatiere() {
		return nomMatiere;
	}

	public void setNomMatiere(String nomMatiere) {
		this.nomMatiere = nomMatiere;
	}

	public String getCommentaireProfesseur() {
		return commentaireProfesseur;
	}

	public void setCommentaireProfesseur(String commentaireProfesseur) {
		this.commentaireProfesseur = commentaireProfesseur;
	}

	public byte[] getFichierCorrection() {
		return fichierCorrection;
	}

	public void setFichierCorrection(byte[] fichierCorrection) {
		this.fichierCorrection = fichierCorrection;
	}

	public Examen getExamen() {
		return examen;
	}

	public void setExamen(Examen examen) {
		this.examen = examen;
	}

}
