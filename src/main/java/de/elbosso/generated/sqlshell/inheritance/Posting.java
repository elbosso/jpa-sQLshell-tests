package de.elbosso.generated.sqlshell.inheritance;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "posting"
/*	,indexes = {
		@Index(name= "posting_pkey", columnList="id")
	}*/
)
@Inheritance(strategy = InheritanceType.JOINED)
public class Posting
extends Publication
{

	@OneToMany(mappedBy = "m_posting", cascade = CascadeType.DETACH)
	private Set<Stackoverflowposting> m_stackoverflowpostings = new HashSet();

	@ManyToOne
	@JoinColumn(name = "id", referencedColumnName = "id",foreignKey=@ForeignKey(name="posting_id_fkey", value=ConstraintMode.CONSTRAINT))
	private Publication m_publication;


	@Column(name = "url"
		, length=255
		, precision=255
		, scale=0
	)
	private java.lang.String m_url;

	public Publication getPublication()
	{
		return m_publication;
	}
	public void setPublication(Publication v_publication)
	{
		m_publication=v_publication;
	}
	public Set<Stackoverflowposting> getStackoverflowpostings()
	{
		return m_stackoverflowpostings;
	}
	public void setStackoverflowpostings(Set<Stackoverflowposting> v_stackoverflowpostings)
	{
		m_stackoverflowpostings=v_stackoverflowpostings;
	}
	public java.lang.String getUrl()
	{
		return m_url;
	}
	public void setUrl(java.lang.String v_url)
	{
		m_url=v_url;
	}

}