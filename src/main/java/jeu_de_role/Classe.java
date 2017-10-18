package jeu_de_role;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "classe")
public class Classe {

	/** id : int */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/** nom : String */
	@Column(name = "NOM")
	private String nom;

	/** personnages : List<Personnage> */
	@OneToMany(mappedBy = "classe")
	private List<Personnage> personnages;

	/**
	 * Constructeur hibernate
	 */
	public Classe() {
		super();
	}

	/**
	 * Constructeur
	 * 
	 * @param nom
	 */
	public Classe(String nom) {
		this.nom = nom;
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
