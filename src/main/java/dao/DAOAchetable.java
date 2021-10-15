package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;


import model.courses.Achetable;
import util.Context;

public class DAOAchetable implements IDAOAchetable
{

	@Override
	public Achetable findById(Integer id) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Achetable objet = em.find(Achetable.class, id);
		em.close();
		return objet;
	}

	@Override
	public List<Achetable> findAll() {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Query requete = em.createQuery("from Achetable p",Achetable.class);
		List<Achetable> Achetables = requete.getResultList();
		em.close();
		return Achetables;
	}

	@Override
	public Achetable save(Achetable o) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		o=em.merge(o);
		em.getTransaction().commit();
		em.close();
		return o;
	}

	@Override
	public void delete(Achetable o) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		o=em.merge(o);
		em.remove(o);
		em.getTransaction().commit();
		em.close();		
	}

}
