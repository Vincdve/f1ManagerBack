package model;

public class Voiture extends Boutique {

	private String marque;
	
	private Level level;
	private int maniabilite;
	private int vitesse;
	private double poids;
	
	// private Caracteristique carac;
	
	
	
	public Voiture(String objet, int prix, String marque, Level level, int maniabilite, int vitesse, double poids) {
		super(objet, prix);
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
