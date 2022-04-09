package de.elbosso.generated.sqlshell;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "customers"
/*	,indexes = {
		@Index(name= "IFK_CustomerSupportRepId", columnList="SupportRepId")
	}*/
)
public class Customers
{

	@OneToMany(mappedBy = "m_customers", cascade = CascadeType.DETACH)
	private Set<Invoices> m_invoicess = new HashSet();

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@Column(name = "CustomerId"
		, nullable = false
		, updatable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private Integer m_CustomerId;

	@NotNull
	@Column(name = "FirstName"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_FirstName;

	@NotNull
	@Column(name = "LastName"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_LastName;

	@Column(name = "Company"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_Company;

	@Column(name = "Address"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_Address;

	@Column(name = "City"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_City;

	@Column(name = "State"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_State;

	@Column(name = "Country"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_Country;

	@Column(name = "PostalCode"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_PostalCode;

	@Column(name = "Phone"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_Phone;

	@Column(name = "Fax"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_Fax;

	@NotNull
	@Column(name = "Email"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_Email;

	@ManyToOne
	@JoinColumn(name = "SupportRepId"
				, referencedColumnName = "EmployeeId"
	)
	private Employees m_cemployees;


	public Integer getCustomerId()
	{
		return m_CustomerId;
	}
	public void setCustomerId(Integer v_CustomerId)
	{
		m_CustomerId=v_CustomerId;
	}
	public Set<Invoices> getInvoicess()
	{
		return m_invoicess;
	}
	public void setInvoicess(Set<Invoices> v_invoicess)
	{
		m_invoicess=v_invoicess;
	}
	public String getFirstName()
	{
		return m_FirstName;
	}
	public void setFirstName(String v_FirstName)
	{
		m_FirstName=v_FirstName;
	}
	public String getLastName()
	{
		return m_LastName;
	}
	public void setLastName(String v_LastName)
	{
		m_LastName=v_LastName;
	}
	public String getCompany()
	{
		return m_Company;
	}
	public void setCompany(String v_Company)
	{
		m_Company=v_Company;
	}
	public String getAddress()
	{
		return m_Address;
	}
	public void setAddress(String v_Address)
	{
		m_Address=v_Address;
	}
	public String getCity()
	{
		return m_City;
	}
	public void setCity(String v_City)
	{
		m_City=v_City;
	}
	public String getState()
	{
		return m_State;
	}
	public void setState(String v_State)
	{
		m_State=v_State;
	}
	public String getCountry()
	{
		return m_Country;
	}
	public void setCountry(String v_Country)
	{
		m_Country=v_Country;
	}
	public String getPostalCode()
	{
		return m_PostalCode;
	}
	public void setPostalCode(String v_PostalCode)
	{
		m_PostalCode=v_PostalCode;
	}
	public String getPhone()
	{
		return m_Phone;
	}
	public void setPhone(String v_Phone)
	{
		m_Phone=v_Phone;
	}
	public String getFax()
	{
		return m_Fax;
	}
	public void setFax(String v_Fax)
	{
		m_Fax=v_Fax;
	}
	public String getEmail()
	{
		return m_Email;
	}
	public void setEmail(String v_Email)
	{
		m_Email=v_Email;
	}
	public Employees getEmployees()
	{
		return m_cemployees;
	}
	public void setEmployees(Employees v_employees)
	{
		m_cemployees=v_employees;
	}

}