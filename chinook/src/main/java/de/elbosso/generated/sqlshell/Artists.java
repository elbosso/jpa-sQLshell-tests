package de.elbosso.generated.sqlshell;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "artists"
)
public class Artists
{

	@OneToMany(mappedBy = "m_albums_artists", cascade = CascadeType.DETACH)
	private Set<Albums> m_artists_albumss = new HashSet();

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@Column(name = "ArtistId"
		, nullable = false
		, updatable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private Integer m_artists_ArtistId;

	@Column(name = "Name"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_artists_Name;

	public Integer getArtistId()
	{
		return m_artists_ArtistId;
	}
	public void setArtistId(Integer v_ArtistId)
	{
		m_artists_ArtistId=v_ArtistId;
	}
	public Set<Albums> getAlbumss()
	{
		return m_artists_albumss;
	}
	public void setAlbumss(Set<Albums> v_albumss)
	{
		m_artists_albumss=v_albumss;
	}
	public String getName()
	{
		return m_artists_Name;
	}
	public void setName(String v_Name)
	{
		m_artists_Name=v_Name;
	}

}