package be.steformations.fs.yaka.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import be.steformations.fs.yaka.jpa.beans.ArticlesImpl;
import be.steformations.fs.yaka.jpa.beans.CaracteristiquesImpl;
import be.steformations.fs.yaka.jpa.beans.CategoriesImpl;
import be.steformations.fs.yaka.jpa.beans.ProduitsImpl;
import be.steformations.fs.yaka.jpa.beans.ProprietesImpl;
import be.steformations.fs.yaka.jpa.beans.SousCategoriesImpl;

@org.springframework.stereotype.Service	
@org.springframework.context.annotation.Scope("application")
public class Gestionnaire {
	
	protected EntityManager em;
	
	public Gestionnaire() {
		super();
		this.em = Persistence.createEntityManagerFactory("postgresql_eclipselink").createEntityManager();
	}
	
	public List<CategoriesImpl> getAllCategories(){
		return this.em.createNamedQuery("getAllCategories", CategoriesImpl.class).getResultList();
	}
	
	public List<SousCategoriesImpl> getAllSousCategoriesByCategories(int cat){
		return this.em.createNamedQuery("getAllSousCategoriesByCategories", SousCategoriesImpl.class).setParameter("cat", cat).getResultList();
	}
	
	public List<ProduitsImpl> getAllProduitsBySousCategories(int scat){
		return this.em.createNamedQuery("getAllProduitsBySousCategories", ProduitsImpl.class).setParameter("scat", scat).getResultList();
	}
	
	public ProduitsImpl getProduitById(int id){
		return this.em.createNamedQuery("getProduitById", ProduitsImpl.class).setParameter("id", id).getSingleResult();
	}

	public List<ProprietesImpl> getProprieteByProduitId(int id) {
		return this.em.createNamedQuery("getProprieteByProduitId",ProprietesImpl.class).setParameter("id", id).getResultList();
	}
	
//	public List<CaracteristiquesImpl> getCaracteristiquesByProduitId(int id){
//		return this.em.createNamedQuery("getCaracteristiquesByProduitId", CaracteristiquesImpl.class).setParameter("id", id).getResultList();
//	}
	

	
	

}
