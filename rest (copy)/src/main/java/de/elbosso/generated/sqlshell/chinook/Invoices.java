package de.elbosso.generated.sqlshell.chinook;

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

	@ManyToMany
	@JoinTable(
	  name = "invoice_items",
	  joinColumns = @JoinColumn(name = "InvoiceId"),
	  inverseJoinColumns = @JoinColumn(name = "TrackId"))
	private Set<Tracks> m_trackss = new HashSet();

	@OneToMany(mappedBy = "m_invoices", cascade = CascadeType.DETACH)
	private Set<Invoice_items> m_invoice_itemss = new HashSet();

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "InvoiceId"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private java.lang.Integer m_InvoiceId;

	@ManyToOne
	@JoinColumn(name = "CustomerId", referencedColumnName = "CustomerId")
	private Customers m_customers;


	@NotNull
	@Column(name = "InvoiceDate"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private java.lang.String m_InvoiceDate;

	@Column(name = "BillingAddress"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private java.lang.String m_BillingAddress;

	@Column(name = "BillingCity"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private java.lang.String m_BillingCity;

	@Column(name = "BillingState"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private java.lang.String m_BillingState;

	@Column(name = "BillingCountry"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private java.lang.String m_BillingCountry;

	@Column(name = "BillingPostalCode"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private java.lang.String m_BillingPostalCode;

	@NotNull
	@Column(name = "Total"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private java.lang.Float m_Total;

	public java.lang.Integer getInvoiceId()
	{
		return m_InvoiceId;
	}
	public void setInvoiceId(java.lang.Integer v_InvoiceId)
	{
		m_InvoiceId=v_InvoiceId;
	}
	public Set<Invoice_items> getInvoice_itemss()
	{
		return m_invoice_itemss;
	}
	public void setInvoice_itemss(Set<Invoice_items> v_invoice_itemss)
	{
		m_invoice_itemss=v_invoice_itemss;
	}
	public Customers getCustomers()
	{
		return m_customers;
	}
	public void setCustomers(Customers v_customers)
	{
		m_customers=v_customers;
	}
	public java.lang.String getInvoiceDate()
	{
		return m_InvoiceDate;
	}
	public void setInvoiceDate(java.lang.String v_InvoiceDate)
	{
		m_InvoiceDate=v_InvoiceDate;
	}
	public java.lang.String getBillingAddress()
	{
		return m_BillingAddress;
	}
	public void setBillingAddress(java.lang.String v_BillingAddress)
	{
		m_BillingAddress=v_BillingAddress;
	}
	public java.lang.String getBillingCity()
	{
		return m_BillingCity;
	}
	public void setBillingCity(java.lang.String v_BillingCity)
	{
		m_BillingCity=v_BillingCity;
	}
	public java.lang.String getBillingState()
	{
		return m_BillingState;
	}
	public void setBillingState(java.lang.String v_BillingState)
	{
		m_BillingState=v_BillingState;
	}
	public java.lang.String getBillingCountry()
	{
		return m_BillingCountry;
	}
	public void setBillingCountry(java.lang.String v_BillingCountry)
	{
		m_BillingCountry=v_BillingCountry;
	}
	public java.lang.String getBillingPostalCode()
	{
		return m_BillingPostalCode;
	}
	public void setBillingPostalCode(java.lang.String v_BillingPostalCode)
	{
		m_BillingPostalCode=v_BillingPostalCode;
	}
	public java.lang.Float getTotal()
	{
		return m_Total;
	}
	public void setTotal(java.lang.Float v_Total)
	{
		m_Total=v_Total;
	}

	public Set<Tracks> getTrackss()
	{
		return m_trackss;
	}
	public void setTrackss(Set<Tracks> v_trackss)
	{
		m_trackss=v_trackss;
	}
}
