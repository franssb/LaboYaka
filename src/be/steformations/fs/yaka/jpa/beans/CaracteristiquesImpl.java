package be.steformations.fs.yaka.jpa.beans;

import java.util.List;

import be.steformations.fs.yaka.jpa.interfaces.Caracteristiques;
import be.steformations.fs.yaka.jpa.interfaces.Produits;
import be.steformations.fs.yaka.jpa.interfaces.Proprietes;

public class CaracteristiquesImpl implements Caracteristiques {
	
	protected int id;
	protected Produits produits;
	protected Proprietes proprietes;
	protected String valeur;
	protected List<ArticlesImpl> articles;
	
	@Override
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public Produits getProduits() {
		return produits;
	}
	
	@Override
	public Proprietes getProprietes() {
		return proprietes;
	}
	public void setProprietes(Proprietes proprietes) {
		this.proprietes = proprietes;
	}
	
	@Override
	public String getValeur() {
		return valeur;
	}
	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

	public void setProduits(ProduitsImpl produits) {
		this.produits = produits;
	}
	public List<ArticlesImpl> getArticles() {
		return articles;
	}
	
}
