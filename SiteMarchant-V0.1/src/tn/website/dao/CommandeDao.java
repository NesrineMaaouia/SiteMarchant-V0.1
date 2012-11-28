package tn.website.dao;



import java.util.List;
import javax.persistence.EntityManager;
import tn.website.model.Produit;

public class CommandeDao {
	
public static EntityManager em;
	
	public static void ajouterProduit(List<Produit> list){
		em.getTransaction().begin();
		em.merge(list);
		em.getTransaction().commit();
	
	}

}
