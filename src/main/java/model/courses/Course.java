package model.courses;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import model.ecuries.Pilote;
@Entity
public class Course {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
	private String nom;
	private int nombreTour;
	private Alea alea;
	private double cashPrice;
	@OneToMany
	private List<Pilote> classement;
	
	
	public Course() {}
	
	public Course(String nom, int nombreTour, Alea alea, double cashPrice, List<Pilote> classement) {
		this.nom = nom;
		this.nombreTour = nombreTour;
		this.alea = alea;
		this.cashPrice = cashPrice;
		this.classement = classement;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getNombreTour() {
		return nombreTour;
	}


	public void setNombreTour(int nombreTour) {
		this.nombreTour = nombreTour;
	}


	public Alea getAlea() {
		return alea;
	}


	public void setAlea(Alea alea) {
		this.alea = alea;
	}


	public double getCashPrice() {
		return cashPrice;
	}


	public void setCashPrice(double cashPrice) {
		this.cashPrice = cashPrice;
	}


	public List<Pilote> getClassement() {
		return classement;
	}


	public void setClassement(List<Pilote> classement) {
		this.classement = classement;
	}


	@Override
	public String toString() {
		return "Course [nom=" + nom + ", nombreTour=" + nombreTour + ", alea=" + alea + ", cashPrice=" + cashPrice
				+ ", classement=" + classement + "]";
	}
	
	
	
	
}
