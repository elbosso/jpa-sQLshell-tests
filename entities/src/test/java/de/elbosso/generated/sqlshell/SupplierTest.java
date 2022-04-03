package de.elbosso.generated.sqlshell;

import de.elbosso.generated.sqlshell.Supplier;
import de.elbosso.generated.sqlshell.dao.DaoFactory;
import de.elbosso.generated.sqlshell.dao.SupplierDao;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SupplierTest
{
	static DaoFactory df;

	@BeforeClass
	public static void setUp() throws ClassNotFoundException
	{
		df=new DaoFactory("pg-jpa");
	}

	@Test
	public void testPersist() {
		SupplierDao supplierDao= df.createSupplierDao();
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
	@Test
	public void testCountCustomers()
	{
		try {

			SupplierDao supplierDao= df.createSupplierDao();
			supplierDao.beginTransaction();
			Long number =  supplierDao. findNumberOfCustomers("Richter eG").orElse(null);
			supplierDao.commitTransaction();
			Assert.assertNotNull(number);
			Assert.assertEquals(5l,number.longValue());

		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
}
