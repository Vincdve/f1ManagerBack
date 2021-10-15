package dao;

import model.connexion.Compte;

public interface IDAOCompte extends IDAO <Compte , Integer>{

	public Compte connect(String login,String password);
}
