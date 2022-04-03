package de.elbosso.generated.sqlshell.dao;

import de.elbosso.generated.sqlshell.Orderitem;
import de.elbosso.generated.sqlshell.Product;
import util.JpaDao;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.Optional;

public class OrderitemDao extends JpaDao<Orderitem>
{
	OrderitemDao()
	{
		super(Orderitem.class);
	}
	@Transactional
	public Optional<java.util.List<Orderitem>> findByScarcity(int minimumStock) {
		try {
			return Optional.of(entityManager.createQuery("SELECT o FROM Orderitem o WHERE o.m_quantity < :minimumStock", Orderitem.class)
					.setParameter("minimumStock", minimumStock)
					.getResultList());
		} catch (NoResultException e) {
			return Optional.empty();
		}
	}
	@Transactional
	public Integer findMaxQuantity() {
			return entityManager.createQuery("SELECT max(o.m_quantity) FROM Orderitem o", Integer.class)
					.getSingleResult();
	}
	@Transactional
	public Optional<java.util.List<Orderitem>> findMaxQuantities() {
		try {
			return Optional.of(entityManager.createQuery("SELECT o FROM Orderitem o WHERE o.m_quantity = (SELECT max(o.m_quantity) FROM Orderitem o)", Orderitem.class)
					.getResultList());
		} catch (NoResultException e) {
			return Optional.empty();
		}
	}
	@Transactional
	public Optional<java.util.List<Orderitem>> returnPageQuantities(int first,int howMany) {
		try {
			Query q=entityManager.createQuery("SELECT o FROM Orderitem o ORDER BY o.m_id", Orderitem.class);
			q.setFirstResult(first);
			q.setMaxResults(howMany);
			return Optional.of(q.getResultList());
		} catch (NoResultException e) {
			return Optional.empty();
		}
	}
	@Transactional
	/**
	 * This is terrible and should be done under no circumstances. It is only meant as a reminder
	 * what the query would look like. In production just search the product and then access the orderitems via
	 * the provided getter!
	 */
	public Optional<java.util.List<Orderitem>> findAllForProduct(Product product) {
		try {
			return Optional.of(entityManager.createQuery("SELECT o FROM Orderitem o JOIN o.m_product p WHERE p.id = :productid", Orderitem.class)
					.setParameter("productid", product.getId())
					.getResultList());
		} catch (NoResultException e) {
			return Optional.empty();
		}
	}

}
