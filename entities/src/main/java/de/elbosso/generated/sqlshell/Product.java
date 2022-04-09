package de.elbosso.generated.sqlshell;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "product"
/*	,indexes = {
		@Index(name= "indexproductname", columnList="productname")
		@Index(name= "pk_product", columnList="id")
		@Index(name= "indexproductsupplierid", columnList="supplierid")
	}*/
)
public class Product
{
	//in case there is no @Id annotation - just uncomment the following three lines!
	//@Id
	//@Column(name="ROWID")
	//private String rowid_id;

	@ManyToMany(mappedBy = "m_product_via_orderitems")
	private Set<Theorder> m_theorder_via_orderitems = new HashSet();

	@OneToMany(mappedBy = "m_orderitem_product", cascade = CascadeType.DETACH)
	private Set<Orderitem> m_product_orderitems = new HashSet();

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
	private java.lang.Integer m_product_id;

	@NotNull
	@Column(name = "productname"
		, nullable = false
		, length=50
		, precision=50
		, scale=0
	)
	private java.lang.String m_product_productname;

	@ManyToOne
	@JoinColumn(name = "supplierid"
				, referencedColumnName = "id"
,foreignKey=@ForeignKey(name="fk_product_reference_supplier"
				, value=ConstraintMode.CONSTRAINT)	)
	private Supplier m_product_supplier;


	@Column(name = "unitprice"
		, length=12
		, precision=12
		, scale=2
	)
	private java.math.BigDecimal m_product_unitprice;

	@Column(name = "package"
		, length=30
		, precision=30
		, scale=0
	)
	private java.lang.String m_product_package;

	@NotNull
	@Column(name = "isdiscontinued"
		, nullable = false
		, length=1
		, precision=1
		, scale=0
	)
	private java.lang.Boolean m_product_isdiscontinued;

	public java.lang.Integer getId()
	{
		return m_product_id;
	}
	public void setId(java.lang.Integer v_id)
	{
		m_product_id=v_id;
	}
	public Set<Orderitem> getOrderitems()
	{
		return m_product_orderitems;
	}
	public void setOrderitems(Set<Orderitem> v_orderitems)
	{
		m_product_orderitems=v_orderitems;
	}
	public java.lang.String getProductname()
	{
		return m_product_productname;
	}
	public void setProductname(java.lang.String v_productname)
	{
		m_product_productname=v_productname;
	}
	public Supplier getSupplier()
	{
		return m_product_supplier;
	}
	public void setSupplier(Supplier v_supplier)
	{
		m_product_supplier=v_supplier;
	}
	public java.math.BigDecimal getUnitprice()
	{
		return m_product_unitprice;
	}
	public void setUnitprice(java.math.BigDecimal v_unitprice)
	{
		m_product_unitprice=v_unitprice;
	}
	public java.lang.String getPackage()
	{
		return m_product_package;
	}
	public void setPackage(java.lang.String v_package)
	{
		m_product_package=v_package;
	}
	public java.lang.Boolean getIsdiscontinued()
	{
		return m_product_isdiscontinued;
	}
	public void setIsdiscontinued(java.lang.Boolean v_isdiscontinued)
	{
		m_product_isdiscontinued=v_isdiscontinued;
	}

	public Set<Theorder> getTheorder_via_orderitems()
	{
		return m_theorder_via_orderitems;
	}
	public void setTheorder_via_orderitems(Set<Theorder> v_theorders)
	{
		m_theorder_via_orderitems=v_theorders;
	}
}