package jeu_de_role;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "caracteristique")
public class Caracteristique {

	/** id : int */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/** nom : String */
	@Column(name = "NOM")
	private String nom;

	/** valeur : float */
	@Column(name = "VALEUR")
	private float valeur;

	/** personnages : List<Personnage> */
	@OneToMany(mappedBy = "caracteristique")
	private List<Personnage> personnages;

	/**
	 * Construteur hibernate
	 */
	public Caracteristique() {
		super();
	}

	/**
	 * Constructeur
	 * 
	 * @param nom
	 * @param valeur
	 */
	public Caracteristique(String nom, float valeur) {
		this.nom = nom;
		this.valeur = valeur;
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
	 * @return the valeur
	 */
	public float getValeur() {
		return valeur;
	}

	/**
	 * @param valeur
	 *            the valeur to set
	 */
	public void setValeur(float valeur) {
		this.valeur = valeur;
	}

	/**
	 * @return the personnages
	 */
	public List<Personnage> getPersonnages() {
		return personnages;
	}

	/**
	 * @param personnages
	 *            the personnages to set
	 */
	public void setPersonnages(List<Personnage> personnages) {
		this.personnages = personnages;
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

}
