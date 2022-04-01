package de.elbosso.generated.sqlshell.inheritance.dao;

import de.elbosso.generated.sqlshell.inheritance.Publication;
import util.JpaDao;

import javax.persistence.NoResultException;
import javax.transaction.Transactional;
import java.util.Optional;

public class PublicationDao extends JpaDao<Publication>
{
	PublicationDao()
	{
		super(Publication.class);
	}

}
