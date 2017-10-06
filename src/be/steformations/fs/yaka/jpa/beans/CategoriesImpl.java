package be.steformations.fs.yaka.jpa.beans;

import be.steformations.fs.yaka.jpa.interfaces.Categories;

public class CategoriesImpl implements Categories {

	protected int id;
	protected String nom;
	protected int stat;
	

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

	public int getStat() {
		return stat;
	}

	public void setStat(int stat) {
		this.stat = stat;
	}
}
