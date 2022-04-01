package de.elbosso.generated.sqlshell.chinook;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "invoice_items"
/*	,indexes = {
		@Index(name= "IFK_InvoiceLineInvoiceId", columnList="InvoiceId")
		@Index(name= "IFK_InvoiceLineTrackId", columnList="TrackId")
	}*/
)
public class Invoice_items
{

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "InvoiceLineId"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private java.lang.Integer m_InvoiceLineId;

	@ManyToOne
	@JoinColumn(name = "InvoiceId", referencedColumnName = "InvoiceId")
	private Invoices m_invoices;


	@ManyToOne
	@JoinColumn(name = "TrackId", referencedColumnName = "TrackId")
	private Tracks m_tracks;


	@NotNull
	@Column(name = "UnitPrice"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private java.lang.Float m_UnitPrice;

	@NotNull
	@Column(name = "Quantity"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private java.lang.Integer m_Quantity;

	public java.lang.Integer getInvoiceLineId()
	{
		return m_InvoiceLineId;
	}
	public void setInvoiceLineId(java.lang.Integer v_InvoiceLineId)
	{
		m_InvoiceLineId=v_InvoiceLineId;
	}
	public Invoices getInvoices()
	{
		return m_invoices;
	}
	public void setInvoices(Invoices v_invoices)
	{
		m_invoices=v_invoices;
	}
	public Tracks getTracks()
	{
		return m_tracks;
	}
	public void setTracks(Tracks v_tracks)
	{
		m_tracks=v_tracks;
	}
	public java.lang.Float getUnitPrice()
	{
		return m_UnitPrice;
	}
	public void setUnitPrice(java.lang.Float v_UnitPrice)
	{
		m_UnitPrice=v_UnitPrice;
	}
	public java.lang.Integer getQuantity()
	{
		return m_Quantity;
	}
	public void setQuantity(java.lang.Integer v_Quantity)
	{
		m_Quantity=v_Quantity;
	}

}
