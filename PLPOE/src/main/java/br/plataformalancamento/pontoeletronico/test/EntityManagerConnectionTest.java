package br.plataformalancamento.pontoeletronico.test;

import org.jboss.logging.Logger;

import br.plataformalancamento.pontoeletronico.connection.EntityManagerConnection;

public class EntityManagerConnectionTest {
	
	private static final Logger LOGGER = Logger.getLogger(EntityManagerConnectionTest.class);
	
	public static void main(String[] args) {
		entityManagerConnection();
	}

	@SuppressWarnings("static-access")
	private static void entityManagerConnection() {
		EntityManagerConnection entityManagerConnection = new EntityManagerConnection();
		LOGGER.info("ENTITY MANAGER CONNECTION: " + entityManagerConnection.getEntityManagerConnection());
	}

	public static Logger getLogger() {
		return LOGGER;
	}
	
}
