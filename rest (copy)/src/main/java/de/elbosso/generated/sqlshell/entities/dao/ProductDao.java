package de.elbosso.generated.sqlshell.entities.dao;

import de.elbosso.generated.sqlshell.entities.Product;
import util.JpaDao;

import javax.persistence.NoResultException;
import javax.transaction.Transactional;
import java.util.Optional;

public class ProductDao extends JpaDao<Product>
{
	ProductDao()
	{
		super(Product.class);
	}
	@Transactional
	public Optional<Product> findByProductname(String productname) {
		try {
			return Optional.of(entityManager.createQuery("SELECT p FROM Product p WHERE p.m_productname = :productname", Product.class)
					.setParameter("productname", productname)
					.getSingleResult());
		} catch (NoResultException e) {
			return Optional.empty();
		}
	}

}
