package de.elbosso.generated.sqlshell.bikestores;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "categories"
/*	,indexes = {
		@Index(name= "PK__categori__D54EE9B43A44FEB1", columnList="category_id")
	}*/
)
public class Categories
{

	@ManyToMany(mappedBy = "m_categoriess")
	private Set<Brands> m_brandss = new HashSet();

	@OneToMany(mappedBy = "m_categories", cascade = CascadeType.DETACH)
	private Set<Products> m_productss = new HashSet();

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "category_id"
		, nullable = false
		, length=10
		, precision=10
		, scale=0
	)
	private java.lang.Integer m_category_id;

	@NotNull
	@Column(name = "category_name"
		, nullable = false
		, length=255
		, precision=255
		, scale=0
	)
	private java.lang.String m_category_name;

	public java.lang.Integer getCategory_id()
	{
		return m_category_id;
	}
	public void setCategory_id(java.lang.Integer v_category_id)
	{
		m_category_id=v_category_id;
	}
	public Set<Products> getProductss()
	{
		return m_productss;
	}
	public void setProductss(Set<Products> v_productss)
	{
		m_productss=v_productss;
	}
	public java.lang.String getCategory_name()
	{
		return m_category_name;
	}
	public void setCategory_name(java.lang.String v_category_name)
	{
		m_category_name=v_category_name;
	}

	public Set<Brands> getBrandss()
	{
		return m_brandss;
	}
	public void setBrandss(Set<Brands> v_brandss)
	{
		m_brandss=v_brandss;
	}
}