package com.inti.entities;

import java.io.Serializable;

public class Distanciel extends Cours implements Serializable{
	
private String lienZoom;

public Distanciel() {
	super();
}


public Distanciel(String chapitre, int nbrHeure, byte [] fichierCours) {
	super(chapitre, nbrHeure, fichierCours);
}


public Distanciel(String chapitre, int nbrHeure, byte [] fichierCours, String lienZoom) {
	super(chapitre, nbrHeure, fichierCours);
	this.lienZoom = lienZoom;
}


public String getLienZoom() {
	return lienZoom;
}


public void setLienZoom(String lienZoom) {
	this.lienZoom = lienZoom;
}


}
