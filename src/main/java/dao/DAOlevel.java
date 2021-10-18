package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.ecuries.Level;
import util.Context;

public class DAOlevel implements IDAOlevel{

	public Level findById(Integer id) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Level objet = em.find(Level.class, id);
		em.close();
		return objet;
	}

	public List<Level> findAll() {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Query requete = em.createQuery("from Level l",Level.class);
		List<Level> level = requete.getResultList();
		em.close();
		return level;
	}

	public Level save(Level o) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		o=em.merge(o);
		em.getTransaction().commit();
		em.close();
		return o;
	}

	public void delete(Level o) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		o=em.merge(o);
		em.remove(o);
		em.getTransaction().commit();
		em.close();
	}

}
