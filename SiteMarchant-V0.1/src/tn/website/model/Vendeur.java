package tn.website.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;



@Entity
public class Vendeur extends Personne{
	

	@OneToOne(cascade={CascadeType.PERSIST, CascadeType.REMOVE}) //orphanRemoval=true)
	private Stock stock;

	
	public Stock getStock() {
		return stock;
	}


	public void setStock(Stock stock) {
		this.stock = stock;
	}


	public void supprimerProduit(){
		
	}
	
	
	public void modifierProduit(){
		
		
	}
}
