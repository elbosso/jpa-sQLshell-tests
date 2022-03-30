package de.elbosso.generated.sqlshell.entities;

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

	@ManyToMany(mappedBy = "m_products",fetch = FetchType.LAZY)
	private Set<Theorder> m_theorders = new HashSet();

	@OneToMany(mappedBy = "m_product", cascade = CascadeType.DETACH,fetch = FetchType.LAZY)
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
	@Column(name = "productname"
		, nullable = false
		, length=50
		, precision=50
		, scale=0
	)
	private java.lang.String m_productname;

	@ManyToOne
	@JoinColumn(name = "supplierid", referencedColumnName = "id",foreignKey=@ForeignKey(name="fk_product_reference_supplier", value=ConstraintMode.CONSTRAINT))
	private Supplier m_supplier;


	@Column(name = "unitprice"
		, length=12
		, precision=12
		, scale=2
	)
	private java.math.BigDecimal m_unitprice;

	@Column(name = "package"
		, length=30
		, precision=30
		, scale=0
	)
	private java.lang.String m_package;

	@NotNull
	@Column(name = "isdiscontinued"
		, nullable = false
		, length=1
		, precision=1
		, scale=0
	)
	private java.lang.Boolean m_isdiscontinued;

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
	public java.lang.String getProductname()
	{
		return m_productname;
	}
	public void setProductname(java.lang.String v_productname)
	{
		m_productname=v_productname;
	}
	public Supplier getSupplier()
	{
		return m_supplier;
	}
	public void setSupplier(Supplier v_supplier)
	{
		m_supplier=v_supplier;
	}
	public java.math.BigDecimal getUnitprice()
	{
		return m_unitprice;
	}
	public void setUnitprice(java.math.BigDecimal v_unitprice)
	{
		m_unitprice=v_unitprice;
	}
	public java.lang.String getPackage()
	{
		return m_package;
	}
	public void setPackage(java.lang.String v_package)
	{
		m_package=v_package;
	}
	public java.lang.Boolean getIsdiscontinued()
	{
		return m_isdiscontinued;
	}
	public void setIsdiscontinued(java.lang.Boolean v_isdiscontinued)
	{
		m_isdiscontinued=v_isdiscontinued;
	}

	public Set<Theorder> getTheorders()
	{
		return m_theorders;
	}
	public void setTheorders(Set<Theorder> v_theorders)
	{
		m_theorders=v_theorders;
	}
}
