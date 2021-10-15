package model.connexion;

import java.util.List;

import model.ecuries.Voiture;

public class Joueur extends Compte{
	
	
	
	private String pseudo;
	private int age;
	private double experience;
	private boolean bot;
	private List<Voiture> voiture;
	
	
	
	
	public Joueur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Joueur(String login, String password) {
		super(login, password);
		// TODO Auto-generated constructor stub
	}
	public Joueur(String login, String password, String pseudo, int age, double experience) {
		super(login, password);
		this.pseudo = pseudo;
		this.age = age;
		this.experience = experience;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getExperience() {
		return experience;
	}
	public void setExperience(double experience) {
		this.experience = experience;
	}
	
	
	public boolean isBot() {
		return bot;
	}
	public void setBot(boolean bot) {
		this.bot = bot;
	}
	public List<Voiture> getVoiture() {
		return voiture;
	}
	public void setVoiture(List<Voiture> voiture) {
		this.voiture = voiture;
	}
	@Override
	public String toString() {
		return "Joueur [pseudo=" + pseudo + ", age=" + age + ", experience=" + experience + ", bot=" + bot
				+ ", voiture=" + voiture + "]";
	}
	
	
 
	
	
	
	}

	
	

