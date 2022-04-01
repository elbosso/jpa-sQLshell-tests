package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaDaoFactory
{
	protected static EntityManagerFactory emf;
	protected static java.util.Map<java.lang.Class,JpaDao> map=new java.util.HashMap();

	public static <T> JpaDao<T> createDao(java.lang.Class<T> cls)
	{
		if(map.containsKey(cls)==false)
		{
			ensureEntityManagerFactory();
			JpaDao<T> jpaDao = new JpaDao<T>(cls);
			jpaDao.setEntityManager(emf.createEntityManager());
			map.put(cls,jpaDao);
		}
		return map.get(cls);
	}

	protected static void ensureEntityManagerFactory()
	{
		emf = Persistence.createEntityManagerFactory("pg-jpa");
	}
}
