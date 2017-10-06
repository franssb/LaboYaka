package be.steformations.fs.yaka.spring_mvc.controleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import be.steformations.fs.yaka.jpa.dao.Gestionnaire;

@Controller
@Scope("request")
public class LoginControler {
	
	@Autowired
	Gestionnaire gestionnaire;
	
	
	@RequestMapping("login")
	public String connection(){
		String retour = "/login.jsp";
		return retour;
	}
}
