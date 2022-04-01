package de.elbosso.generated.sqlshell.bikestores;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

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
	  name = "stocks",
	  joinColumns = @JoinColumn(name = "store_id"),
	  inverseJoinColumns = @JoinColumn(name = "product_id"))
	private Set<Products> m_products_via_stockss = new HashSet();

	@ManyToMany
	@JoinTable(
	  name = "orders",
	  joinColumns = @JoinColumn(name = "store_id"),
	  inverseJoinColumns = @JoinColumn(name = "staff_id"))
	private Set<Staffs> m_staffs_via_orderss = new HashSet();

	@ManyToMany
	@JoinTable(
	  name = "staffs",
	  joinColumns = @JoinColumn(name = "store_id"),
	  inverseJoinColumns = @JoinColumn(name = "manager_id"))
	private Set<Staffs> m_staffs_via_staffss = new HashSet();

//customers orders customer_id store_id stores 
	@ManyToMany(mappedBy = "m_stores_via_orderss")
	private Set<Customers> m_customers_via_orderss = new HashSet();

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
	private Integer m_store_id;

	@NotNull
	@Column(name = "store_name"
		, nullable = false
		, length=255
		, precision=255
		, scale=0
	)
	private String m_store_name;

	@Column(name = "phone"
		, length=25
		, precision=25
		, scale=0
	)
	private String m_phone;

	@Column(name = "email"
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
		, length=255
		, precision=255
		, scale=0
	)
	private String m_city;

	@Column(name = "state"
		, length=10
		, precision=10
		, scale=0
	)
	private String m_state;

	@Column(name = "zip_code"
		, length=5
		, precision=5
		, scale=0
	)
	private String m_zip_code;

	public Integer getStore_id()
	{
		return m_store_id;
	}
	public void setStore_id(Integer v_store_id)
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
	public String getStore_name()
	{
		return m_store_name;
	}
	public void setStore_name(String v_store_name)
	{
		m_store_name=v_store_name;
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

	public Set<Products> getProducts_via_stockss()
	{
		return m_products_via_stockss;
	}
	public void setProducts_via_stockss(Set<Products> v_productss)
	{
		m_products_via_stockss=v_productss;
	}
	public Set<Staffs> getStaffs_via_orderss()
	{
		return m_staffs_via_orderss;
	}
	public void setStaffs_via_orderss(Set<Staffs> v_staffss)
	{
		m_staffs_via_orderss=v_staffss;
	}
	public Set<Staffs> getStaffs_via_staffss()
	{
		return m_staffs_via_staffss;
	}
	public void setStaffs_via_staffss(Set<Staffs> v_staffss)
	{
		m_staffs_via_staffss=v_staffss;
	}
	public Set<Customers> getCustomers_via_orderss()
	{
		return m_customers_via_orderss;
	}
	public void setCustomers_via_orderss(Set<Customers> v_customerss)
	{
		m_customers_via_orderss=v_customerss;
	}
}
