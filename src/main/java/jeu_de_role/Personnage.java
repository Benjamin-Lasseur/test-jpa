package jeu_de_role;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "personnage")
public class Personnage {

	/** id : int */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/** nom : String */
	@Column(name = "NOM")
	private String nom;

	/** prenom : String */
	@Column(name = "PRENOM")
	private String prenom;

	/** age : int */
	@Column(name = "AGE")
	private int age;

	/** classe : Classe */
	@ManyToOne
	private Classe classe;

	/** caracteristique : Caracteristique */
	@ManyToOne
	private Caracteristique caracteristique;

	/** scenario : Scenario */
	@ManyToMany
	@JoinTable(name = "PERS_SCENARIO", joinColumns = @JoinColumn(name = "ID_PERS", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_SCENARIO", referencedColumnName = "ID"))
	private List<Scenario> scenarios;

	/**
	 * Construteur hibernate
	 */
	public Personnage() {
		super();
	}

	/**
	 * Constructeur
	 * 
	 * @param nom
	 * @param prenom
	 * @param age
	 */
	public Personnage(String nom, String prenom, int age, Classe classe, Caracteristique caracteristique,
			List<Scenario> scenarios) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.classe = classe;
		this.caracteristique = caracteristique;
		this.scenarios = new ArrayList<>();
		scenarios.stream().forEach(sc -> this.scenarios.add(sc));
	}

	/**
	 * @return the nom
	 */
	/**
	 * @return
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	/**
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	/**
	 * @return
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	/**
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the age
	 */
	/**
	 * @return
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	/**
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the classe
	 */
	/**
	 * @return
	 */
	public Classe getClasse() {
		return classe;
	}

	/**
	 * @param classe
	 *            the classe to set
	 */
	/**
	 * @param classe
	 */
	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	/**
	 * @return the caracteristique
	 */
	public Caracteristique getCaracteristique() {
		return caracteristique;
	}

	/**
	 * @param caracteristique
	 *            the caracteristique to set
	 */
	public void setCaracteristique(Caracteristique caracteristique) {
		this.caracteristique = caracteristique;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the scenario
	 */
	public List<Scenario> getScenario() {
		return scenarios;
	}

	/**
	 * @param scenario
	 *            the scenario to set
	 */
	public void setScenario(List<Scenario> scenario) {
		this.scenarios = scenario;
	}
}
