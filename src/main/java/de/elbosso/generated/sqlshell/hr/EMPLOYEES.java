package de.elbosso.generated.sqlshell.hr;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "EMPLOYEES"
/*	,indexes = {
		@Index(name= "EMP_NAME_IX", columnList="LAST_NAMEFIRST_NAME")
		@Index(name= "EMP_DEPARTMENT_IX", columnList="DEPARTMENT_ID")
		@Index(name= "EMP_JOB_IX", columnList="JOB_ID")
		@Index(name= "EMP_EMAIL_UK", columnList="EMAIL")
		@Index(name= "EMP_EMP_ID_PK", columnList="EMPLOYEE_ID")
		@Index(name= "EMP_MANAGER_IX", columnList="MANAGER_ID")
	}*/
)
public class EMPLOYEES
{

	@ManyToMany
	@JoinTable(
	  name = "DEPARTMENTS",
	  joinColumns = @JoinColumn(name = "MANAGER_ID"),
	  inverseJoinColumns = @JoinColumn(name = "LOCATION_ID"))
	private Set<LOCATIONS> m_LOCATIONS_via_DEPARTMENTSs = new HashSet();

	@ManyToMany
	@JoinTable(
	  name = "EMPLOYEES",
	  joinColumns = @JoinColumn(name = "MANAGER_ID"),
	  inverseJoinColumns = @JoinColumn(name = "DEPARTMENT_ID"))
	private Set<DEPARTMENTS> m_DEPARTMENTS_via_EMPLOYEESs = new HashSet();

	@ManyToMany
	@JoinTable(
	  name = "JOB_HISTORY",
	  joinColumns = @JoinColumn(name = "EMPLOYEE_ID"),
	  inverseJoinColumns = @JoinColumn(name = "JOB_ID"))
	private Set<JOBS> m_JOBS_via_JOB_HISTORYs = new HashSet();

	@ManyToMany
	@JoinTable(
	  name = "JOB_HISTORY",
	  joinColumns = @JoinColumn(name = "EMPLOYEE_ID"),
	  inverseJoinColumns = @JoinColumn(name = "DEPARTMENT_ID"))
	private Set<DEPARTMENTS> m_DEPARTMENTS_via_JOB_HISTORYs = new HashSet();

//JOBS EMPLOYEES JOB_ID MANAGER_ID EMPLOYEES 
	@ManyToMany(mappedBy = "m_EMPLOYEES_via_EMPLOYEESs")
	private Set<JOBS> m_JOBS_via_EMPLOYEESs = new HashSet();

	@OneToMany(mappedBy = "m_EMPLOYEES", cascade = CascadeType.DETACH)
	private Set<DEPARTMENTS> m_DEPARTMENTSs = new HashSet();

	@OneToMany(mappedBy = "m_EMPLOYEES", cascade = CascadeType.DETACH)
	private Set<EMPLOYEES> m_EMPLOYEESs = new HashSet();

	@OneToMany(mappedBy = "m_EMPLOYEES", cascade = CascadeType.DETACH)
	private Set<JOB_HISTORY> m_JOB_HISTORYs = new HashSet();

	@Id
	@NotNull
	@Column(name = "EMPLOYEE_ID"
		, nullable = false
		, length=6
		, precision=6
		, scale=0
	)
	private java.math.BigDecimal m_EMPLOYEE_ID;

	@Column(name = "FIRST_NAME"
		, length=20
		, precision=20
		, scale=0
	)
	private java.lang.String m_FIRST_NAME;

	@NotNull
	@Column(name = "LAST_NAME"
		, nullable = false
		, length=25
		, precision=25
		, scale=0
	)
	private java.lang.String m_LAST_NAME;

	@NotNull
	@Column(name = "EMAIL"
		, nullable = false
		, length=25
		, precision=25
		, scale=0
	)
	private java.lang.String m_EMAIL;

	@Column(name = "PHONE_NUMBER"
		, length=20
		, precision=20
		, scale=0
	)
	private java.lang.String m_PHONE_NUMBER;

	@NotNull
	@Column(name = "HIRE_DATE"
		, nullable = false
		, length=7
		, precision=7
		, scale=0
	)
	private java.sql.Timestamp m_HIRE_DATE;

	@ManyToOne
	@JoinColumn(name = "JOB_ID", referencedColumnName = "JOB_ID",foreignKey=@ForeignKey(name="EMP_JOB_FK", value=ConstraintMode.CONSTRAINT))
	private JOBS m_JOBS;


	@Column(name = "SALARY"
		, length=8
		, precision=8
		, scale=2
	)
	private java.math.BigDecimal m_SALARY;

	@Column(name = "COMMISSION_PCT"
		, length=2
		, precision=2
		, scale=2
	)
	private java.math.BigDecimal m_COMMISSION_PCT;

	@ManyToOne
	@JoinColumn(name = "MANAGER_ID", referencedColumnName = "EMPLOYEE_ID",foreignKey=@ForeignKey(name="EMP_MANAGER_FK", value=ConstraintMode.CONSTRAINT))
	private EMPLOYEES m_EMPLOYEES;


