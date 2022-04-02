package de.elbosso.generated.sqlshell.inheritance.dao;

import de.elbosso.generated.sqlshell.inheritance.Author;
import de.elbosso.generated.sqlshell.inheritance.Stackoverflowposting;
import util.JpaDao;

import javax.persistence.NoResultException;
import java.util.List;
import java.util.Optional;

public class StackoverflowPostingDao extends JpaDao<Stackoverflowposting>
{
	StackoverflowPostingDao()
	{
		super(Stackoverflowposting.class);
	}

	public Optional<List<Stackoverflowposting>> findAllForAuthor(Author author) {
		try {
//			return Optional.of(entityManager.createQuery("SELECT s FROM Stackoverflowposting s JOIN s.m_posting p JOIN p.m_publication u JOIN u.m_author_via_authorpublicationmappings a WHERE a.id = :authorid", Stackoverflowposting.class)


			return Optional.of(entityManager.createQuery("SELECT s FROM Stackoverflowposting s JOIN s.m_author_via_authorpublicationmappings a WHERE a.id = :authorid", Stackoverflowposting.class)
					.setParameter("authorid", author.getId())
					.getResultList());
		} catch (NoResultException e) {
			return Optional.empty();
		}
	}

}
