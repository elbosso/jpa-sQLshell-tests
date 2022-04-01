package de.elbosso.generated.sqlshell.bikestores;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "staffs"
/*	,indexes = {
		@Index(name= "PK__staffs__1963DD9C4B0CEADE", columnList="staff_id")
		@Index(name= "UQ__staffs__AB6E6164B43CBD71", columnList="email")
	}*/
)
public class Staffs
{

//customers orders customer_id staff_id staffs 
	@ManyToMany(mappedBy = "m_staffs_via_orderss")
	private Set<Customers> m_customers_via_orderss = new HashSet();

//stores orders store_id staff_id staffs 
	@ManyToMany(mappedBy = "m_staffs_via_orderss")
	private Set<Stores> m_stores_via_orderss = new HashSet();

//stores staffs store_id manager_id staffs 
	@ManyToMany(mappedBy = "m_staffs_via_staffss")
	private Set<Stores> m_stores_via_staffss = new HashSet();

	@OneToMany(mappedBy = "m_staffs", cascade = CascadeType.DETACH)
	private Set<Orders> m_orderss = new HashSet();

	@OneToMany(mappedBy = "m_staffs", cascade = CascadeType.DETACH)
	private Set<Staffs> m_staffss = new HashSet();

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "staff_id"
		, nullable = false
		, length=10
		, precision=10
		, scale=0
	)
	private Integer m_staff_id;

	@NotNull
	@Column(name = "first_name"
		, nullable = false
		, length=50
		, precision=50
		, scale=0
	)
	private String m_first_name;

	@NotNull
	@Column(name = "last_name"
		, nullable = false
		, length=50
		, precision=50
		, scale=0
	)
	private String m_last_name;

	@NotNull
	@Column(name = "email"
		, nullable = false
		, length=255
		, precision=255
		, scale=0
	)
	private String m_email;

	@Column(name = "phone"
		, length=25
		, precision=25
		, scale=0
	)
	private String m_phone;

	@NotNull
	@Column(name = "active"
		, nullable = false
		, length=3
		, precision=3
		, scale=0
	)
	private Byte m_active;

	@ManyToOne
	@JoinColumn(name = "store_id", referencedColumnName = "store_id",foreignKey=@ForeignKey(name="FK__staffs__store_id__4316F928", value=ConstraintMode.CONSTRAINT))
	private Stores m_stores;


	@ManyToOne
	@JoinColumn(name = "manager_id", referencedColumnName = "staff_id",foreignKey=@ForeignKey(name="FK__staffs__manager___440B1D61", value=ConstraintMode.CONSTRAINT))
	private Staffs m_staffs;


	public Integer getStaff_id()
	{
		return m_staff_id;
	}
	public void setStaff_id(Integer v_staff_id)
	{
		m_staff_id=v_staff_id;
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
	public String getEmail()
	{
		return m_email;
	}
	public void setEmail(String v_email)
	{
		m_email=v_email;
	}
	public String getPhone()
	{
		return m_phone;
	}
	public void setPhone(String v_phone)
	{
		m_phone=v_phone;
	}
	public Byte getActive()
	{
		return m_active;
	}
	public void setActive(Byte v_active)
	{
		m_active=v_active;
	}
	public Stores getStores()
	{
		return m_stores;
	}
	public void setStores(Stores v_stores)
	{
		m_stores=v_stores;
	}
	public Staffs getStaffs()
	{
		return m_staffs;
	}
	public void setStaffs(Staffs v_staffs)
	{
		m_staffs=v_staffs;
	}

	public Set<Customers> getCustomers_via_orderss()
	{
		return m_customers_via_orderss;
	}
	public void setCustomers_via_orderss(Set<Customers> v_customerss)
	{
		m_customers_via_orderss=v_customerss;
	}
	public Set<Stores> getStores_via_orderss()
	{
		return m_stores_via_orderss;
	}
	public void setStores_via_orderss(Set<Stores> v_storess)
	{
		m_stores_via_orderss=v_storess;
	}
	public Set<Stores> getStores_via_staffss()
	{
		return m_stores_via_staffss;
	}
	public void setStores_via_staffss(Set<Stores> v_storess)
	{
		m_stores_via_staffss=v_storess;
	}
}
