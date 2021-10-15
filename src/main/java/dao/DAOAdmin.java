package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.connexion.Admin;
import util.Context;

public class DAOAdmin implements IDAOAdmin{

	@Override
	public Admin findById(Integer id) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Admin admin = em.find(Admin.class, id);

	return admin;
	}

	@Override
	public List<Admin> findAll() {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Query requete = em.createQuery("from Joueur j",Admin.class);
		List<Admin> admins = requete.getResultList();
		em.close();
		return admins;
		}

	@Override
	public Admin save(Admin o) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		o=em.merge(o);
		em.getTransaction().commit();
		em.close();
		return o;
	}

	@Override
	public void delete(Admin o) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		o=em.merge(o);
		em.remove(o);
		em.getTransaction().commit();
		em.close();
	}	



}
