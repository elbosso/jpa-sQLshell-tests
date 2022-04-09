package de.elbosso.generated.sqlshell;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

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
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@Column(name = "InvoiceLineId"
		, nullable = false
		, updatable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private Integer m_invoice_items_InvoiceLineId;

	@ManyToOne
	@JoinColumn(name = "InvoiceId"
				, referencedColumnName = "InvoiceId"
	)
	private Invoices m_invoice_items_invoices;


	@ManyToOne
	@JoinColumn(name = "TrackId"
				, referencedColumnName = "TrackId"
	)
	private Tracks m_invoice_items_tracks;


	@NotNull
	@Column(name = "UnitPrice"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private Float m_invoice_items_UnitPrice;

	@NotNull
	@Column(name = "Quantity"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private Integer m_invoice_items_Quantity;

	public Integer getInvoiceLineId()
	{
		return m_invoice_items_InvoiceLineId;
	}
	public void setInvoiceLineId(Integer v_InvoiceLineId)
	{
		m_invoice_items_InvoiceLineId=v_InvoiceLineId;
	}
	public Invoices getInvoices()
	{
		return m_invoice_items_invoices;
	}
	public void setInvoices(Invoices v_invoices)
	{
		m_invoice_items_invoices=v_invoices;
	}
	public Tracks getTracks()
	{
		return m_invoice_items_tracks;
	}
	public void setTracks(Tracks v_tracks)
	{
		m_invoice_items_tracks=v_tracks;
	}
	public Float getUnitPrice()
	{
		return m_invoice_items_UnitPrice;
	}
	public void setUnitPrice(Float v_UnitPrice)
	{
		m_invoice_items_UnitPrice=v_UnitPrice;
	}
	public Integer getQuantity()
	{
		return m_invoice_items_Quantity;
	}
	public void setQuantity(Integer v_Quantity)
	{
		m_invoice_items_Quantity=v_Quantity;
	}

}