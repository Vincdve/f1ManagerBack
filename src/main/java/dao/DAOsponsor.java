package dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.ecuries.Sponsor;
import util.Context;

public class DAOsponsor implements IDAOsponsor{

	public Sponsor findById(Integer id) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Sponsor objet = em.find(Sponsor.class, id);
		em.close();
		return objet;
	}

	public List<Sponsor> findAll() {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Query requete = em.createQuery("from Sponsor s",Sponsor.class);
		List<Sponsor> sponsor = requete.getResultList();
		em.close();
		return sponsor;
	}

	public Sponsor save(Sponsor o) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		o=em.merge(o);
		em.getTransaction().commit();
		em.close();
		return o;
	}

	public void delete(Sponsor o) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		o=em.merge(o);
		em.remove(o);
		em.getTransaction().commit();
		em.close();
	}



}
