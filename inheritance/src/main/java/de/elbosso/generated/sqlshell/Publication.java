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

	@ManyToMany(mappedBy = "m_publication_via_authorpublicationmappings")
	private Set<Author> m_author_via_authorpublicationmappings = new HashSet();

	@OneToMany(mappedBy = "m_publication", cascade = CascadeType.DETACH)
	private Set<Authorpublicationmapping> m_authorpublicationmappings = new HashSet();

	@OneToMany(mappedBy = "m_publication", cascade = CascadeType.DETACH)
	private Set<Book> m_books = new HashSet();

	@OneToMany(mappedBy = "m_publication", cascade = CascadeType.DETACH)
	private Set<Posting> m_postings = new HashSet();

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
	private Integer m_id;

	@Column(name = "date"
		, length=29
		, precision=29
		, scale=6
	)
	private java.sql.Timestamp m_date;

	@Column(name = "name"
		, length=255
		, precision=255
		, scale=0
	)
	private String m_name;

	public Integer getId()
	{
		return m_id;
	}
	public void setId(Integer v_id)
	{
		m_id=v_id;
	}
	public Set<Authorpublicationmapping> getAuthorpublicationmappings()
	{
		return m_authorpublicationmappings;
	}
	public void setAuthorpublicationmappings(Set<Authorpublicationmapping> v_authorpublicationmappings)
	{
		m_authorpublicationmappings=v_authorpublicationmappings;
	}
	public Set<Book> getBooks()
	{
		return m_books;
	}
	public void setBooks(Set<Book> v_books)
	{
		m_books=v_books;
	}
	public Set<Posting> getPostings()
	{
		return m_postings;
	}
	public void setPostings(Set<Posting> v_postings)
	{
		m_postings=v_postings;
	}
	public java.sql.Timestamp getDate()
	{
		return m_date;
	}
	public void setDate(java.sql.Timestamp v_date)
	{
		m_date=v_date;
	}
	public String getName()
	{
		return m_name;
	}
	public void setName(String v_name)
	{
		m_name=v_name;
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