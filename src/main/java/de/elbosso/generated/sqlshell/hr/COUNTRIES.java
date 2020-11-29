package de.elbosso.generated.sqlshell.hr;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "COUNTRIES"
/*	,indexes = {
		@Index(name= "COUNTRY_C_ID_PK", columnList="COUNTRY_ID")
	}*/
)
public class COUNTRIES
{

	@OneToMany(mappedBy = "m_COUNTRIES", cascade = CascadeType.DETACH)
	private Set<LOCATIONS> m_LOCATIONSs = new HashSet();

	@Id
	@NotNull
	@Column(name = "COUNTRY_ID"
		, nullable = false
		, length=2
		, precision=2
		, scale=0
	)
	private java.lang.String m_COUNTRY_ID;

	@Column(name = "COUNTRY_NAME"
		, length=40
		, precision=40
		, scale=0
	)
	private java.lang.String m_COUNTRY_NAME;

	@ManyToOne
	@JoinColumn(name = "REGION_ID", referencedColumnName = "REGION_ID",foreignKey=@ForeignKey(name="COUNTR_REG_FK", value=ConstraintMode.CONSTRAINT))
	private REGIONS m_REGIONS;


	public java.lang.String getCOUNTRY_ID()
	{
		return m_COUNTRY_ID;
	}
	public void setCOUNTRY_ID(java.lang.String v_COUNTRY_ID)
	{
		m_COUNTRY_ID=v_COUNTRY_ID;
	}
	public Set<LOCATIONS> getLOCATIONSs()
	{
		return m_LOCATIONSs;
	}
	public void setLOCATIONSs(Set<LOCATIONS> v_LOCATIONSs)
	{
		m_LOCATIONSs=v_LOCATIONSs;
	}
	public java.lang.String getCOUNTRY_NAME()
	{
		return m_COUNTRY_NAME;
	}
	public void setCOUNTRY_NAME(java.lang.String v_COUNTRY_NAME)
	{
		m_COUNTRY_NAME=v_COUNTRY_NAME;
	}
	public REGIONS getREGIONS()
	{
		return m_REGIONS;
	}
	public void setREGIONS(REGIONS v_REGIONS)
	{
		m_REGIONS=v_REGIONS;
	}

}
