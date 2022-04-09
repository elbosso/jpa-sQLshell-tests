package de.elbosso.generated.sqlshell.dao;

import de.elbosso.generated.sqlshell.Product;
import javax.transaction.Transactional;
import util.JpaDao;

import javax.persistence.NoResultException;
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
			return Optional.of(entityManager.createQuery("SELECT p FROM Product p WHERE p.m_product_productname = :productname", Product.class)
					.setParameter("productname", productname)
					.getSingleResult());
		} catch (NoResultException e) {
			return Optional.empty();
		}
	}

}
