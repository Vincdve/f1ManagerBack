package model.ecuries;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Level {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY )
	private int id;
	private int compteur;
	private int nombreCourse;// les course .siez
	private int nombreVictoire; // les classement la list where ordre = 1
	private int nombreSaison; //
	private int pdc; //pointDeCompetence
	private int salaire;
	private int popularite;

	
	public Level() {}
	//constructeur pour le reste(Infrastructure , Voiture)
	public Level(int compteur, int nombreCourse, int nombreVictoire, int nombreSaison, int pdc) {
		this.compteur = compteur;
		this.nombreCourse = nombreCourse;
		this.nombreVictoire = nombreVictoire;
		this.nombreSaison = nombreSaison;
		this.pdc = pdc;
	}


	//Constructeur pour pilote
		public Level(int compteur, int nombreCourse, int nombreVictoire, int nombreSaison, int pdc, int salaire,
			int popularite) {
		this.compteur = compteur;
		this.nombreCourse = nombreCourse;
		this.nombreVictoire = nombreVictoire;
		this.nombreSaison = nombreSaison;
		this.pdc = pdc;
		this.salaire = salaire;
		this.setPopularite(popularite);
	}


	

	
	
	public int getCompteur() {
		return compteur;
	}



	


	public void setCompteur(int compteur) {
		this.compteur = compteur;
	}



	public int getNombreCourse() {
		return nombreCourse;
	}



	public void setNombreCourse(int nombreCourse) {
		this.nombreCourse = nombreCourse;
	}



	public int getNombreVictoire() {
		return nombreVictoire;
	}



	public void setNombreVictoire(int nombreVictoire) {
		this.nombreVictoire = nombreVictoire;
	}



	public int getNombreSaison() {
		return nombreSaison;
	}



	public void setNombreSaison(int nombreSaison) {
		this.nombreSaison = nombreSaison;
	}



	public int getPdc() {
		return pdc;
	}



	public void setPdc(int pdc) {
		this.pdc = pdc;
	}



	


	public int getSalaire() {
		return salaire;
	}


	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}


	public int getPopularite() {
		return popularite;
	}


	public void setPopularite(int popularite) {
		this.popularite = popularite;
	}
	
	@Override
	public String toString() {
		return "level [compteur=" + compteur + ", nombreCourse=" + nombreCourse + ", nombreVictoire=" + nombreVictoire
				+ ", nombreSaison=" + nombreSaison + ", pdc=" + pdc + "]";
	}
	
	
	
	
}
