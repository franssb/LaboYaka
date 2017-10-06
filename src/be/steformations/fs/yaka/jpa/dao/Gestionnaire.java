package be.steformations.fs.yaka.jpa.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.sun.security.ntlm.Client;

import be.steformations.fs.yaka.jpa.beans.ArticlesImpl;
import be.steformations.fs.yaka.jpa.beans.CategoriesImpl;
import be.steformations.fs.yaka.jpa.beans.ClientsImpl;
import be.steformations.fs.yaka.jpa.beans.CommandesImpl;
import be.steformations.fs.yaka.jpa.beans.LignesCommandeImpl;
import be.steformations.fs.yaka.jpa.beans.PaysImpl;
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
	
	
	public ArticlesImpl getArticlesIdByCaracteristiquesIdList(List<Integer>id, int count){
		return this.em.createNamedQuery("getArticlesIdByCaracteristiquesIdList",ArticlesImpl.class).setParameter("id", id).setParameter("count", count).getSingleResult();
	}
//	public List<CaracteristiquesImpl> getCaracteristiquesByProduitId(int id){
//		return this.em.createNamedQuery("getCaracteristiquesByProduitId", CaracteristiquesImpl.class).setParameter("id", id).getResultList();
//	}

	public ArticlesImpl getArticlesById(int id) {
		return this.em.createNamedQuery("getArticlesById", ArticlesImpl.class).setParameter("id", id).getSingleResult();
	}

	public List<PaysImpl> getAllCountry() {
		return this.em.createNamedQuery("getAllCountry", PaysImpl.class).getResultList();
		
	}

	public ClientsImpl addClient(String nom, String prenom, String adresse, String cp, String localite, PaysImpl pays,
			String telephone, String numeroCarte, Date echeance, String email) {
		ClientsImpl client = new ClientsImpl();
		client.setNom(nom);
		client.setPrenom(prenom);
		client.setAdresse(adresse);
		client.setCp(cp);
		client.setLocalite(localite);
		client.setPays(pays);
		client.setTelephone(telephone);
		client.setNumeroCarte(numeroCarte);
		client.setEcheance(echeance);
		client.setEmail(email);
		if (this.em.isJoinedToTransaction()) {
			this.em.persist(client);
		} else {
			this.em.getTransaction().begin();
			this.em.persist(client);
			this.em.getTransaction().commit();
		}
		
		return client;
	}

	public PaysImpl getCountryById(String paysAbr) {
		return this.em.createNamedQuery("getCountryById", PaysImpl.class).setParameter("id", paysAbr).getSingleResult();
		
	}

	public void addCommande(CommandesImpl commande) {
		if (this.em.isJoinedToTransaction()) {
			this.em.persist(commande);
		} else {
			this.em.getTransaction().begin();
			this.em.persist(commande);
			this.em.getTransaction().commit();
		}
	}

	public void addLignesCommande(LignesCommandeImpl lc) {
		if (this.em.isJoinedToTransaction()) {
			this.em.persist(lc);
		} else {
			this.em.getTransaction().begin();
			this.em.persist(lc);
			this.em.getTransaction().commit();
		}
	}
	

	
	

}
