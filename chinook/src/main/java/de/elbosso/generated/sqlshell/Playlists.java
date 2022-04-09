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

	@ManyToMany
	@JoinTable(
	  name = "tracks_playlist_track",
	  joinColumns = @JoinColumn(name = "PlaylistId"),
	  inverseJoinColumns = @JoinColumn(name = "TrackId"))
	private Set<Tracks> m_tracks_via_playlist_tracks = new HashSet();

	@OneToMany(mappedBy = "m_playlist_track_playlists", cascade = CascadeType.DETACH)
	private Set<Playlist_track> m_playlists_playlist_tracks = new HashSet();

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

	public Integer getPlaylistId()
	{
		return m_playlists_PlaylistId;
	}
	public void setPlaylistId(Integer v_PlaylistId)
	{
		m_playlists_PlaylistId=v_PlaylistId;
	}
	public Set<Playlist_track> getPlaylist_tracks()
	{
		return m_playlists_playlist_tracks;
	}
	public void setPlaylist_tracks(Set<Playlist_track> v_playlist_tracks)
	{
		m_playlists_playlist_tracks=v_playlist_tracks;
	}
	public String getName()
	{
		return m_playlists_Name;
	}
	public void setName(String v_Name)
	{
		m_playlists_Name=v_Name;
	}

	public Set<Tracks> getTracks_via_playlist_tracks()
	{
		return m_tracks_via_playlist_tracks;
	}
	public void setTracks_via_playlist_tracks(Set<Tracks> v_trackss)
	{
		m_tracks_via_playlist_tracks=v_trackss;
	}
}