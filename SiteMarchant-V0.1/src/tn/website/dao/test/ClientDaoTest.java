package tn.website.dao.test;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import tn.website.dao.ClientDao;
import tn.website.model.Client;
import tn.website.model.Personne;

public class ClientDaoTest {
	private static EntityManager em;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("site_marchant3");
		em  = emf.createEntityManager();
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
		Client c = new Client();
		c.setNom("krichen");
//		c.setPrenom("mehdi");
//		c.setAddress("ariana");
		//c.setTelephone(24600487);
		ClientDao.ajouterClient(c);
		
	}

}
