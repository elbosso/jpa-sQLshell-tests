package de.elbosso.generated.sqlshell.bikestores;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

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
	private Set<Stores> m_stores_via_orderss = new HashSet();

	@ManyToMany
	@JoinTable(
	  name = "orders",
	  joinColumns = @JoinColumn(name = "customer_id"),
	  inverseJoinColumns = @JoinColumn(name = "staff_id"))
	private Set<Staffs> m_staffs_via_orderss = new HashSet();

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
	private Integer m_customer_id;

	@NotNull
	@Column(name = "first_name"
		, nullable = false
		, length=255
		, precision=255
		, scale=0
	)
	private String m_first_name;

	@NotNull
	@Column(name = "last_name"
		, nullable = false
		, length=255
		, precision=255
		, scale=0
	)
	private String m_last_name;

	@Column(name = "phone"
		, length=25
		, precision=25
		, scale=0
	)
	private String m_phone;

	@NotNull
	@Column(name = "email"
		, nullable = false
		, length=255
		, precision=255
		, scale=0
	)
	private String m_email;

	@Column(name = "street"
		, length=255
		, precision=255
		, scale=0
	)
	private String m_street;

	@Column(name = "city"
		, length=50
		, precision=50
		, scale=0
	)
	private String m_city;

	@Column(name = "state"
		, length=25
		, precision=25
		, scale=0
	)
	private String m_state;

	@Column(name = "zip_code"
		, length=5
		, precision=5
		, scale=0
	)
	private String m_zip_code;

	public Integer getCustomer_id()
	{
		return m_customer_id;
	}
	public void setCustomer_id(Integer v_customer_id)
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
	public String getFirst_name()
	{
		return m_first_name;
	}
	public void setFirst_name(String v_first_name)
	{
		m_first_name=v_first_name;
	}
	public String getLast_name()
	{
		return m_last_name;
	}
	public void setLast_name(String v_last_name)
	{
		m_last_name=v_last_name;
	}
	public String getPhone()
	{
		return m_phone;
	}
	public void setPhone(String v_phone)
	{
		m_phone=v_phone;
	}
	public String getEmail()
	{
		return m_email;
	}
	public void setEmail(String v_email)
	{
		m_email=v_email;
	}
	public String getStreet()
	{
		return m_street;
	}
	public void setStreet(String v_street)
	{
		m_street=v_street;
	}
	public String getCity()
	{
		return m_city;
	}
	public void setCity(String v_city)
	{
		m_city=v_city;
	}
	public String getState()
	{
		return m_state;
	}
	public void setState(String v_state)
	{
		m_state=v_state;
	}
	public String getZip_code()
	{
		return m_zip_code;
	}
	public void setZip_code(String v_zip_code)
	{
		m_zip_code=v_zip_code;
	}

	public Set<Stores> getStores_via_orderss()
	{
		return m_stores_via_orderss;
	}
	public void setStores_via_orderss(Set<Stores> v_storess)
	{
		m_stores_via_orderss=v_storess;
	}
	public Set<Staffs> getStaffs_via_orderss()
	{
		return m_staffs_via_orderss;
	}
	public void setStaffs_via_orderss(Set<Staffs> v_staffss)
	{
		m_staffs_via_orderss=v_staffss;
	}
}
