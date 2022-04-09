package de.elbosso.generated.sqlshell;

import de.elbosso.generated.sqlshell.Orderitem;
import de.elbosso.generated.sqlshell.Product;
import de.elbosso.generated.sqlshell.Theorder;
import de.elbosso.generated.sqlshell.dao.DaoFactory;
import de.elbosso.generated.sqlshell.dao.TheorderDao;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TheorderTest
{
	static DaoFactory df;

	@BeforeClass
	public static void setUp() throws ClassNotFoundException
	{
		df=new DaoFactory("pg-jpa");
	}
	@Test
	public void testFindByOrdernumber() {
		try {

			TheorderDao theorderDao= df.createTheorderDao();
			theorderDao.beginTransaction();
			Theorder theorderDB =  theorderDao.findByOrdernumber("IL91237442").orElse(null);
			theorderDao.commitTransaction();
			Assert.assertNotNull(theorderDB);

		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	@Test
	public void testOrders() {
		try {

			TheorderDao theorderDao= df.createTheorderDao();
			theorderDao.beginTransaction();
			Theorder theorderDB =  theorderDao.findByOrdernumber("LB9591223L").orElse(null);
			theorderDao.commitTransaction();
			Assert.assertNotNull(theorderDB);
//542944 order should have 4 products
			Assert.assertEquals(3, theorderDB.getProduct_via_orderitems().size());
			Product p=theorderDB.getProduct_via_orderitems().iterator().next();
			Assert.assertNotNull(p.getTheorder_via_orderitems());
			Assert.assertNotNull(p.getOrderitems());
			Assert.assertFalse(p.getTheorder_via_orderitems().isEmpty());
			Assert.assertFalse(p.getOrderitems().isEmpty());
			Orderitem o=p.getOrderitems().iterator().next();
			Assert.assertEquals(p,o.getProduct());
//			Assert.assertEquals(theorderDB,o.getTheorder());

		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

}
