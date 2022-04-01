package de.elbosso.generated.sqlshell.bikestores;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "products"
/*	,indexes = {
		@Index(name= "PK__products__47027DF5B8715209", columnList="product_id")
	}*/
)
public class Products
{

//stores stocks store_id product_id products 
	@ManyToMany(mappedBy = "m_products_via_stockss")
	private Set<Stores> m_stores_via_stockss = new HashSet();

//orders order_items order_id product_id products 
	@ManyToMany(mappedBy = "m_products_via_order_itemss")
	private Set<Orders> m_orders_via_order_itemss = new HashSet();

	@OneToMany(mappedBy = "m_products", cascade = CascadeType.DETACH)
	private Set<Stocks> m_stockss = new HashSet();

	@OneToMany(mappedBy = "m_products", cascade = CascadeType.DETACH)
	private Set<Order_items> m_order_itemss = new HashSet();

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id"
		, nullable = false
		, length=10
		, precision=10
		, scale=0
	)
	private Integer m_product_id;

	@NotNull
	@Column(name = "product_name"
		, nullable = false
		, length=255
		, precision=255
		, scale=0
	)
	private String m_product_name;

	@ManyToOne
	@JoinColumn(name = "brand_id", referencedColumnName = "brand_id",foreignKey=@ForeignKey(name="FK__products__brand___3B75D760", value=ConstraintMode.CONSTRAINT))
	private Brands m_brands;


	@ManyToOne
	@JoinColumn(name = "category_id", referencedColumnName = "category_id",foreignKey=@ForeignKey(name="FK__products__catego__3A81B327", value=ConstraintMode.CONSTRAINT))
	private Categories m_categories;


	@NotNull
	@Column(name = "model_year"
		, nullable = false
		, length=5
		, precision=5
		, scale=0
	)
	private Short m_model_year;

	@NotNull
	@Column(name = "list_price"
		, nullable = false
		, length=10
		, precision=10
		, scale=2
	)
	private java.math.BigDecimal m_list_price;

	public Integer getProduct_id()
	{
		return m_product_id;
	}
	public void setProduct_id(Integer v_product_id)
	{
		m_product_id=v_product_id;
	}
	public Set<Stocks> getStockss()
	{
		return m_stockss;
	}
	public void setStockss(Set<Stocks> v_stockss)
	{
		m_stockss=v_stockss;
	}
	public Set<Order_items> getOrder_itemss()
	{
		return m_order_itemss;
	}
	public void setOrder_itemss(Set<Order_items> v_order_itemss)
	{
		m_order_itemss=v_order_itemss;
	}
	public String getProduct_name()
	{
		return m_product_name;
	}
	public void setProduct_name(String v_product_name)
	{
		m_product_name=v_product_name;
	}
	public Brands getBrands()
	{
		return m_brands;
	}
	public void setBrands(Brands v_brands)
	{
		m_brands=v_brands;
	}
	public Categories getCategories()
	{
		return m_categories;
	}
	public void setCategories(Categories v_categories)
	{
		m_categories=v_categories;
	}
	public Short getModel_year()
	{
		return m_model_year;
	}
	public void setModel_year(Short v_model_year)
	{
		m_model_year=v_model_year;
	}
	public java.math.BigDecimal getList_price()
	{
		return m_list_price;
	}
	public void setList_price(java.math.BigDecimal v_list_price)
	{
		m_list_price=v_list_price;
	}

	public Set<Stores> getStores_via_stockss()
	{
		return m_stores_via_stockss;
	}
	public void setStores_via_stockss(Set<Stores> v_storess)
	{
		m_stores_via_stockss=v_storess;
	}
	public Set<Orders> getOrders_via_order_itemss()
	{
		return m_orders_via_order_itemss;
	}
	public void setOrders_via_order_itemss(Set<Orders> v_orderss)
	{
		m_orders_via_order_itemss=v_orderss;
	}
}
