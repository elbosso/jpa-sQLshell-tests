package de.elbosso.generated.sqlshell.entities;

import de.elbosso.generated.sqlshell.entities.dao.DaoFactory;
import de.elbosso.generated.sqlshell.entities.dao.ProductDao;
import de.elbosso.generated.sqlshell.entities.dao.SupplierDao;
import junit.framework.Assert;
import org.junit.Test;
import util.JpaDao;
import util.JpaDaoFactory;

public class ProductTest
{
	@Test
	public void testPersist() {
		SupplierDao supplierDao=DaoFactory.createSupplierDao();
		ProductDao productDao= DaoFactory.createProductDao();
		try {

			// Persist in database
			productDao.beginTransaction();
			Supplier supplier=supplierDao.find(Integer.valueOf(-2147483635)).orElse(new Supplier());
			Product product = new Product();
			product.setProductname("product2");
			product.setSupplier(supplier);
			product.setIsdiscontinued(Boolean.FALSE);
			productDao.persist(product);
			Product productDB =  productDao.find(product.getId()).get();
			productDao.commitTransaction();
			Assert.assertNotNull(productDB);
			Assert.assertEquals(product.getProductname(), productDB.getProductname());

		} catch (Throwable e) {
			productDao.rollbackTransaction();
			e.printStackTrace();
			Assert.fail();
		}
	}
	@Test
	public void testFindByProductname() {
		ProductDao productDao= DaoFactory.createProductDao();
		try {

			productDao.beginTransaction();
			Product productDB =  productDao.findByProductname("klassische Seife").get();
			productDao.commitTransaction();
			Assert.assertEquals(java.lang.Integer.valueOf(-2147483636), productDB.getId());

		} catch (Throwable e) {
			productDao.rollbackTransaction();
			e.printStackTrace();
			Assert.fail();
		}
	}
	@Test
	public void testOrders() {
		ProductDao productDao= DaoFactory.createProductDao();
		try {

			productDao.beginTransaction();
			Product productDB =  productDao.findByProductname("elegante Teller").get();
			productDao.commitTransaction();
			Assert.assertEquals(4, productDB.getTheorders().size());
		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

}
