package tn.website.dao;

import javax.persistence.EntityManager;

import tn.website.model.Client;
import tn.website.model.Personne;

public class ClientDao {
	public static EntityManager em;
	
	public static void ajouterClient(Client c){
		em.getTransaction().begin();
		em.merge(c);
		em.getTransaction().commit();
	
	}

}
