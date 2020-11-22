package de.elbosso.generated.sqlshell.bikestores;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "stores"
/*	,indexes = {
		@Index(name= "PK__stores__A2F2A30C60D3CA92", columnList="store_id")
	}*/
)
public class Stores
{

	@ManyToMany
	@JoinTable(
	  name = "orders",
	  joinColumns = @JoinColumn(name = "store_id"),
	  inverseJoinColumns = @JoinColumn(name = "staff_id"))
	private Set<Staffs> m_staffss = new HashSet();

	@ManyToMany
	@JoinTable(
	  name = "staffs",
	  joinColumns = @JoinColumn(name = "store_id"),
	  inverseJoinColumns = @JoinColumn(name = "manager_id"))
	private Set<Staffs> m_staffss = new HashSet();

	@ManyToMany
	@JoinTable(
	  name = "stocks",
	  joinColumns = @JoinColumn(name = "store_id"),
	  inverseJoinColumns = @JoinColumn(name = "product_id"))
	private Set<Products> m_productss = new HashSet();

	@ManyToMany(mappedBy = "m_storess")
	private Set<Customers> m_customerss = new HashSet();

	@OneToMany(mappedBy = "m_stores", cascade = CascadeType.DETACH)
	private Set<Stocks> m_stockss = new HashSet();

	@OneToMany(mappedBy = "m_stores", cascade = CascadeType.DETACH)
	private Set<Orders> m_orderss = new HashSet();

	@OneToMany(mappedBy = "m_stores", cascade = CascadeType.DETACH)
	private Set<Staffs> m_staffss = new HashSet();

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "store_id"
		, nullable = false
		, length=10
		, precision=10
		, scale=0
	)
	private java.lang.Integer m_store_id;

	@NotNull
	@Column(name = "store_name"
		, nullable = false
		, length=255
		, precision=255
		, scale=0
	)
	private java.lang.String m_store_name;

	@Column(name = "phone"
		, length=25
		, precision=25
		, scale=0
	)
	private java.lang.String m_phone;

	@Column(name = "email"
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
		, length=255
		, precision=255
		, scale=0
	)
	private java.lang.String m_city;

	@Column(name = "state"
		, length=10
		, precision=10
		, scale=0
	)
	private java.lang.String m_state;

	@Column(name = "zip_code"
		, length=5
		, precision=5
		, scale=0
	)
	private java.lang.String m_zip_code;

	public java.lang.Integer getStore_id()
	{
		return m_store_id;
	}
	public void setStore_id(java.lang.Integer v_store_id)
	{
		m_store_id=v_store_id;
	}
	public Set<Stocks> getStockss()
	{
		return m_stockss;
	}
	public void setStockss(Set<Stocks> v_stockss)
	{
		m_stockss=v_stockss;
	}
	public Set<Orders> getOrderss()
	{
		return m_orderss;
	}
	public void setOrderss(Set<Orders> v_orderss)
	{
		m_orderss=v_orderss;
	}
	public Set<Staffs> getStaffss()
	{
		return m_staffss;
	}
	public void setStaffss(Set<Staffs> v_staffss)
	{
		m_staffss=v_staffss;
	}
	public java.lang.String getStore_name()
	{
		return m_store_name;
	}
	public void setStore_name(java.lang.String v_store_name)
	{
		m_store_name=v_store_name;
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

	public Set<Staffs> getStaffss()
	{
		return m_staffss;
	}
	public void setStaffss(Set<Staffs> v_staffss)
	{
		m_staffss=v_staffss;
	}
	public Set<Staffs> getStaffss()
	{
		return m_staffss;
	}
	public void setStaffss(Set<Staffs> v_staffss)
	{
		m_staffss=v_staffss;
	}
	public Set<Products> getProductss()
	{
		return m_productss;
	}
	public void setProductss(Set<Products> v_productss)
	{
		m_productss=v_productss;
	}
	public Set<Customers> getCustomerss()
	{
		return m_customerss;
	}
	public void setCustomerss(Set<Customers> v_customerss)
	{
		m_customerss=v_customerss;
	}
}