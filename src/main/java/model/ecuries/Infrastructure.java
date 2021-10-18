package model.ecuries;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import model.courses.Achetable;
@Entity
public class Infrastructure extends Achetable {
	
	private String nom;
	private String type;
	private int nombreIngenieur;
	private int pitStop; //sur la course quand ils changent les pneus
	@OneToOne
	private Level level;
	// private Caracteristique carac;
	
	public Infrastructure() {};
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
