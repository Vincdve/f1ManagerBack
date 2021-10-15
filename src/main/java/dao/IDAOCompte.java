package dao;

import model.connexion.Compte;

public interface IDAOCompte {

	public Compte connect(String login,String password);
}
