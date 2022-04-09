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

	@ManyToMany
	@JoinTable(
	  name = "tracks_invoice_items",
	  joinColumns = @JoinColumn(name = "InvoiceId"),
	  inverseJoinColumns = @JoinColumn(name = "TrackId"))
	private Set<Tracks> m_tracks_via_invoice_itemss = new HashSet();

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

	public Integer getInvoiceId()
	{
		return m_invoices_InvoiceId;
	}
	public void setInvoiceId(Integer v_InvoiceId)
	{
		m_invoices_InvoiceId=v_InvoiceId;
	}
	public Set<Invoice_items> getInvoice_itemss()
	{
		return m_invoices_invoice_itemss;
	}
	public void setInvoice_itemss(Set<Invoice_items> v_invoice_itemss)
	{
		m_invoices_invoice_itemss=v_invoice_itemss;
	}
	public Customers getCustomers()
	{
		return m_invoices_customers;
	}
	public void setCustomers(Customers v_customers)
	{
		m_invoices_customers=v_customers;
	}
	public String getInvoiceDate()
	{
		return m_invoices_InvoiceDate;
	}
	public void setInvoiceDate(String v_InvoiceDate)
	{
		m_invoices_InvoiceDate=v_InvoiceDate;
	}
	public String getBillingAddress()
	{
		return m_invoices_BillingAddress;
	}
	public void setBillingAddress(String v_BillingAddress)
	{
		m_invoices_BillingAddress=v_BillingAddress;
	}
	public String getBillingCity()
	{
		return m_invoices_BillingCity;
	}
	public void setBillingCity(String v_BillingCity)
	{
		m_invoices_BillingCity=v_BillingCity;
	}
	public String getBillingState()
	{
		return m_invoices_BillingState;
	}
	public void setBillingState(String v_BillingState)
	{
		m_invoices_BillingState=v_BillingState;
	}
	public String getBillingCountry()
	{
		return m_invoices_BillingCountry;
	}
	public void setBillingCountry(String v_BillingCountry)
	{
		m_invoices_BillingCountry=v_BillingCountry;
	}
	public String getBillingPostalCode()
	{
		return m_invoices_BillingPostalCode;
	}
	public void setBillingPostalCode(String v_BillingPostalCode)
	{
		m_invoices_BillingPostalCode=v_BillingPostalCode;
	}
	public Float getTotal()
	{
		return m_invoices_Total;
	}
	public void setTotal(Float v_Total)
	{
		m_invoices_Total=v_Total;
	}

	public Set<Tracks> getTracks_via_invoice_itemss()
	{
		return m_tracks_via_invoice_itemss;
	}
	public void setTracks_via_invoice_itemss(Set<Tracks> v_trackss)
	{
		m_tracks_via_invoice_itemss=v_trackss;
	}
}