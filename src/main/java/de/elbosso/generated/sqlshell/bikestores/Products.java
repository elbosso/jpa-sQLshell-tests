package de.elbosso.generated.sqlshell.bikestores;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "products"
/*	,indexes = {
		@Index(name= "PK__products__47027DF5B8715209", columnList="product_id")
	}*/
)
public class Products
{

	@ManyToMany(mappedBy = "m_productss")
	private Set<Orders> m_orderss = new HashSet();

	@ManyToMany(mappedBy = "m_productss")
	private Set<Stores> m_storess = new HashSet();

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
	private java.lang.Integer m_product_id;

	@NotNull
	@Column(name = "product_name"
		, nullable = false
		, length=255
		, precision=255
		, scale=0
	)
	private java.lang.String m_product_name;

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
	private java.lang.Short m_model_year;

	@NotNull
	@Column(name = "list_price"
		, nullable = false
		, length=10
		, precision=10
		, scale=2
	)
	private java.math.BigDecimal m_list_price;

	public java.lang.Integer getProduct_id()
	{
		return m_product_id;
	}
	public void setProduct_id(java.lang.Integer v_product_id)
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
	public java.lang.String getProduct_name()
	{
		return m_product_name;
	}
	public void setProduct_name(java.lang.String v_product_name)
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
	public java.lang.Short getModel_year()
	{
		return m_model_year;
	}
	public void setModel_year(java.lang.Short v_model_year)
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

	public Set<Orders> getOrderss()
	{
		return m_orderss;
	}
	public void setOrderss(Set<Orders> v_orderss)
	{
		m_orderss=v_orderss;
	}
	public Set<Stores> getStoress()
	{
		return m_storess;
	}
	public void setStoress(Set<Stores> v_storess)
	{
		m_storess=v_storess;
	}
}