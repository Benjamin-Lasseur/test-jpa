package dev;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestJpa {

	private static final Logger LOG = LoggerFactory.getLogger(TestJpa.class);

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		TypedQuery<Bon> tQ = entityManager.createQuery("select bon from Bon bon", Bon.class);
		tQ.getResultList().stream()
				.forEach(bon -> bon.getArticles().stream().forEach(art -> LOG.error(art.toString())));
		entityManager.close();
		entityManagerFactory.close();
	}
}
