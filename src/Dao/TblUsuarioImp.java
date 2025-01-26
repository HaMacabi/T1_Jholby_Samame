package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuario;
import model.TblProducto;
import model.TblUsuario;

public class TblUsuarioImp implements IUsuario {

	@Override
	public void newUser(TblUsuario tblusuario) {
		// Conexión con unidad de persistencia para registrar datos
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_T1_JHOLBYSAMAME");
		EntityManager em = emf.createEntityManager();

		try {
			// Iniciar transacción
			em.getTransaction().begin();
			// Invocar registrar
			em.persist(tblusuario);
			// Confirmar
			em.getTransaction().commit();

		} catch (Exception e) {
			e.getMessage();
		} finally {
			// Cerrar
			em.close();

		}

	}

	@Override
	public void updateUser(TblUsuario tblusuario) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_T1_JHOLBYSAMAME");
		EntityManager em = emf.createEntityManager();

		try {

			em.getTransaction().begin();
			em.merge(tblusuario);
			em.getTransaction().commit();

		} catch (Exception e) {
			e.getMessage();
		} finally {

			em.close();

		}


	}

	@Override
	public void removeUser(TblUsuario tblusuario) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_T1_JHOLBYSAMAME");
		EntityManager em = emf.createEntityManager();

		try {

			em.getTransaction().begin();
			TblUsuario paraEliminar = em.find(TblUsuario.class, tblusuario.getIdusuario());

			if (tblusuario != null) {
				em.remove(paraEliminar);
				em.getTransaction().commit();

			}

		} catch (Exception e) {
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
			e.getMessage();
		} finally {

			em.close();

		}

	}

	@Override
	public TblUsuario findUser(TblUsuario tblusuario) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_T1_JHOLBYSAMAME");
		EntityManager em = emf.createEntityManager();

		TblUsuario pro = null;

		try {

			em.getTransaction().begin();
			pro = em.find(TblUsuario.class, tblusuario.getIdusuario());
			em.getTransaction().commit();

		} catch (Exception e) {
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
			e.getMessage();
		} finally {

			em.close();

		}

		return pro;
	}

	@Override
	public List<TblUsuario> listUsers() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_T1_JHOLBYSAMAME");
		EntityManager em = emf.createEntityManager();

		List<TblUsuario> listado = null;

		try {
			em.getTransaction().begin();
			// Consulta JPQL
			listado = em.createQuery("SELECT t FROM TblUsuario t", TblUsuario.class).getResultList();
			em.getTransaction().commit();

		} catch (Exception e) {
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
			e.getMessage();
		} finally {
			em.close();

		}

		return listado;
	
	}

}
