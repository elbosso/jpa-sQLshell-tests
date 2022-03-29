package de.elbosso.generated.sqlshell.entities.dao;

import de.elbosso.generated.sqlshell.entities.Orderitem;
import de.elbosso.generated.sqlshell.entities.Product;
import de.elbosso.generated.sqlshell.entities.Supplier;
import de.elbosso.generated.sqlshell.entities.Theorder;
import util.JpaDao;
import util.JpaDaoFactory;

import javax.persistence.Persistence;

public class DaoFactory extends JpaDaoFactory
{
	protected static void ensureEntityManagerFactory()
	{
		emf = Persistence.createEntityManagerFactory("pg-jpa");
	}
	public static ProductDao createProductDao()
	{
		if(map.containsKey(Product.class)==false)
		{
			ensureEntityManagerFactory();
			JpaDao<Product> productDao=new ProductDao();
			productDao.setEntityManager(emf.createEntityManager());
			map.put(Product.class,productDao);
		}
		return (ProductDao) map.get(Product.class);
	}
	public static OrderitemDao createOrderitemDao()
	{
		if(map.containsKey(Orderitem.class)==false)
		{
			ensureEntityManagerFactory();
			JpaDao<Orderitem> orderitemDao=new OrderitemDao();
			orderitemDao.setEntityManager(emf.createEntityManager());
			map.put(Orderitem.class,orderitemDao);
		}
		return (OrderitemDao) map.get(Orderitem.class);
	}
	public static TheorderDao createTheorderDao()
	{
		if(map.containsKey(Theorder.class)==false)
		{
			ensureEntityManagerFactory();
			JpaDao<Theorder> theorderDao=new TheorderDao();
			theorderDao.setEntityManager(emf.createEntityManager());
			map.put(Theorder.class,theorderDao);
		}
		return (TheorderDao) map.get(Theorder.class);
	}
	public static SupplierDao createSupplierDao()
	{
		if(map.containsKey(Supplier.class)==false)
		{
			ensureEntityManagerFactory();
			JpaDao<Supplier> supplierDao=new SupplierDao();
			supplierDao.setEntityManager(emf.createEntityManager());
			map.put(Supplier.class,supplierDao);
		}
		Object ref=map.get(Supplier.class);
		boolean b=JpaDao.class.isAssignableFrom(SupplierDao.class);
		SupplierDao rv=(SupplierDao) ref;
		return rv;
	}
}
