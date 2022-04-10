package de.elbosso.generated.sqlshell;

import de.elbosso.generated.sqlshell.Author;
import de.elbosso.generated.sqlshell.Book;
import de.elbosso.generated.sqlshell.dao.AuthorDao;
import de.elbosso.generated.sqlshell.dao.AuthorpublicationmappingDao;
import de.elbosso.generated.sqlshell.dao.DaoFactory;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import util.JpaDao;

import java.util.List;

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

		AuthorDao authorDao= df.createAuthorDao();
		authorDao.beginTransaction();
		Author author=new Author();
		author.setName("Stanislaw Lem");
		authorDao.persist(author);
		authorDao.commitTransaction();

		AuthorpublicationmappingDao authorpublicationmappingDao=df.createAuthorpublicationmappingDao();
		Authorpublicationmapping authorpublicationmapping=authorpublicationmappingDao.associate(book,author);
		authorpublicationmappingDao.beginTransaction();
		authorpublicationmappingDao.persist(authorpublicationmapping);
		authorpublicationmappingDao.commitTransaction();


		authorDao.beginTransaction();
		List<Book> books=authorDao.findAllBooksForAuthor(author).orElseThrow();
		Assert.assertEquals(1,books.size());


		authorDao.commitTransaction();
	}
	@AfterClass
	public static void tearDown()
	{
	}
}
