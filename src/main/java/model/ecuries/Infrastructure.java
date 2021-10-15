package model.ecuries;

import model.courses.Achetable;

public class Infrastructure extends Achetable {

	private String nom;
	private String type;
	private int nombreIngenieur;
	private int pitStop; //sur la course quand ils changent les pneus
	private Level level;
	// private Caracteristique carac;
	
	
	public Infrastructure( int prix, String nom, String type, int nombreIngenieur, int pitStop,
			Level level) {
		super(prix);
		this.nom = nom;
		this.type = type;
		this.nombreIngenieur = nombreIngenieur;
		this.pitStop = pitStop;
		this.level = level;
	}



	@Override
	public String toString() {
		return "Infrastructure [nom=" + nom + ", type=" + type + ", nombreIngenieur=" + nombreIngenieur + ", pitStop="
				+ pitStop + ", level=" + level + "]";
	}
	
	
}
