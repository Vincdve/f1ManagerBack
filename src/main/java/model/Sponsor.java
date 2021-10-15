package model;

import java.time.LocalDate;

public class Sponsor extends Boutique {

	private String nom;
	private Objectif objectif;
	private LocalDate duree;
	
	
	
	public Sponsor(String objet, int prix, String nom, Objectif objectif, LocalDate duree) {
		super(objet, prix);
		this.nom = nom;
		this.objectif = objectif;
		this.duree = duree;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public Objectif getObjectif() {
		return objectif;
	}



	public void setObjectif(Objectif objectif) {
		this.objectif = objectif;
	}



	public LocalDate getDuree() {
		return duree;
	}



	public void setDuree(LocalDate duree) {
		this.duree = duree;
	}



	@Override
	public String toString() {
		return "Sponsor [nom=" + nom + ", objectif=" + objectif + ", duree=" + duree + "]";
	}
	
	
	
}
