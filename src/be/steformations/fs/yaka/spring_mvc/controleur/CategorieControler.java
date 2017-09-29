package be.steformations.fs.yaka.spring_mvc.controleur;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import be.steformations.fs.yaka.jpa.beans.CategoriesImpl;
import be.steformations.fs.yaka.jpa.dao.Gestionnaire;

@Controller
public class CategorieControler {

	@Autowired
	private Gestionnaire gestionnaire;
	
	
	public CategorieControler() {
		super();
	}
	
	
	@org.springframework.web.bind.annotation.RequestMapping("index")
	public String showCategories( 
			Map<String, Object> attributs
			){		
		List<CategoriesImpl> cat = gestionnaire.getAllCategories();
		attributs.put("categories", cat);		
		return "/index.jsp";
	}
	
}
