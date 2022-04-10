package de.elbosso.generated.sqlshell;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "tracks"
/*	,indexes = {
		@Index(name= "IFK_TrackGenreId", columnList="GenreId")
		@Index(name= "IFK_TrackAlbumId", columnList="AlbumId")
		@Index(name= "IFK_TrackMediaTypeId", columnList="MediaTypeId")
	}*/
)
public class Tracks
{
	//in case there is no @Id annotation - just uncomment the following three lines!
	//@Id
	//@Column(name="ROWID")
	//private String rowid_id;

	@ManyToMany(mappedBy = "m_tracks_via_playlist_tracks")
	private Set<Playlists> m_playlists_via_playlist_tracks = new HashSet();
	@OneToMany(mappedBy = "m_invoice_items_tracks", cascade = CascadeType.DETACH)
	private Set<Invoice_items> m_tracks_invoice_itemss = new HashSet();

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@Column(name = "TrackId"
		, nullable = false
		, updatable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private Integer m_tracks_TrackId;

	@NotNull
	@Column(name = "Name"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_tracks_Name;

	@ManyToOne
	@JoinColumn(name = "AlbumId"
				, referencedColumnName = "AlbumId"
	)
	private Albums m_tracks_albums;


	@ManyToOne
	@JoinColumn(name = "MediaTypeId"
				, referencedColumnName = "MediaTypeId"
	)
	private Media_types m_tracks_media_types;


	@ManyToOne
	@JoinColumn(name = "GenreId"
				, referencedColumnName = "GenreId"
	)
	private Genres m_tracks_genres;


	@Column(name = "Composer"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_tracks_Composer;

	@NotNull
	@Column(name = "Milliseconds"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private Integer m_tracks_Milliseconds;

	@Column(name = "Bytes"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private Integer m_tracks_Bytes;

	@NotNull
	@Column(name = "UnitPrice"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private Float m_tracks_UnitPrice;

//TrackId
	public Integer getTrackId()
	{
		return m_tracks_TrackId;
	}
	public void setTrackId(Integer v_TrackId)
	{
		m_tracks_TrackId=v_TrackId;
	}
//it is an export
	public Set<Invoice_items> getInvoice_itemss()
	{
		return m_tracks_invoice_itemss;
	}
	public void setInvoice_itemss(Set<Invoice_items> v_invoice_itemss)
	{
		m_tracks_invoice_itemss=v_invoice_itemss;
	}
//Name
	public String getName()
	{
		return m_tracks_Name;
	}
	public void setName(String v_Name)
	{
		m_tracks_Name=v_Name;
	}
//AlbumId
//it is a reference
	public Albums getAlbums()
	{
		return m_tracks_albums;
	}
	public void setAlbums(Albums v_albums)
	{
		m_tracks_albums=v_albums;
	}
//MediaTypeId
//it is a reference
	public Media_types getMedia_types()
	{
		return m_tracks_media_types;
	}
	public void setMedia_types(Media_types v_media_types)
	{
		m_tracks_media_types=v_media_types;
	}
//GenreId
//it is a reference
	public Genres getGenres()
	{
		return m_tracks_genres;
	}
	public void setGenres(Genres v_genres)
	{
		m_tracks_genres=v_genres;
	}
//Composer
	public String getComposer()
	{
		return m_tracks_Composer;
	}
	public void setComposer(String v_Composer)
	{
		m_tracks_Composer=v_Composer;
	}
//Milliseconds
	public Integer getMilliseconds()
	{
		return m_tracks_Milliseconds;
	}
	public void setMilliseconds(Integer v_Milliseconds)
	{
		m_tracks_Milliseconds=v_Milliseconds;
	}
//Bytes
	public Integer getBytes()
	{
		return m_tracks_Bytes;
	}
	public void setBytes(Integer v_Bytes)
	{
		m_tracks_Bytes=v_Bytes;
	}
//UnitPrice
	public Float getUnitPrice()
	{
		return m_tracks_UnitPrice;
	}
	public void setUnitPrice(Float v_UnitPrice)
	{
		m_tracks_UnitPrice=v_UnitPrice;
	}

//public Set<Invoices> getInvoices_via_invoice_itemss()
//public Set<Playlists> getPlaylists_via_playlist_tracks()
	public Set<Playlists> getPlaylists_via_playlist_tracks()
	{
		return m_playlists_via_playlist_tracks;
	}
	public void setPlaylists_via_playlist_tracks(Set<Playlists> v_playlistss)
	{
		m_playlists_via_playlist_tracks=v_playlistss;
	}
}