package app;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.connexion.Admin;
import model.connexion.Compte;
import model.connexion.Joueur;
import model.courses.Alea;
import model.courses.Course;
import model.courses.Saison;
import model.ecuries.Ecurie;
>>>>>>> Stashed changes
import model.ecuries.Infrastructure;
import model.ecuries.Level;
import model.ecuries.Objectif;
import model.ecuries.Pilote;
import model.ecuries.Sponsor;
import model.ecuries.Voiture;
import util.Context;


public class App {

	static int compteur = 1;

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


	}




	private static void menuAdmin() {
		System.out.println("Menu Admin : ");
		System.out.println("1 - Acceder a la boutique ");
		System.out.println("2 - Retour");


		int choix = saisieInt("");

		switch(choix)
		{
		case 1 : Boutique();break;
		case 2 : menuPrincipal();
		}		menuAdmin();
	}

	private static void Boutique() {

		System.out.println("Menu Boutique : ");
		System.out.println("1 - Creer un  pilote ");
		System.out.println("2 - Creer une voiture");
		System.out.println("3 - Creer une infrastructure");
		System.out.println("4 - Creer un sponsor");
		System.out.println("5 - Retour");


		int choix = saisieInt("");

		switch(choix)
		{
		case 1 : creerPilote();break;
		case 2 : creerVoiture();break;	
		case 3 : creerInfrastructure();break;
		case 4 : creerSponsor();break;
		case 5 : menuAdmin();
		}	Boutique();	
	}
	






	private static void creerPilote() {
		
		
		int prix = saisieInt("Saisir le prix du pilote");
		String nom = saisieString("Saisir le nom du pilote");
		String prenom = saisieString("Saisir le prenom du pilote");
		int age = saisieInt("Saisir l'age du pilote");
		String civ = saisieString("Saisir la civilité du pilote");
		
		int compteur = saisieInt("Saisir le niveau du pilote");
		int nombreCourse = 0;
		int nombreVictoire = 0;
		int nombreSaison = 0;
		int pdc = 0;
		int salaire = saisieInt("Saisir le salaire du pilote");
		int popularité = saisieInt("Saisir la popularite du pilote");
		Level levelPilote = new Level(compteur, nombreCourse,nombreVictoire,nombreSaison,  pdc,  salaire, popularité);
		Context.getInstance().getDaoLevel().save(levelPilote);
		
		Pilote p = new Pilote(prix, nom, prenom, age, civ, levelPilote);
		Context.getInstance().getDaoPilote().save(p);
		
		Context.getInstance().closeEmf();
		System.out.println("Pilote : " + p +" CREER");
		Boutique();
		
	}


	private static void creerVoiture() {



		int prix = saisieInt("Saisir le prix de la voiture");
		String marque = saisieString("Saisir la marque de la voiture");
		int poids = saisieInt("Saisir le poids de la voiture");
		int maniabilite = saisieInt("Saisir le niveau de maniabilite de la voiture");
		int vitesse = saisieInt("Saisir la vitesse de la voiture");
		
		int compteur = saisieInt("Saisir le niveau de la voiture");
		int nombreCourse = 0;
		int nombreVictoire = 0;
		int nombreSaison = 0;
		int pdc = 0;
		
		Level levelVoiture = new Level(compteur, nombreCourse,nombreVictoire,nombreSaison,  pdc);
		Context.getInstance().getDaoLevel().save(levelVoiture);
		
		Voiture v = new Voiture(prix, marque, levelVoiture, maniabilite,  vitesse,  poids);
		Context.getInstance().getDaoVoiture().save(v);
		
		Context.getInstance().closeEmf();
		System.out.println("Voiture : " + v +" CREER");
		Boutique();
	}

	

	private static void creerInfrastructure() {

		int prix = saisieInt("Saisir le prix de l'infrastructure");
		String nom = saisieString("Saisir le nom de l'infrastructure");
		int nombreIngenieur = saisieInt("Saisir le nombre d'ingenieurs");
		int pitStop = saisieInt("Saisir le niveau du pitStop de l'infrastructure");
		
		int compteur = saisieInt("Saisir le niveau de l'infrastructure");
		int nombreCourse = 0;
		int nombreVictoire = 0;
		int nombreSaison = 0;
		int pdc = 0;
		
		Level levelInfrastructure = new Level(compteur, nombreCourse,nombreVictoire,nombreSaison,  pdc);
		Context.getInstance().getDaoLevel().save(levelInfrastructure);
		
		Infrastructure v = new Infrastructure(prix,  nom,  nombreIngenieur,  pitStop,
				 levelInfrastructure);
		Context.getInstance().getDaoInfrastructure().save(v);
		
		Context.getInstance().closeEmf();
		System.out.println("Infrastructure : " + v +" CREER");
		Boutique();
	}

	private static void creerSponsor() {
		int prix = saisieInt("Saisir le prix du Sponsor");
		String nom = saisieString("Saisir le nom du Sponsor");
		String duree = saisieString("Saisir la date de fin du contrat");
		
		
		
		String libelle = saisieString("Saisir le libelle de l'objectif");
		String condition = saisieString("Saisir la condition pour realiser l'objectif");
		int prime =  saisieInt("Saisir le prime de l'objectif");
		
		
		Objectif objectif = new Objectif(libelle,  condition,  prime);
		Context.getInstance().getDaoObjectif().save(objectif);
		
		Sponsor s = new Sponsor(prix, nom, objectif, LocalDate.parse(duree));
		Context.getInstance().getDaoSponsor().save(s);
		
		Context.getInstance().closeEmf();
		System.out.println("Sponsor : " + s +" CREER");
		Boutique();

	}
	public static void menuJoueur()
	{
		System.out.println("Menu Joueur : ");
		System.out.println("1 - Acceder a la partie ");
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
		System.out.println("1 - Configurer l'ecurie ");
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
	
	private static void lancerSaison() {
		
	}

	private static void lancerCourse() {
		//Afficher les infos de la course
		
		//Course course = new Course();
		
		
		
		Course course = Context.getInstance().getDaoCourse().findById(compteur);
		String nom = course.getNom();
		int nbTour = course.getNombreTour();
		
		System.out.println("Circuit" + nom + "Tours" + nbTour);
			
		Pilote pilote1 = Context.getInstance().getDaoPilote().findById(1);
		
		//int nbVictoirePilote1 = pilote1.getLevel().getNombreVictoire();
		
		
		Voiture voiture = Context.getInstance().getDaoVoiture().findById(compteur);
		String nom = course.getNom();
		
		//recupere la config de configEcurie
		int levelPilote1 = ecurie.getEcurie().getPilote().getLevel().getCompteur();
		int levelVoiture1 = getEcurie().getVoiture().getLevel().getCompteur();
		int maniabiliteVoiture1 = ecurie.getVoiture().getManiabilite();
		int poidsVoiture1 = ecurie.getVoiture().getPoids();
		int vitesseVoiture1 = ecurie.getVoiture().getVitesse();
		int pitStopInfrastructure = ecurie.getInfrastucture().getpitStop();
		int levelInfrastructure = ecurie.getInfrastucture().getLevel().getCompteur();
		
		int levelPilote2 = getEcurie().getPilote().getLevel().getCompteur();
		int levelVoiture2 = getEcurie().getVoiture().getLevel().getCompteur();
		int maniabiliteVoiture2 = ecurie.getVoiture().getManiabilite();
		int poidsVoiture2 = ecurie.getVoiture().getPoids();
		int vitesseVoiture2 = ecurie.getVoiture().getVitesse();
		
				
		Alea alea = new Alea();

		while(cpt<nombreTour){
		//creer fonction random
		Random r = new Random();
		int a= alea.getOption(r.nextInt(5));
		
		//generer un algorithme pour le classement
		
		int c_voiture1 = (maniabiliteVoiture1 +vitesseVoiture1) - poidsVoiture1;
		int c_voiture2 = (maniabiliteVoiture2 +vitesseVoiture2) - poidsVoiture2;
		positionPilote1 = 20 - ((levelPilote1*0.1)+(levelInfrastructure*0.1)+((levelVoiture1+c_voiture1)*0.1));
		positionPilote2 = 20 - ((levelPilote2*0.1)+(levelInfrastructure*0.1)+((levelVoiture2+c_voiture2)*0.1));
		cpt++;
		}
		
		double scorePilote1= (((maniabiliteVoiture1 +vitesseVoiture1) - (poidsVoiture1/10)) +((levelPilote1*0.1)+(levelInfrastructure*0.1)+((levelVoiture1)*0.1)));
		double scorePilote2 = (((maniabiliteVoiture2 +vitesseVoiture2) - (poidsVoiture2/10)) +((levelPilote2*0.1)+(levelInfrastructure*0.1)+((levelVoiture2)*0.1)));
		double totalscorePilote1 =0; 
		double totalscorePilote2 =0;
		
		for (i =1 , i<nbTour, i++) {
			totalscorePilote1+=scorePilote1;
		}
		
		
		
		//Afficher un classement en fonction des stats
		System.out.println("Classement"+ classement);
		
		lancerPartie();
	
	
	
	
		
		}

	private static void configEcurie() {

		lancerPartie();
	}


	public static void main(String[] args) {

		//Context.getInstance();
		menuAdmin();
		
//
//		List<Pilote> pilotes = new ArrayList();
//		List<Voiture> voitures = new ArrayList();
//		List<Sponsor> sponsors = new ArrayList();
//		List<Infrastructure> infra = new ArrayList();
//		List<Saison> calendrier = new ArrayList();
//		
//		
//		Level l = new Level(1,1,1,1,150);
//		Voiture v = new Voiture(60000,"Mercedes", l, 55, 310, 745.5);
//		voitures.add(v);
//		
//		Level l_pilote = new Level(1,1,1,1,150,5000,25);
//		Pilote p = new Pilote(500000, "BILAL", "Daniel", 24, "Homme", l_pilote, v);
//        pilotes.add(p);
//        
//		Objectif o = new Objectif("Gagner", "Decrocher", 10000);
//		Sponsor s = new Sponsor(30000,"Motul", o, LocalDate.now());
//		sponsors.add(s);
//        
//        
//        Infrastructure inf = new Infrastructure(200000, "R&D", "Chassis", 5, 2, l);
//        infra.add(inf);
//        
//        Ecurie e = new Ecurie("Groupe 4", 1000000, 25, 500, calendrier, voitures, pilotes, sponsors, infra);
//
//
// 		EntityManagerFactory emf = Persistence.createEntityManagerFactory("configJPA");
//
//		EntityManager em = emf.createEntityManager();
//
//
//
//		em.getTransaction().commit();
//		em.close();
//
//		emf.close();
//
//
//        em.getTransaction().begin();
//        em.persist(o);
//        em.persist(s);
//        em.persist(l);
//        em.persist(l_pilote);
//        em.persist(inf);
//        em.persist(v);
//        em.persist(p);
//        em.persist(e);
//     





	}

}
