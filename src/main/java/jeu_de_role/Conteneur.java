package jeu_de_role;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Conteneur {

	/** id : int */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/** nom : String */
	@Column(name = "NOM")
	private String nom;

	/** type : String */
	@Column(name = "TYPE")
	private String type;

	/** nbObjetsMax : int */
	@Column(name = "NBOBJMAX")
	private int nbObjetsMax;

	/** objets : List<Objet> */
	@OneToMany(mappedBy = "conteneur")
	private List<Objet> objets = new ArrayList<>();

	/**
	 * Constructeur hibernate
	 */
	public Conteneur() {
		super();
	}

	/**
	 * Constructeur
	 * 
	 * @param nom
	 * @param type
	 * @param nbObjetsMax
	 * @param objets
	 */
	public Conteneur(String nom, String type, int nbObjetsMax) {
		this.nom = nom;
		this.type = type;
		this.nbObjetsMax = nbObjetsMax;
	}

	public void addObjet(Objet o) {
		if (this.objets.size() < this.nbObjetsMax) {
			this.objets.add(o);
			o.setConteneur(this);
		}
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the nbObjetsMax
	 */
	public int getNbObjetsMax() {
		return nbObjetsMax;
	}

	/**
	 * @param nbObjetsMax
	 *            the nbObjetsMax to set
	 */
	public void setNbObjetsMax(int nbObjetsMax) {
		this.nbObjetsMax = nbObjetsMax;
	}

	/**
	 * @return the objets
	 */
	public List<Objet> getObjets() {
		return objets;
	}

	/**
	 * @param objets
	 *            the objets to set
	 */
	public void setObjets(List<Objet> objets) {
		this.objets = objets;
	}

}
