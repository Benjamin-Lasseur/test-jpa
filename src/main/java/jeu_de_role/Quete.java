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
import javax.persistence.Table;

@Entity
@Table(name = "quete")
public class Quete {

	/** id : int */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/** nom : String */
	@Column(name = "NOM")
	private String nom;

	/** delai : int */
	@Column(name = "DELAI")
	private int delai;

	/** debutCoordX : int */
	@Column(name = "DEBUTCOORDX")
	private int debutCoordX;

	/** debutCoordY : int */
	@Column(name = "DEBUTCOORDY")
	private int debutCoordY;

	/** scenarios : List<Scenario> */
	@ManyToMany
	@JoinTable(name = "quete_scenario", joinColumns = @JoinColumn(name = "ID_QUETE", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_SCENARIO", referencedColumnName = "ID"))
	private List<Scenario> scenarios;

	/** actionsARealiser : List<ActionARealiser> */
	@ManyToMany
	@JoinTable(name = "quete_actions", joinColumns = @JoinColumn(name = "ID_QUETE", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_ACTION", referencedColumnName = "ID"))
	private List<ActionARealiser> actionsARealiser;

	/**
	 * Constructeur hibernate
	 */
	public Quete() {

	}

	/**
	 * Constructeur
	 * 
	 * @param nom
	 * @param delai
	 * @param debutCoordX
	 * @param debutCoordY
	 */
	public Quete(String nom, int delai, int debutCoordX, int debutCoordY, List<ActionARealiser> actions,
			List<Scenario> scenarios) {
		this.nom = nom;
		this.delai = delai;
		this.debutCoordX = debutCoordX;
		this.debutCoordY = debutCoordY;
		this.actionsARealiser = new ArrayList<>();
		this.scenarios = new ArrayList<>();
		actions.stream().forEach(ac -> this.actionsARealiser.add(ac));
		scenarios.stream().forEach(sc -> this.scenarios.add(sc));
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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the delai
	 */
	public int getDelai() {
		return delai;
	}

	/**
	 * @param delai
	 *            the delai to set
	 */
	public void setDelai(int delai) {
		this.delai = delai;
	}

	/**
	 * @return the debutCoordX
	 */
	public int getDebutCoordX() {
		return debutCoordX;
	}

	/**
	 * @param debutCoordX
	 *            the debutCoordX to set
	 */
	public void setDebutCoordX(int debutCoordX) {
		this.debutCoordX = debutCoordX;
	}

	/**
	 * @return the debutCoordY
	 */
	public int getDebutCoordY() {
		return debutCoordY;
	}

	/**
	 * @param debutCoordY
	 *            the debutCoordY to set
	 */
	public void setDebutCoordY(int debutCoordY) {
		this.debutCoordY = debutCoordY;
	}

	/**
	 * @return the scenarios
	 */
	public List<Scenario> getScenarios() {
		return scenarios;
	}

	/**
	 * @param scenarios
	 *            the scenarios to set
	 */
	public void setScenarios(List<Scenario> scenarios) {
		this.scenarios = scenarios;
	}

	/**
	 * @return the actionsARealiser
	 */
	public List<ActionARealiser> getActionsARealiser() {
		return actionsARealiser;
	}

	/**
	 * @param actionsARealiser
	 *            the actionsARealiser to set
	 */
	public void setActionsARealiser(List<ActionARealiser> actionsARealiser) {
		this.actionsARealiser = actionsARealiser;
	}

}
