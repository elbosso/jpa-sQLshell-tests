package de.elbosso.generated.sqlshell.inheritance;

import de.elbosso.generated.sqlshell.inheritance.dao.DaoFactory;
import de.elbosso.generated.sqlshell.inheritance.dao.StackoverflowPostingDao;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import util.JpaDao;

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
		try {
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

			JpaDao<Author> authorDao= df.<Author>createDao(Author.class);
			authorDao.beginTransaction();
			Author author=new Author();
			author.setName("Stanislaw Lem");
			author.getPublication_via_authorpublicationmappings().add(stackoverflowposting);
			author.getPublication_via_authorpublicationmappings().add(book);
			authorDao.persist(author);
			Author author1=new Author();
			author1.setName("Jules Verne");
			author1.getPublication_via_authorpublicationmappings().add(stackoverflowposting1);
			author1.getPublication_via_authorpublicationmappings().add(book);
			authorDao.persist(author1);
			authorDao.commitTransaction();

			Assert.assertEquals(0,stackoverflowposting.getAuthor_via_authorpublicationmappings().size());
			stackoverflowPostingDao.refresh(stackoverflowposting);
			Assert.assertEquals(1,stackoverflowposting.getAuthor_via_authorpublicationmappings().size());

			Assert.assertEquals(0,book.getAuthor_via_authorpublicationmappings().size());
			bookDao.refresh(book);
			Assert.assertEquals(2,book.getAuthor_via_authorpublicationmappings().size());

			java.util.Collection<Stackoverflowposting> stackoverflowpostings=stackoverflowPostingDao.findAllForAuthor(author).orElse(java.util.Collections.emptyList());


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
