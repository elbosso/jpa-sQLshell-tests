package de.elbosso.generated.sqlshell.inheritance.dao;

import de.elbosso.generated.sqlshell.inheritance.Posting;
import util.JpaDao;

import javax.persistence.NoResultException;
import javax.transaction.Transactional;
import java.util.Optional;

public class PostingDao extends JpaDao<Posting>
{
	PostingDao()
	{
		super(Posting.class);
	}

}
