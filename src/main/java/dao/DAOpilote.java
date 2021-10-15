package dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.ecuries.Pilote;
import util.Context;

public class DAOpilote {

	public Pilote findById(Integer id) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Pilote objet = em.find(Pilote.class, id);
		em.close();
		return objet;
	}

	public List<Pilote> findAll() {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Query requete = em.createQuery("from Pilote p",Pilote.class);
		List<Pilote> pilote = requete.getResultList();
		em.close();
		return pilote;
	}

	public Pilote save(Pilote o) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		o=em.merge(o);
		em.getTransaction().commit();
		em.close();
		return o;
	}

	public void delete(Pilote o) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		o=em.merge(o);
		em.remove(o);
		em.getTransaction().commit();
		em.close();
	}

}
