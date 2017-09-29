package be.steformations.fs.yaka.jpa.beans;

import java.util.ArrayList;
import java.util.List;

import be.steformations.fs.yaka.jpa.interfaces.Produits;
import be.steformations.fs.yaka.jpa.interfaces.Proprietes;


public class ProduitsImpl implements Produits {

	protected int id;
	protected String nom;
	protected String vignette;
	protected String image;
	protected String descrCourte;
	protected String descrLongue;
	protected int sousCategories;
	
	protected List<CaracByProprietes> caracByProp;
	
	
	protected List<CaracteristiquesImpl> caracteristiques; /*potentiellement inutile*/
	
	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public String getVignette() {
		return vignette;
	}

	@Override
	public String getImage() {
		return image;
	}

	@Override
	public String getDescrCourte() {
		return descrCourte;
	}

	@Override
	public String getDescrLongue() {
		return descrLongue;
	}
	
	@Override
	public int getSousCategories() {
		return sousCategories;
	}

	@Override
	public List<CaracteristiquesImpl> getCaracteristiques() {
		return caracteristiques;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setVignette(String vignette) {
		this.vignette = vignette;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setDescrCourte(String descrCourte) {
		this.descrCourte = descrCourte;
	}

	public void setDescrLongue(String descrLongue) {
		this.descrLongue = descrLongue;
	}

	public void setSousCategories(int sousCategories) {
		this.sousCategories = sousCategories;
	}

	public void setCaracteristiques(List<CaracteristiquesImpl> caracteristiques) {
		this.caracteristiques = caracteristiques;
	}

	
	//c'est tres moche, a changer!!!
	public List<CaracByProprietes> getCaracByProp() {
		if (caracByProp == null) {
			caracByProp = new ArrayList<>();

			List<Proprietes>propList = new ArrayList<>();
			for (CaracteristiquesImpl car : caracteristiques) {
				Proprietes p = car.getProprietes();
				if(!propList.contains(p)){
					propList.add(p);
				}				
			}
			for (Proprietes proprietes : propList) {
				CaracByProprietes cbp = new CaracByProprietes();
				cbp.setProprietes(proprietes);
				for (CaracteristiquesImpl car : caracteristiques) {					
					if(car.proprietes.equals(proprietes)){
						cbp.add(car);
					}				
				}
				caracByProp.add(cbp);
			}			
		}
		return caracByProp;
	}

	public void setCaracByProp(List<CaracByProprietes> caracByProp) {
		this.caracByProp = caracByProp;
	}
	
	
	
}
