package de.elbosso.generated.sqlshell.dao;

import de.elbosso.generated.sqlshell.Orderitem;
import de.elbosso.generated.sqlshell.Product;
import de.elbosso.generated.sqlshell.Supplier;
import de.elbosso.generated.sqlshell.Theorder;
import util.JpaDao;
import util.JpaDaoFactory;

public class DaoFactory extends JpaDaoFactory
{
	public DaoFactory(String persistenceUnitName)
	{
		super(persistenceUnitName);
	}

	public  ProductDao createProductDao()
	{
		if(map.containsKey(Product.class)==false)
		{
			JpaDao<Product> productDao=new ProductDao();
			productDao.setEntityManager(emf.createEntityManager());
			map.put(Product.class,productDao);
		}
		return (ProductDao) map.get(Product.class);
	}
	public OrderitemDao createOrderitemDao()
	{
		if(map.containsKey(Orderitem.class)==false)
		{
			JpaDao<Orderitem> orderitemDao=new OrderitemDao();
			orderitemDao.setEntityManager(emf.createEntityManager());
			map.put(Orderitem.class,orderitemDao);
		}
		return (OrderitemDao) map.get(Orderitem.class);
	}
	public TheorderDao createTheorderDao()
	{
		if(map.containsKey(Theorder.class)==false)
		{
			JpaDao<Theorder> theorderDao=new TheorderDao();
			theorderDao.setEntityManager(emf.createEntityManager());
			map.put(Theorder.class,theorderDao);
		}
		return (TheorderDao) map.get(Theorder.class);
	}
	public SupplierDao createSupplierDao()
	{
		if(map.containsKey(Supplier.class)==false)
		{
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
