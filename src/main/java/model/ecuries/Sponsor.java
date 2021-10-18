package model.ecuries;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import model.courses.Achetable;
@Entity
public class Sponsor extends Achetable {

	
	private String nom;
	@OneToOne (cascade = CascadeType.PERSIST)//(mappedBy = "Sponsor" )
	private Objectif objectif;//liste d'objectifs
	private LocalDate duree;
	
	public Sponsor(){}
	
	public Sponsor(int prix, String nom, Objectif objectif, LocalDate duree) {
		super(prix);
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
