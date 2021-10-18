package app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.connexion.Admin;
import model.connexion.Compte;
import model.connexion.Joueur;
import model.courses.Course;
import model.ecuries.Infrastructure;
import model.ecuries.Level;
import model.ecuries.Objectif;
import model.ecuries.Pilote;
import model.ecuries.Sponsor;
import model.ecuries.Voiture;
import util.Context;


public class App {
	
	List<Pilote> pilotes = new ArrayList();
	List<Voiture> voitures = new ArrayList();
	List<Sponsor> sponsors = new ArrayList();
	List<Course> courses = new ArrayList();
	List<Objectif> objectifs = new ArrayList();
	
	public static String saisieString(String msg) 
	{
		Scanner sc= new Scanner(System.in);		
		System.out.println(msg);
		return sc.nextLine();
	}

	public static int saisieInt(String msg) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		return sc.nextInt();
	}

	public static double saisieDouble(String msg) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		return sc.nextDouble();
	}
	
	
	
	private static void menuPrincipal() {

		System.out.println("Menu Principal : ");
		System.out.println("1 - Se connecter ");
		System.out.println("2 - Quitter");
		
		
		int choix = saisieInt("");
		
		switch(choix)
		{
		case 1 : seConnecter();break;
		case 2 : System.exit(0);
		}		
		menuPrincipal();
	}

	private static void seConnecter() {
		String login = saisieString("Saisir le login");
		String password = saisieString("Saisir le password");
		Compte connected=Context.getInstance().getDaoCompte().connect(login,password); // FaireIDAOCompte et DAOCompte ainsi que changer la class compte
		Context.getInstance().setConnected(connected);

		if(connected instanceof Joueur) 
		{
			menuJoueur();
		}
		else if(connected instanceof Admin) 
		{
			menuAdmin();
		}
		else 
		{
			System.out.println("Identifiants invalides");
		}

		menuPrincipal();
	}

	
	
	 
	private static void menuAdmin() {
		System.out.println("Menu Admin : ");
		System.out.println("1 - Accéder à la boutique ");
		System.out.println("2 - Retour");
		
		
		int choix = saisieInt("");
		
		switch(choix)
		{
		case 1 : Boutique();break;
		case 2 : menuPrincipal();
		}		
	}

	private static void Boutique() {

		
		}

	public static void menuJoueur()
	{
		System.out.println("Menu Joueur : ");
		System.out.println("1 - Accéder à la partie ");
		System.out.println("2 - Retour");
		
		
		int choix = saisieInt("");
		
		switch(choix)
		{
		case 1 : lancerPartie();break;
		case 2 : menuPrincipal();
		}
	
		
	}
	

	private static void lancerPartie() {

		System.out.println("Partie : ");
		System.out.println("1 - Configurer l'écurie ");
		System.out.println("2 - Lancer une course");
		System.out.println("3 - Retour");
		
		
		int choix = saisieInt("");
		
		switch(choix)
		{
		case 1 : configEcurie();break;
		case 2 : lancerCourse();break;
		case 3 : menuJoueur();
		}
	}

	private static void lancerCourse() {
		
		lancerPartie();
	}

	private static void configEcurie() {
		
		lancerPartie();
	}

	
	public static void main(String[] args) {
		
		Objectif o = new Objectif("Gagner", "Decrocher", 10000);
        Level l = new Level(1,1,1,1,150);
        Level l_pilote = new Level(1,1,1,1,150,5000,25);
        Infrastructure inf = new Infrastructure(200000, "R&D", "Chassis", 5, 2, l);
        Voiture v = new Voiture(60000,"Mercedes", l, 55, 310, 745.5);
        Pilote p = new Pilote(500000, "BILAL", "Daniel", 24, "Homme", l_pilote, v);
        List<Objectif> objectif=new ArrayList();
        objectif.add(o);
        Sponsor s = new Sponsor(30000, "Motul", objectif, LocalDate.now());
       


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("configJPA");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        //em.persist(o);
        //em.persist(s);
        em.persist(l);
        em.persist(l_pilote);
        em.persist(inf);
        em.persist(v);
        em.persist(p);
     

        em.getTransaction().commit();
        em.close();

        emf.close();

		

		
		
	}

}
