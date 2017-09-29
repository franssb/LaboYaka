package be.steformations.fs.yaka.jpa.beans;

import be.steformations.fs.yaka.jpa.interfaces.Categories;

public class CategoriesImpl implements Categories {

	protected int id;
	protected String nom;
	

	@Override
	public int getId() {
		return id;
	}
	
	@Override
	public String getNom() {
		return nom;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
}
