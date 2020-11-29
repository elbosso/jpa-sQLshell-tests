package de.elbosso.generated.sqlshell.hr;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "REGIONS"
/*	,indexes = {
		@Index(name= "REG_ID_PK", columnList="REGION_ID")
	}*/
)
public class REGIONS
{

	@OneToMany(mappedBy = "m_REGIONS", cascade = CascadeType.DETACH)
	private Set<COUNTRIES> m_COUNTRIESs = new HashSet();

	@Id
	@NotNull
	@Column(name = "REGION_ID"
		, nullable = false
		, length=0
		, precision=0
		, scale=-127
	)
	private java.math.BigDecimal m_REGION_ID;

	@Column(name = "REGION_NAME"
		, length=25
		, precision=25
		, scale=0
	)
	private java.lang.String m_REGION_NAME;

	public java.math.BigDecimal getREGION_ID()
	{
		return m_REGION_ID;
	}
	public void setREGION_ID(java.math.BigDecimal v_REGION_ID)
	{
		m_REGION_ID=v_REGION_ID;
	}
	public Set<COUNTRIES> getCOUNTRIESs()
	{
		return m_COUNTRIESs;
	}
	public void setCOUNTRIESs(Set<COUNTRIES> v_COUNTRIESs)
	{
		m_COUNTRIESs=v_COUNTRIESs;
	}
	public java.lang.String getREGION_NAME()
	{
		return m_REGION_NAME;
	}
	public void setREGION_NAME(java.lang.String v_REGION_NAME)
	{
		m_REGION_NAME=v_REGION_NAME;
	}

}
