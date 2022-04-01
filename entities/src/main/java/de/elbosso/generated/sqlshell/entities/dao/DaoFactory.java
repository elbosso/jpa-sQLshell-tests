package de.elbosso.generated.sqlshell.entities.dao;

import de.elbosso.generated.sqlshell.entities.*;
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
	public static ProductDao createNewProductDao()
	{
			ProductDao productDao=new ProductDao();
			productDao.setEntityManager(emf.createEntityManager());
			return productDao;
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
	public static CustomerDao createCustomerDao()
	{
		if(map.containsKey(Customer.class)==false)
		{
			ensureEntityManagerFactory();
			JpaDao<Customer> customerDao=new CustomerDao();
			customerDao.setEntityManager(emf.createEntityManager());
			map.put(Customer.class,customerDao);
		}
		Object ref=map.get(Customer.class);
		boolean b=JpaDao.class.isAssignableFrom(CustomerDao.class);
		CustomerDao rv=(CustomerDao) ref;
		return rv;
	}
}
