package de.elbosso.generated.sqlshell.bikestores;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "brands"
/*	,indexes = {
		@Index(name= "PK__brands__5E5A8E27386164DA", columnList="brand_id")
	}*/
)
public class Brands
{

	@ManyToMany
	@JoinTable(
	  name = "products",
	  joinColumns = @JoinColumn(name = "brand_id"),
	  inverseJoinColumns = @JoinColumn(name = "category_id"))
	private Set<Categories> m_categories_via_productss = new HashSet();

	@OneToMany(mappedBy = "m_brands", cascade = CascadeType.DETACH)
	private Set<Products> m_productss = new HashSet();

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "brand_id"
		, nullable = false
		, length=10
		, precision=10
		, scale=0
	)
	private Integer m_brand_id;

	@NotNull
	@Column(name = "brand_name"
		, nullable = false
		, length=255
		, precision=255
		, scale=0
	)
	private String m_brand_name;

	public Integer getBrand_id()
	{
		return m_brand_id;
	}
	public void setBrand_id(Integer v_brand_id)
	{
		m_brand_id=v_brand_id;
	}
	public Set<Products> getProductss()
	{
		return m_productss;
	}
	public void setProductss(Set<Products> v_productss)
	{
		m_productss=v_productss;
	}
	public String getBrand_name()
	{
		return m_brand_name;
	}
	public void setBrand_name(String v_brand_name)
	{
		m_brand_name=v_brand_name;
	}

	public Set<Categories> getCategories_via_productss()
	{
		return m_categories_via_productss;
	}
	public void setCategories_via_productss(Set<Categories> v_categoriess)
	{
		m_categories_via_productss=v_categoriess;
	}
}
