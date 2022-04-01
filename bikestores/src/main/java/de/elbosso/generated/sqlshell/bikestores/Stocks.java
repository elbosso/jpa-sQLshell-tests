package de.elbosso.generated.sqlshell.bikestores;

import javax.persistence.*;

@Entity
@Table(name = "stocks"
/*	,indexes = {
		@Index(name= "PK__stocks__E68284D370D082C9", columnList="store_idproduct_id")
	}*/
)
public class Stocks
{

	@ManyToOne
	@JoinColumn(name = "store_id", referencedColumnName = "store_id",foreignKey=@ForeignKey(name="FK__stocks__store_id__5070F446", value=ConstraintMode.CONSTRAINT))
	private Stores m_stores;


	@ManyToOne
	@JoinColumn(name = "product_id", referencedColumnName = "product_id",foreignKey=@ForeignKey(name="FK__stocks__product___5165187F", value=ConstraintMode.CONSTRAINT))
	private Products m_products;


	@Column(name = "quantity"
		, length=10
		, precision=10
		, scale=0
	)
	private Integer m_quantity;

	public Stores getStores()
	{
		return m_stores;
	}
	public void setStores(Stores v_stores)
	{
		m_stores=v_stores;
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

}
