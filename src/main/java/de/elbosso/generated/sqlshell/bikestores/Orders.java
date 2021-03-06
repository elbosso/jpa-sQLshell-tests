package de.elbosso.generated.sqlshell.bikestores;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orders"
/*	,indexes = {
		@Index(name= "PK__orders__46596229555AEC44", columnList="order_id")
	}*/
)
public class Orders
{

	@ManyToMany
	@JoinTable(
	  name = "order_items",
	  joinColumns = @JoinColumn(name = "order_id"),
	  inverseJoinColumns = @JoinColumn(name = "product_id"))
	private Set<Products> m_products_via_order_itemss = new HashSet();

	@OneToMany(mappedBy = "m_orders", cascade = CascadeType.DETACH)
	private Set<Order_items> m_order_itemss = new HashSet();

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id"
		, nullable = false
		, length=10
		, precision=10
		, scale=0
	)
	private Integer m_order_id;

	@ManyToOne
	@JoinColumn(name = "customer_id", referencedColumnName = "customer_id",foreignKey=@ForeignKey(name="FK__orders__customer__46E78A0C", value=ConstraintMode.CONSTRAINT))
	private Customers m_customers;


	@NotNull
	@Column(name = "order_status"
		, nullable = false
		, length=3
		, precision=3
		, scale=0
	)
	private Byte m_order_status;

	@NotNull
	@Column(name = "order_date"
		, nullable = false
		, length=10
		, precision=10
		, scale=0
	)
	private String m_order_date;

	@NotNull
	@Column(name = "required_date"
		, nullable = false
		, length=10
		, precision=10
		, scale=0
	)
	private String m_required_date;

	@Column(name = "shipped_date"
		, length=10
		, precision=10
		, scale=0
	)
	private String m_shipped_date;

	@ManyToOne
	@JoinColumn(name = "store_id", referencedColumnName = "store_id",foreignKey=@ForeignKey(name="FK__orders__store_id__47DBAE45", value=ConstraintMode.CONSTRAINT))
	private Stores m_stores;


	@ManyToOne
	@JoinColumn(name = "staff_id", referencedColumnName = "staff_id",foreignKey=@ForeignKey(name="FK__orders__staff_id__48CFD27E", value=ConstraintMode.CONSTRAINT))
	private Staffs m_staffs;


	public Integer getOrder_id()
	{
		return m_order_id;
	}
	public void setOrder_id(Integer v_order_id)
	{
		m_order_id=v_order_id;
	}
	public Set<Order_items> getOrder_itemss()
	{
		return m_order_itemss;
	}
	public void setOrder_itemss(Set<Order_items> v_order_itemss)
	{
		m_order_itemss=v_order_itemss;
	}
	public Customers getCustomers()
	{
		return m_customers;
	}
	public void setCustomers(Customers v_customers)
	{
		m_customers=v_customers;
	}
	public Byte getOrder_status()
	{
		return m_order_status;
	}
	public void setOrder_status(Byte v_order_status)
	{
		m_order_status=v_order_status;
	}
	public String getOrder_date()
	{
		return m_order_date;
	}
	public void setOrder_date(String v_order_date)
	{
		m_order_date=v_order_date;
	}
	public String getRequired_date()
	{
		return m_required_date;
	}
	public void setRequired_date(String v_required_date)
	{
		m_required_date=v_required_date;
	}
	public String getShipped_date()
	{
		return m_shipped_date;
	}
	public void setShipped_date(String v_shipped_date)
	{
		m_shipped_date=v_shipped_date;
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

	public Set<Products> getProducts_via_order_itemss()
	{
		return m_products_via_order_itemss;
	}
	public void setProducts_via_order_itemss(Set<Products> v_productss)
	{
		m_products_via_order_itemss=v_productss;
	}
}
