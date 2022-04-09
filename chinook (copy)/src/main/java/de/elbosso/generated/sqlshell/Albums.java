package de.elbosso.generated.sqlshell;

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
	  name = "media_types_via_tracks",
	  joinColumns = @JoinColumn(name = "AlbumId"),
	  inverseJoinColumns = @JoinColumn(name = "MediaTypeId"))
	private Set<Media_types> m_media_types_via_trackss = new HashSet();

	@ManyToMany
	@JoinTable(
	  name = "genres_via_tracks",
	  joinColumns = @JoinColumn(name = "AlbumId"),
	  inverseJoinColumns = @JoinColumn(name = "GenreId"))
	private Set<Genres> m_genres_via_trackss = new HashSet();

	@OneToMany(mappedBy = "m_albums", cascade = CascadeType.DETACH)
	private Set<Tracks> m_trackss = new HashSet();

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@Column(name = "AlbumId"
		, nullable = false
		, updatable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private Integer m_AlbumId;

	@NotNull
	@Column(name = "Title"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_Title;

	@ManyToOne
	@JoinColumn(name = "ArtistId"
				, referencedColumnName = "ArtistId"
	)
	private Artists m_artists;


	public Integer getAlbumId()
	{
		return m_AlbumId;
	}
	public void setAlbumId(Integer v_AlbumId)
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
	public String getTitle()
	{
		return m_Title;
	}
	public void setTitle(String v_Title)
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

	public Set<Media_types> getMedia_types_via_trackss()
	{
		return m_media_types_via_trackss;
	}
	public void setMedia_types_via_trackss(Set<Media_types> v_media_typess)
	{
		m_media_types_via_trackss=v_media_typess;
	}
	public Set<Genres> getGenres_via_trackss()
	{
		return m_genres_via_trackss;
	}
	public void setGenres_via_trackss(Set<Genres> v_genress)
	{
		m_genres_via_trackss=v_genress;
	}
}