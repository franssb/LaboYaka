package be.steformations.fs.yaka.jpa.beans;

import be.steformations.fs.yaka.jpa.interfaces.SousCategories;

public class SousCategoriesImpl implements SousCategories {

	
	protected int id;
	protected String nom;
	protected CategoriesImpl categorie;
	
	
	@Override
	public int getId() {
		return id;
	}
	
	@Override
	public String getNom() {
		return nom;
	}
	
	@Override
	public CategoriesImpl getCategorie() {
		return categorie;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}	
	
	public void setCategorie(CategoriesImpl categorie) {
		this.categorie = categorie;
	}
}