	@ManyToOne
	@JoinColumn(name = "DEPARTMENT_ID", referencedColumnName = "DEPARTMENT_ID",foreignKey=@ForeignKey(name="EMP_DEPT_FK", value=ConstraintMode.CONSTRAINT))
	private DEPARTMENTS m_DEPARTMENTS;


	public java.math.BigDecimal getEMPLOYEE_ID()
	{
		return m_EMPLOYEE_ID;
	}
	public void setEMPLOYEE_ID(java.math.BigDecimal v_EMPLOYEE_ID)
	{
		m_EMPLOYEE_ID=v_EMPLOYEE_ID;
	}
	public Set<DEPARTMENTS> getDEPARTMENTSs()
	{
		return m_DEPARTMENTSs;
	}
	public void setDEPARTMENTSs(Set<DEPARTMENTS> v_DEPARTMENTSs)
	{
		m_DEPARTMENTSs=v_DEPARTMENTSs;
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
	public java.lang.String getFIRST_NAME()
	{
		return m_FIRST_NAME;
	}
	public void setFIRST_NAME(java.lang.String v_FIRST_NAME)
	{
		m_FIRST_NAME=v_FIRST_NAME;
	}
	public java.lang.String getLAST_NAME()
	{
		return m_LAST_NAME;
	}
	public void setLAST_NAME(java.lang.String v_LAST_NAME)
	{
		m_LAST_NAME=v_LAST_NAME;
	}
	public java.lang.String getEMAIL()
	{
		return m_EMAIL;
	}
	public void setEMAIL(java.lang.String v_EMAIL)
	{
		m_EMAIL=v_EMAIL;
	}
	public java.lang.String getPHONE_NUMBER()
	{
		return m_PHONE_NUMBER;
	}
	public void setPHONE_NUMBER(java.lang.String v_PHONE_NUMBER)
	{
		m_PHONE_NUMBER=v_PHONE_NUMBER;
	}
	public java.sql.Timestamp getHIRE_DATE()
	{
		return m_HIRE_DATE;
	}
	public void setHIRE_DATE(java.sql.Timestamp v_HIRE_DATE)
	{
		m_HIRE_DATE=v_HIRE_DATE;
	}
	public JOBS getJOBS()
	{
		return m_JOBS;
	}
	public void setJOBS(JOBS v_JOBS)
	{
		m_JOBS=v_JOBS;
	}
	public java.math.BigDecimal getSALARY()
	{
		return m_SALARY;
	}
	public void setSALARY(java.math.BigDecimal v_SALARY)
	{
		m_SALARY=v_SALARY;
	}
	public java.math.BigDecimal getCOMMISSION_PCT()
	{
		return m_COMMISSION_PCT;
	}
	public void setCOMMISSION_PCT(java.math.BigDecimal v_COMMISSION_PCT)
	{
		m_COMMISSION_PCT=v_COMMISSION_PCT;
	}
	public EMPLOYEES getEMPLOYEES()
	{
		return m_EMPLOYEES;
	}
	public void setEMPLOYEES(EMPLOYEES v_EMPLOYEES)
	{
		m_EMPLOYEES=v_EMPLOYEES;
	}
	public DEPARTMENTS getDEPARTMENTS()
	{
		return m_DEPARTMENTS;
	}
	public void setDEPARTMENTS(DEPARTMENTS v_DEPARTMENTS)
	{
		m_DEPARTMENTS=v_DEPARTMENTS;
	}

	public Set<LOCATIONS> getLOCATIONS_via_DEPARTMENTSs()
	{
		return m_LOCATIONS_via_DEPARTMENTSs;
	}
	public void setLOCATIONS_via_DEPARTMENTSs(Set<LOCATIONS> v_LOCATIONSs)
	{
		m_LOCATIONS_via_DEPARTMENTSs=v_LOCATIONSs;
	}
	public Set<DEPARTMENTS> getDEPARTMENTS_via_EMPLOYEESs()
	{
		return m_DEPARTMENTS_via_EMPLOYEESs;
	}
	public void setDEPARTMENTS_via_EMPLOYEESs(Set<DEPARTMENTS> v_DEPARTMENTSs)
	{
		m_DEPARTMENTS_via_EMPLOYEESs=v_DEPARTMENTSs;
	}
	public Set<JOBS> getJOBS_via_JOB_HISTORYs()
	{
		return m_JOBS_via_JOB_HISTORYs;
	}
	public void setJOBS_via_JOB_HISTORYs(Set<JOBS> v_JOBSs)
	{
		m_JOBS_via_JOB_HISTORYs=v_JOBSs;
	}
	public Set<DEPARTMENTS> getDEPARTMENTS_via_JOB_HISTORYs()
	{
		return m_DEPARTMENTS_via_JOB_HISTORYs;
	}
	public void setDEPARTMENTS_via_JOB_HISTORYs(Set<DEPARTMENTS> v_DEPARTMENTSs)
	{
		m_DEPARTMENTS_via_JOB_HISTORYs=v_DEPARTMENTSs;
	}
	public Set<JOBS> getJOBS_via_EMPLOYEESs()
	{
		return m_JOBS_via_EMPLOYEESs;
	}
	public void setJOBS_via_EMPLOYEESs(Set<JOBS> v_JOBSs)
	{
		m_JOBS_via_EMPLOYEESs=v_JOBSs;
	}
}
