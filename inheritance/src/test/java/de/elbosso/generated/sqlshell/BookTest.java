package de.elbosso.generated.sqlshell;

import de.elbosso.generated.sqlshell.Author;
import de.elbosso.generated.sqlshell.Book;
import de.elbosso.generated.sqlshell.dao.DaoFactory;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import util.JpaDao;

public class BookTest
{
	static DaoFactory df;

	@BeforeClass
	public static void setUp() throws ClassNotFoundException
	{
		df=new DaoFactory("pg-jpa");
	}

	@Test
	public void testM2NRelationship() {
		JpaDao<Book> bookDao= df.<Book>createDao(Book.class);
		bookDao.beginTransaction();
		Book book=new Book();
		book.setIsbn("isbn");
		book.setName("name");
		bookDao.persist(book);
		bookDao.commitTransaction();

		JpaDao<Author> authorDao= df.<Author>createDao(Author.class);
		authorDao.beginTransaction();
		Author author=new Author();
		author.setName("Stanislaw Lem");

//		author.getAuthorpublicationmappings()..add(book);
		authorDao.persist(author);
		authorDao.commitTransaction();

/*			bookDao.beginTransaction();
		book.getAuthor_via_authorpublicationmappings().add(author);
		bookDao.persist(book);
		bookDao.commitTransaction();
*/

//		Assert.assertEquals(0,book.getAuthor_via_authorpublicationmappings().size());
		bookDao.refresh(book);
//		Assert.assertEquals(1,book.getAuthor_via_authorpublicationmappings().size());
		authorDao.beginTransaction();
		java.util.List<Author> authors=authorDao.findAll();
		for(Author auth:authors)
			authorDao.remove(auth);
		authorDao.commitTransaction();
	}
	@AfterClass
	public static void tearDown()
	{
	}
}
