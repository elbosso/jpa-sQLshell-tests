package de.elbosso.generated.sqlshell.entities;

import de.elbosso.generated.sqlshell.entities.dao.*;
import junit.framework.Assert;
import org.junit.Test;
import util.JpaDao;
import util.JpaDaoFactory;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class ProductTest
{
	@Test
	public void testPersist() {
		SupplierDao supplierDao=DaoFactory.createSupplierDao();
		CustomerDao customerDao=DaoFactory.createCustomerDao();
		ProductDao productDao= DaoFactory.createProductDao();
		TheorderDao theorderDao=DaoFactory.createTheorderDao();
		OrderitemDao orderitemDao=DaoFactory.createOrderitemDao();
		try {

			// Persist in database
			productDao.beginTransaction();
			Supplier supplier=supplierDao.find(Integer.valueOf(-2147483635)).orElse(new Supplier());
			Product product = new Product();
			product.setProductname("product2");
			product.setSupplier(supplier);
			product.setIsdiscontinued(Boolean.FALSE);
			productDao.persist(product);
			productDao.commitTransaction();

			theorderDao.beginTransaction();
			Customer customer=customerDao.find(Integer.valueOf(-2147483647)).orElse(new Customer());
			Theorder theorder=new Theorder();
			theorder.setOrderdate(new Timestamp(new java.util.Date().getTime()));
			theorder.setTotalamount(BigDecimal.valueOf(3.14));
			theorder.setCustomer(customer);
			theorder.getProducts().add(product);
			theorderDao.persist(theorder);
			theorderDao.commitTransaction();

			orderitemDao.beginTransaction();
			java.util.List<Orderitem> orderitems=orderitemDao.findAllForProduct(product).orElse(java.util.Collections.emptyList());
			orderitemDao.commitTransaction();

			//this is needed to access the theorders and the orderitems!!
//			productDao= DaoFactory.createNewProductDao();
			//this is an alternative to actually get the references to the theorders and the orderitems!!
			productDao.getEntityManager().refresh(product);
/*			productDao.beginTransaction();
			Product productDB =  productDao.find(product.getId()).get();
			productDao.commitTransaction();
*/			java.util.Set<Orderitem> orderitemsdb=product.getOrderitems();
			java.util.Set<Theorder> theorders=product.getTheorders();

			Assert.assertEquals(1,orderitemsdb.size());
			Assert.assertEquals(1,orderitems.size());
//			Assert.assertTrue(orderitems.iterator().next().equals(orderitemsdb.iterator().next()));
//			Assert.assertNotNull(productDB);
//			Assert.assertEquals(product.getProductname(), productDB.getProductname());

		} catch (Throwable e) {
//			productDao.rollbackTransaction();
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
