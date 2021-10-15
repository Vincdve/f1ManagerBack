package model.courses;

import java.util.List;

import model.connexion.Joueur;
import model.ecuries.Infrastructure;
import model.ecuries.Pilote;
import model.ecuries.Voiture;

public class Partie extends Joueur{

	
	private List <Saison> listeSaison;
	private int numero;
	
	
	
	
	

	public Partie(String pseudo, int age, double experience, boolean bot, List<Voiture> voiture, List<Pilote> pilote,
			List<Infrastructure> infrastructure, List<Saison> listeSaison, int numero) {
		super(pseudo, age, experience, bot, voiture, pilote, infrastructure);
		this.listeSaison = listeSaison;
		this.numero = numero;
	}




	public Partie() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Partie(String pseudo, int age, double experience, boolean bot, List<Voiture> voiture, List<Pilote> pilote,
			List<Infrastructure> infrastructure) {
		super(pseudo, age, experience, bot, voiture, pilote, infrastructure);
		// TODO Auto-generated constructor stub
	}




	public Partie(String login, String password) {
		super(login, password);
		// TODO Auto-generated constructor stub
	}




	public int getNumero() {
		return numero;
	}




	public void setNumero(int numero) {
		this.numero = numero;
	}




	public List <Saison> getListeSaison() {
		return listeSaison;
	}




	public void setListeSaison(List <Saison> listeSaison) {
		this.listeSaison = listeSaison;
	}




	@Override
	public String toString() {
		return "Partie [listeSaison=" + listeSaison + ", numero=" + numero + ", id=" + id + ", login=" + login
				+ ", password=" + password + "]";
	}
	
	
	//public static Commencer Commencer()
	
}
