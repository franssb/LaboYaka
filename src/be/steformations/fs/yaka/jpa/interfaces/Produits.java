package be.steformations.fs.yaka.jpa.interfaces;

import java.util.List;

import be.steformations.fs.yaka.jpa.beans.CaracteristiquesImpl;

public interface Produits {
	
	Integer getId();
	String getNom();
	String getVignette();
	String getImage();
	String getDescrCourte();
	String getDescrLongue();
	int getSousCategories();
	List<CaracteristiquesImpl> getCaracteristiques();
}
