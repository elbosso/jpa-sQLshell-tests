package de.elbosso.generated.sqlshell.entities.dao;

import de.elbosso.generated.sqlshell.entities.Customer;
import de.elbosso.generated.sqlshell.entities.Supplier;
import util.JpaDao;

import javax.persistence.NoResultException;
import javax.transaction.Transactional;
import java.util.Optional;

public class CustomerDao extends JpaDao<Customer>
{
	CustomerDao()
	{
		super(Customer.class);
	}

}
