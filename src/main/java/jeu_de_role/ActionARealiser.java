package jeu_de_role;

import javax.persistence.*;

@Entity
@Table(name = "actionarealiser")
public class ActionARealiser {

	/** id : int */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/** type : String */
	@Column(name = "TYPE")
	private String type;

	/** cible : String */
	@Column(name = "CIBLE")
	private String cible;

	/** coordX : int */
	@Column(name = "COORDX")
	private int coordX;

	/** coordY : int */
	@Column(name = "COORDY")
	private int coordY;

	/**
	 * Constructeur hibernate
	 */
	public ActionARealiser() {
		super();
	}

	/**
	 * Constructeur
	 * 
	 * @param type
	 * @param cible
	 * @param coordX
	 * @param coordY
	 */
	public ActionARealiser(String type, String cible, int coordX, int coordY) {
		this.type = type;
		this.cible = cible;
		this.coordX = coordX;
		this.coordY = coordY;
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
	 * @return the cible
	 */
	public String getCible() {
		return cible;
	}

	/**
	 * @param cible
	 *            the cible to set
	 */
	public void setCible(String cible) {
		this.cible = cible;
	}

	/**
	 * @return the coordX
	 */
	public int getCoordX() {
		return coordX;
	}

	/**
	 * @param coordX
	 *            the coordX to set
	 */
	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}

	/**
	 * @return the coordY
	 */
	public int getCoordY() {
		return coordY;
	}

	/**
	 * @param coordY
	 *            the coordY to set
	 */
	public void setCoordY(int coordY) {
		this.coordY = coordY;
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
