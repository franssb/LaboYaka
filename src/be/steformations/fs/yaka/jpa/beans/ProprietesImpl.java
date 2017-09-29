package be.steformations.fs.yaka.jpa.beans;

import be.steformations.fs.yaka.jpa.interfaces.Proprietes;

public class ProprietesImpl implements Proprietes {

	protected int id;
	protected String nom;

	@Override
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
