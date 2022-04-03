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

	@ManyToMany(mappedBy = "m_product_via_orderitems")
	private Set<Theorder> m_theorder_via_orderitems = new HashSet();

	@OneToMany(mappedBy = "m_product", cascade = CascadeType.DETACH)
	private Set<Orderitem> m_orderitems = new HashSet();

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
	private Integer m_id;

	@NotNull
	@Column(name = "productname"
		, nullable = false
		, length=50
		, precision=50
		, scale=0
	)
	private String m_productname;

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
	private String m_package;

	@NotNull
	@Column(name = "isdiscontinued"
		, nullable = false
		, length=1
		, precision=1
		, scale=0
	)
	private Boolean m_isdiscontinued;

	public Integer getId()
	{
		return m_id;
	}
	public void setId(Integer v_id)
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
	public String getProductname()
	{
		return m_productname;
	}
	public void setProductname(String v_productname)
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
	public String getPackage()
	{
		return m_package;
	}
	public void setPackage(String v_package)
	{
		m_package=v_package;
	}
	public Boolean getIsdiscontinued()
	{
		return m_isdiscontinued;
	}
	public void setIsdiscontinued(Boolean v_isdiscontinued)
	{
		m_isdiscontinued=v_isdiscontinued;
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