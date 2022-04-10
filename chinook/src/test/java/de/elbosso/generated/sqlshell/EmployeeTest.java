package de.elbosso.generated.sqlshell;

import de.elbosso.generated.sqlshell.dao.DaoFactory;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import util.JpaDao;

public class EmployeeTest
{
	static DaoFactory df;

	@BeforeClass
	public static void setUp() throws ClassNotFoundException
	{
		df=new DaoFactory("sqlite-jpa");
	}

	@Test
	public void test() {
		try {
			JpaDao<Employees> employeesDao= df.<Employees>createDao(Employees.class);
			employeesDao.beginTransaction();
			java.util.Optional<Employees> oemp=employeesDao.find(java.lang.Integer.valueOf(7));
			employeesDao.commitTransaction();
			Assert.assertTrue(oemp.isPresent());


//			Assert.assertEquals(0,book.getAuthor_via_authorpublicationmappings().size());
		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	@AfterClass
	public static void tearDown()
	{
	}
}
