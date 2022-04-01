package de.elbosso.generated.sqlshell.inheritance.dao;

import de.elbosso.generated.sqlshell.inheritance.Book;
import util.JpaDao;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.Optional;

public class BookDao extends JpaDao<Book>
{
	BookDao()
	{
		super(Book.class);
	}

}
