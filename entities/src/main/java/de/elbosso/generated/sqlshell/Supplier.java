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
	//in case there is no @Id annotation - just uncomment the following three lines!
	//@Id
	//@Column(name="ROWID")
	//private String rowid_id;
	@OneToMany(mappedBy = "m_product_supplier", cascade = CascadeType.DETACH)
	private Set<Product> m_supplier_products = new HashSet();

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
	private Integer m_supplier_id;

	@NotNull
	@Column(name = "companyname"
		, nullable = false
		, length=40
		, precision=40
		, scale=0
	)
	private String m_supplier_companyname;

	@Column(name = "contactname"
		, length=50
		, precision=50
		, scale=0
	)
	private String m_supplier_contactname;

	@Column(name = "contacttitle"
		, length=40
		, precision=40
		, scale=0
	)
	private String m_supplier_contacttitle;

	@Column(name = "city"
		, length=40
		, precision=40
		, scale=0
	)
	private String m_supplier_city;

	@Column(name = "country"
		, length=40
		, precision=40
		, scale=0
	)
	private String m_supplier_country;

	@Column(name = "phone"
		, length=30
		, precision=30
		, scale=0
	)
	private String m_supplier_phone;

	@Column(name = "fax"
		, length=30
		, precision=30
		, scale=0
	)
	private String m_supplier_fax;

//id
	public Integer getId()
	{
		return m_supplier_id;
	}
	public void setId(Integer v_id)
	{
		m_supplier_id=v_id;
	}
//it is an export
	public Set<Product> getProducts()
	{
		return m_supplier_products;
	}
	public void setProducts(Set<Product> v_products)
	{
		m_supplier_products=v_products;
	}
//companyname
	public String getCompanyname()
	{
		return m_supplier_companyname;
	}
	public void setCompanyname(String v_companyname)
	{
		m_supplier_companyname=v_companyname;
	}
//contactname
	public String getContactname()
	{
		return m_supplier_contactname;
	}
	public void setContactname(String v_contactname)
	{
		m_supplier_contactname=v_contactname;
	}
//contacttitle
	public String getContacttitle()
	{
		return m_supplier_contacttitle;
	}
	public void setContacttitle(String v_contacttitle)
	{
		m_supplier_contacttitle=v_contacttitle;
	}
//city
	public String getCity()
	{
		return m_supplier_city;
	}
	public void setCity(String v_city)
	{
		m_supplier_city=v_city;
	}
//country
	public String getCountry()
	{
		return m_supplier_country;
	}
	public void setCountry(String v_country)
	{
		m_supplier_country=v_country;
	}
//phone
	public String getPhone()
	{
		return m_supplier_phone;
	}
	public void setPhone(String v_phone)
	{
		m_supplier_phone=v_phone;
	}
//fax
	public String getFax()
	{
		return m_supplier_fax;
	}
	public void setFax(String v_fax)
	{
		m_supplier_fax=v_fax;
	}

}