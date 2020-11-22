package de.elbosso.generated.sqlshell.entities;

import de.elbosso.generated.sqlshell.entities.dao.DaoFactory;
import de.elbosso.generated.sqlshell.entities.dao.TheorderDao;
import junit.framework.Assert;
import org.junit.Test;

public class TheorderTest
{
	@Test
	public void testFindByOrdernumber() {
		try {

			TheorderDao theorderDao= DaoFactory.createTheorderDao();
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

			TheorderDao theorderDao= DaoFactory.createTheorderDao();
			theorderDao.beginTransaction();
			Theorder theorderDB =  theorderDao.findByOrdernumber("LB9591223L").orElse(null);
			theorderDao.commitTransaction();
			Assert.assertNotNull(theorderDB);
//542944 order should have 4 products
			Assert.assertEquals(3, theorderDB.getProducts().size());
		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

}
