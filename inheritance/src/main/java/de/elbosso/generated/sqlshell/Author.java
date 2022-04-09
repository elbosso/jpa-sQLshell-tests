package de.elbosso.generated.sqlshell;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "author"
/*	,indexes = {
		@Index(name= "author_pkey", columnList="id")
	}*/
)
public class Author
{
	//in case there is no @Id annotation - just uncomment the following three lines!
	//@Id
	//@Column(name="ROWID")
	//private String rowid_id;

	@ManyToMany
	@JoinTable(
	  name = "publication_authorpublicationmapping",
	  joinColumns = @JoinColumn(name = "authorid"),
	  inverseJoinColumns = @JoinColumn(name = "publicationid"))
	private Set<Publication> m_publication_via_authorpublicationmappings = new HashSet();

	@OneToMany(mappedBy = "m_authorpublicationmapping_author", cascade = CascadeType.DETACH)
	private Set<Authorpublicationmapping> m_author_authorpublicationmappings = new HashSet();

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
	private java.lang.Integer m_author_id;

	@Column(name = "name"
		, length=255
		, precision=255
		, scale=0
	)
	private java.lang.String m_author_name;

	public java.lang.Integer getId()
	{
		return m_author_id;
	}
	public void setId(java.lang.Integer v_id)
	{
		m_author_id=v_id;
	}
	public Set<Authorpublicationmapping> getAuthorpublicationmappings()
	{
		return m_author_authorpublicationmappings;
	}
	public void setAuthorpublicationmappings(Set<Authorpublicationmapping> v_authorpublicationmappings)
	{
		m_author_authorpublicationmappings=v_authorpublicationmappings;
	}
	public java.lang.String getName()
	{
		return m_author_name;
	}
	public void setName(java.lang.String v_name)
	{
		m_author_name=v_name;
	}

	public Set<Publication> getPublication_via_authorpublicationmappings()
	{
		return m_publication_via_authorpublicationmappings;
	}
	public void setPublication_via_authorpublicationmappings(Set<Publication> v_publications)
	{
		m_publication_via_authorpublicationmappings=v_publications;
	}
}