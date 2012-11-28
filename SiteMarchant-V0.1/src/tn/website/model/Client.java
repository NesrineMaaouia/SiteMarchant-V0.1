package tn.website.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;



@Entity
public class Client extends Personne {
	
	@OneToOne
	private Commande commande;
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	
	
	public void ajouterAuPannier(){
		
	}
	public void supprimerDuPanier(){
			
	}
	public void acheter(){
		
	}
	

}
