package tn.website.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Entity
public class Administrateur extends Personne{
	
	@OneToMany
	private   List<Vendeur> listeVendeur;
	@OneToMany
	private   List<Client> listeClient;
	
	
	
	public List<Vendeur> getListeVendeur() {
	return listeVendeur;
}


public void setListeVendeur(List<Vendeur> listeVendeur) {
	this.listeVendeur = listeVendeur;
}


public List<Client> getListeClient() {
	return listeClient;
}


public void setListeClient(List<Client> listeClient) {
	this.listeClient = listeClient;
}





	public void supprimmerUtilisateur(){
		
	}

	
	public void consulterListutilisateur(){
		
	}
	
		
	
	
}

