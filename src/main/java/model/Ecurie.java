package model;



public class Ecurie {

	private String nom;
	private double argent;
	private double popularite;
	private int pdc; //pointDeCompetence
	private Saison calendrier;
	private Voiture voiture;
	private Pilote pilote;
	private Sponsor sponsor;
	private Infrastructure infrastructure;
	
	
	public Ecurie () {}
	
	
	public Ecurie(String nom, double argent, double popularite, int pdc, Saison calendrier, Voiture voiture,
			Pilote pilote, Sponsor sponsor, Infrastructure infrastructure) {
		this.nom = nom;
		this.argent = argent;
		this.popularite = popularite;
		this.pdc = pdc;
		this.calendrier = calendrier;
		this.voiture = voiture;
		this.pilote = pilote;
		this.sponsor = sponsor;
		this.infrastructure = infrastructure;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public double getArgent() {
		return argent;
	}



	public void setArgent(double argent) {
		this.argent = argent;
	}



	public double getPopularite() {
		return popularite;
	}



	public void setPopularite(double popularite) {
		this.popularite = popularite;
	}



	public int getPdc() {
		return pdc;
	}



	public void setPdc(int pdc) {
		this.pdc = pdc;
	}



	public Saison getCalendrier() {
		return calendrier;
	}



	public void setCalendrier(Saison calendrier) {
		this.calendrier = calendrier;
	}



	public Voiture getVoiture() {
		return voiture;
	}



	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}



	public Pilote getPilote() {
		return pilote;
	}



	public void setPilote(Pilote pilote) {
		this.pilote = pilote;
	}



	public Sponsor getSponsor() {
		return sponsor;
	}



	public void setSponsor(Sponsor sponsor) {
		this.sponsor = sponsor;
	}



	public Infrastructure getInfrastructure() {
		return infrastructure;
	}



	public void setInfrastructure(Infrastructure infrastructure) {
		this.infrastructure = infrastructure;
	}



	@Override
	public String toString() {
		return "Ecurie [nom=" + nom + ", argent=" + argent + ", popularite=" + popularite + ", pdc=" + pdc
				+ ", calendrier=" + calendrier + ", voiture=" + voiture + ", pilote=" + pilote + ", sponsor=" + sponsor
				+ ", infrastructure=" + infrastructure + "]";
	}
	
	
	
	
		
	
	
}
