package de.elbosso.generated.sqlshell.inheritance.dao;

import de.elbosso.generated.sqlshell.inheritance.*;
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

}
