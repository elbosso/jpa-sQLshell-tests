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
	private Integer m_product_id;

	@NotNull
	@Column(name = "productname"
		, nullable = false
		, length=50
		, precision=50
		, scale=0
	)
	private String m_product_productname;

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
	private String m_product_package;

	@NotNull
	@Column(name = "isdiscontinued"
		, nullable = false
		, length=1
		, precision=1
		, scale=0
	)
	private Boolean m_product_isdiscontinued;

//id
	public Integer getId()
	{
		return m_product_id;
	}
	public void setId(Integer v_id)
	{
		m_product_id=v_id;
	}
//it is an export
	public Set<Orderitem> getOrderitems()
	{
		return m_product_orderitems;
	}
	public void setOrderitems(Set<Orderitem> v_orderitems)
	{
		m_product_orderitems=v_orderitems;
	}
//productname
	public String getProductname()
	{
		return m_product_productname;
	}
	public void setProductname(String v_productname)
	{
		m_product_productname=v_productname;
	}
//supplierid
//it is a reference
	public Supplier getSupplier()
	{
		return m_product_supplier;
	}
	public void setSupplier(Supplier v_supplier)
	{
		m_product_supplier=v_supplier;
	}
//unitprice
	public java.math.BigDecimal getUnitprice()
	{
		return m_product_unitprice;
	}
	public void setUnitprice(java.math.BigDecimal v_unitprice)
	{
		m_product_unitprice=v_unitprice;
	}
//package
	public String getPackage()
	{
		return m_product_package;
	}
	public void setPackage(String v_package)
	{
		m_product_package=v_package;
	}
//isdiscontinued
	public Boolean getIsdiscontinued()
	{
		return m_product_isdiscontinued;
	}
	public void setIsdiscontinued(Boolean v_isdiscontinued)
	{
		m_product_isdiscontinued=v_isdiscontinued;
	}

//public Set<Theorder> getTheorder_via_orderitems()
}