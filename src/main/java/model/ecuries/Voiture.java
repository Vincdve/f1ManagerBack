package model.ecuries;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import model.courses.Achetable;
@Entity
public class Voiture extends Achetable {

	private String marque;
	@OneToOne
	private Level level; //private transient Level level;
	private int maniabilite;
	private int vitesse;
	private double poids;
	@OneToOne(mappedBy = "voiture" )
	private Pilote pilote;//Attribut ajouté pour mapping
	@ManyToOne 
	private Ecurie ecurie;//Attribut ajouté pour mapping
	
	// private Caracteristique carac;
	
	public Voiture() {}
	
	public Voiture(int prix, String marque, Level level, int maniabilite, int vitesse, double poids) {
		super(prix);
		this.marque = marque;
		this.level = level;
		this.maniabilite = maniabilite;
		this.vitesse = vitesse;
		this.poids = poids;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public Level getLevel() {
		return level;
	}
	public void setLevel(Level level) {
		this.level = level;
	}
	public int getManiabilite() {
		return maniabilite;
	}
	public void setManiabilite(int maniabilite) {
		this.maniabilite = maniabilite;
	}
	public int getVitesse() {
		return vitesse;
	}
	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	}
	
	@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", level=" + level + ", maniabilite=" + maniabilite + ", vitesse="
				+ vitesse + ", poids=" + poids + "]";
	}
	
	
	
	
	
}
