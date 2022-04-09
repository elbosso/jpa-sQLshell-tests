package de.elbosso.generated.sqlshell;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "genres"
)
public class Genres
{

	@ManyToMany(mappedBy = "m_genres_via_trackss")
	private Set<Albums> m_albums_via_trackss = new HashSet();

	@ManyToMany(mappedBy = "m_genres_via_trackss")
	private Set<Media_types> m_media_types_via_trackss = new HashSet();

	@OneToMany(mappedBy = "m_tracks_genres", cascade = CascadeType.DETACH)
	private Set<Tracks> m_genres_trackss = new HashSet();

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@Column(name = "GenreId"
		, nullable = false
		, updatable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private Integer m_genres_GenreId;

	@Column(name = "Name"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_genres_Name;

	public Integer getGenreId()
	{
		return m_genres_GenreId;
	}
	public void setGenreId(Integer v_GenreId)
	{
		m_genres_GenreId=v_GenreId;
	}
	public Set<Tracks> getTrackss()
	{
		return m_genres_trackss;
	}
	public void setTrackss(Set<Tracks> v_trackss)
	{
		m_genres_trackss=v_trackss;
	}
	public String getName()
	{
		return m_genres_Name;
	}
	public void setName(String v_Name)
	{
		m_genres_Name=v_Name;
	}

	public Set<Albums> getAlbums_via_trackss()
	{
		return m_albums_via_trackss;
	}
	public void setAlbums_via_trackss(Set<Albums> v_albumss)
	{
		m_albums_via_trackss=v_albumss;
	}
	public Set<Media_types> getMedia_types_via_trackss()
	{
		return m_media_types_via_trackss;
	}
	public void setMedia_types_via_trackss(Set<Media_types> v_media_typess)
	{
		m_media_types_via_trackss=v_media_typess;
	}
}