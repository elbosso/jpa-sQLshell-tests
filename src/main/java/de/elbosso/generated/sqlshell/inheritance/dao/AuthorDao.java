package de.elbosso.generated.sqlshell.inheritance.dao;

import de.elbosso.generated.sqlshell.entities.Product;
import de.elbosso.generated.sqlshell.inheritance.Author;
import util.JpaDao;

import javax.persistence.NoResultException;
import javax.transaction.Transactional;
import java.util.Optional;

public class AuthorDao extends JpaDao<Author>
{
	AuthorDao()
	{
		super(Author.class);
	}

}
