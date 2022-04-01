package de.elbosso.generated.sqlshell.hr;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "DEPARTMENTS"
/*	,indexes = {
		@Index(name= "DEPT_LOCATION_IX", columnList="LOCATION_ID")
		@Index(name= "DEPT_ID_PK", columnList="DEPARTMENT_ID")
	}*/
)
public class DEPARTMENTS
{

//JOBS EMPLOYEES JOB_ID DEPARTMENT_ID DEPARTMENTS 
	@ManyToMany(mappedBy = "m_DEPARTMENTS_via_EMPLOYEESs")
	private Set<JOBS> m_JOBS_via_EMPLOYEESs = new HashSet();

//EMPLOYEES EMPLOYEES MANAGER_ID DEPARTMENT_ID DEPARTMENTS 
	@ManyToMany(mappedBy = "m_DEPARTMENTS_via_EMPLOYEESs")
	private Set<EMPLOYEES> m_EMPLOYEES_via_EMPLOYEESs = new HashSet();

//EMPLOYEES JOB_HISTORY EMPLOYEE_ID DEPARTMENT_ID DEPARTMENTS 
	@ManyToMany(mappedBy = "m_DEPARTMENTS_via_JOB_HISTORYs")
	private Set<EMPLOYEES> m_EMPLOYEES_via_JOB_HISTORYs = new HashSet();

//JOBS JOB_HISTORY JOB_ID DEPARTMENT_ID DEPARTMENTS 
	@ManyToMany(mappedBy = "m_DEPARTMENTS_via_JOB_HISTORYs")
	private Set<JOBS> m_JOBS_via_JOB_HISTORYs = new HashSet();

	@OneToMany(mappedBy = "m_DEPARTMENTS", cascade = CascadeType.DETACH)
	private Set<EMPLOYEES> m_EMPLOYEESs = new HashSet();

	@OneToMany(mappedBy = "m_DEPARTMENTS", cascade = CascadeType.DETACH)
	private Set<JOB_HISTORY> m_JOB_HISTORYs = new HashSet();

	@Id
	@NotNull
	@Column(name = "DEPARTMENT_ID"
		, nullable = false
		, length=4
		, precision=4
		, scale=0
	)
	private java.math.BigDecimal m_DEPARTMENT_ID;

	@NotNull
	@Column(name = "DEPARTMENT_NAME"
		, nullable = false
		, length=30
		, precision=30
		, scale=0
	)
	private java.lang.String m_DEPARTMENT_NAME;

	@ManyToOne
	@JoinColumn(name = "MANAGER_ID", referencedColumnName = "EMPLOYEE_ID",foreignKey=@ForeignKey(name="DEPT_MGR_FK", value=ConstraintMode.CONSTRAINT))
	private EMPLOYEES m_EMPLOYEES;


	@ManyToOne
	@JoinColumn(name = "LOCATION_ID", referencedColumnName = "LOCATION_ID",foreignKey=@ForeignKey(name="DEPT_LOC_FK", value=ConstraintMode.CONSTRAINT))
	private LOCATIONS m_LOCATIONS;


	public java.math.BigDecimal getDEPARTMENT_ID()
	{
		return m_DEPARTMENT_ID;
	}
	public void setDEPARTMENT_ID(java.math.BigDecimal v_DEPARTMENT_ID)
	{
		m_DEPARTMENT_ID=v_DEPARTMENT_ID;
	}
	public Set<EMPLOYEES> getEMPLOYEESs()
	{
		return m_EMPLOYEESs;
	}
	public void setEMPLOYEESs(Set<EMPLOYEES> v_EMPLOYEESs)
	{
		m_EMPLOYEESs=v_EMPLOYEESs;
	}
	public Set<JOB_HISTORY> getJOB_HISTORYs()
	{
		return m_JOB_HISTORYs;
	}
	public void setJOB_HISTORYs(Set<JOB_HISTORY> v_JOB_HISTORYs)
	{
		m_JOB_HISTORYs=v_JOB_HISTORYs;
	}
	public java.lang.String getDEPARTMENT_NAME()
	{
		return m_DEPARTMENT_NAME;
	}
	public void setDEPARTMENT_NAME(java.lang.String v_DEPARTMENT_NAME)
	{
		m_DEPARTMENT_NAME=v_DEPARTMENT_NAME;
	}
	public EMPLOYEES getEMPLOYEES()
	{
		return m_EMPLOYEES;
	}
	public void setEMPLOYEES(EMPLOYEES v_EMPLOYEES)
	{
		m_EMPLOYEES=v_EMPLOYEES;
	}
	public LOCATIONS getLOCATIONS()
	{
		return m_LOCATIONS;
	}
	public void setLOCATIONS(LOCATIONS v_LOCATIONS)
	{
		m_LOCATIONS=v_LOCATIONS;
	}

	public Set<JOBS> getJOBS_via_EMPLOYEESs()
	{
		return m_JOBS_via_EMPLOYEESs;
	}
	public void setJOBS_via_EMPLOYEESs(Set<JOBS> v_JOBSs)
	{
		m_JOBS_via_EMPLOYEESs=v_JOBSs;
	}
	public Set<EMPLOYEES> getEMPLOYEES_via_EMPLOYEESs()
	{
		return m_EMPLOYEES_via_EMPLOYEESs;
	}
	public void setEMPLOYEES_via_EMPLOYEESs(Set<EMPLOYEES> v_EMPLOYEESs)
	{
		m_EMPLOYEES_via_EMPLOYEESs=v_EMPLOYEESs;
	}
	public Set<EMPLOYEES> getEMPLOYEES_via_JOB_HISTORYs()
	{
		return m_EMPLOYEES_via_JOB_HISTORYs;
	}
	public void setEMPLOYEES_via_JOB_HISTORYs(Set<EMPLOYEES> v_EMPLOYEESs)
	{
		m_EMPLOYEES_via_JOB_HISTORYs=v_EMPLOYEESs;
	}
	public Set<JOBS> getJOBS_via_JOB_HISTORYs()
	{
		return m_JOBS_via_JOB_HISTORYs;
	}
	public void setJOBS_via_JOB_HISTORYs(Set<JOBS> v_JOBSs)
	{
		m_JOBS_via_JOB_HISTORYs=v_JOBSs;
	}
}
