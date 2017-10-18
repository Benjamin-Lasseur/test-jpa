package jeu_de_role;

import javax.persistence.*;

@Entity
public class Arme extends Objet {

	/** valeurAttaque : int */
	@Column(name = "VALATTAQUE")
	private int valeurAttaque;

	/**
	 * Constructeur hibernate
	 */
	public Arme() {
		super();
	}

	/**
	 * Constructeur
	 * 
	 * @param nom
	 * @param poids
	 * @param type
	 * @param conteneur
	 * @param valeurAttaque
	 */
	public Arme(String nom, int poids, String type, int valeurAttaque) {
		super(nom, poids, type);
		this.valeurAttaque = valeurAttaque;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see jeu_de_role.Objet#utiliser()
	 */
	@Override
	public void utiliser() {
		StringBuilder str = new StringBuilder("LEEEEERRRROOOY JJJEEEENNNKIINNSSS ").append(this.valeurAttaque)
				.append(" PTS d'attaque");
		LOG.debug(str.toString());

	}

	/**
	 * @return the valeurAttaque
	 */
	public int getValeurAttaque() {
		return valeurAttaque;
	}

	/**
	 * @param valeurAttaque
	 *            the valeurAttaque to set
	 */
	public void setValeurAttaque(int valeurAttaque) {
		this.valeurAttaque = valeurAttaque;
	}

}
