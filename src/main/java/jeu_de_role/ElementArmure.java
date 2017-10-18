package jeu_de_role;

import javax.persistence.*;

@Entity
public class ElementArmure extends Objet {

	/** emplacement : String */
	@Column(name = "EMPLA")
	private String emplacement;

	/** valeurDefense : int */
	@Column(name = "VALDEF")
	private int valeurDefense;

	/**
	 * Constructeur hibernate
	 */
	public ElementArmure() {
		super();
	}

	/**
	 * Constructeur
	 * 
	 * @param nom
	 * @param poids
	 * @param type
	 * @param conteneur
	 * @param emplacement
	 * @param valeurDefense
	 */
	public ElementArmure(String nom, int poids, String type, String emplacement, int valeurDefense) {
		super(nom, poids, type);
		this.emplacement = emplacement;
		this.valeurDefense = valeurDefense;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see jeu_de_role.Objet#utiliser()
	 */
	@Override
	public void utiliser() {
		StringBuilder str = new StringBuilder("DEFENSE ! ").append(this.valeurDefense).append(" PTS encaissés");
		LOG.debug(str.toString());

	}

	/**
	 * @return the emplacement
	 */
	public String getEmplacement() {
		return emplacement;
	}

	/**
	 * @param emplacement
	 *            the emplacement to set
	 */
	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}

	/**
	 * @return the valeurDefense
	 */
	public int getValeurDefense() {
		return valeurDefense;
	}

	/**
	 * @param valeurDefense
	 *            the valeurDefense to set
	 */
	public void setValeurDefense(int valeurDefense) {
		this.valeurDefense = valeurDefense;
	}

}
