package de.elbosso.generated.sqlshell.hr;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "JOB_HISTORY"
/*	,indexes = {
		@Index(name= "JHIST_DEPARTMENT_IX", columnList="DEPARTMENT_ID")
		@Index(name= "JHIST_EMP_ID_ST_DATE_PK", columnList="EMPLOYEE_IDSTART_DATE")
		@Index(name= "JHIST_EMPLOYEE_IX", columnList="EMPLOYEE_ID")
		@Index(name= "JHIST_JOB_IX", columnList="JOB_ID")
	}*/
)
public class JOB_HISTORY
{

	@ManyToOne
	@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "EMPLOYEE_ID",foreignKey=@ForeignKey(name="JHIST_EMP_FK", value=ConstraintMode.CONSTRAINT))
	private EMPLOYEES m_EMPLOYEES;


	@Id
	@NotNull
	@Column(name = "START_DATE"
		, nullable = false
		, length=7
		, precision=7
		, scale=0
	)
	private java.sql.Timestamp m_START_DATE;

	@NotNull
	@Column(name = "END_DATE"
		, nullable = false
		, length=7
		, precision=7
		, scale=0
	)
	private java.sql.Timestamp m_END_DATE;

	@ManyToOne
	@JoinColumn(name = "JOB_ID", referencedColumnName = "JOB_ID",foreignKey=@ForeignKey(name="JHIST_JOB_FK", value=ConstraintMode.CONSTRAINT))
	private JOBS m_JOBS;


	@ManyToOne
	@JoinColumn(name = "DEPARTMENT_ID", referencedColumnName = "DEPARTMENT_ID",foreignKey=@ForeignKey(name="JHIST_DEPT_FK", value=ConstraintMode.CONSTRAINT))
	private DEPARTMENTS m_DEPARTMENTS;


	public EMPLOYEES getEMPLOYEES()
	{
		return m_EMPLOYEES;
	}
	public void setEMPLOYEES(EMPLOYEES v_EMPLOYEES)
	{
		m_EMPLOYEES=v_EMPLOYEES;
	}
	public java.sql.Timestamp getSTART_DATE()
	{
		return m_START_DATE;
	}
	public void setSTART_DATE(java.sql.Timestamp v_START_DATE)
	{
		m_START_DATE=v_START_DATE;
	}
	public java.sql.Timestamp getEND_DATE()
	{
		return m_END_DATE;
	}
	public void setEND_DATE(java.sql.Timestamp v_END_DATE)
	{
		m_END_DATE=v_END_DATE;
	}
	public JOBS getJOBS()
	{
		return m_JOBS;
	}
	public void setJOBS(JOBS v_JOBS)
	{
		m_JOBS=v_JOBS;
	}
	public DEPARTMENTS getDEPARTMENTS()
	{
		return m_DEPARTMENTS;
	}
	public void setDEPARTMENTS(DEPARTMENTS v_DEPARTMENTS)
	{
		m_DEPARTMENTS=v_DEPARTMENTS;
	}

}
