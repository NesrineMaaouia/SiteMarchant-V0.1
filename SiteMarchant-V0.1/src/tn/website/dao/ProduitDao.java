package tn.website.dao;

import javax.persistence.EntityManager;

import tn.website.model.Produit;



public class ProduitDao {
	
public static EntityManager em;
	
	public static void ajouterProduit(Produit p){
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
	
	}

}
