package de.elbosso.generated.sqlshell.hr;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "LOCATIONS"
/*	,indexes = {
		@Index(name= "LOC_ID_PK", columnList="LOCATION_ID")
		@Index(name= "LOC_CITY_IX", columnList="CITY")
		@Index(name= "LOC_STATE_PROVINCE_IX", columnList="STATE_PROVINCE")
		@Index(name= "LOC_COUNTRY_IX", columnList="COUNTRY_ID")
	}*/
)
public class LOCATIONS
{

//EMPLOYEES DEPARTMENTS MANAGER_ID LOCATION_ID LOCATIONS 
	@ManyToMany(mappedBy = "m_LOCATIONS_via_DEPARTMENTSs")
	private Set<EMPLOYEES> m_EMPLOYEES_via_DEPARTMENTSs = new HashSet();

	@OneToMany(mappedBy = "m_LOCATIONS", cascade = CascadeType.DETACH)
	private Set<DEPARTMENTS> m_DEPARTMENTSs = new HashSet();

	@Id
	@NotNull
	@Column(name = "LOCATION_ID"
		, nullable = false
		, length=4
		, precision=4
		, scale=0
	)
	private java.math.BigDecimal m_LOCATION_ID;

	@Column(name = "STREET_ADDRESS"
		, length=40
		, precision=40
		, scale=0
	)
	private java.lang.String m_STREET_ADDRESS;

	@Column(name = "POSTAL_CODE"
		, length=12
		, precision=12
		, scale=0
	)
	private java.lang.String m_POSTAL_CODE;

	@NotNull
	@Column(name = "CITY"
		, nullable = false
		, length=30
		, precision=30
		, scale=0
	)
	private java.lang.String m_CITY;

	@Column(name = "STATE_PROVINCE"
		, length=25
		, precision=25
		, scale=0
	)
	private java.lang.String m_STATE_PROVINCE;

	@ManyToOne
	@JoinColumn(name = "COUNTRY_ID", referencedColumnName = "COUNTRY_ID",foreignKey=@ForeignKey(name="LOC_C_ID_FK", value=ConstraintMode.CONSTRAINT))
	private COUNTRIES m_COUNTRIES;


	public java.math.BigDecimal getLOCATION_ID()
	{
		return m_LOCATION_ID;
	}
	public void setLOCATION_ID(java.math.BigDecimal v_LOCATION_ID)
	{
		m_LOCATION_ID=v_LOCATION_ID;
	}
	public Set<DEPARTMENTS> getDEPARTMENTSs()
	{
		return m_DEPARTMENTSs;
	}
	public void setDEPARTMENTSs(Set<DEPARTMENTS> v_DEPARTMENTSs)
	{
		m_DEPARTMENTSs=v_DEPARTMENTSs;
	}
	public java.lang.String getSTREET_ADDRESS()
	{
		return m_STREET_ADDRESS;
	}
	public void setSTREET_ADDRESS(java.lang.String v_STREET_ADDRESS)
	{
		m_STREET_ADDRESS=v_STREET_ADDRESS;
	}
	public java.lang.String getPOSTAL_CODE()
	{
		return m_POSTAL_CODE;
	}
	public void setPOSTAL_CODE(java.lang.String v_POSTAL_CODE)
	{
		m_POSTAL_CODE=v_POSTAL_CODE;
	}
	public java.lang.String getCITY()
	{
		return m_CITY;
	}
	public void setCITY(java.lang.String v_CITY)
	{
		m_CITY=v_CITY;
	}
	public java.lang.String getSTATE_PROVINCE()
	{
		return m_STATE_PROVINCE;
	}
	public void setSTATE_PROVINCE(java.lang.String v_STATE_PROVINCE)
	{
		m_STATE_PROVINCE=v_STATE_PROVINCE;
	}
	public COUNTRIES getCOUNTRIES()
	{
		return m_COUNTRIES;
	}
	public void setCOUNTRIES(COUNTRIES v_COUNTRIES)
	{
		m_COUNTRIES=v_COUNTRIES;
	}

	public Set<EMPLOYEES> getEMPLOYEES_via_DEPARTMENTSs()
	{
		return m_EMPLOYEES_via_DEPARTMENTSs;
	}
	public void setEMPLOYEES_via_DEPARTMENTSs(Set<EMPLOYEES> v_EMPLOYEESs)
	{
		m_EMPLOYEES_via_DEPARTMENTSs=v_EMPLOYEESs;
	}
}
