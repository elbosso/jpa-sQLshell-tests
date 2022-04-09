package de.elbosso.generated.sqlshell;

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
	//in case there is no @Id annotation - just uncomment the following three lines!
	//@Id
	//@Column(name="ROWID")
	//private String rowid_id;

	@OneToMany(mappedBy = "m_stackoverflowposting_posting", cascade = CascadeType.DETACH)
	private Set<Stackoverflowposting> m_posting_stackoverflowpostings = new HashSet();

	@ManyToOne
	@JoinColumn(name = "id"
				, referencedColumnName = "id"
,foreignKey=@ForeignKey(name="posting_id_fkey"
				, value=ConstraintMode.CONSTRAINT), insertable = false
				, updatable = false	)
	private Publication m_posting_publication;


	@Column(name = "url"
		, length=255
		, precision=255
		, scale=0
	)
	private java.lang.String m_posting_url;

	public Publication getPublication()
	{
		return m_posting_publication;
	}
	public void setPublication(Publication v_publication)
	{
		m_posting_publication=v_publication;
	}
	public Set<Stackoverflowposting> getStackoverflowpostings()
	{
		return m_posting_stackoverflowpostings;
	}
	public void setStackoverflowpostings(Set<Stackoverflowposting> v_stackoverflowpostings)
	{
		m_posting_stackoverflowpostings=v_stackoverflowpostings;
	}
	public java.lang.String getUrl()
	{
		return m_posting_url;
	}
	public void setUrl(java.lang.String v_url)
	{
		m_posting_url=v_url;
	}

}