package de.elbosso.generated.sqlshell.inheritance;

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

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id"
		, nullable = false
		, updatable = false
		, length=10
		, precision=10
		, scale=0
			,insertable = false
	)
	private java.lang.Integer m_id;

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
	private java.lang.String m_name;

	public java.lang.Integer getId()
	{
		return m_id;
	}
	public void setId(java.lang.Integer v_id)
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
	public java.sql.Timestamp getDate()
	{
		return m_date;
	}
	public void setDate(java.sql.Timestamp v_date)
	{
		m_date=v_date;
	}
	public java.lang.String getName()
	{
		return m_name;
	}
	public void setName(java.lang.String v_name)
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