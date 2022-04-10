package de.elbosso.generated.sqlshell;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "orderitem"
/*	,indexes = {
		@Index(name= "indexorderitemorderid", columnList="orderid")
		@Index(name= "indexorderitemproductid", columnList="productid")
		@Index(name= "pk_orderitem", columnList="id")
	}*/
)
public class Orderitem
{
	//in case there is no @Id annotation - just uncomment the following three lines!
	//@Id
	//@Column(name="ROWID")
	//private String rowid_id;

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
	private Integer m_orderitem_id;

	@ManyToOne
	@JoinColumn(name = "orderid"
				, referencedColumnName = "id"
,foreignKey=@ForeignKey(name="fk_orderite_reference_order"
				, value=ConstraintMode.CONSTRAINT)	)
	private Theorder m_orderitem_theorder;


	@ManyToOne
	@JoinColumn(name = "productid"
				, referencedColumnName = "id"
,foreignKey=@ForeignKey(name="fk_orderite_reference_product"
				, value=ConstraintMode.CONSTRAINT)	)
	private Product m_orderitem_product;


	@NotNull
	@Column(name = "unitprice"
		, nullable = false
		, length=12
		, precision=12
		, scale=2
	)
	private java.math.BigDecimal m_orderitem_unitprice;

	@NotNull
	@Column(name = "quantity"
		, nullable = false
		, length=10
		, precision=10
		, scale=0
	)
	private Integer m_orderitem_quantity;

//id
	public Integer getId()
	{
		return m_orderitem_id;
	}
	public void setId(Integer v_id)
	{
		m_orderitem_id=v_id;
	}
//orderid
//it is a reference
	public Theorder getTheorder()
	{
		return m_orderitem_theorder;
	}
	public void setTheorder(Theorder v_theorder)
	{
		m_orderitem_theorder=v_theorder;
	}
//productid
//it is a reference
	public Product getProduct()
	{
		return m_orderitem_product;
	}
	public void setProduct(Product v_product)
	{
		m_orderitem_product=v_product;
	}
//unitprice
	public java.math.BigDecimal getUnitprice()
	{
		return m_orderitem_unitprice;
	}
	public void setUnitprice(java.math.BigDecimal v_unitprice)
	{
		m_orderitem_unitprice=v_unitprice;
	}
//quantity
	public Integer getQuantity()
	{
		return m_orderitem_quantity;
	}
	public void setQuantity(Integer v_quantity)
	{
		m_orderitem_quantity=v_quantity;
	}

}