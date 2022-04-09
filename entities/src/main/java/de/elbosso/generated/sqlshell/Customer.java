package de.elbosso.generated.sqlshell;

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
	//in case there is no @Id annotation - just uncomment the following three lines!
	//@Id
	//@Column(name="ROWID")
	//private String rowid_id;
/*
A column in a table of placenames with geospatial coordinates
*/

	@OneToMany(mappedBy = "m_theorder_customer", cascade = CascadeType.DETACH)
	private Set<Theorder> m_customer_theorders = new HashSet();

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@Column(name = "id"
		, nullable = false
		, updatable = false
		, length=10
		, precision=10
		, scale=0
	)
	private java.lang.Integer m_customer_id;

	@NotNull
	@Column(name = "firstname"
		, nullable = false
		, length=40
		, precision=40
		, scale=0
	)
	private java.lang.String m_customer_firstname;

	@NotNull
	@Column(name = "lastname"
		, nullable = false
		, length=40
		, precision=40
		, scale=0
	)
	private java.lang.String m_customer_lastname;

	@Column(name = "city"
		, length=40
		, precision=40
		, scale=0
	)
	private java.lang.String m_customer_city;

	@Column(name = "country"
		, length=40
		, precision=40
		, scale=0
	)
	private java.lang.String m_customer_country;

	@Column(name = "phone"
		, length=20
		, precision=20
		, scale=0
	)
	private java.lang.String m_customer_phone;

	public java.lang.Integer getId()
	{
		return m_customer_id;
	}
	public void setId(java.lang.Integer v_id)
	{
		m_customer_id=v_id;
	}
	public Set<Theorder> getTheorders()
	{
		return m_customer_theorders;
	}
	public void setTheorders(Set<Theorder> v_theorders)
	{
		m_customer_theorders=v_theorders;
	}
	public java.lang.String getFirstname()
	{
		return m_customer_firstname;
	}
	public void setFirstname(java.lang.String v_firstname)
	{
		m_customer_firstname=v_firstname;
	}
	public java.lang.String getLastname()
	{
		return m_customer_lastname;
	}
	public void setLastname(java.lang.String v_lastname)
	{
		m_customer_lastname=v_lastname;
	}
	public java.lang.String getCity()
	{
		return m_customer_city;
	}
	public void setCity(java.lang.String v_city)
	{
		m_customer_city=v_city;
	}
	public java.lang.String getCountry()
	{
		return m_customer_country;
	}
	public void setCountry(java.lang.String v_country)
	{
		m_customer_country=v_country;
	}
	public java.lang.String getPhone()
	{
		return m_customer_phone;
	}
	public void setPhone(java.lang.String v_phone)
	{
		m_customer_phone=v_phone;
	}

}