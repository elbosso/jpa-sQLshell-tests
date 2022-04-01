package de.elbosso.generated.sqlshell.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "theorder"
/*	,indexes = {
		@Index(name= "pk_order", columnList="id")
		@Index(name= "indexordercustomerid", columnList="customerid")
		@Index(name= "indexorderorderdate", columnList="orderdate")
	}*/
)
public class Theorder
{

	@ManyToMany
	@JoinTable(
	  name = "orderitem",
	  joinColumns = @JoinColumn(name = "orderid"),
	  inverseJoinColumns = @JoinColumn(name = "productid"))
	private Set<Product> m_products = new HashSet();

	@OneToMany(mappedBy = "m_theorder", cascade = CascadeType.DETACH)
	private Set<Orderitem> m_orderitems = new HashSet();

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
	@Column(name = "orderdate"
		, nullable = false
		, length=29
		, precision=29
		, scale=6
	)
	private java.sql.Timestamp m_orderdate;

	@Column(name = "ordernumber"
		, length=10
		, precision=10
		, scale=0
	)
	private java.lang.String m_ordernumber;

	@ManyToOne
	@JoinColumn(name = "customerid", referencedColumnName = "id",foreignKey=@ForeignKey(name="fk_order_reference_customer", value=ConstraintMode.CONSTRAINT))
	private Customer m_customer;


	@Column(name = "totalamount"
		, length=12
		, precision=12
		, scale=2
	)
	private java.math.BigDecimal m_totalamount;

	public java.lang.Integer getId()
	{
		return m_id;
	}
	public void setId(java.lang.Integer v_id)
	{
		m_id=v_id;
	}
	public Set<Orderitem> getOrderitems()
	{
		return m_orderitems;
	}
	public void setOrderitems(Set<Orderitem> v_orderitems)
	{
		m_orderitems=v_orderitems;
	}
	public java.sql.Timestamp getOrderdate()
	{
		return m_orderdate;
	}
	public void setOrderdate(java.sql.Timestamp v_orderdate)
	{
		m_orderdate=v_orderdate;
	}
	public java.lang.String getOrdernumber()
	{
		return m_ordernumber;
	}
	public void setOrdernumber(java.lang.String v_ordernumber)
	{
		m_ordernumber=v_ordernumber;
	}
	public Customer getCustomer()
	{
		return m_customer;
	}
	public void setCustomer(Customer v_customer)
	{
		m_customer=v_customer;
	}
	public java.math.BigDecimal getTotalamount()
	{
		return m_totalamount;
	}
	public void setTotalamount(java.math.BigDecimal v_totalamount)
	{
		m_totalamount=v_totalamount;
	}

	public Set<Product> getProducts()
	{
		return m_products;
	}
	public void setProducts(Set<Product> v_products)
	{
		m_products=v_products;
	}
}
