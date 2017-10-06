package be.steformations.fs.yaka.spring_mvc.controleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import be.steformations.fs.yaka.jpa.dao.Gestionnaire;

@Controller
@Scope("request")
public class AdminControler {

	@Autowired
	Gestionnaire gestionnaire;
	
	
	@RequestMapping(value="admin", method = RequestMethod.POST )
	public String connection(
			@RequestParam("mdp") String mdp
			){
		String retour = "/login.jsp";
		if(mdp.equals("login")){
			retour = "/admin.jsp";
		}
		return retour;
	}
}
