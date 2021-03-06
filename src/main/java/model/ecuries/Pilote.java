package model.ecuries;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import model.courses.Achetable;
@Entity
public class Pilote extends Achetable {

	private String nom;
	private String prenom;
	private int age ;
	private String civ;
	@OneToOne (cascade = CascadeType.PERSIST)
	private Level level;
	@OneToOne
	private Voiture voiture;
	@ManyToOne 
	private Ecurie ecurie; //Attribut ajout� pour mapping
	
	// private Caracteristique carac;
	
		
	public Pilote() {}
	

	public Pilote(int prix) {
		super(prix);
	}
	
	public Pilote(int prix, String nom, String prenom, int age, String civ, Level level,Voiture voiture) {
		super(prix);
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.civ = civ;
		this.level = level;
		this.voiture = voiture;
	}

	public Pilote(int prix, String nom, String prenom, int age, String civ, Level level) {
		super(prix);
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.civ = civ;
		this.level = level;
		
	}
	

	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}




	public String getPrenom() {
		return prenom;
	}




	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getCiv() {
		return civ;
	}




	public void setCiv(String civ) {
		this.civ = civ;
	}




	



	public Level getLevel() {
		return level;
	}


	public void setLevel(Level level) {
		this.level = level;
	}


	public Voiture getVoiture() {
		return voiture;
	}


	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}


	


	@Override
	public String toString() {
		return "Pilote [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", civ=" + civ + ", level=" + level
				 + ", voiture=" + voiture + "]";
	}




	

	
	
	
	

	
}
