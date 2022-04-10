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
	private Integer m_author_id;

	@Column(name = "name"
		, length=255
		, precision=255
		, scale=0
	)
	private String m_author_name;

	public Integer getId()
	{
		return m_author_id;
	}
	public void setId(Integer v_id)
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
	public String getName()
	{
		return m_author_name;
	}
	public void setName(String v_name)
	{
		m_author_name=v_name;
	}

}