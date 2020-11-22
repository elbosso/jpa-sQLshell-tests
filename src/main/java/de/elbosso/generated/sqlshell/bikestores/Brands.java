package de.elbosso.generated.sqlshell.bikestores;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

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
	private Set<Categories> m_categoriess = new HashSet();

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
	private java.lang.Integer m_brand_id;

	@NotNull
	@Column(name = "brand_name"
		, nullable = false
		, length=255
		, precision=255
		, scale=0
	)
	private java.lang.String m_brand_name;

	public java.lang.Integer getBrand_id()
	{
		return m_brand_id;
	}
	public void setBrand_id(java.lang.Integer v_brand_id)
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
	public java.lang.String getBrand_name()
	{
		return m_brand_name;
	}
	public void setBrand_name(java.lang.String v_brand_name)
	{
		m_brand_name=v_brand_name;
	}

	public Set<Categories> getCategoriess()
	{
		return m_categoriess;
	}
	public void setCategoriess(Set<Categories> v_categoriess)
	{
		m_categoriess=v_categoriess;
	}
}