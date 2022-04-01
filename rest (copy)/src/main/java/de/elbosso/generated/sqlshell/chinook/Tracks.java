package de.elbosso.generated.sqlshell.chinook;

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

	@ManyToMany(mappedBy = "m_trackss")
	private Set<Invoices> m_invoicess = new HashSet();

	@ManyToMany(mappedBy = "m_trackss")
	private Set<Playlists> m_playlistss = new HashSet();

	@OneToMany(mappedBy = "m_tracks", cascade = CascadeType.DETACH)
	private Set<Invoice_items> m_invoice_itemss = new HashSet();

	@OneToMany(mappedBy = "m_tracks", cascade = CascadeType.DETACH)
	private Set<Playlist_track> m_playlist_tracks = new HashSet();

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TrackId"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private java.lang.Integer m_TrackId;

	@NotNull
	@Column(name = "Name"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private java.lang.String m_Name;

	@ManyToOne
	@JoinColumn(name = "AlbumId", referencedColumnName = "AlbumId")
	private Albums m_albums;


	@ManyToOne
	@JoinColumn(name = "MediaTypeId", referencedColumnName = "MediaTypeId")
	private Media_types m_media_types;


	@ManyToOne
	@JoinColumn(name = "GenreId", referencedColumnName = "GenreId")
	private Genres m_genres;


	@Column(name = "Composer"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private java.lang.String m_Composer;

	@NotNull
	@Column(name = "Milliseconds"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private java.lang.Integer m_Milliseconds;

	@Column(name = "Bytes"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private java.lang.Integer m_Bytes;

	@NotNull
	@Column(name = "UnitPrice"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private java.lang.Float m_UnitPrice;

	public java.lang.Integer getTrackId()
	{
		return m_TrackId;
	}
	public void setTrackId(java.lang.Integer v_TrackId)
	{
		m_TrackId=v_TrackId;
	}
	public Set<Invoice_items> getInvoice_itemss()
	{
		return m_invoice_itemss;
	}
	public void setInvoice_itemss(Set<Invoice_items> v_invoice_itemss)
	{
		m_invoice_itemss=v_invoice_itemss;
	}
	public Set<Playlist_track> getPlaylist_tracks()
	{
		return m_playlist_tracks;
	}
	public void setPlaylist_tracks(Set<Playlist_track> v_playlist_tracks)
	{
		m_playlist_tracks=v_playlist_tracks;
	}
	public java.lang.String getName()
	{
		return m_Name;
	}
	public void setName(java.lang.String v_Name)
	{
		m_Name=v_Name;
	}
	public Albums getAlbums()
	{
		return m_albums;
	}
	public void setAlbums(Albums v_albums)
	{
		m_albums=v_albums;
	}
	public Media_types getMedia_types()
	{
		return m_media_types;
	}
	public void setMedia_types(Media_types v_media_types)
	{
		m_media_types=v_media_types;
	}
	public Genres getGenres()
	{
		return m_genres;
	}
	public void setGenres(Genres v_genres)
	{
		m_genres=v_genres;
	}
	public java.lang.String getComposer()
	{
		return m_Composer;
	}
	public void setComposer(java.lang.String v_Composer)
	{
		m_Composer=v_Composer;
	}
	public java.lang.Integer getMilliseconds()
	{
		return m_Milliseconds;
	}
	public void setMilliseconds(java.lang.Integer v_Milliseconds)
	{
		m_Milliseconds=v_Milliseconds;
	}
	public java.lang.Integer getBytes()
	{
		return m_Bytes;
	}
	public void setBytes(java.lang.Integer v_Bytes)
	{
		m_Bytes=v_Bytes;
	}
	public java.lang.Float getUnitPrice()
	{
		return m_UnitPrice;
	}
	public void setUnitPrice(java.lang.Float v_UnitPrice)
	{
		m_UnitPrice=v_UnitPrice;
	}

	public Set<Invoices> getInvoicess()
	{
		return m_invoicess;
	}
	public void setInvoicess(Set<Invoices> v_invoicess)
	{
		m_invoicess=v_invoicess;
	}
	public Set<Playlists> getPlaylistss()
	{
		return m_playlistss;
	}
	public void setPlaylistss(Set<Playlists> v_playlistss)
	{
		m_playlistss=v_playlistss;
	}
}
