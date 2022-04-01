package de.elbosso.generated.sqlshell.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "customer"
/*	,indexes = {
		@Index(name= "pk_customer", columnList="id")
		@Index(name= "indexcustomername", columnList="lastnamefirstname")
	}*/
)
public class Customer
{
/*
A column in a table of placenames with geospatial coordinates
*/

	@OneToMany(mappedBy = "m_customer", cascade = CascadeType.DETACH)
	private Set<Theorder> m_theorders = new HashSet();

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id"
		, nullable = false
		, length=10
		, precision=10
		, scale=0
	)
	private java.lang.Integer m_id;

	@NotNull
	@Column(name = "firstname"
		, nullable = false
		, length=40
		, precision=40
		, scale=0
	)
	private java.lang.String m_firstname;

	@NotNull
	@Column(name = "lastname"
		, nullable = false
		, length=40
		, precision=40
		, scale=0
	)
	private java.lang.String m_lastname;

	@Column(name = "city"
		, length=40
		, precision=40
		, scale=0
	)
	private java.lang.String m_city;

	@Column(name = "country"
		, length=40
		, precision=40
		, scale=0
	)
	private java.lang.String m_country;

	@Column(name = "phone"
		, length=20
		, precision=20
		, scale=0
	)
	private java.lang.String m_phone;

	public java.lang.Integer getId()
	{
		return m_id;
	}
	public void setId(java.lang.Integer v_id)
	{
		m_id=v_id;
	}
	public Set<Theorder> getTheorders()
	{
		return m_theorders;
	}
	public void setTheorders(Set<Theorder> v_theorders)
	{
		m_theorders=v_theorders;
	}
	public java.lang.String getFirstname()
	{
		return m_firstname;
	}
	public void setFirstname(java.lang.String v_firstname)
	{
		m_firstname=v_firstname;
	}
	public java.lang.String getLastname()
	{
		return m_lastname;
	}
	public void setLastname(java.lang.String v_lastname)
	{
		m_lastname=v_lastname;
	}
	public java.lang.String getCity()
	{
		return m_city;
	}
	public void setCity(java.lang.String v_city)
	{
		m_city=v_city;
	}
	public java.lang.String getCountry()
	{
		return m_country;
	}
	public void setCountry(java.lang.String v_country)
	{
		m_country=v_country;
	}
	public java.lang.String getPhone()
	{
		return m_phone;
	}
	public void setPhone(java.lang.String v_phone)
	{
		m_phone=v_phone;
	}

}
