package de.elbosso.generated.sqlshell;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "playlists"
)
public class Playlists
{
	//in case there is no @Id annotation - just uncomment the following three lines!
	//@Id
	//@Column(name="ROWID")
	//private String rowid_id;

	@ManyToMany
	@JoinTable(
	  name = "playlist_track",
	  joinColumns = @JoinColumn(name = "PlaylistId"),
	  inverseJoinColumns = @JoinColumn(name = "TrackId"))
	private Set<Tracks> m_tracks_via_playlist_tracks = new HashSet();

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@Column(name = "PlaylistId"
		, nullable = false
		, updatable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private Integer m_playlists_PlaylistId;

	@Column(name = "Name"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private String m_playlists_Name;

//PlaylistId
	public Integer getPlaylistId()
	{
		return m_playlists_PlaylistId;
	}
	public void setPlaylistId(Integer v_PlaylistId)
	{
		m_playlists_PlaylistId=v_PlaylistId;
	}
//it is an export
//Name
	public String getName()
	{
		return m_playlists_Name;
	}
	public void setName(String v_Name)
	{
		m_playlists_Name=v_Name;
	}

//public Set<Tracks> getTracks_via_playlist_tracks()
	public Set<Tracks> getTracks_via_playlist_tracks()
	{
		return m_tracks_via_playlist_tracks;
	}
	public void setTracks_via_playlist_tracks(Set<Tracks> v_trackss)
	{
		m_tracks_via_playlist_tracks=v_trackss;
	}
}