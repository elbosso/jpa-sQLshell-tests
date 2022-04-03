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

	@OneToMany(mappedBy = "m_posting", cascade = CascadeType.DETACH)
	private Set<Stackoverflowposting> m_stackoverflowpostings = new HashSet();

	@ManyToOne
	//{public.stackoverflowposting=id, public.book=id, public.posting=id}
	//id
	//${childParentMappingColumn.get(tableDescription)}
	//${childParentMappingColumn.get(tableDescription).name}
	//${childParentMappingColumn.get(tableDescription).getName()}
	@JoinColumn(name = "id"
				, referencedColumnName = "id"
,foreignKey=@ForeignKey(name="posting_id_fkey"
				, value=ConstraintMode.CONSTRAINT), insertable = false
				, updatable = false	)
	private Publication m_publication;


	@Column(name = "url"
		, length=255
		, precision=255
		, scale=0
	)
	private String m_url;

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
	public String getUrl()
	{
		return m_url;
	}
	public void setUrl(String v_url)
	{
		m_url=v_url;
	}

}