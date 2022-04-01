package de.elbosso.generated.sqlshell.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "supplier"
/*	,indexes = {
		@Index(name= "indexsuppliercountry", columnList="country")
		@Index(name= "pk_supplier", columnList="id")
		@Index(name= "indexsuppliername", columnList="companyname")
	}*/
)
public class Supplier
{

	@OneToMany(mappedBy = "m_supplier", cascade = CascadeType.DETACH)
	private Set<Product> m_products = new HashSet();

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id"
		, nullable = false
		, length=10
		, precision=10
		, scale=0
	)
	private java.lang.Integer m_id;

	@NotNull
	@Column(name = "companyname"
		, nullable = false
		, length=40
		, precision=40
		, scale=0
	)
	private java.lang.String m_companyname;

	@Column(name = "contactname"
		, length=50
		, precision=50
		, scale=0
	)
	private java.lang.String m_contactname;

	@Column(name = "contacttitle"
		, length=40
		, precision=40
		, scale=0
	)
	private java.lang.String m_contacttitle;

	@Column(name = "city"
		, length=40
		, precision=40
		, scale=0
	)
	private java.lang.String m_city;

	@Column(name = "country"
		, length=40
		, precision=40
		, scale=0
	)
	private java.lang.String m_country;

	@Column(name = "phone"
		, length=30
		, precision=30
		, scale=0
	)
	private java.lang.String m_phone;

	@Column(name = "fax"
		, length=30
		, precision=30
		, scale=0
	)
	private java.lang.String m_fax;

	public java.lang.Integer getId()
	{
		return m_id;
	}
	public void setId(java.lang.Integer v_id)
	{
		m_id=v_id;
	}
	public Set<Product> getProducts()
	{
		return m_products;
	}
	public void setProducts(Set<Product> v_products)
	{
		m_products=v_products;
	}
	public java.lang.String getCompanyname()
	{
		return m_companyname;
	}
	public void setCompanyname(java.lang.String v_companyname)
	{
		m_companyname=v_companyname;
	}
	public java.lang.String getContactname()
	{
		return m_contactname;
	}
	public void setContactname(java.lang.String v_contactname)
	{
		m_contactname=v_contactname;
	}
	public java.lang.String getContacttitle()
	{
		return m_contacttitle;
	}
	public void setContacttitle(java.lang.String v_contacttitle)
	{
		m_contacttitle=v_contacttitle;
	}
	public java.lang.String getCity()
	{
		return m_city;
	}
	public void setCity(java.lang.String v_city)
	{
		m_city=v_city;
	}
	public java.lang.String getCountry()
	{
		return m_country;
	}
	public void setCountry(java.lang.String v_country)
	{
		m_country=v_country;
	}
	public java.lang.String getPhone()
	{
		return m_phone;
	}
	public void setPhone(java.lang.String v_phone)
	{
		m_phone=v_phone;
	}
	public java.lang.String getFax()
	{
		return m_fax;
	}
	public void setFax(java.lang.String v_fax)
	{
		m_fax=v_fax;
	}

}
