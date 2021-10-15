package dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.ecuries.Objectif;
import util.Context;

public class DAOobjectif {

	public Objectif findById(Integer id) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Objectif objet = em.find(Objectif.class, id);
		em.close();
		return objet;
	}

	public List<Objectif> findAll() {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Query requete = em.createQuery("from Objectif o",Objectif.class);
		List<Objectif> objectif = requete.getResultList();
		em.close();
		return objectif;
	}

	public Objectif save(Objectif o) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		o=em.merge(o);
		em.getTransaction().commit();
		em.close();
		return o;
	}

	public void delete(Objectif o) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		o=em.merge(o);
		em.remove(o);
		em.getTransaction().commit();
		em.close();
	}

}
