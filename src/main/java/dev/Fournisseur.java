package dev;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "fournisseur")
public class Fournisseur {
	@Id
	private int id;
	@Column
	private String nom;
	@OneToMany(mappedBy = "fournisseur")
	private List<Article> articles;
	@OneToMany(mappedBy = "fournisseur")
	private List<Bon> bons;

	public Fournisseur() {
		super();
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Fournisseur : " + nom;
	}

	/**
	 * @return the articles
	 */
	public List<Article> getArticles() {
		return articles;
	}

	/**
	 * @param articles
	 *            the articles to set
	 */
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
}
