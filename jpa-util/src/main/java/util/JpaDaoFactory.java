package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaDaoFactory <T extends JpaDaoFactory>
{
	protected java.util.Map<java.lang.Class,JpaDao> map=new java.util.HashMap();
	protected EntityManagerFactory emf;
	protected JpaDaoFactory(java.lang.String persistenceUnitName)
	{
		super();
		emf=Persistence.createEntityManagerFactory(persistenceUnitName);
	}

	public <T> JpaDao<T> createDao(java.lang.Class<T> cls)
	{
		if(map.containsKey(cls)==false)
		{
			JpaDao<T> jpaDao = new JpaDao<T>(cls);
			jpaDao.setEntityManager(emf.createEntityManager());
			map.put(cls,jpaDao);
		}
		return map.get(cls);
	}

}
