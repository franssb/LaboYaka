package be.steformations.fs.yaka.spring_mvc.controleur;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import be.steformations.fs.yaka.jpa.beans.CategoriesImpl;
import be.steformations.fs.yaka.jpa.dao.Gestionnaire;

@Controller
@Scope("request")
public class AdminCategorieControler {
	
	@Autowired
	Gestionnaire gestionnaire;
	
	
	@RequestMapping("/admin/cat")
	public String connection(
			Map<String, Object> attributs
			){
		List<CategoriesImpl> cat = this.gestionnaire.getAllCategories();
		attributs.put("categories", cat);		
		return "/adminCat.jsp";
	}
	
	@RequestMapping(value="/admin/cat/del",method=RequestMethod.POST)
	public String del(
			@RequestParam("del") String del,
			Map<String, Object> attributs
			){
		int id = -1;
		try {
			id = Integer.parseInt(del);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.gestionnaire.delCategorie(id);
		return this.connection(attributs);
	}
	@RequestMapping(value="/admin/cat/add",method=RequestMethod.POST)
	public String add(
			@RequestParam("cat") String cat,
			Map<String, Object> attributs){
		System.out.println("AdminCategorieControler.add()");
		this.gestionnaire.createAddCategorie(cat);
		return this.connection(attributs);
	}
	
}
