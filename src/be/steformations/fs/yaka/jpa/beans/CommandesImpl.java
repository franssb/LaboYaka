package be.steformations.fs.yaka.jpa.beans;

import java.util.Date;

public class CommandesImpl {

	protected int id;
	protected Date date;
	protected String facture = "n";
	protected ClientsImpl client;
	
	public CommandesImpl() {
		System.out.println("CommandesImpl.CommandesImpl()");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getFacture() {
		return facture;
	}
	public void setFacture(String facture) {
		this.facture = facture;
	}
	public ClientsImpl getClient() {
		return client;
	}
	public void setClient(ClientsImpl client) {
		this.client = client;
	}
	
}
