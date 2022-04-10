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
	//in case there is no @Id annotation - just uncomment the following three lines!
	//@Id
	//@Column(name="ROWID")
	//private String rowid_id;
	@OneToMany(mappedBy = "m_invoices_customers", cascade = CascadeType.DETACH)
	private Set<Invoices> m_customers_invoicess = new HashSet();

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
	private Integer m_customers_CustomerId;

	@NotNull
	@Column(name = "FirstName"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_customers_FirstName;

	@NotNull
	@Column(name = "LastName"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_customers_LastName;

	@Column(name = "Company"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_customers_Company;

	@Column(name = "Address"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_customers_Address;

	@Column(name = "City"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_customers_City;

	@Column(name = "State"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_customers_State;

	@Column(name = "Country"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_customers_Country;

	@Column(name = "PostalCode"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_customers_PostalCode;

	@Column(name = "Phone"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_customers_Phone;

	@Column(name = "Fax"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_customers_Fax;

	@NotNull
	@Column(name = "Email"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_customers_Email;

	@ManyToOne
	@JoinColumn(name = "SupportRepId"
				, referencedColumnName = "EmployeeId"
	)
	private Employees m_customers_employees;


//CustomerId
	public Integer getCustomerId()
	{
		return m_customers_CustomerId;
	}
	public void setCustomerId(Integer v_CustomerId)
	{
		m_customers_CustomerId=v_CustomerId;
	}
//it is an export
	public Set<Invoices> getInvoicess()
	{
		return m_customers_invoicess;
	}
	public void setInvoicess(Set<Invoices> v_invoicess)
	{
		m_customers_invoicess=v_invoicess;
	}
//FirstName
	public String getFirstName()
	{
		return m_customers_FirstName;
	}
	public void setFirstName(String v_FirstName)
	{
		m_customers_FirstName=v_FirstName;
	}
//LastName
	public String getLastName()
	{
		return m_customers_LastName;
	}
	public void setLastName(String v_LastName)
	{
		m_customers_LastName=v_LastName;
	}
//Company
	public String getCompany()
	{
		return m_customers_Company;
	}
	public void setCompany(String v_Company)
	{
		m_customers_Company=v_Company;
	}
//Address
	public String getAddress()
	{
		return m_customers_Address;
	}
	public void setAddress(String v_Address)
	{
		m_customers_Address=v_Address;
	}
//City
	public String getCity()
	{
		return m_customers_City;
	}
	public void setCity(String v_City)
	{
		m_customers_City=v_City;
	}
//State
	public String getState()
	{
		return m_customers_State;
	}
	public void setState(String v_State)
	{
		m_customers_State=v_State;
	}
//Country
	public String getCountry()
	{
		return m_customers_Country;
	}
	public void setCountry(String v_Country)
	{
		m_customers_Country=v_Country;
	}
//PostalCode
	public String getPostalCode()
	{
		return m_customers_PostalCode;
	}
	public void setPostalCode(String v_PostalCode)
	{
		m_customers_PostalCode=v_PostalCode;
	}
//Phone
	public String getPhone()
	{
		return m_customers_Phone;
	}
	public void setPhone(String v_Phone)
	{
		m_customers_Phone=v_Phone;
	}
//Fax
	public String getFax()
	{
		return m_customers_Fax;
	}
	public void setFax(String v_Fax)
	{
		m_customers_Fax=v_Fax;
	}
//Email
	public String getEmail()
	{
		return m_customers_Email;
	}
	public void setEmail(String v_Email)
	{
		m_customers_Email=v_Email;
	}
//SupportRepId
//it is a reference
	public Employees getEmployees()
	{
		return m_customers_employees;
	}
	public void setEmployees(Employees v_employees)
	{
		m_customers_employees=v_employees;
	}

}