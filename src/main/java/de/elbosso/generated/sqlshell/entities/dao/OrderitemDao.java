package de.elbosso.generated.sqlshell.entities.dao;

import de.elbosso.generated.sqlshell.entities.Orderitem;
import util.JpaDao;

import javax.persistence.NoResultException;
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

}
