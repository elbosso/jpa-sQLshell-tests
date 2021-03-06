package de.elbosso.generated.sqlshell.entities.dao;

import de.elbosso.generated.sqlshell.entities.Theorder;
import util.JpaDao;

import javax.persistence.NoResultException;
import javax.transaction.Transactional;
import java.util.Optional;

public class TheorderDao extends JpaDao<Theorder>
{
	TheorderDao()
	{
		super(Theorder.class);
	}
	@Transactional
	public Optional<Theorder> findByOrdernumber(String ordernumber) {
		try {
			return Optional.of(entityManager.createQuery("SELECT t FROM Theorder t WHERE t.m_ordernumber = :ordernumber", Theorder.class)
					.setParameter("ordernumber", ordernumber)
					.getSingleResult());
		} catch (NoResultException e) {
			return Optional.empty();
		}
	}

}
