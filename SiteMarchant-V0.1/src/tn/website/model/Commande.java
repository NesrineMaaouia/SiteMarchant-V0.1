package tn.website.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Commande {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_commande;
	private List<Produit> listeProduit;
	public long getId_commande() {
		return id_commande;
	}
	public void setId_commande(long id_commande) {
		this.id_commande = id_commande;
	}
	public List<Produit> getListeProduit() {
		return listeProduit;
	}
	public void setListeProduit(List<Produit> listeProduit) {
		this.listeProduit = listeProduit;
	}
	
	public void ajouterProduit(Produit p){
		listeProduit.add(p);
	}
	

}
