package be.steformations.fs.yaka.jpa.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class PanierImpl {

	protected List<ArticlesImpl> articles;
	protected int prix = 0;
	
	public PanierImpl() {
		System.out.println("PanierImpl.PanierImpl()");
	}
	
	public List<ArticlesImpl> getArticles() {
		System.out.println("PanierImpl.getArticles()");
		if (articles == null) {
			articles = new ArrayList<>();			
		}
		return articles;
	}
	
	public void setArticles(List<ArticlesImpl> articles) {
		this.articles = articles;
	}
		
	public void remove(ArticlesImpl art){
		System.out.println("PanierImpl.remove()");
		articles.remove(art);
	}

	public int getPrix() {
		System.out.println("PanierImpl.getPrix()");
		this.prix = 0;
		for (ArticlesImpl a : articles) {
			this.prix +=a.getPrixHtva()*a.getQuantite();
		}
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}
}
