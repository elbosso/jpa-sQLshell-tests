package de.elbosso.generated.sqlshell.chinook;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "media_types"
)
public class Media_types
{

	@ManyToMany
	@JoinTable(
	  name = "tracks",
	  joinColumns = @JoinColumn(name = "MediaTypeId"),
	  inverseJoinColumns = @JoinColumn(name = "GenreId"))
	private Set<Genres> m_genress = new HashSet();

	@ManyToMany(mappedBy = "m_media_typess")
	private Set<Albums> m_albumss = new HashSet();

	@OneToMany(mappedBy = "m_media_types", cascade = CascadeType.DETACH)
	private Set<Tracks> m_trackss = new HashSet();

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MediaTypeId"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private java.lang.Integer m_MediaTypeId;

	@Column(name = "Name"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private java.lang.String m_Name;

	public java.lang.Integer getMediaTypeId()
	{
		return m_MediaTypeId;
	}
	public void setMediaTypeId(java.lang.Integer v_MediaTypeId)
	{
		m_MediaTypeId=v_MediaTypeId;
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

	public Set<Genres> getGenress()
	{
		return m_genress;
	}
	public void setGenress(Set<Genres> v_genress)
	{
		m_genress=v_genress;
	}
	public Set<Albums> getAlbumss()
	{
		return m_albumss;
	}
	public void setAlbumss(Set<Albums> v_albumss)
	{
		m_albumss=v_albumss;
	}
}
