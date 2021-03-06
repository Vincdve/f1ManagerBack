package model.connexion;


import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import model.ecuries.Infrastructure;
import model.ecuries.Pilote;
import model.ecuries.Voiture;


@Entity
@DiscriminatorValue("Joueur")
public class Joueur extends Compte{
	
	
	
	private String pseudo;
	private int age;
	private double experience;
	private boolean bot;
	@ManyToMany
	@JoinTable
	(
		name="voitures_joueur",
		joinColumns = @JoinColumn(name="id"),
		inverseJoinColumns = @JoinColumn(name="marque")
	)
	private List<Voiture> voiture;
	@ManyToMany
	@JoinTable
	(
		name="pilotes_joueur",
		joinColumns = @JoinColumn(name="id"),
		inverseJoinColumns = @JoinColumn(name="nom")
	)
	private List<Pilote> pilote;
	@ManyToMany
	@JoinTable
	(
		name="infrastructure_joueur",
		joinColumns = @JoinColumn(name="id"),
		inverseJoinColumns = @JoinColumn(name="nom")
	)
	private List<Infrastructure> infrastructure;
	
	
	
	
	public Joueur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Joueur(String login, String password) {
		super(login, password);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Joueur(String pseudo, int age, double experience, boolean bot, List<Voiture> voiture, List<Pilote> pilote,
			List<Infrastructure> infrastructure) {
		this.pseudo = pseudo;
		this.age = age;
		this.experience = experience;
		this.bot = bot;
		this.voiture = voiture;
		this.pilote = pilote;
		this.infrastructure = infrastructure;
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
	public List<Pilote> getPilote() {
		return pilote;
	}
	public void setPilote(List<Pilote> pilote) {
		this.pilote = pilote;
	}
	public List<Infrastructure> getInfrastructure() {
		return infrastructure;
	}
	public void setInfrastructure(List<Infrastructure> infrastructure) {
		this.infrastructure = infrastructure;
	}
	
	
 
	
	
	
	}

	
	

