package de.elbosso.generated.sqlshell.bikestores;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "order_items"
/*	,indexes = {
		@Index(name= "PK__order_it__837942D442DCFA4C", columnList="order_iditem_id")
	}*/
)
public class Order_items
{

	@ManyToOne
	@JoinColumn(name = "order_id", referencedColumnName = "order_id",foreignKey=@ForeignKey(name="FK__order_ite__order__4CA06362", value=ConstraintMode.CONSTRAINT))
	private Orders m_orders;


	@Id
	@NotNull
	@Column(name = "item_id"
		, nullable = false
		, length=10
		, precision=10
		, scale=0
	)
	private Integer m_item_id;

	@ManyToOne
	@JoinColumn(name = "product_id", referencedColumnName = "product_id",foreignKey=@ForeignKey(name="FK__order_ite__produ__4D94879B", value=ConstraintMode.CONSTRAINT))
	private Products m_products;


	@NotNull
	@Column(name = "quantity"
		, nullable = false
		, length=10
		, precision=10
		, scale=0
	)
	private Integer m_quantity;

	@NotNull
	@Column(name = "list_price"
		, nullable = false
		, length=10
		, precision=10
		, scale=2
	)
	private java.math.BigDecimal m_list_price;

	@NotNull
	@Column(name = "discount"
		, nullable = false
		, length=4
		, precision=4
		, scale=2
	)
	private java.math.BigDecimal m_discount;

	public Orders getOrders()
	{
		return m_orders;
	}
	public void setOrders(Orders v_orders)
	{
		m_orders=v_orders;
	}
	public Integer getItem_id()
	{
		return m_item_id;
	}
	public void setItem_id(Integer v_item_id)
	{
		m_item_id=v_item_id;
	}
	public Products getProducts()
	{
		return m_products;
	}
	public void setProducts(Products v_products)
	{
		m_products=v_products;
	}
	public Integer getQuantity()
	{
		return m_quantity;
	}
	public void setQuantity(Integer v_quantity)
	{
		m_quantity=v_quantity;
	}
	public java.math.BigDecimal getList_price()
	{
		return m_list_price;
	}
	public void setList_price(java.math.BigDecimal v_list_price)
	{
		m_list_price=v_list_price;
	}
	public java.math.BigDecimal getDiscount()
	{
		return m_discount;
	}
	public void setDiscount(java.math.BigDecimal v_discount)
	{
		m_discount=v_discount;
	}

}
