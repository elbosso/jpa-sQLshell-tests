package de.elbosso.generated.sqlshell.chinook;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "albums"
/*	,indexes = {
		@Index(name= "IFK_AlbumArtistId", columnList="ArtistId")
	}*/
)
public class Albums
{

	@ManyToMany
	@JoinTable(
	  name = "tracks",
	  joinColumns = @JoinColumn(name = "AlbumId"),
	  inverseJoinColumns = @JoinColumn(name = "MediaTypeId"))
	private Set<Media_types> m_media_typess = new HashSet();

	@ManyToMany
	@JoinTable(
	  name = "tracks",
	  joinColumns = @JoinColumn(name = "AlbumId"),
	  inverseJoinColumns = @JoinColumn(name = "GenreId"))
	private Set<Genres> m_genress = new HashSet();

	@OneToMany(mappedBy = "m_albums", cascade = CascadeType.DETACH)
	private Set<Tracks> m_trackss = new HashSet();

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "AlbumId"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private java.lang.Integer m_AlbumId;

	@NotNull
	@Column(name = "Title"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private java.lang.String m_Title;

	@ManyToOne
	@JoinColumn(name = "ArtistId", referencedColumnName = "ArtistId")
	private Artists m_artists;


	public java.lang.Integer getAlbumId()
	{
		return m_AlbumId;
	}
	public void setAlbumId(java.lang.Integer v_AlbumId)
	{
		m_AlbumId=v_AlbumId;
	}
	public Set<Tracks> getTrackss()
	{
		return m_trackss;
	}
	public void setTrackss(Set<Tracks> v_trackss)
	{
		m_trackss=v_trackss;
	}
	public java.lang.String getTitle()
	{
		return m_Title;
	}
	public void setTitle(java.lang.String v_Title)
	{
		m_Title=v_Title;
	}
	public Artists getArtists()
	{
		return m_artists;
	}
	public void setArtists(Artists v_artists)
	{
		m_artists=v_artists;
	}

	public Set<Media_types> getMedia_typess()
	{
		return m_media_typess;
	}
	public void setMedia_typess(Set<Media_types> v_media_typess)
	{
		m_media_typess=v_media_typess;
	}
	public Set<Genres> getGenress()
	{
		return m_genress;
	}
	public void setGenress(Set<Genres> v_genress)
	{
		m_genress=v_genress;
	}
}
