package jeu_de_role;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestJpa {

	public static void main(String[] args) {
		Conteneur sac = new Conteneur("Sac", "Tissue", 5);
		List<Objet> listObjet = new ArrayList<>();
		listObjet.add(new ElementArmure("Casque", 12, "Métal", "Tête", 100));
		listObjet.add(new Arme("BAZOOOOOOOKA", 100, "AOE", 1000));
		listObjet.add(new Consommable("Poche de vin", 2, "Denrée", true, false, 10));
		listObjet.stream().forEach(o -> sac.addObjet(o));
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(sac);
		listObjet.stream().forEach(o -> em.persist(o));
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

	private static void instanciationPersonnage() {
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
