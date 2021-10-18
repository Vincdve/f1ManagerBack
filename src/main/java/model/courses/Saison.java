package model.courses;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Saison {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
	private int numero;
	private int nombreCourse;
	private LocalDate calendrier;
	@OneToMany
	private List<Course> course;

	
	
	
	public Saison() {}
	
	public Saison(int numero, int nombreCourse, LocalDate calendrier, List<Course> course) {
		this.numero = numero;
		this.nombreCourse = nombreCourse;
		this.calendrier = calendrier;
		this.course = course;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNombreCourse() {
		return nombreCourse;
	}
	public void setNombreCourse(int nombreCourse) {
		this.nombreCourse = nombreCourse;
	}
	public LocalDate getCalendrier() {
		return calendrier;
	}
	public void setCalendrier(LocalDate calendrier) {
		this.calendrier = calendrier;
	}
	
	public int getId() {
		return Id;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setId(int id) {
		Id = id;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Saison [numero=" + numero + ", nombreCourse=" + nombreCourse + ", calendrier=" + calendrier
				+ ", course=" + course + "]";
	}
	
	
	

}
