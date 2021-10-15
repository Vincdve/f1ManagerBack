package model.courses;

import model.ecuries.Pilote;

public class Classement {

	private Pilote pilote;
	private int ordre;
	private Course course;
	
	
	public Classement(Pilote pilote, int ordre, Course course) {
		this.pilote = pilote;
		this.ordre = ordre;
		this.course = course;
	}


	public Pilote getPilote() {
		return pilote;
	}


	public void setPilote(Pilote pilote) {
		this.pilote = pilote;
	}


	public int getOrdre() {
		return ordre;
	}


	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	@Override
	public String toString() {
		return "Classement [pilote=" + pilote + ", ordre=" + ordre + ", course=" + course + "]";
	}
	
	
}
