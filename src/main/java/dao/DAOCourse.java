package dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;

import model.courses.Course;
import util.Context;

public class DAOCourse implements IDAOCourse {

	@Override
	public Course findById(Integer id) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Course objet = em.find(Course.class, id);
		em.close();
		return objet;
	}

	@Override
	public List<Course> findAll() {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		Query requete = em.createQuery("from Course p",Course.class);
		List<Course> Courses = requete.getResultList();
		em.close();
		return Courses;
	}

	@Override
	public Course save(Course o) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		o=em.merge(o);
		em.getTransaction().commit();
		em.close();
		return o;
	}

	@Override
	public void delete(Course o) {
		EntityManager em = Context.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		o=em.merge(o);
		em.remove(o);
		em.getTransaction().commit();
		em.close();		
	}

}
