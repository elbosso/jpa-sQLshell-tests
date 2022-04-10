package de.elbosso.generated.sqlshell.dao;

import de.elbosso.generated.sqlshell.*;
import util.JpaDao;

import javax.persistence.NoResultException;
import java.util.List;
import java.util.Optional;


public class AuthorDao extends JpaDao<Author>
{
	AuthorDao()
	{
		super(Author.class);
	}

	public Optional<List<Book>> findAllBooksForAuthor(Author author) {
		try {
//			return Optional.of(entityManager.createQuery("SELECT s FROM Stackoverflowposting s JOIN s.m_posting p JOIN p.m_publication u JOIN u.m_author_via_authorpublicationmappings a WHERE a.id = :authorid", Stackoverflowposting.class)


			return Optional.of(entityManager.createQuery("SELECT b FROM Book b JOIN b.m_book_publication p JOIN p.m_publication_authorpublicationmappings m JOIN m.m_authorpublicationmapping_author a WHERE a.id = :authorid", Book.class)
					.setParameter("authorid", author.getId())
					.getResultList());
		} catch (NoResultException e) {
			return Optional.empty();
		}
	}
	public Optional<List<Posting>> findAllPostingsForAuthor(Author author) {
		try {
//			return Optional.of(entityManager.createQuery("SELECT s FROM Stackoverflowposting s JOIN s.m_posting p JOIN p.m_publication u JOIN u.m_author_via_authorpublicationmappings a WHERE a.id = :authorid", Stackoverflowposting.class)


			return Optional.of(entityManager.createQuery("SELECT b FROM Posting b JOIN b.m_posting_publication p JOIN p.m_publication_authorpublicationmappings m JOIN m.m_authorpublicationmapping_author a WHERE a.id = :authorid", Posting.class)
					.setParameter("authorid", author.getId())
					.getResultList());
		} catch (NoResultException e) {
			return Optional.empty();
		}
	}
	public Optional<List<Publication>> findAllPublicationsForAuthor(Author author) {
		try {
//			return Optional.of(entityManager.createQuery("SELECT s FROM Stackoverflowposting s JOIN s.m_posting p JOIN p.m_publication u JOIN u.m_author_via_authorpublicationmappings a WHERE a.id = :authorid", Stackoverflowposting.class)


			return Optional.of(entityManager.createQuery("SELECT p FROM Publication p JOIN p.m_publication_authorpublicationmappings m JOIN m.m_authorpublicationmapping_author a WHERE a.id = :authorid", Publication.class)
					.setParameter("authorid", author.getId())
					.getResultList());
		} catch (NoResultException e) {
			return Optional.empty();
		}
	}

}
