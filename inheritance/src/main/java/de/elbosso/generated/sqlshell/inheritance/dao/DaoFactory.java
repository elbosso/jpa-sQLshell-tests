package de.elbosso.generated.sqlshell.inheritance.dao;

import de.elbosso.generated.sqlshell.inheritance.*;
import util.JpaDao;
import util.JpaDaoFactory;

import javax.persistence.Persistence;

public class DaoFactory extends JpaDaoFactory
{
	protected static void ensureEntityManagerFactory()
	{
		emf = Persistence.createEntityManagerFactory("inheritance-jpa");
	}

	public static AuthorDao createAuthorDao()
	{
		if(map.containsKey(Author.class)==false)
		{
			ensureEntityManagerFactory();
			JpaDao<Author> authorDao=new AuthorDao();
			authorDao.setEntityManager(emf.createEntityManager());
			map.put(Author.class,authorDao);
		}
		return (AuthorDao) map.get(Author.class);
	}
	public static PublicationDao createPublicationDao()
	{
		if(map.containsKey(Publication.class)==false)
		{
			ensureEntityManagerFactory();
			JpaDao<Publication> publicationDao=new PublicationDao();
			publicationDao.setEntityManager(emf.createEntityManager());
			map.put(Publication.class,publicationDao);
		}
		return (PublicationDao) map.get(Publication.class);
	}
	public static BookDao createBookDao()
	{
		if(map.containsKey(Book.class)==false)
		{
			ensureEntityManagerFactory();
			JpaDao<Book> bookDao=new BookDao();
			bookDao.setEntityManager(emf.createEntityManager());
			map.put(Book.class,bookDao);
		}
		return (BookDao) map.get(Book.class);
	}
	public static PostingDao createPostingDao()
	{
		if(map.containsKey(Posting.class)==false)
		{
			ensureEntityManagerFactory();
			JpaDao<Posting> postingDao=new PostingDao();
			postingDao.setEntityManager(emf.createEntityManager());
			map.put(Posting.class,postingDao);
		}
		Object ref=map.get(Posting.class);
		boolean b=JpaDao.class.isAssignableFrom(PostingDao.class);
		PostingDao rv=(PostingDao) ref;
		return rv;
	}
	public static StackoverflowPostingDao createStackoverflowPostingDao()
	{
		if(map.containsKey(Stackoverflowposting.class)==false)
		{
			ensureEntityManagerFactory();
			JpaDao<Stackoverflowposting> stackoverflowPostingDao=new StackoverflowPostingDao();
			stackoverflowPostingDao.setEntityManager(emf.createEntityManager());
			map.put(Stackoverflowposting.class,stackoverflowPostingDao);
		}
		Object ref=map.get(Posting.class);
		boolean b=JpaDao.class.isAssignableFrom(StackoverflowPostingDao.class);
		StackoverflowPostingDao rv=(StackoverflowPostingDao) ref;
		return rv;
	}
}
