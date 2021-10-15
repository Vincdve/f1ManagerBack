package model.courses;

import java.time.LocalDate;

public class Saison {
	
	private int numero;
	private int nombreCourse;
	private LocalDate calendrier;
	private Course course;

	
	
	
	
	
	public Saison(int numero, int nombreCourse, LocalDate calendrier, Course course) {
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
	@Override
	public String toString() {
		return "Saison [numero=" + numero + ", nombreCourse=" + nombreCourse + ", calendrier=" + calendrier
				+ ", course=" + course + "]";
	}
	
	
	

}
