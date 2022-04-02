package de.elbosso.generated.sqlshell.inheritance.dao;

import de.elbosso.generated.sqlshell.inheritance.Book;
import util.JpaDao;

public class BookDao extends JpaDao<Book>
{
	BookDao()
	{
		super(Book.class);
	}

}
