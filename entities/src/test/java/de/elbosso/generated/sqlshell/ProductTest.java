package de.elbosso.generated.sqlshell;

import de.elbosso.generated.sqlshell.dao.*;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import util.JpaDao;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class ProductTest
{
	static DaoFactory df;

	@BeforeClass
	public static void setUp() throws ClassNotFoundException
	{
		df=new DaoFactory("pg-jpa");
	}

	@Test
	public void testPersist() {
		SupplierDao supplierDao=df.createSupplierDao();
		JpaDao<Customer> customerDao=df.<Customer>createDao(Customer.class);
		ProductDao productDao= df.createProductDao();
		TheorderDao theorderDao=df.createTheorderDao();
		OrderitemDao orderitemDao=df.createOrderitemDao();
			// Persist in database
			productDao.beginTransaction();
			Supplier supplier=supplierDao.find(Integer.valueOf(-2147483635)).get();
			Product product = new Product();
			product.setProductname("product2");
			product.setSupplier(supplier);
			product.setIsdiscontinued(Boolean.FALSE);
			productDao.persist(product);
			productDao.commitTransaction();

			theorderDao.beginTransaction();
			Customer customer=customerDao.find(Integer.valueOf(-2147483647)).get();
			Theorder theorder=new Theorder();
			theorder.setOrderdate(new Timestamp(new java.util.Date().getTime()));
			theorder.setTotalamount(BigDecimal.valueOf(3.14));
			theorder.setCustomer(customer);
//			theorder.getProduct_via_orderitems().add(product);
		//you have to do that in order to get the references right
		// on subsequent queries - another way would be to
		//empty the cache of the entity manager or
		//use a new entitymanager
		productDao.getEntityManager().refresh(product);
			theorderDao.persist(theorder);
			theorderDao.commitTransaction();

			orderitemDao.beginTransaction();
			java.util.List<Orderitem> orderitems=orderitemDao.findAllForProduct(product).orElse(java.util.Collections.emptyList());
			orderitemDao.commitTransaction();

			//this is needed to access the theorders and the orderitems!!
//			productDao= DaoFactory.createNewProductDao();
			//this is an alternative to actually get the references to the theorders and the orderitems!!
//			productDao.getEntityManager().refresh(product);
/*			productDao.beginTransaction();
*/			Product productDB =  productDao.find(product.getId()).get();
/*			productDao.commitTransaction();
*/			java.util.Set<Orderitem> orderitemsdb=product.getOrderitems();
//			java.util.Set<Theorder> theorders=product.getTheorder_via_orderitems();

//			Assert.assertEquals(1,orderitemsdb.size());
//			Assert.assertEquals(1,orderitems.size());
//			Assert.assertTrue(orderitems.iterator().next().equals(orderitemsdb.iterator().next()));
			Assert.assertNotNull(productDB);
			Assert.assertEquals(product.getProductname(), productDB.getProductname());

	}
	@Test
	public void testFindByProductname() {
		ProductDao productDao= df.createProductDao();
		productDao.beginTransaction();
		Product productDB =  productDao.findByProductname("klassische Seife").get();
		productDao.commitTransaction();
		Assert.assertEquals(java.lang.Integer.valueOf(-2147483636), productDB.getId());

	}
	@Test
	public void testOrders() {
		ProductDao productDao= df.createProductDao();
		productDao.beginTransaction();
		Product productDB =  productDao.findByProductname("elegante Teller").get();
		productDao.commitTransaction();
//		Assert.assertEquals(4, productDB.getTheorder_via_orderitems().size());
	}

	@AfterClass
	public static void tearDown()
	{
	}
}
