package tn.website.dao.test;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import tn.website.dao.ProduitDao;
import tn.website.model.Produit;

public class ProduitDaoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Produit p =new Produit();
		p.setNom("television");
		ProduitDao.ajouterProduit(p);
		
		
		
	}

}
