package de.elbosso.generated.sqlshell.dao;

import de.elbosso.generated.sqlshell.Author;
import de.elbosso.generated.sqlshell.Authorpublicationmapping;
import de.elbosso.generated.sqlshell.Publication;
import util.JpaDao;

public class AuthorpublicationmappingDao extends JpaDao<Authorpublicationmapping>
{
	AuthorpublicationmappingDao()
	{
		super(Authorpublicationmapping.class);
	}

	public Authorpublicationmapping associate(Publication publication, Author author)
	{
		Authorpublicationmapping authorpublicationmapping=new Authorpublicationmapping();
		authorpublicationmapping.setAuthor(author);
		authorpublicationmapping.setPublication(publication);
		publication.getAuthorpublicationmappings().add(authorpublicationmapping);
		return authorpublicationmapping;
	}
	public Authorpublicationmapping associateAndPersist(Publication publication, Author author)
	{
		Authorpublicationmapping authorpublicationmapping=new Authorpublicationmapping();
		authorpublicationmapping.setAuthor(author);
		authorpublicationmapping.setPublication(publication);
		publication.getAuthorpublicationmappings().add(authorpublicationmapping);
		beginTransaction();
		persist(authorpublicationmapping);
		commitTransaction();
		return authorpublicationmapping;
	}

}
