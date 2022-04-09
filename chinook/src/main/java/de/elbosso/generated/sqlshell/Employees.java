package de.elbosso.generated.sqlshell;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "employees"
/*	,indexes = {
		@Index(name= "IFK_EmployeeReportsTo", columnList="ReportsTo")
	}*/
)
public class Employees
{

	@OneToMany(mappedBy = "m_customers_employees", cascade = CascadeType.DETACH)
	private Set<Customers> m_employees_customerss = new HashSet();

	@OneToMany(mappedBy = "m_employees_employees", cascade = CascadeType.DETACH)
	private Set<Employees> m_employees_employeess = new HashSet();

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@Column(name = "EmployeeId"
		, nullable = false
		, updatable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private Integer m_employees_EmployeeId;

	@NotNull
	@Column(name = "LastName"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_employees_LastName;

	@NotNull
	@Column(name = "FirstName"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_employees_FirstName;

	@Column(name = "Title"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_employees_Title;

	@ManyToOne
	@JoinColumn(name = "ReportsTo"
				, referencedColumnName = "EmployeeId"
	)
	private Employees m_employees_employees;


	@Column(name = "BirthDate"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_employees_BirthDate;

	@Column(name = "HireDate"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_employees_HireDate;

	@Column(name = "Address"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_employees_Address;

	@Column(name = "City"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_employees_City;

	@Column(name = "State"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_employees_State;

	@Column(name = "Country"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_employees_Country;

	@Column(name = "PostalCode"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_employees_PostalCode;

	@Column(name = "Phone"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_employees_Phone;

	@Column(name = "Fax"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_employees_Fax;

	@Column(name = "Email"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_employees_Email;

	public Integer getEmployeeId()
	{
		return m_employees_EmployeeId;
	}
	public void setEmployeeId(Integer v_EmployeeId)
	{
		m_employees_EmployeeId=v_EmployeeId;
	}
	public Set<Customers> getCustomerss()
	{
		return m_employees_customerss;
	}
	public void setCustomerss(Set<Customers> v_customerss)
	{
		m_employees_customerss=v_customerss;
	}
	public Set<Employees> getEmployeess()
	{
		return m_employees_employeess;
	}
	public void setEmployeess(Set<Employees> v_employeess)
	{
		m_employees_employeess=v_employeess;
	}
	public String getLastName()
	{
		return m_employees_LastName;
	}
	public void setLastName(String v_LastName)
	{
		m_employees_LastName=v_LastName;
	}
	public String getFirstName()
	{
		return m_employees_FirstName;
	}
	public void setFirstName(String v_FirstName)
	{
		m_employees_FirstName=v_FirstName;
	}
	public String getTitle()
	{
		return m_employees_Title;
	}
	public void setTitle(String v_Title)
	{
		m_employees_Title=v_Title;
	}
	public Employees getEmployees()
	{
		return m_employees_employees;
	}
	public void setEmployees(Employees v_employees)
	{
		m_employees_employees=v_employees;
	}
	public String getBirthDate()
	{
		return m_employees_BirthDate;
	}
	public void setBirthDate(String v_BirthDate)
	{
		m_employees_BirthDate=v_BirthDate;
	}
	public String getHireDate()
	{
		return m_employees_HireDate;
	}
	public void setHireDate(String v_HireDate)
	{
		m_employees_HireDate=v_HireDate;
	}
	public String getAddress()
	{
		return m_employees_Address;
	}
	public void setAddress(String v_Address)
	{
		m_employees_Address=v_Address;
	}
	public String getCity()
	{
		return m_employees_City;
	}
	public void setCity(String v_City)
	{
		m_employees_City=v_City;
	}
	public String getState()
	{
		return m_employees_State;
	}
	public void setState(String v_State)
	{
		m_employees_State=v_State;
	}
	public String getCountry()
	{
		return m_employees_Country;
	}
	public void setCountry(String v_Country)
	{
		m_employees_Country=v_Country;
	}
	public String getPostalCode()
	{
		return m_employees_PostalCode;
	}
	public void setPostalCode(String v_PostalCode)
	{
		m_employees_PostalCode=v_PostalCode;
	}
	public String getPhone()
	{
		return m_employees_Phone;
	}
	public void setPhone(String v_Phone)
	{
		m_employees_Phone=v_Phone;
	}
	public String getFax()
	{
		return m_employees_Fax;
	}
	public void setFax(String v_Fax)
	{
		m_employees_Fax=v_Fax;
	}
	public String getEmail()
	{
		return m_employees_Email;
	}
	public void setEmail(String v_Email)
	{
		m_employees_Email=v_Email;
	}

}