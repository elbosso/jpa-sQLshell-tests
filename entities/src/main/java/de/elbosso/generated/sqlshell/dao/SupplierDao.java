package de.elbosso.generated.sqlshell.dao;

import de.elbosso.generated.sqlshell.Supplier;
import javax.transaction.Transactional;
import util.JpaDao;

import javax.persistence.NoResultException;
import java.util.Optional;

public class SupplierDao extends JpaDao<Supplier>
{
	SupplierDao()
	{
		super(Supplier.class);
	}
	/**
	 * <pre>
	 * SELECT
	 *   Count(customer3.lastname) as customers
	 * FROM public.orderitem orderitem1
	 *  LEFT JOIN public.theorder theorder2 ON orderitem1.orderid=theorder2.id
	 *  LEFT JOIN public.customer customer3 ON theorder2.customerid=customer3.id
	 *  LEFT JOIN public.product product4 ON orderitem1.productid=product4.id
	 *  LEFT JOIN public.supplier supplier5 ON product4.supplierid=supplier5.id
	 * GROUP BY supplier5.companyname
	 * HAVING (supplier5.companyname ='Richter eG')
	 * ORDER BY supplier5.companyname DESC;
	 * </pre>
	 * */
	@Transactional
	public Optional<Long> findNumberOfCustomers(String companyname) {
		try {
			String stmt="select count(customer3.m_customer_lastname) as customers "+
			"FROM Orderitem orderitem1 "+
			"LEFT JOIN Theorder theorder2 ON orderitem1.m_orderitem_theorder.m_theorder_id=theorder2.m_theorder_id "+
			"LEFT JOIN Product product4 ON orderitem1.m_orderitem_product.m_product_id=product4.m_product_id "+
			"LEFT JOIN Supplier supplier5 ON product4.m_product_supplier.m_supplier_id=supplier5.m_supplier_id "+
			"LEFT JOIN Customer customer3 ON theorder2.m_theorder_customer.m_customer_id=customer3.m_customer_id "+
			"GROUP BY supplier5.m_supplier_companyname "+
			"HAVING supplier5.m_supplier_companyname =:companyname";
			return Optional.of(entityManager.createQuery(stmt, Long.class)
					.setParameter("companyname", companyname)
					.getSingleResult());
		} catch (NoResultException e) {
			return Optional.empty();
		}
	}

}
