package dao;

import model.Compte;

public interface IDAOCompte {

	public Compte connect(String login,String password);
}
