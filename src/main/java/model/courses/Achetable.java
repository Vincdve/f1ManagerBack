package model.courses;

public class Achetable {

	
	private int prix;
	
	
	public Achetable(int prix) {
		this.prix = prix;
	}


	
	


	public int getPrix() {
		return prix;
	}



	public void setPrix(int prix) {
		this.prix = prix;
	}



	@Override
	public String toString() {
		return "Boutique [prix=" + prix + "]";
	}
	
	
}
