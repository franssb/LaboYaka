package be.steformations.fs.yaka.spring_mvc.controleur;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import be.steformations.fs.yaka.jpa.beans.ProduitsImpl;
import be.steformations.fs.yaka.jpa.dao.Gestionnaire;

@Controller
@Scope("request")
public class ProduitControler {

	@Autowired
	Gestionnaire gestionnaire;
	
	public ProduitControler() {
		super();
		System.out.println("ProduitControler.ProduitControler()");
	}
	
	@RequestMapping("produits")
	public String showProduits( 
			@RequestParam("scat") String scat,
			Map<String, Object> attributs
			){	
		int scatInt = -1;
		try {
		 scatInt = Integer.parseInt(scat);
		} catch (Exception e) {
		e.printStackTrace();
		}
		List<ProduitsImpl> prod = gestionnaire.getAllProduitsBySousCategories(scatInt);
		attributs.put("produits", prod);
		return "/produits.jsp";
	}
}



