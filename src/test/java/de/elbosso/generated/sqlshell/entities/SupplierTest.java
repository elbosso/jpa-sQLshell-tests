package de.elbosso.generated.sqlshell.entities;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import util.JpaDao;
import util.JpaDaoFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SupplierTest
{
	static EntityManagerFactory emf;
	EntityManager em;

	@BeforeClass
	public static void setUp() throws ClassNotFoundException
	{
//		emf = Persistence.createEntityManagerFactory("hsqldb-jpa");
		emf = Persistence.createEntityManagerFactory("pg-jpa");
	}

	@Before
	public void initEntityManager() {
		em = emf.createEntityManager();
	}

	@Test
	public void testPersist() {
		JpaDao<Supplier> supplierDao= JpaDaoFactory.createDao(Supplier.class);
		try {

			// Persist in database
			supplierDao.beginTransaction();
			Supplier supplier=new Supplier();
			supplier.setCompanyname("Company1");
			supplier.setContactname("Contact1");
			supplier.setCountry("DE");
			supplierDao.persist(supplier);
			Supplier supplierDB =  supplierDao.find(supplier.getId()).get();
			supplierDao.commitTransaction();
			Assert.assertNotNull(supplierDao);
			Assert.assertEquals(supplier.getCompanyname(), supplierDB.getCompanyname());

		} catch (Throwable e) {
			supplierDao.rollbackTransaction();
			e.printStackTrace();
			Assert.fail();
		}
	}
}
