package model;

public class Boutique {

	
	private String objet;
	private int prix;
	
	
	public Boutique(String objet, int prix) {
		this.objet = objet;
		this.prix = prix;
	}


	
	public String getObjet() {
		return objet;
	}



	public void setObjet(String objet) {
		this.objet = objet;
	}



	public int getPrix() {
		return prix;
	}



	public void setPrix(int prix) {
		this.prix = prix;
	}



	@Override
	public String toString() {
		return "Boutique [objet=" + objet + ", prix=" + prix + "]";
	}
	
	
}
