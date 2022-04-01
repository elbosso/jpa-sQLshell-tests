package de.elbosso.generated.sqlshell.inheritance;

import de.elbosso.generated.sqlshell.inheritance.dao.AuthorDao;
import de.elbosso.generated.sqlshell.inheritance.dao.BookDao;
import de.elbosso.generated.sqlshell.inheritance.dao.DaoFactory;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Collections;
import java.util.List;

public class BookTest
{
	static EntityManagerFactory emf;
	EntityManager em;

	@BeforeClass
	public static void setUp() throws ClassNotFoundException
	{
		emf = Persistence.createEntityManagerFactory("inheritance-jpa");
	}

	@Before
	public void initEntityManager() {
		em = emf.createEntityManager();
	}

	@Test
	public void test() {
		try {
			BookDao bookDao= DaoFactory.createBookDao();
			bookDao.beginTransaction();
			Book book=new Book();
			book.setIsbn("isbn");
			book.setName("name");
			bookDao.persist(book);
			bookDao.commitTransaction();

			AuthorDao authorDao= DaoFactory.createAuthorDao();
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
}
