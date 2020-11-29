package de.elbosso.generated.sqlshell.bikestores;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "categories"
/*	,indexes = {
		@Index(name= "PK__categori__D54EE9B43A44FEB1", columnList="category_id")
	}*/
)
public class Categories
{

//brands products brand_id category_id categories 
	@ManyToMany(mappedBy = "m_categories_via_productss")
	private Set<Brands> m_brands_via_productss = new HashSet();

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
	private Integer m_category_id;

	@NotNull
	@Column(name = "category_name"
		, nullable = false
		, length=255
		, precision=255
		, scale=0
	)
	private String m_category_name;

	public Integer getCategory_id()
	{
		return m_category_id;
	}
	public void setCategory_id(Integer v_category_id)
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
	public String getCategory_name()
	{
		return m_category_name;
	}
	public void setCategory_name(String v_category_name)
	{
		m_category_name=v_category_name;
	}

	public Set<Brands> getBrands_via_productss()
	{
		return m_brands_via_productss;
	}
	public void setBrands_via_productss(Set<Brands> v_brandss)
	{
		m_brands_via_productss=v_brandss;
	}
}
