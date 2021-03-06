package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.ecuries.Voiture;
import util.Context;

public class DAOvoiture implements IDAOvoiture{

		public Voiture findById(Integer id) {
			EntityManager em = Context.getInstance().getEmf().createEntityManager();
			Voiture objet = em.find(Voiture.class, id);
			em.close();
			return objet;
		}

		public List<Voiture> findAll() {
			EntityManager em = Context.getInstance().getEmf().createEntityManager();
			TypedQuery<Voiture> requete = em.createQuery("from Voiture v",Voiture.class);
			List<Voiture> voiture = requete.getResultList();
			em.close();
			return voiture;
		}

		public Voiture save(Voiture o) {
			EntityManager em = Context.getInstance().getEmf().createEntityManager();
			em.getTransaction().begin();
			o=em.merge(o);
			em.getTransaction().commit();
			em.close();
			return o;
		}

		public void delete(Voiture o) {
			EntityManager em = Context.getInstance().getEmf().createEntityManager();
			em.getTransaction().begin();
			o=em.merge(o);
			em.remove(o);
			em.getTransaction().commit();
			em.close();
		}


}
