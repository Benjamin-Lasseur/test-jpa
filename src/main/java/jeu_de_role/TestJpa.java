package jeu_de_role;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestJpa {

	public static void main(String[] args) {
		List<ActionARealiser> listAction = new ArrayList<>();
		listAction.add(new ActionARealiser("Attaquer", "Monstres", 12, 13));
		listAction.add(new ActionARealiser("Defendre", "tours", 9, 11));
		List<Scenario> listScenario = new ArrayList<>();
		listScenario.add(new Scenario("Sauver la princesse"));
		Quete q = new Quete("Super Quete", 13, 14, 15, listAction, listScenario);
		Classe c = new Classe("Paladin");
		Caracteristique carac = new Caracteristique("Feu", 123.6f);
		Personnage p = new Personnage("Lasseur", "Benjamin", 24, c, carac, listScenario);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		listAction.stream().forEach(ac -> em.persist(ac));
		listScenario.stream().forEach(sc -> em.persist(sc));
		em.persist(c);
		em.persist(carac);
		em.persist(p);
		em.persist(q);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
