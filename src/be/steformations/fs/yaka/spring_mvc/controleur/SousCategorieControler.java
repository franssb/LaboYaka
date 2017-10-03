package be.steformations.fs.yaka.spring_mvc.controleur;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import be.steformations.fs.yaka.jpa.beans.SousCategoriesImpl;
import be.steformations.fs.yaka.jpa.dao.Gestionnaire;

@Controller
@Scope("request")
public class SousCategorieControler {

	@Autowired
	private Gestionnaire gestionnaire;
	
	public SousCategorieControler() {
		System.out.println("SousCategorieControler.SousCategorieControler()");
	}
	
	@org.springframework.web.bind.annotation.RequestMapping("souscategories")
	public String showSousCategories( 
			@RequestParam("cat") String cat,
			Map<String, Object> attributs
			){	
		int catInt = -1;
		try {
			 catInt = Integer.parseInt(cat);
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<SousCategoriesImpl> scat = gestionnaire.getAllSousCategoriesByCategories(catInt);
		attributs.put("souscategories", scat);
		return "/souscategories.jsp";
	}


}
