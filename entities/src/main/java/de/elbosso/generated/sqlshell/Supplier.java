package de.elbosso.generated.sqlshell;

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

	@NotNull
	@Column(name = "companyname"
		, nullable = false
		, length=40
		, precision=40
		, scale=0
	)
	private String m_companyname;

	@Column(name = "contactname"
		, length=50
		, precision=50
		, scale=0
	)
	private String m_contactname;

	@Column(name = "contacttitle"
		, length=40
		, precision=40
		, scale=0
	)
	private String m_contacttitle;

	@Column(name = "city"
		, length=40
		, precision=40
		, scale=0
	)
	private String m_city;

	@Column(name = "country"
		, length=40
		, precision=40
		, scale=0
	)
	private String m_country;

	@Column(name = "phone"
		, length=30
		, precision=30
		, scale=0
	)
	private String m_phone;

	@Column(name = "fax"
		, length=30
		, precision=30
		, scale=0
	)
	private String m_fax;

	public Integer getId()
	{
		return m_id;
	}
	public void setId(Integer v_id)
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
	public String getCompanyname()
	{
		return m_companyname;
	}
	public void setCompanyname(String v_companyname)
	{
		m_companyname=v_companyname;
	}
	public String getContactname()
	{
		return m_contactname;
	}
	public void setContactname(String v_contactname)
	{
		m_contactname=v_contactname;
	}
	public String getContacttitle()
	{
		return m_contacttitle;
	}
	public void setContacttitle(String v_contacttitle)
	{
		m_contacttitle=v_contacttitle;
	}
	public String getCity()
	{
		return m_city;
	}
	public void setCity(String v_city)
	{
		m_city=v_city;
	}
	public String getCountry()
	{
		return m_country;
	}
	public void setCountry(String v_country)
	{
		m_country=v_country;
	}
	public String getPhone()
	{
		return m_phone;
	}
	public void setPhone(String v_phone)
	{
		m_phone=v_phone;
	}
	public String getFax()
	{
		return m_fax;
	}
	public void setFax(String v_fax)
	{
		m_fax=v_fax;
	}

}