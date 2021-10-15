package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.ecuries.Infrastructure;
import util.Context;

public class DAOinfrastructure {

	public Infrastructure findById(Integer id) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Infrastructure objet = em.find(Infrastructure.class, id);
		em.close();
		return objet;
	}

	public List<Infrastructure> findAll() {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Query requete = em.createQuery("from Infrastructure i",Infrastructure.class);
		List<Infrastructure> infrastructure = requete.getResultList();
		em.close();
		return infrastructure;
	}

	public Infrastructure save(Infrastructure o) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		o=em.merge(o);
		em.getTransaction().commit();
		em.close();
		return o;
	}

	public void delete(Infrastructure o) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		o=em.merge(o);
		em.remove(o);
		em.getTransaction().commit();
		em.close();
	}
}
