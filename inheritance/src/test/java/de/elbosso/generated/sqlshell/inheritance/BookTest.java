package de.elbosso.generated.sqlshell.inheritance;

import de.elbosso.generated.sqlshell.inheritance.dao.AuthorDao;
import de.elbosso.generated.sqlshell.inheritance.dao.DaoFactory;
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
	public void test() {
		try {
			JpaDao<Book> bookDao= df.<Book>createDao(Book.class);
			bookDao.beginTransaction();
			Book book=new Book();
			book.setIsbn("isbn");
			book.setName("name");
			bookDao.persist(book);
			bookDao.commitTransaction();

			AuthorDao authorDao= df.createAuthorDao();
			authorDao.beginTransaction();
			Author author=new Author();
			author.setName("Stanislaw Lem");
//			author.getPublication_via_authorpublicationmappings().add(book);
			authorDao.persist(author);
			authorDao.commitTransaction();

/*			bookDao.beginTransaction();
			book.getAuthor_via_authorpublicationmappings().add(author);
			bookDao.persist(book);
			bookDao.commitTransaction();
*/

			authorDao.beginTransaction();
			java.util.List<Author> authors=authorDao.findAll();
			for(Author auth:authors)
				authorDao.remove(auth);
			authorDao.commitTransaction();
		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	@AfterClass
	public static void tearDown()
	{
	}
}
