package jeu_de_role;

import javax.persistence.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Objet {

	/** id : int */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;

	/** nom : String */
	@Column(name = "NOM")
	protected String nom;

	/** poids : int */
	@Column(name = "POIDS")
	protected int poids;

	/** type : String */
	@Column(name = "TYPE")
	protected String type;

	/** conteneur : Conteneur */
	@ManyToOne
	@JoinColumn(name = "ID_CONT")
	protected Conteneur conteneur;

	@Transient
	protected static final Logger LOG = LoggerFactory.getLogger(Objet.class);

	/**
	 * Utilise l'objet : spécifique à l'objet
	 */
	public abstract void utiliser();

	/**
	 * Constructeur hibernate
	 */
	public Objet() {
		super();
	}

	/**
	 * Constructeur
	 * 
	 * @param nom
	 * @param poids
	 * @param type
	 * @param conteneur
	 */
	public Objet(String nom, int poids, String type) {
		this.nom = nom;
		this.poids = poids;
		this.type = type;
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
	 * @return the poids
	 */
	public int getPoids() {
		return poids;
	}

	/**
	 * @param poids
	 *            the poids to set
	 */
	public void setPoids(int poids) {
		this.poids = poids;
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
	 * @return the conteneur
	 */
	public Conteneur getConteneur() {
		return conteneur;
	}

	/**
	 * @param conteneur
	 *            the conteneur to set
	 */
	public void setConteneur(Conteneur conteneur) {
		this.conteneur = conteneur;
	}

}
