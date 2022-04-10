package de.elbosso.generated.sqlshell;

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
	//in case there is no @Id annotation - just uncomment the following three lines!
	//@Id
	//@Column(name="ROWID")
	//private String rowid_id;

	@OneToMany(mappedBy = "m_orderitem_theorder", cascade = CascadeType.DETACH)
	private Set<Orderitem> m_theorder_orderitems = new HashSet();

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
	private Integer m_theorder_id;

	@NotNull
	@Column(name = "orderdate"
		, nullable = false
		, length=29
		, precision=29
		, scale=6
	)
	private java.sql.Timestamp m_theorder_orderdate;

	@Column(name = "ordernumber"
		, length=10
		, precision=10
		, scale=0
	)
	private String m_theorder_ordernumber;

	@ManyToOne
	@JoinColumn(name = "customerid"
				, referencedColumnName = "id"
,foreignKey=@ForeignKey(name="fk_order_reference_customer"
				, value=ConstraintMode.CONSTRAINT)	)
	private Customer m_theorder_customer;


	@Column(name = "totalamount"
		, length=12
		, precision=12
		, scale=2
	)
	private java.math.BigDecimal m_theorder_totalamount;

//id
	public Integer getId()
	{
		return m_theorder_id;
	}
	public void setId(Integer v_id)
	{
		m_theorder_id=v_id;
	}
//it is an export
	public Set<Orderitem> getOrderitems()
	{
		return m_theorder_orderitems;
	}
	public void setOrderitems(Set<Orderitem> v_orderitems)
	{
		m_theorder_orderitems=v_orderitems;
	}
//orderdate
	public java.sql.Timestamp getOrderdate()
	{
		return m_theorder_orderdate;
	}
	public void setOrderdate(java.sql.Timestamp v_orderdate)
	{
		m_theorder_orderdate=v_orderdate;
	}
//ordernumber
	public String getOrdernumber()
	{
		return m_theorder_ordernumber;
	}
	public void setOrdernumber(String v_ordernumber)
	{
		m_theorder_ordernumber=v_ordernumber;
	}
//customerid
//it is a reference
	public Customer getCustomer()
	{
		return m_theorder_customer;
	}
	public void setCustomer(Customer v_customer)
	{
		m_theorder_customer=v_customer;
	}
//totalamount
	public java.math.BigDecimal getTotalamount()
	{
		return m_theorder_totalamount;
	}
	public void setTotalamount(java.math.BigDecimal v_totalamount)
	{
		m_theorder_totalamount=v_totalamount;
	}

//public Set<Product> getProduct_via_orderitems()
}