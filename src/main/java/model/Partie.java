package model;

import java.util.List;

public class Partie extends Joueur{

	private List <Saison> listeSaison;
	private int numero;
	
	
	
	
	public Partie(String login, String password, String pseudo, int age, double experience, List<Saison> listeSaison,
			int numero) {
		super(login, password, pseudo, age, experience);
		this.setListeSaison(listeSaison);
		this.setNumero(numero);
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
