package be.steformations.fs.yaka.jpa.beans;

public class LignesCommandeImpl {

	
	protected int id;
	protected CommandesImpl commande;
	protected ArticlesImpl article;
	protected int quantite;
	
	public LignesCommandeImpl() {
		System.out.println("LignesCommandeImpl.LignesCommandeImpl()");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public CommandesImpl getCommande() {
		return commande;
	}
	public void setCommande(CommandesImpl commande) {
		this.commande = commande;
	}
	public ArticlesImpl getArticle() {
		return article;
	}
	public void setArticle(ArticlesImpl article) {
		this.article = article;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	
}
