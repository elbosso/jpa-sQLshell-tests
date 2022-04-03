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

	@ManyToMany
	@JoinTable(
	  name = "authorpublicationmapping",
	  joinColumns = @JoinColumn(name = "authorid"),
	  inverseJoinColumns = @JoinColumn(name = "publicationid"))
	private Set<Publication> m_publication_via_authorpublicationmappings = new HashSet();

	@OneToMany(mappedBy = "m_author", cascade = CascadeType.DETACH)
	private Set<Authorpublicationmapping> m_authorpublicationmappings = new HashSet();

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
	public String getName()
	{
		return m_name;
	}
	public void setName(String v_name)
	{
		m_name=v_name;
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