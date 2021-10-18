package model.ecuries;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import model.courses.Saison;
@Entity
public class Ecurie {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY )
	private int id;
	private String nom;
	private double argent;
	private double popularite;
	private int pdc; //pointDeCompetence
	@OneToMany
	private List<Saison> calendrier;
	@OneToMany //(mappedBy = "Ecurie" )
	private List <Voiture> voitures; //transformer en liste?
	@OneToMany //(mappedBy = "Ecurie" )
	private List <Pilote> pilotes; //transformer en liste?
	@OneToMany //(mappedBy = "Ecurie" )
	private List <Sponsor> sponsor; //transformer en liste?
	@OneToMany //(mappedBy = "Ecurie" )
	private List<Infrastructure> infrastructures;//transformer en liste?
	
	public Ecurie () {}

	public Ecurie(String nom, double argent, double popularite, int pdc, List<Saison> calendrier,
			List<Voiture> voitures, List<Pilote> pilotes, List<Sponsor> sponsor, List<Infrastructure> infrastructures) {
		super();
		this.nom = nom;
		this.argent = argent;
		this.popularite = popularite;
		this.pdc = pdc;
		this.calendrier = calendrier;
		this.voitures = voitures;
		this.pilotes = pilotes;
		this.sponsor = sponsor;
		this.infrastructures = infrastructures;
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





	public List<Saison> getCalendrier() {
		return calendrier;
	}

	public void setCalendrier(List<Saison> calendrier) {
		this.calendrier = calendrier;
	}

	public int getId() {
		return id;
	}

	public List<Voiture> getVoitures() {
		return voitures;
	}

	public List<Pilote> getPilotes() {
		return pilotes;
	}

	public List<Sponsor> getSponsor() {
		return sponsor;
	}

	public List<Infrastructure> getInfrastructures() {
		return infrastructures;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setVoitures(List<Voiture> voitures) {
		this.voitures = voitures;
	}

	public void setPilotes(List<Pilote> pilotes) {
		this.pilotes = pilotes;
	}

	public void setSponsor(List<Sponsor> sponsor) {
		this.sponsor = sponsor;
	}

	public void setInfrastructures(List<Infrastructure> infrastructures) {
		this.infrastructures = infrastructures;
	}

	@Override
	public String toString() {
		return "Ecurie [id=" + id + ", nom=" + nom + ", argent=" + argent + ", popularite=" + popularite + ", pdc="
				+ pdc + ", calendrier=" + calendrier + ", voitures=" + voitures + ", pilotes=" + pilotes + ", sponsor="
				+ sponsor + ", infrastructures=" + infrastructures + "]";
	}


	
	
	
	
		
	
	
}
