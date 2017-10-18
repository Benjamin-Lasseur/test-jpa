package jeu_de_role;

import javax.persistence.*;

@Entity
public class Consommable extends Objet {

	/** buvable : boolean */
	@Column(name = "BUV", columnDefinition = "TINYINT")
	private boolean buvable;

	/** mangeable : boolean */
	@Column(name = "MANG", columnDefinition = "TINYINT")
	private boolean mangeable;

	/** duree : int */
	@Column(name = "DUREE")
	private int duree;

	/**
	 * Constructeur hibernate
	 */
	public Consommable() {
		super();
	}

	/**
	 * Constructeur
	 * 
	 * @param nom
	 * @param poids
	 * @param type
	 * @param conteneur
	 * @param buvable
	 * @param mangeable
	 * @param duree
	 */
	public Consommable(String nom, int poids, String type, boolean buvable, boolean mangeable, int duree) {
		super(nom, poids, type);
		this.buvable = buvable;
		this.mangeable = mangeable;
		this.duree = duree;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see jeu_de_role.Objet#utiliser()
	 */
	@Override
	public void utiliser() {
		if (buvable) {
			LOG.debug("BOIRE !");
		} else if (mangeable) {
			LOG.debug("MANGER !");
		} else {
			LOG.debug("JE SAIS PAS QUOI EN FAIRE");
		}

	}

	/**
	 * @return the buvable
	 */
	public boolean isBuvable() {
		return buvable;
	}

	/**
	 * @param buvable
	 *            the buvable to set
	 */
	public void setBuvable(boolean buvable) {
		this.buvable = buvable;
	}

	/**
	 * @return the mangeable
	 */
	public boolean isMangeable() {
		return mangeable;
	}

	/**
	 * @param mangeable
	 *            the mangeable to set
	 */
	public void setMangeable(boolean mangeable) {
		this.mangeable = mangeable;
	}

	/**
	 * @return the duree
	 */
	public int getDuree() {
		return duree;
	}

	/**
	 * @param duree
	 *            the duree to set
	 */
	public void setDuree(int duree) {
		this.duree = duree;
	}

}
