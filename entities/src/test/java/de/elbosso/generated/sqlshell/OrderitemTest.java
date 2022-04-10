package de.elbosso.generated.sqlshell;

import de.elbosso.generated.sqlshell.Orderitem;
import de.elbosso.generated.sqlshell.dao.DaoFactory;
import de.elbosso.generated.sqlshell.dao.OrderitemDao;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class OrderitemTest
{
	static DaoFactory df;

	@BeforeClass
	public static void setUp() throws ClassNotFoundException
	{
		df=new DaoFactory("pg-jpa");
	}

	@Test
	public void testScarcity() {
		OrderitemDao orderitemDao= df.createOrderitemDao();
		orderitemDao.beginTransaction();
		List<Orderitem> scarce20=  orderitemDao.findByScarcity(20).orElse(Collections.EMPTY_LIST);
		List<Orderitem> scarce10=  orderitemDao.findByScarcity(10).orElse(Collections.EMPTY_LIST);
		List<Orderitem> scarce3=  orderitemDao.findByScarcity(3).orElse(Collections.EMPTY_LIST);
		orderitemDao.commitTransaction();
		Assert.assertTrue(scarce20.size()>-1);
		Assert.assertTrue(scarce10.size()>-1);
		Assert.assertTrue(scarce3.size()>-1);
		Assert.assertTrue(scarce3.size()<=scarce10.size());
		Assert.assertTrue(scarce3.size()<=scarce20.size());
		Assert.assertTrue(scarce10.size()<=scarce20.size());
//			Assert.assertEquals(product.getProductname(), productDB.getProductname());

	}
	@Test
	public void testMax()
	{
		try
		{
			OrderitemDao orderitemDao = df.createOrderitemDao();
			orderitemDao.beginTransaction();
			Integer max = orderitemDao.findMaxQuantity();
			orderitemDao.commitTransaction();
			Assert.assertEquals(10,max.intValue());
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testMaxQuantities()
	{
		OrderitemDao orderitemDao = df.createOrderitemDao();
		orderitemDao.beginTransaction();
		Integer max = orderitemDao.findMaxQuantity();
		orderitemDao.commitTransaction();
		Assert.assertEquals(10,max.intValue());
		List<Orderitem> mo=  orderitemDao.findMaxQuantities().orElse(Collections.EMPTY_LIST);
		Assert.assertFalse(mo.isEmpty());
		for(Orderitem orderitem:mo)
		{
			Assert.assertEquals(max,orderitem.getQuantity());
		}
	}
	@Test
	public void testPaging()
	{
		int start=0;
		int howMany=10;
		OrderitemDao orderitemDao = df.createOrderitemDao();
		orderitemDao.beginTransaction();
		boolean cont=true;
		while(cont)
		{
			java.util.List<Orderitem> ois=orderitemDao.returnPageQuantities(start,howMany).get();
/*			for(Orderitem oi:ois)
			{
				System.out.println(oi.getId()+" "+oi.getProduct().getProductname());
			}
			System.out.println("----");
*/			start+=ois.size();
			cont=ois.isEmpty()==false;
		}
		orderitemDao.commitTransaction();
	}
}
