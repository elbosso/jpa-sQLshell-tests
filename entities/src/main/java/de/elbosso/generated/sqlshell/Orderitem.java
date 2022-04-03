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

	@ManyToOne
	@JoinColumn(name = "orderid", referencedColumnName = "id",foreignKey=@ForeignKey(name="fk_orderite_reference_order", value=ConstraintMode.CONSTRAINT))
	private Theorder m_theorder;


	@ManyToOne
	@JoinColumn(name = "productid", referencedColumnName = "id",foreignKey=@ForeignKey(name="fk_orderite_reference_product", value=ConstraintMode.CONSTRAINT))
	private Product m_product;


	@NotNull
	@Column(name = "unitprice"
		, nullable = false
		, length=12
		, precision=12
		, scale=2
	)
	private java.math.BigDecimal m_unitprice;

	@NotNull
	@Column(name = "quantity"
		, nullable = false
		, length=10
		, precision=10
		, scale=0
	)
	private Integer m_quantity;

	public Integer getId()
	{
		return m_id;
	}
	public void setId(Integer v_id)
	{
		m_id=v_id;
	}
	public Theorder getTheorder()
	{
		return m_theorder;
	}
	public void setTheorder(Theorder v_theorder)
	{
		m_theorder=v_theorder;
	}
	public Product getProduct()
	{
		return m_product;
	}
	public void setProduct(Product v_product)
	{
		m_product=v_product;
	}
	public java.math.BigDecimal getUnitprice()
	{
		return m_unitprice;
	}
	public void setUnitprice(java.math.BigDecimal v_unitprice)
	{
		m_unitprice=v_unitprice;
	}
	public Integer getQuantity()
	{
		return m_quantity;
	}
	public void setQuantity(Integer v_quantity)
	{
		m_quantity=v_quantity;
	}

}