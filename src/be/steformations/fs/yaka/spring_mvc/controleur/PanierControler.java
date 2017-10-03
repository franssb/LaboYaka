package be.steformations.fs.yaka.spring_mvc.controleur;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import be.steformations.fs.yaka.jpa.beans.ArticlesImpl;
import be.steformations.fs.yaka.jpa.beans.PanierImpl;
import be.steformations.fs.yaka.jpa.dao.Gestionnaire;

@Controller
@Scope("request")
public class PanierControler {

	@Autowired	
	protected Gestionnaire gestionnaire;
	@Autowired
	protected PanierImpl panier;
	
	public PanierControler() {
		System.out.println("PanierControler.PanierControler()");
	}
	
	@RequestMapping("panier")
	public String showPanier( 	
			Map<String, Object> attributs
			){
		attributs.put("panier", panier);
		return "/panier.jsp";
	}
	
	
	@RequestMapping(value="panier/add",method=RequestMethod.POST )
	public String addPanier( 				
			@RequestParam("param") List<String> parametres,
			Map<String, Object> attributs
			){
			if(parametres == null){
				parametres = new ArrayList<>();
				parametres.add("2");						
			}
			System.out.println("PanierControler.addPanier()");
			List<Integer>listId = new ArrayList<>();
			for (String s : parametres) {
				try {
					int id = Integer.parseInt(s);
					listId.add(id);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			ArticlesImpl article = this.gestionnaire.getArticlesIdByCaracteristiquesIdList(listId, parametres.size());
			panier.getArticles().add(article);
		return this.showPanier(attributs);
	}
	
	@RequestMapping(value="panier/remove",method=RequestMethod.POST)
	public String removePanier( 				
			@RequestParam("remove") String remove,
			Map<String, Object> attributs
			){
		System.out.println("PanierControler.removePanier()");
		int id = -1;
		try {
			id = Integer.parseInt(remove);
		} catch (Exception e) {
			e.printStackTrace();
		}
		ArticlesImpl article = this.gestionnaire.getArticlesById(id);
		panier.getArticles().remove(article);
		return this.showPanier(attributs);
	}
	
}
