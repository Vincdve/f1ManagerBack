package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.courses.Classement;
import util.Context;

public class DAOClassement implements IDAOClassement {

	@Override
	public Classement findById(Integer id) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Classement objet = em.find(Classement.class, id);
		em.close();
		return objet;
	}

	@Override
	public List<Classement> findAll() {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Query requete = em.createQuery("from Classement p",Classement.class);
		List<Classement> Classements = requete.getResultList();
		em.close();
		return Classements;
	}

	@Override
	public Classement save(Classement o) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		o=em.merge(o);
		em.getTransaction().commit();
		em.close();
		return o;
	}

	@Override
	public void delete(Classement o) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		o=em.merge(o);
		em.remove(o);
		em.getTransaction().commit();
		em.close();		
	}

}
