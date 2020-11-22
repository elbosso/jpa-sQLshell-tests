package de.elbosso.generated.sqlshell.bikestores;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "customers"
/*	,indexes = {
		@Index(name= "PK__customer__CD65CB85486E44F3", columnList="customer_id")
	}*/
)
public class Customers
{

	@ManyToMany
	@JoinTable(
	  name = "orders",
	  joinColumns = @JoinColumn(name = "customer_id"),
	  inverseJoinColumns = @JoinColumn(name = "store_id"))
	private Set<Stores> m_storess = new HashSet();

	@ManyToMany
	@JoinTable(
	  name = "orders",
	  joinColumns = @JoinColumn(name = "customer_id"),
	  inverseJoinColumns = @JoinColumn(name = "staff_id"))
	private Set<Staffs> m_staffss = new HashSet();

	@OneToMany(mappedBy = "m_customers", cascade = CascadeType.DETACH)
	private Set<Orders> m_orderss = new HashSet();

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id"
		, nullable = false
		, length=10
		, precision=10
		, scale=0
	)
	private java.lang.Integer m_customer_id;

	@NotNull
	@Column(name = "first_name"
		, nullable = false
		, length=255
		, precision=255
		, scale=0
	)
	private java.lang.String m_first_name;

	@NotNull
	@Column(name = "last_name"
		, nullable = false
		, length=255
		, precision=255
		, scale=0
	)
	private java.lang.String m_last_name;

	@Column(name = "phone"
		, length=25
		, precision=25
		, scale=0
	)
	private java.lang.String m_phone;

	@NotNull
	@Column(name = "email"
		, nullable = false
		, length=255
		, precision=255
		, scale=0
	)
	private java.lang.String m_email;

	@Column(name = "street"
		, length=255
		, precision=255
		, scale=0
	)
	private java.lang.String m_street;

	@Column(name = "city"
		, length=50
		, precision=50
		, scale=0
	)
	private java.lang.String m_city;

	@Column(name = "state"
		, length=25
		, precision=25
		, scale=0
	)
	private java.lang.String m_state;

	@Column(name = "zip_code"
		, length=5
		, precision=5
		, scale=0
	)
	private java.lang.String m_zip_code;

	public java.lang.Integer getCustomer_id()
	{
		return m_customer_id;
	}
	public void setCustomer_id(java.lang.Integer v_customer_id)
	{
		m_customer_id=v_customer_id;
	}
	public Set<Orders> getOrderss()
	{
		return m_orderss;
	}
	public void setOrderss(Set<Orders> v_orderss)
	{
		m_orderss=v_orderss;
	}
	public java.lang.String getFirst_name()
	{
		return m_first_name;
	}
	public void setFirst_name(java.lang.String v_first_name)
	{
		m_first_name=v_first_name;
	}
	public java.lang.String getLast_name()
	{
		return m_last_name;
	}
	public void setLast_name(java.lang.String v_last_name)
	{
		m_last_name=v_last_name;
	}
	public java.lang.String getPhone()
	{
		return m_phone;
	}
	public void setPhone(java.lang.String v_phone)
	{
		m_phone=v_phone;
	}
	public java.lang.String getEmail()
	{
		return m_email;
	}
	public void setEmail(java.lang.String v_email)
	{
		m_email=v_email;
	}
	public java.lang.String getStreet()
	{
		return m_street;
	}
	public void setStreet(java.lang.String v_street)
	{
		m_street=v_street;
	}
	public java.lang.String getCity()
	{
		return m_city;
	}
	public void setCity(java.lang.String v_city)
	{
		m_city=v_city;
	}
	public java.lang.String getState()
	{
		return m_state;
	}
	public void setState(java.lang.String v_state)
	{
		m_state=v_state;
	}
	public java.lang.String getZip_code()
	{
		return m_zip_code;
	}
	public void setZip_code(java.lang.String v_zip_code)
	{
		m_zip_code=v_zip_code;
	}

	public Set<Stores> getStoress()
	{
		return m_storess;
	}
	public void setStoress(Set<Stores> v_storess)
	{
		m_storess=v_storess;
	}
	public Set<Staffs> getStaffss()
	{
		return m_staffss;
	}
	public void setStaffss(Set<Staffs> v_staffss)
	{
		m_staffss=v_staffss;
	}
}