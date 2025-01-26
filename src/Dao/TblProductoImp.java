package Dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Interfaces.IProducto;
import model.TblProducto;

public class TblProductoImp implements IProducto {

	@Override
	public void newProduct(TblProducto tblproducto) {
		// Conexión con unidad de persistencia para registrar datos
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_T1_JHOLBYSAMAME");
		EntityManager em = emf.createEntityManager();

		try {
			// Iniciar transacción
			em.getTransaction().begin();
			// Invocar registrar
			em.persist(tblproducto);
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
	public void updateProduct(TblProducto tblproducto) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_T1_JHOLBYSAMAME");
		EntityManager em = emf.createEntityManager();

		try {

			em.getTransaction().begin();
			em.merge(tblproducto);
			em.getTransaction().commit();

		} catch (Exception e) {
			e.getMessage();
		} finally {

			em.close();

		}

	}

	@Override
	public void removeProduct(TblProducto tblproducto) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_T1_JHOLBYSAMAME");
		EntityManager em = emf.createEntityManager();

		try {

			em.getTransaction().begin();
			TblProducto paraEliminar = em.find(TblProducto.class, tblproducto.getIdproducto());

			if (tblproducto != null) {
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
	public TblProducto findProduct(TblProducto tblproducto) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_T1_JHOLBYSAMAME");
		EntityManager em = emf.createEntityManager();

		TblProducto pro = null;

		try {

			em.getTransaction().begin();
			pro = em.find(TblProducto.class, tblproducto.getIdproducto());
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
	public List<TblProducto> listProducts() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_T1_JHOLBYSAMAME");
		EntityManager em = emf.createEntityManager();

		List<TblProducto> listado = null;

		try {
			em.getTransaction().begin();
			// Consulta JPQL
			listado = em.createQuery("select c from TblProducto c", TblProducto.class).getResultList();
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
