package model;

public class Objectif {

	private String libelle;
	private String condition;
	private int prime;
	
	
	
	public Objectif(String libelle, String condition, int prime) {
		this.libelle = libelle;
		this.condition = condition;
		this.prime = prime;
	}



	public String getLibelle() {
		return libelle;
	}



	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}



	public String getCondition() {
		return condition;
	}



	public void setCondition(String condition) {
		this.condition = condition;
	}



	public int getPrime() {
		return prime;
	}



	public void setPrime(int prime) {
		this.prime = prime;
	}



	@Override
	public String toString() {
		return "Objectif [libelle=" + libelle + ", condition=" + condition + ", prime=" + prime + "]";
	}
	
	
	
}
