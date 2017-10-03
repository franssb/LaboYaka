package be.steformations.fs.yaka.jpa.beans;

import java.util.List;

import be.steformations.fs.yaka.jpa.interfaces.Produits;

public class ArticlesImpl {

	
	protected int id;
	protected int prixHtva;
	protected int poids;
	protected int vol_conditionnement;
	protected List<CaracteristiquesImpl> caracteristiques;
	protected Produits produit;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrixHtva() {
		return prixHtva;
	}
	public void setPrixHtva(int prixHtva) {
		this.prixHtva = prixHtva;
	}
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}
	public int getVol_conditionnement() {
		return vol_conditionnement;
	}
	public void setVol_conditionnement(int vol_conditionnement) {
		this.vol_conditionnement = vol_conditionnement;
	}
	public List<CaracteristiquesImpl> getCaracteristiques() {
		return caracteristiques;
	}
	public void setCaracteristiques(List<CaracteristiquesImpl> caracteristiques) {
		this.caracteristiques = caracteristiques;
	}
	public Produits getProduit() {
		if (produit == null) {
			produit = caracteristiques.get(0).getProduits();			
		}
		return produit;
	}
	public void setProduit(ProduitsImpl produit) {
		this.produit = produit;
	}
	
	
}
