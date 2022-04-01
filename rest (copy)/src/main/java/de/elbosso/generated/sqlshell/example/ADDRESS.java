package de.elbosso.generated.sqlshell.example;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ADDRESS"
/*	,indexes = {
		@Index(name= "SYS_IDX_SYS_PK_10104_10106", columnList="ID")
		@Index(name= "SYS_IDX_SYS_FK_10105_10110", columnList="PERSON_ID")
	}*/
)
public class ADDRESS
{

	@Id
	@NotNull
	@Column(name = "ID"
		, nullable = false
		, length=32
		, precision=32
		, scale=0
	)
	private java.lang.Integer m_ID;

	@ManyToOne
	@JoinColumn(name = "PERSON_ID", referencedColumnName = "ID",foreignKey=@ForeignKey(name="SYS_FK_10105", value=ConstraintMode.CONSTRAINT))
	private EXAMPLE m_EXAMPLE;


	@Column(name = "STREET"
		, length=255
		, precision=255
		, scale=0
	)
	private java.lang.String m_STREET;

	@Column(name = "TOWN"
		, length=255
		, precision=255
		, scale=0
	)
	private java.lang.String m_TOWN;

	@NotNull
	@Column(name = "ZIP"
		, nullable = false
		, length=5
		, precision=5
		, scale=0
	)
	private java.math.BigDecimal m_ZIP;

	public java.lang.Integer getID()
	{
		return m_ID;
	}
	public void setID(java.lang.Integer v_ID)
	{
		m_ID=v_ID;
	}
	public EXAMPLE getEXAMPLE()
	{
		return m_EXAMPLE;
	}
	public void setEXAMPLE(EXAMPLE v_EXAMPLE)
	{
		m_EXAMPLE=v_EXAMPLE;
	}
	public java.lang.String getSTREET()
	{
		return m_STREET;
	}
	public void setSTREET(java.lang.String v_STREET)
	{
		m_STREET=v_STREET;
	}
	public java.lang.String getTOWN()
	{
		return m_TOWN;
	}
	public void setTOWN(java.lang.String v_TOWN)
	{
		m_TOWN=v_TOWN;
	}
	public java.math.BigDecimal getZIP()
	{
		return m_ZIP;
	}
	public void setZIP(java.math.BigDecimal v_ZIP)
	{
		m_ZIP=v_ZIP;
	}

}
