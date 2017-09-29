package be.steformations.fs.yaka.jpa.beans;

import java.util.ArrayList;
import java.util.List;

import be.steformations.fs.yaka.jpa.interfaces.Proprietes;

public class CaracByProprietes {

	Proprietes proprietes;
	List<CaracteristiquesImpl> caracteristiques = new ArrayList<>();

	public Proprietes getProprietes() {
		return proprietes;
	}

	public void setProprietes(Proprietes proprietes) {
		this.proprietes = proprietes;
	}

	public List<CaracteristiquesImpl> getCaracteristiques() {
		return caracteristiques;
	}

	public void setCaracteristiques(List<CaracteristiquesImpl> caracteristiques) {
		this.caracteristiques = caracteristiques;
	}

	public void add(CaracteristiquesImpl caracteristiques) {
		if (!this.caracteristiques.contains(caracteristiques)) {
			this.caracteristiques.add(caracteristiques);
		}
	}
}
