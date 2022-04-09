package de.elbosso.generated.sqlshell;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "stackoverflowposting"
/*	,indexes = {
		@Index(name= "stackoverflowposting_pkey", columnList="id")
	}*/
)
public class Stackoverflowposting
extends Posting
{
	//in case there is no @Id annotation - just uncomment the following three lines!
	//@Id
	//@Column(name="ROWID")
	//private String rowid_id;

	@ManyToOne
	@JoinColumn(name = "id"
				, referencedColumnName = "id"
,foreignKey=@ForeignKey(name="stackoverflowposting_id_fkey"
				, value=ConstraintMode.CONSTRAINT), insertable = false
				, updatable = false	)
	private Posting m_stackoverflowposting_posting;


	@Column(name = "permalink"
		, length=255
		, precision=255
		, scale=0
	)
	private java.lang.String m_stackoverflowposting_permalink;

	public Posting getPosting()
	{
		return m_stackoverflowposting_posting;
	}
	public void setPosting(Posting v_posting)
	{
		m_stackoverflowposting_posting=v_posting;
	}
	public java.lang.String getPermalink()
	{
		return m_stackoverflowposting_permalink;
	}
	public void setPermalink(java.lang.String v_permalink)
	{
		m_stackoverflowposting_permalink=v_permalink;
	}

}