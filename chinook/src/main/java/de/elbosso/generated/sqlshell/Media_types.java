package de.elbosso.generated.sqlshell;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "media_types"
)
public class Media_types
{
	//in case there is no @Id annotation - just uncomment the following three lines!
	//@Id
	//@Column(name="ROWID")
	//private String rowid_id;

	@OneToMany(mappedBy = "m_tracks_media_types", cascade = CascadeType.DETACH)
	private Set<Tracks> m_media_types_trackss = new HashSet();

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@Column(name = "MediaTypeId"
		, nullable = false
		, updatable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private Integer m_media_types_MediaTypeId;

	@Column(name = "Name"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_media_types_Name;

//MediaTypeId
	public Integer getMediaTypeId()
	{
		return m_media_types_MediaTypeId;
	}
	public void setMediaTypeId(Integer v_MediaTypeId)
	{
		m_media_types_MediaTypeId=v_MediaTypeId;
	}
//it is an export
	public Set<Tracks> getTrackss()
	{
		return m_media_types_trackss;
	}
	public void setTrackss(Set<Tracks> v_trackss)
	{
		m_media_types_trackss=v_trackss;
	}
//Name
	public String getName()
	{
		return m_media_types_Name;
	}
	public void setName(String v_Name)
	{
		m_media_types_Name=v_Name;
	}

//public Set<Genres> getGenres_via_trackss()
//public Set<Albums> getAlbums_via_trackss()
}