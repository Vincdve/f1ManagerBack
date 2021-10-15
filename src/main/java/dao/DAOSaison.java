package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.courses.Saison;
import util.Context;

public class DAOSaison implements IDAOSaison {

	@Override
	public Saison findById(Integer id) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Saison objet = em.find(Saison.class, id);
		em.close();
		return objet;
	}

	@Override
	public List<Saison> findAll() {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Query requete = em.createQuery("from Saison p",Saison.class);
		List<Saison> Saisons = requete.getResultList();
		em.close();
		return Saisons;
	}

	@Override
	public Saison save(Saison o) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		o=em.merge(o);
		em.getTransaction().commit();
		em.close();
		return o;
	}

	@Override
	public void delete(Saison o) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		o=em.merge(o);
		em.remove(o);
		em.getTransaction().commit();
		em.close();		
	}


}
