package app;

import java.util.Scanner;

import model.connexion.Admin;
import model.connexion.Compte;
import model.connexion.Joueur;
import util.Context;


public class App {
	
	
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
		Compte connected=Context.getInstance().getDaoC().connect(login,password); // FaireIDAOCompte et DAOCompte ainsi que changer la class compte
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

	
		menuPrincipal();
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
		// TODO Auto-generated method stub

		

		
		
	}

}
