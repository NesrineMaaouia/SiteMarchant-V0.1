package tn.website.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import sun.font.CreatedFontTracker;
import tn.website.dao.ClientDao;
import tn.website.model.Categorie;
import tn.website.model.Client;
import tn.website.model.Commande;
import tn.website.model.Personne;
import tn.website.model.Produit;
import tn.website.model.Stock;
import tn.website.model.Vendeur;




public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("site_marchant3");
		EntityManager em = emf.createEntityManager();
		
		
		
		
		//ajout d'un client
//		Commande commande = new Commande();
//		Client c = new Client();
//		c.setNom("krichen");
//		c.setPrenom("nesrine");
//		c.setAddress("ariana");
//		c.setTelephone(24600487);
//		c.setCommande(commande);
//		em.getTransaction().begin();
//		em.merge(c);
//		em.getTransaction().commit();
		//
		
		
		
		//supprimer Utilisateur
		//Personne personne =new Personne();
		
		
		
		
		
		//ajout d'un produit
		Produit produit =new Produit();
		produit.setMarque("samsung");
		produit.setNom("televiseur");
		produit.setPrix(2000);
		//produit.setCategorie(categorie);
		em.getTransaction().begin();
		em.merge(produit);
		em.getTransaction().commit();
		
		/////////////
		
		
		
		//ajout de Vendeur
		Stock stock = new Stock();
		Vendeur v = new Vendeur();
		v.setNom("mehdi");
		v.setAddress("tunis");
		v.setPrenom("krichen");
		v.setTelephone(55600487);
		v.setStock(stock);
		em.getTransaction().begin();
		em.merge(v);
		em.getTransaction().commit();
		/////
		

	
		
		
		//ajouter une categorie
		Categorie categorie = new Categorie();
		categorie.setId_categorie(1);
		categorie.setLibelle("television");
		em.getTransaction().begin();
		em.merge(categorie);
		em.getTransaction().commit();
		///
		
		
		
		
		
		///consulter listes Client
		Query qc= em.createQuery("select c from Client c");
		List<Client> lA = qc.getResultList();
		for(Client clt:lA){
			System.out.println(clt.getNom());			
		}
		////
		
		
		///consulter listes Client
				Query qv = em.createQuery("select c from Vendeur c");
				List<Vendeur> lV = qv.getResultList();
				for(Vendeur ven:lV){
					System.out.println(ven.getNom());			
				}
		////
		
				
				
				
				
				
				
		//ajouter produit au panier d'un client
			Commande commande = new Commande();
			Query query1= em.createQuery("select c from Client c where c.nom = :nom");
					query1.setParameter("nom","krichen");
				//Commande cm=(Commande) query1.getSingleResult();
				List<Client> client=(List<Client>) query1.getResultList();
				
				for(Client ven:client){
					System.out.println(ven.getNom() + " " + ven.getPrenom());			
				}
				
				Produit p1 = new Produit();
				p1.setNom("plasma");
				p1.setMarque("sony");
				p1.setPrix(400);
				
				
				commande.ajouterProduit(p1);
				
				
				
		///
		em.close();
		emf.close();
		

	}

}
