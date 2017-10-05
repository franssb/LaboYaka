package be.steformations.fs.yaka.jpa.beans;

public class PaysImpl {

	protected String abreviation;
	protected String nom;
	protected int port;
	
	public PaysImpl() {
		System.out.println("PaysImpl.PaysImpl()");
	}
	
	public String getAbreviation() {
		return abreviation;
	}
	public void setAbreviation(String abreviation) {
		this.abreviation = abreviation;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
}
