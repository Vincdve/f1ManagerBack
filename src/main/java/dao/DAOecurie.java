package dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.ecuries.Ecurie;
import util.Context;

public class DAOecurie implements IDAOecurie {

	public Ecurie findById(Integer id) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Ecurie objet = em.find(Ecurie.class, id);
		em.close();
		return objet;
	}

	public List<Ecurie> findAll() {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Query requete = em.createQuery("from Ecurie e",Ecurie.class);
		List<Ecurie> ecurie = requete.getResultList();
		em.close();
		return ecurie;
	}

	public Ecurie save(Ecurie o) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		o=em.merge(o);
		em.getTransaction().commit();
		em.close();
		return o;
	}

	public void delete(Ecurie o) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		o=em.merge(o);
		em.remove(o);
		em.getTransaction().commit();
		em.close();
	}
	
}