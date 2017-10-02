package be.steformations.fs.yaka.spring_mvc.controleur;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import be.steformations.fs.yaka.jpa.beans.PanierImpl;
import be.steformations.fs.yaka.jpa.dao.Gestionnaire;

@Controller
public class PanierControler {

	@Autowired
	Gestionnaire gestionnaire;
	
	public PanierControler() {
		System.out.println("PanierControler.PanierControler()");
	}
	
	@RequestMapping("panier")
	public String showPanier( 	
			Map<String, Object> attributs
			){
		PanierImpl panierImpl = new PanierImpl(); // TODO
		attributs.put("articlesListPanier", panierImpl);
		
		
		return "/panier.jsp";
	}
	
	
	@RequestMapping(value="panier/add",method=RequestMethod.POST )
	public String addPanier( 				
			@RequestParam("param") List<String> parametres,
			Map<String, Object> attributs
			){
			System.out.println("param" + parametres);
			for (String s : parametres) {
				System.out.println(s);
			}
		
		
		return "/panier.jsp";
	}
	
}
