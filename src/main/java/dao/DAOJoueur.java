package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.connexion.Joueur;
import util.Context;

public class DAOJoueur implements IDAOJoueur{

	@Override
	public Joueur findById(Integer id) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Joueur joueur = em.find(Joueur.class, id);

	return joueur;
	}

	@Override
	public List<Joueur> findAll() {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Query requete = em.createQuery("from Joueur j",Joueur.class);
		List<Joueur> joueurs = requete.getResultList();
		em.close();
		return joueurs;
		}

	@Override
	public Joueur save(Joueur o) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		o=em.merge(o);
		em.getTransaction().commit();
		em.close();
		return o;
	}

	@Override
	public void delete(Joueur o) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		o=em.merge(o);
		em.remove(o);
		em.getTransaction().commit();
		em.close();
	}		

}
