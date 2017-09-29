package be.steformations.fs.yaka.spring_mvc.controleur;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import be.steformations.fs.yaka.jpa.beans.CaracByProprietes;
import be.steformations.fs.yaka.jpa.beans.CaracteristiquesImpl;
import be.steformations.fs.yaka.jpa.beans.ProduitsImpl;
import be.steformations.fs.yaka.jpa.beans.ProprietesImpl;
import be.steformations.fs.yaka.jpa.dao.Gestionnaire;

@Controller
public class DetailProduitControler {
	
	@Autowired
	Gestionnaire gestionnaire;
	
	public DetailProduitControler() {
		System.out.println("DetailProduitControler.DetailProduitControler()");
	}

	@RequestMapping("detailProduit")
	public String showProduitDetail( 
			@RequestParam("prod") String prod,
			Map<String, Object> attributs
			){	
		int idProduit = -1;
		try {
			 idProduit = Integer.parseInt(prod);
		} catch (Exception e) {
			e.printStackTrace();
		}
		ProduitsImpl produit = gestionnaire.getProduitById(idProduit);
		attributs.put("produit", produit);
		
		//for each produit.getcarac -> get prop name
		/*List<ProprietesImpl> propList = gestionnaire.getProprieteByProduitId(idProduit);
		List<CaracByProprietes> caracByPropList = new ArrayList<>();
		for (ProprietesImpl prop : propList) {
			CaracByProprietes cbp = new CaracByProprietes();
			cbp.setProprietes(prop);
			caracByPropList.add(cbp);
		}
		attributs.put("caracByProprietes", caracByPropList);*/
		
		return "/detailProduit.jsp";
	}
}
