package be.steformations.fs.yaka.spring_mvc.controleur;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import be.steformations.fs.yaka.jpa.beans.PaysImpl;
import be.steformations.fs.yaka.jpa.dao.Gestionnaire;

@Controller
@Scope("request")
public class ClientsControler {


	@Autowired
	protected Gestionnaire gestionnaire;
	
	public ClientsControler() {
		System.out.println("ClientsControler.ClientsControler()");
	}
	
	
	
	
	@RequestMapping(value="/client", method = RequestMethod.POST)
	public String showClient(
			Map<String, Object> attributs
			){
		System.out.println("ClientsControler.showClient()");
		
		attributs.put("pays",this.gestionnaire.getAllCountry());
		return "/client.jsp";
	}
	
	
	@RequestMapping(value="/achat", method = RequestMethod.POST)
	public String addClient(			
			@RequestParam("nom") String nom,
			@RequestParam("prenom") String prenom,
			@RequestParam("adresse") String adresse,
			@RequestParam("cp") String cp,
			@RequestParam("localite") String localite,
			@RequestParam("telephone") String telephone,
			@RequestParam("numeroCarte") String numeroCarte,
			@RequestParam("email") String email,
			@RequestParam("echeance") String echeance,
			@RequestParam("pays") String paysAbr,	
			Map<String, Object> attributs
			){		
		System.out.println("ClientsControler.addClient()");
		Date date = null;
		PaysImpl pays = null;
		try {
			date = new SimpleDateFormat("dd-mm-yyyy").parse(echeance);
			pays = this.gestionnaire.getCountryById(paysAbr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.gestionnaire.addClient(nom, prenom, adresse, cp, localite, pays, telephone, numeroCarte, date, email );
		
		
		return "/client.jsp";
	}
	
}
