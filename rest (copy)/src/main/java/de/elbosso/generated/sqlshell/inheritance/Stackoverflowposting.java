package de.elbosso.generated.sqlshell.inheritance;

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

	@ManyToOne
	@JoinColumn(name = "soid", referencedColumnName = "id",foreignKey=@ForeignKey(name="stackoverflowposting_id_fkey", value=ConstraintMode.CONSTRAINT))
	private Posting m_posting;


	@Column(name = "permalink"
		, length=255
		, precision=255
		, scale=0
	)
	private java.lang.String m_permalink;

	public Posting getPosting()
	{
		return m_posting;
	}
	public void setPosting(Posting v_posting)
	{
		m_posting=v_posting;
	}
	public java.lang.String getPermalink()
	{
		return m_permalink;
	}
	public void setPermalink(java.lang.String v_permalink)
	{
		m_permalink=v_permalink;
	}

}