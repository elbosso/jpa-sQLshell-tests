package de.elbosso.generated.sqlshell.dao;

import de.elbosso.generated.sqlshell.Author;
import de.elbosso.generated.sqlshell.Authorpublicationmapping;
import de.elbosso.generated.sqlshell.Stackoverflowposting;
import util.JpaDao;
import util.JpaDaoFactory;

public class DaoFactory extends JpaDaoFactory
{

	public DaoFactory(String persistenceUnitName)
	{
		super(persistenceUnitName);
	}

	public StackoverflowPostingDao createStackoverflowPostingDao()
	{
		if(map.containsKey(Stackoverflowposting.class)==false)
		{
			JpaDao<Stackoverflowposting> stackoverflowPostingDao=new StackoverflowPostingDao();
			stackoverflowPostingDao.setEntityManager(emf.createEntityManager());
			map.put(Stackoverflowposting.class,stackoverflowPostingDao);
		}
		return (StackoverflowPostingDao) map.get(Stackoverflowposting.class);
	}

	public AuthorpublicationmappingDao createAuthorpublicationmappingDao()
	{
		if(map.containsKey(Authorpublicationmapping.class)==false)
		{
			JpaDao<Authorpublicationmapping> authorpublicationmappingDao=new AuthorpublicationmappingDao();
			authorpublicationmappingDao.setEntityManager(emf.createEntityManager());
			map.put(Authorpublicationmapping.class,authorpublicationmappingDao);
		}
		return (AuthorpublicationmappingDao) map.get(Authorpublicationmapping.class);
	}
	public AuthorDao createAuthorDao()
	{
		if(map.containsKey(Author.class)==false)
		{
			JpaDao<Author> authorDao=new AuthorDao();
			authorDao.setEntityManager(emf.createEntityManager());
			map.put(Author.class,authorDao);
		}
		return (AuthorDao) map.get(Author.class);
	}

}
