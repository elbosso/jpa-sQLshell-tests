package de.elbosso.generated.sqlshell;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "publication"
/*	,indexes = {
		@Index(name= "publication_pkey", columnList="id")
	}*/
)
@Inheritance(strategy = InheritanceType.JOINED)
public class Publication
{
	//in case there is no @Id annotation - just uncomment the following three lines!
	//@Id
	//@Column(name="ROWID")
	//private String rowid_id;

	@ManyToMany(mappedBy = "m_publication_via_authorpublicationmappings")
	private Set<Author> m_author_via_authorpublicationmappings = new HashSet();

	@OneToMany(mappedBy = "m_authorpublicationmapping_publication", cascade = CascadeType.DETACH)
	private Set<Authorpublicationmapping> m_publication_authorpublicationmappings = new HashSet();

	@OneToMany(mappedBy = "m_book_publication", cascade = CascadeType.DETACH)
	private Set<Book> m_publication_books = new HashSet();

	@OneToMany(mappedBy = "m_posting_publication", cascade = CascadeType.DETACH)
	private Set<Posting> m_publication_postings = new HashSet();

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@Column(name = "id"
		, nullable = false
		, updatable = false
		, length=10
		, precision=10
		, scale=0
	)
	private java.lang.Integer m_publication_id;

	@Column(name = "date"
		, length=29
		, precision=29
		, scale=6
	)
	private java.sql.Timestamp m_publication_date;

	@Column(name = "name"
		, length=255
		, precision=255
		, scale=0
	)
	private java.lang.String m_publication_name;

	public java.lang.Integer getId()
	{
		return m_publication_id;
	}
	public void setId(java.lang.Integer v_id)
	{
		m_publication_id=v_id;
	}
	public Set<Authorpublicationmapping> getAuthorpublicationmappings()
	{
		return m_publication_authorpublicationmappings;
	}
	public void setAuthorpublicationmappings(Set<Authorpublicationmapping> v_authorpublicationmappings)
	{
		m_publication_authorpublicationmappings=v_authorpublicationmappings;
	}
	public Set<Book> getBooks()
	{
		return m_publication_books;
	}
	public void setBooks(Set<Book> v_books)
	{
		m_publication_books=v_books;
	}
	public Set<Posting> getPostings()
	{
		return m_publication_postings;
	}
	public void setPostings(Set<Posting> v_postings)
	{
		m_publication_postings=v_postings;
	}
	public java.sql.Timestamp getDate()
	{
		return m_publication_date;
	}
	public void setDate(java.sql.Timestamp v_date)
	{
		m_publication_date=v_date;
	}
	public java.lang.String getName()
	{
		return m_publication_name;
	}
	public void setName(java.lang.String v_name)
	{
		m_publication_name=v_name;
	}

	public Set<Author> getAuthor_via_authorpublicationmappings()
	{
		return m_author_via_authorpublicationmappings;
	}
	public void setAuthor_via_authorpublicationmappings(Set<Author> v_authors)
	{
		m_author_via_authorpublicationmappings=v_authors;
	}
}