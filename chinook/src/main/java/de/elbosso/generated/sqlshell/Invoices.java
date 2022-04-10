package de.elbosso.generated.sqlshell;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "invoices"
/*	,indexes = {
		@Index(name= "IFK_InvoiceCustomerId", columnList="CustomerId")
	}*/
)
public class Invoices
{
	//in case there is no @Id annotation - just uncomment the following three lines!
	//@Id
	//@Column(name="ROWID")
	//private String rowid_id;

	@OneToMany(mappedBy = "m_invoice_items_invoices", cascade = CascadeType.DETACH)
	private Set<Invoice_items> m_invoices_invoice_itemss = new HashSet();

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@Column(name = "InvoiceId"
		, nullable = false
		, updatable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private Integer m_invoices_InvoiceId;

	@ManyToOne
	@JoinColumn(name = "CustomerId"
				, referencedColumnName = "CustomerId"
	)
	private Customers m_invoices_customers;


	@NotNull
	@Column(name = "InvoiceDate"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_invoices_InvoiceDate;

	@Column(name = "BillingAddress"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_invoices_BillingAddress;

	@Column(name = "BillingCity"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_invoices_BillingCity;

	@Column(name = "BillingState"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_invoices_BillingState;

	@Column(name = "BillingCountry"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_invoices_BillingCountry;

	@Column(name = "BillingPostalCode"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_invoices_BillingPostalCode;

	@NotNull
	@Column(name = "Total"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private Float m_invoices_Total;

//InvoiceId
	public Integer getInvoiceId()
	{
		return m_invoices_InvoiceId;
	}
	public void setInvoiceId(Integer v_InvoiceId)
	{
		m_invoices_InvoiceId=v_InvoiceId;
	}
//it is an export
	public Set<Invoice_items> getInvoice_itemss()
	{
		return m_invoices_invoice_itemss;
	}
	public void setInvoice_itemss(Set<Invoice_items> v_invoice_itemss)
	{
		m_invoices_invoice_itemss=v_invoice_itemss;
	}
//CustomerId
//it is a reference
	public Customers getCustomers()
	{
		return m_invoices_customers;
	}
	public void setCustomers(Customers v_customers)
	{
		m_invoices_customers=v_customers;
	}
//InvoiceDate
	public String getInvoiceDate()
	{
		return m_invoices_InvoiceDate;
	}
	public void setInvoiceDate(String v_InvoiceDate)
	{
		m_invoices_InvoiceDate=v_InvoiceDate;
	}
//BillingAddress
	public String getBillingAddress()
	{
		return m_invoices_BillingAddress;
	}
	public void setBillingAddress(String v_BillingAddress)
	{
		m_invoices_BillingAddress=v_BillingAddress;
	}
//BillingCity
	public String getBillingCity()
	{
		return m_invoices_BillingCity;
	}
	public void setBillingCity(String v_BillingCity)
	{
		m_invoices_BillingCity=v_BillingCity;
	}
//BillingState
	public String getBillingState()
	{
		return m_invoices_BillingState;
	}
	public void setBillingState(String v_BillingState)
	{
		m_invoices_BillingState=v_BillingState;
	}
//BillingCountry
	public String getBillingCountry()
	{
		return m_invoices_BillingCountry;
	}
	public void setBillingCountry(String v_BillingCountry)
	{
		m_invoices_BillingCountry=v_BillingCountry;
	}
//BillingPostalCode
	public String getBillingPostalCode()
	{
		return m_invoices_BillingPostalCode;
	}
	public void setBillingPostalCode(String v_BillingPostalCode)
	{
		m_invoices_BillingPostalCode=v_BillingPostalCode;
	}
//Total
	public Float getTotal()
	{
		return m_invoices_Total;
	}
	public void setTotal(Float v_Total)
	{
		m_invoices_Total=v_Total;
	}

//public Set<Tracks> getTracks_via_invoice_itemss()
}