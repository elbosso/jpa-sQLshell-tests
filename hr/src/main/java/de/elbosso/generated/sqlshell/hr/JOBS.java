package de.elbosso.generated.sqlshell.hr;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "JOBS"
/*	,indexes = {
		@Index(name= "JOB_ID_PK", columnList="JOB_ID")
	}*/
)
public class JOBS
{

	@ManyToMany
	@JoinTable(
	  name = "EMPLOYEES",
	  joinColumns = @JoinColumn(name = "JOB_ID"),
	  inverseJoinColumns = @JoinColumn(name = "MANAGER_ID"))
	private Set<EMPLOYEES> m_EMPLOYEES_via_EMPLOYEESs = new HashSet();

	@ManyToMany
	@JoinTable(
	  name = "EMPLOYEES",
	  joinColumns = @JoinColumn(name = "JOB_ID"),
	  inverseJoinColumns = @JoinColumn(name = "DEPARTMENT_ID"))
	private Set<DEPARTMENTS> m_DEPARTMENTS_via_EMPLOYEESs = new HashSet();

	@ManyToMany
	@JoinTable(
	  name = "JOB_HISTORY",
	  joinColumns = @JoinColumn(name = "JOB_ID"),
	  inverseJoinColumns = @JoinColumn(name = "DEPARTMENT_ID"))
	private Set<DEPARTMENTS> m_DEPARTMENTS_via_JOB_HISTORYs = new HashSet();

//EMPLOYEES JOB_HISTORY EMPLOYEE_ID JOB_ID JOBS 
	@ManyToMany(mappedBy = "m_JOBS_via_JOB_HISTORYs")
	private Set<EMPLOYEES> m_EMPLOYEES_via_JOB_HISTORYs = new HashSet();

	@OneToMany(mappedBy = "m_JOBS", cascade = CascadeType.DETACH)
	private Set<EMPLOYEES> m_EMPLOYEESs = new HashSet();

	@OneToMany(mappedBy = "m_JOBS", cascade = CascadeType.DETACH)
	private Set<JOB_HISTORY> m_JOB_HISTORYs = new HashSet();

	@Id
	@NotNull
	@Column(name = "JOB_ID"
		, nullable = false
		, length=10
		, precision=10
		, scale=0
	)
	private java.lang.String m_JOB_ID;

	@NotNull
	@Column(name = "JOB_TITLE"
		, nullable = false
		, length=35
		, precision=35
		, scale=0
	)
	private java.lang.String m_JOB_TITLE;

	@Column(name = "MIN_SALARY"
		, length=6
		, precision=6
		, scale=0
	)
	private java.math.BigDecimal m_MIN_SALARY;

	@Column(name = "MAX_SALARY"
		, length=6
		, precision=6
		, scale=0
	)
	private java.math.BigDecimal m_MAX_SALARY;

	public java.lang.String getJOB_ID()
	{
		return m_JOB_ID;
	}
	public void setJOB_ID(java.lang.String v_JOB_ID)
	{
		m_JOB_ID=v_JOB_ID;
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
	public java.lang.String getJOB_TITLE()
	{
		return m_JOB_TITLE;
	}
	public void setJOB_TITLE(java.lang.String v_JOB_TITLE)
	{
		m_JOB_TITLE=v_JOB_TITLE;
	}
	public java.math.BigDecimal getMIN_SALARY()
	{
		return m_MIN_SALARY;
	}
	public void setMIN_SALARY(java.math.BigDecimal v_MIN_SALARY)
	{
		m_MIN_SALARY=v_MIN_SALARY;
	}
	public java.math.BigDecimal getMAX_SALARY()
	{
		return m_MAX_SALARY;
	}
	public void setMAX_SALARY(java.math.BigDecimal v_MAX_SALARY)
	{
		m_MAX_SALARY=v_MAX_SALARY;
	}

	public Set<EMPLOYEES> getEMPLOYEES_via_EMPLOYEESs()
	{
		return m_EMPLOYEES_via_EMPLOYEESs;
	}
	public void setEMPLOYEES_via_EMPLOYEESs(Set<EMPLOYEES> v_EMPLOYEESs)
	{
		m_EMPLOYEES_via_EMPLOYEESs=v_EMPLOYEESs;
	}
	public Set<DEPARTMENTS> getDEPARTMENTS_via_EMPLOYEESs()
	{
		return m_DEPARTMENTS_via_EMPLOYEESs;
	}
	public void setDEPARTMENTS_via_EMPLOYEESs(Set<DEPARTMENTS> v_DEPARTMENTSs)
	{
		m_DEPARTMENTS_via_EMPLOYEESs=v_DEPARTMENTSs;
	}
	public Set<DEPARTMENTS> getDEPARTMENTS_via_JOB_HISTORYs()
	{
		return m_DEPARTMENTS_via_JOB_HISTORYs;
	}
	public void setDEPARTMENTS_via_JOB_HISTORYs(Set<DEPARTMENTS> v_DEPARTMENTSs)
	{
		m_DEPARTMENTS_via_JOB_HISTORYs=v_DEPARTMENTSs;
	}
	public Set<EMPLOYEES> getEMPLOYEES_via_JOB_HISTORYs()
	{
		return m_EMPLOYEES_via_JOB_HISTORYs;
	}
	public void setEMPLOYEES_via_JOB_HISTORYs(Set<EMPLOYEES> v_EMPLOYEESs)
	{
		m_EMPLOYEES_via_JOB_HISTORYs=v_EMPLOYEESs;
	}
}
