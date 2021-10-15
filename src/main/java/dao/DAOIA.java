package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.courses.IA;
import util.Context;

public class DAOIA implements IDAOIA {

	@Override
	public IA findById(Integer id) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		IA objet = em.find(IA.class, id);
		em.close();
		return objet;
	}

	@Override
	public List<IA> findAll() {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Query requete = em.createQuery("from IA p",IA.class);
		List<IA> IAs = requete.getResultList();
		em.close();
		return IAs;
	}

	@Override
	public IA save(IA o) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		o=em.merge(o);
		em.getTransaction().commit();
		em.close();
		return o;
	}

	@Override
	public void delete(IA o) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		o=em.merge(o);
		em.remove(o);
		em.getTransaction().commit();
		em.close();		
	}
}
