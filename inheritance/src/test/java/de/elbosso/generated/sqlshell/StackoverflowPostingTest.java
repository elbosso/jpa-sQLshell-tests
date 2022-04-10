package de.elbosso.generated.sqlshell;

import de.elbosso.generated.sqlshell.Author;
import de.elbosso.generated.sqlshell.Book;
import de.elbosso.generated.sqlshell.Stackoverflowposting;
import de.elbosso.generated.sqlshell.dao.AuthorDao;
import de.elbosso.generated.sqlshell.dao.AuthorpublicationmappingDao;
import de.elbosso.generated.sqlshell.dao.DaoFactory;
import de.elbosso.generated.sqlshell.dao.StackoverflowPostingDao;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import util.JpaDao;

import java.util.List;

public class StackoverflowPostingTest
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

		StackoverflowPostingDao stackoverflowPostingDao=df.createStackoverflowPostingDao();
		stackoverflowPostingDao.beginTransaction();
		Stackoverflowposting stackoverflowposting=new Stackoverflowposting();
		stackoverflowposting.setPermalink("Permalink");
		stackoverflowposting.setUrl("Url");
		stackoverflowposting.setName("name");
		stackoverflowPostingDao.persist(stackoverflowposting);
		Stackoverflowposting stackoverflowposting1=new Stackoverflowposting();
		stackoverflowposting1.setPermalink("Permalink1");
		stackoverflowposting1.setUrl("Url1");
		stackoverflowposting1.setName("name1");
		stackoverflowPostingDao.persist(stackoverflowposting1);
		stackoverflowPostingDao.commitTransaction();

		AuthorDao authorDao= df.createAuthorDao();
		authorDao.beginTransaction();
		Author author=new Author();
		author.setName("Stanislaw Lem");
		authorDao.persist(author);

		Author author1=new Author();
		author1.setName("Jules Verne");
		authorDao.persist(author1);
		authorDao.commitTransaction();

		AuthorpublicationmappingDao authorpublicationmappingDao=df.createAuthorpublicationmappingDao();
		Authorpublicationmapping authorpublicationmapping=authorpublicationmappingDao.associateAndPersist(book,author);
		authorpublicationmapping=authorpublicationmappingDao.associateAndPersist(stackoverflowposting,author);
		authorpublicationmapping=authorpublicationmappingDao.associateAndPersist(book,author1);
		authorpublicationmapping=authorpublicationmappingDao.associateAndPersist(stackoverflowposting1,author1);

		List<Book> books=authorDao.findAllBooksForAuthor(author).orElseThrow();
//		Assert.assertEquals(1,stackoverflowposting.getAuthor_via_authorpublicationmappings().size());

		List<Posting> postings=authorDao.findAllPostingsForAuthor(author).orElseThrow();
		Assert.assertEquals(1,postings.size());

		List<Publication> publications=authorDao.findAllPublicationsForAuthor(author).orElseThrow();
		Assert.assertEquals(2,publications.size());

//		java.util.Collection<Stackoverflowposting> stackoverflowpostings=stackoverflowPostingDao.findAllForAuthor(author).orElse(java.util.Collections.emptyList());


	}
	@AfterClass
	public static void tearDown()
	{
	}
}
