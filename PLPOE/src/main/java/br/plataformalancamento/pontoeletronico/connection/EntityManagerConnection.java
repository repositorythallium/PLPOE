package br.plataformalancamento.pontoeletronico.connection;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.plataformalancamento.pontoeletronico.utility.ConstantesUtility;

public class EntityManagerConnection implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private static EntityManagerFactory entityManagerFactory;
	
	public EntityManagerConnection() { }
	
	static {
		entityManagerFactory = Persistence.createEntityManagerFactory(ConstantesUtility.PERSISTENCE_UNIT_NAME);
	}
	
	public static EntityManager getEntityManagerConnection() {
		return EntityManagerConnection.getEntityManagerFactory().createEntityManager();
	}
	
	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	public static void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		EntityManagerConnection.entityManagerFactory = entityManagerFactory;
	}
	
}
