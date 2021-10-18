package util;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.DAOAchetable;
import dao.DAOAdmin;
import dao.DAOClassement;
import dao.DAOCompte;
import dao.DAOCourse;
import dao.DAOIA;
import dao.DAOJoueur;
import dao.DAOPartie;
import dao.DAOSaison;
import dao.DAOecurie;
import dao.DAOinfrastructure;
import dao.DAOlevel;
import dao.DAOobjectif;
import dao.DAOpilote;
import dao.DAOsponsor;
import dao.DAOvoiture;
import dao.IDAOAchetable;
import dao.IDAOAdmin;
import dao.IDAOClassement;
import dao.IDAOCompte;
import dao.IDAOCourse;
import dao.IDAOIA;
import dao.IDAOJoueur;
import dao.IDAOPartie;
import dao.IDAOSaison;
import dao.IDAOecurie;
import dao.IDAOinfrastructure;
import dao.IDAOlevel;
import dao.IDAOobjectif;
import dao.IDAOpilote;
import dao.IDAOsponsor;
import dao.IDAOvoiture;
import model.connexion.Compte;

public class Context {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("configJPA");
	private Compte connected;

	private IDAOAchetable daoAchetable = new DAOAchetable();
	private IDAOAdmin daoAdmin = new DAOAdmin();
	private IDAOClassement daoClassement = new DAOClassement();
	private IDAOCompte daoCompte = new DAOCompte();
	private IDAOCourse daoCourse = new DAOCourse();
	private IDAOecurie daoEcurie = new DAOecurie();
	private IDAOIA daoIA = new DAOIA();
	private IDAOinfrastructure daoInfrastructure = new DAOinfrastructure();
	private IDAOJoueur daoJoueur = new DAOJoueur();
	private IDAOlevel daoLevel = new DAOlevel();
	private IDAOobjectif daoObjectif = new DAOobjectif();
	private IDAOPartie daoPartie = new DAOPartie();
	private IDAOpilote daoPilote = new DAOpilote();
	private IDAOSaison daoSaison = new DAOSaison();
	private IDAOsponsor daoSponsor = new DAOsponsor();
	private IDAOvoiture daoVoiture = new DAOvoiture();


	public IDAOAchetable getDaoAchetable() {
		return daoAchetable;
	}

	public IDAOAdmin getDaoAdmin() {
		return daoAdmin;
	}

	public IDAOClassement getDaoClassement() {
		return daoClassement;
	}

	public IDAOCompte getDaoCompte() {
		return daoCompte;
	}

	public IDAOCourse getDaoCourse() {
		return daoCourse;
	}

	public IDAOecurie getDaoEcurie() {
		return daoEcurie;
	}

	public IDAOIA getDaoIA() {
		return daoIA;
	}

	public IDAOinfrastructure getDaoInfrastructure() {
		return daoInfrastructure;
	}

	public IDAOJoueur getDaoJoueur() {
		return daoJoueur;
	}

	public IDAOlevel getDaoLevel() {
		return daoLevel;
	}

	public IDAOobjectif getDaoObjectif() {
		return daoObjectif;
	}

	public IDAOPartie getDaoPartie() {
		return daoPartie;
	}

	public IDAOpilote getDaoPilote() {
		return daoPilote;
	}

	public IDAOSaison getDaoSaison() {
		return daoSaison;
	}

	public IDAOsponsor getDaoSponsor() {
		return daoSponsor;
	}

	public IDAOvoiture getDaoVoiture() {
		return daoVoiture;
	}

	//SINGLETON
	private static Context _instance;

	private Context() {}

	public static Context getInstance() 
	{
		if(_instance==null)
		{_instance=new Context();}

		return _instance;
	}
	//FIN SINGLETON

	public EntityManagerFactory getEmf() {
		return emf;
	}

	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}

	public Compte getConnected() {
		return connected;
	}

	public void setConnected(Compte connected) {
		this.connected = connected;
	}



	public static void set_instance(Context _instance) {
		Context._instance = _instance;
	}

	public void closeEmf() 
	{
		this.emf.close();
	}

}
