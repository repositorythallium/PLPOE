package br.plataformalancamento.pontoeletronico.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.jboss.logging.Logger;

import br.plataformalancamento.pontoeletronico.connection.EntityManagerConnection;

public class BaseRepository<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private static final Logger LOGGER = Logger.getLogger(BaseRepository.class);
	
	private EntityManager entityManager;
	
	private EntityTransaction entityTransaction;
	
	private EntityManagerConnection entityManagerConnection;
	
	public BaseRepository() {
		this.entityManager = EntityManagerConnection.getEntityManagerConnection();
		this.entityTransaction = entityManager.getTransaction();
	}
	
	public T persist(T object) {
		getBeginTransaction();
			getEntityManager().persist(object);
		getCommitTransaction();
		return object;
	}
	
	public void persistAll(List<T> objectList) {
		getBeginTransaction();
		for(T t : objectList) {
			getEntityManager().persist(t);
		}
		getCommitTransaction();
	}
	
	public void getBeginTransaction() {
		if(entityManager.getTransaction().isActive() == false) {
			entityManager.getTransaction().begin();
			getLogger().info("[LOGGER] Transação iniciada com sucesso...");
		}
	}
	
	public void getCommitTransaction() {
		entityManager.getTransaction().commit();
	}
	
	public void getCommitTransactionAndClose() {
		entityManager.getTransaction().commit();
		getCloseEntityManager();
	}
	
	public void getRollbackTransaction() {
		entityManager.getTransaction().rollback();
	}
	
	public void getCloseEntityManager() {
		entityManager.close();
		getLogger().info("[LOGGER] Transação Finalizada com sucesso...");
	}
	
	public void getCleanEntityManager() {
		entityManager.clear();
	}
	
	public void getFlushEntityManager() {
		entityManager.flush();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public EntityTransaction getEntityTransaction() {
		return entityTransaction;
	}

	public void setEntityTransaction(EntityTransaction entityTransaction) {
		this.entityTransaction = entityTransaction;
	}

	public EntityManagerConnection getEntityManagerConnection() {
		return entityManagerConnection;
	}

	public void setEntityManagerConnection(EntityManagerConnection entityManagerConnection) {
		this.entityManagerConnection = entityManagerConnection;
	}

	public static Logger getLogger() {
		return LOGGER;
	}
	
}
