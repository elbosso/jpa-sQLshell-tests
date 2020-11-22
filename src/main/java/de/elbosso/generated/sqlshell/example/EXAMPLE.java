package de.elbosso.generated.sqlshell.example;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "EXAMPLE"
/*	,indexes = {
		@Index(name= "SYS_IDX_SYS_PK_10098_10099", columnList="ID")
	}*/
)
public class EXAMPLE
{

	@OneToMany(mappedBy = "m_EXAMPLE", cascade = CascadeType.DETACH)
	private Set<ADDRESS> m_ADDRESSs = new HashSet();

	@Id
	@NotNull
	@Column(name = "ID"
		, nullable = false
		, length=32
		, precision=32
		, scale=0
	)
	private java.lang.Integer m_ID;

	@Column(name = "NAME"
		, length=255
		, precision=255
		, scale=0
	)
	private java.lang.String m_NAME;

	@Column(name = "AGE"
		, length=32
		, precision=32
		, scale=0
	)
	private java.lang.Integer m_AGE;

	@Column(name = "EXPERIENCE"
		, length=32
		, precision=32
		, scale=0
	)
	private java.lang.Integer m_EXPERIENCE;

	public java.lang.Integer getID()
	{
		return m_ID;
	}
	public void setID(java.lang.Integer v_ID)
	{
		m_ID=v_ID;
	}
	public Set<ADDRESS> getADDRESSs()
	{
		return m_ADDRESSs;
	}
	public void setADDRESSs(Set<ADDRESS> v_ADDRESSs)
	{
		m_ADDRESSs=v_ADDRESSs;
	}
	public java.lang.String getNAME()
	{
		return m_NAME;
	}
	public void setNAME(java.lang.String v_NAME)
	{
		m_NAME=v_NAME;
	}
	public java.lang.Integer getAGE()
	{
		return m_AGE;
	}
	public void setAGE(java.lang.Integer v_AGE)
	{
		m_AGE=v_AGE;
	}
	public java.lang.Integer getEXPERIENCE()
	{
		return m_EXPERIENCE;
	}
	public void setEXPERIENCE(java.lang.Integer v_EXPERIENCE)
	{
		m_EXPERIENCE=v_EXPERIENCE;
	}

}
