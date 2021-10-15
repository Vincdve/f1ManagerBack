package model.ecuries;

import model.courses.Achetable;

public class Pilote extends Achetable {

	

	private String nom;
	private String prenom;
	private int age ;
	private String civ;
	private Level level;
	private Voiture voiture;
	
	
	// private Caracteristique carac;
	
	
	
	
	

	public Pilote(String objet, int prix) {
		super(prix);
		// TODO Auto-generated constructor stub
	}
	

	

	public Pilote(String objet, int prix, String nom, String prenom, int age, String civ, Level level,
			Voiture voiture) {
		super(prix);
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.civ = civ;
		this.level = level;
		this.voiture = voiture;
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
