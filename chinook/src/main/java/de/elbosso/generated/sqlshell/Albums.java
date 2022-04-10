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
	//in case there is no @Id annotation - just uncomment the following three lines!
	//@Id
	//@Column(name="ROWID")
	//private String rowid_id;


	@OneToMany(mappedBy = "m_tracks_albums", cascade = CascadeType.DETACH)
	private Set<Tracks> m_albums_trackss = new HashSet();

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
	private Integer m_albums_AlbumId;

	@NotNull
	@Column(name = "Title"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_albums_Title;

	@ManyToOne
	@JoinColumn(name = "ArtistId"
				, referencedColumnName = "ArtistId"
	)
	private Artists m_albums_artists;


//AlbumId
	public Integer getAlbumId()
	{
		return m_albums_AlbumId;
	}
	public void setAlbumId(Integer v_AlbumId)
	{
		m_albums_AlbumId=v_AlbumId;
	}
//it is an export
	public Set<Tracks> getTrackss()
	{
		return m_albums_trackss;
	}
	public void setTrackss(Set<Tracks> v_trackss)
	{
		m_albums_trackss=v_trackss;
	}
//Title
	public String getTitle()
	{
		return m_albums_Title;
	}
	public void setTitle(String v_Title)
	{
		m_albums_Title=v_Title;
	}
//ArtistId
//it is a reference
	public Artists getArtists()
	{
		return m_albums_artists;
	}
	public void setArtists(Artists v_artists)
	{
		m_albums_artists=v_artists;
	}

//public Set<Media_types> getMedia_types_via_trackss()
//public Set<Genres> getGenres_via_trackss()
}