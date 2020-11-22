package de.elbosso.generated.sqlshell.bikestores;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "staffs"
/*	,indexes = {
		@Index(name= "PK__staffs__1963DD9C4B0CEADE", columnList="staff_id")
		@Index(name= "UQ__staffs__AB6E6164B43CBD71", columnList="email")
	}*/
)
public class Staffs
{

	@ManyToMany(mappedBy = "m_staffss")
	private Set<Customers> m_customerss = new HashSet();

	@ManyToMany(mappedBy = "m_staffss")
	private Set<Stores> m_storess = new HashSet();

	@ManyToMany(mappedBy = "m_staffss")
	private Set<Stores> m_storess = new HashSet();

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
	private java.lang.Integer m_staff_id;

	@NotNull
	@Column(name = "first_name"
		, nullable = false
		, length=50
		, precision=50
		, scale=0
	)
	private java.lang.String m_first_name;

	@NotNull
	@Column(name = "last_name"
		, nullable = false
		, length=50
		, precision=50
		, scale=0
	)
	private java.lang.String m_last_name;

	@NotNull
	@Column(name = "email"
		, nullable = false
		, length=255
		, precision=255
		, scale=0
	)
	private java.lang.String m_email;

	@Column(name = "phone"
		, length=25
		, precision=25
		, scale=0
	)
	private java.lang.String m_phone;

	@NotNull
	@Column(name = "active"
		, nullable = false
		, length=3
		, precision=3
		, scale=0
	)
	private java.lang.Byte m_active;

	@ManyToOne
	@JoinColumn(name = "store_id", referencedColumnName = "store_id",foreignKey=@ForeignKey(name="FK__staffs__store_id__4316F928", value=ConstraintMode.CONSTRAINT))
	private Stores m_stores;


	@ManyToOne
	@JoinColumn(name = "manager_id", referencedColumnName = "staff_id",foreignKey=@ForeignKey(name="FK__staffs__manager___440B1D61", value=ConstraintMode.CONSTRAINT))
	private Staffs m_staffs;


	public java.lang.Integer getStaff_id()
	{
		return m_staff_id;
	}
	public void setStaff_id(java.lang.Integer v_staff_id)
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
	public java.lang.String getEmail()
	{
		return m_email;
	}
	public void setEmail(java.lang.String v_email)
	{
		m_email=v_email;
	}
	public java.lang.String getPhone()
	{
		return m_phone;
	}
	public void setPhone(java.lang.String v_phone)
	{
		m_phone=v_phone;
	}
	public java.lang.Byte getActive()
	{
		return m_active;
	}
	public void setActive(java.lang.Byte v_active)
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

	public Set<Customers> getCustomerss()
	{
		return m_customerss;
	}
	public void setCustomerss(Set<Customers> v_customerss)
	{
		m_customerss=v_customerss;
	}
	public Set<Stores> getStoress()
	{
		return m_storess;
	}
	public void setStoress(Set<Stores> v_storess)
	{
		m_storess=v_storess;
	}
	public Set<Stores> getStoress()
	{
		return m_storess;
	}
	public void setStoress(Set<Stores> v_storess)
	{
		m_storess=v_storess;
	}
}