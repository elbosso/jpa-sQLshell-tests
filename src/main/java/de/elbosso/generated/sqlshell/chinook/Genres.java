package de.elbosso.generated.sqlshell.chinook;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "genres"
)
public class Genres
{

	@ManyToMany(mappedBy = "m_genress")
	private Set<Albums> m_albumss = new HashSet();

	@ManyToMany(mappedBy = "m_genress")
	private Set<Media_types> m_media_typess = new HashSet();

	@OneToMany(mappedBy = "m_genres", cascade = CascadeType.DETACH)
	private Set<Tracks> m_trackss = new HashSet();

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "GenreId"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private java.lang.Integer m_GenreId;

	@Column(name = "Name"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private java.lang.String m_Name;

	public java.lang.Integer getGenreId()
	{
		return m_GenreId;
	}
	public void setGenreId(java.lang.Integer v_GenreId)
	{
		m_GenreId=v_GenreId;
	}
	public Set<Tracks> getTrackss()
	{
		return m_trackss;
	}
	public void setTrackss(Set<Tracks> v_trackss)
	{
		m_trackss=v_trackss;
	}
	public java.lang.String getName()
	{
		return m_Name;
	}
	public void setName(java.lang.String v_Name)
	{
		m_Name=v_Name;
	}

	public Set<Albums> getAlbumss()
	{
		return m_albumss;
	}
	public void setAlbumss(Set<Albums> v_albumss)
	{
		m_albumss=v_albumss;
	}
	public Set<Media_types> getMedia_typess()
	{
		return m_media_typess;
	}
	public void setMedia_typess(Set<Media_types> v_media_typess)
	{
		m_media_typess=v_media_typess;
	}
}
