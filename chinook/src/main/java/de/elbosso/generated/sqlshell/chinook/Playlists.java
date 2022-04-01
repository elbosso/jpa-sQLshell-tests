package de.elbosso.generated.sqlshell.chinook;

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
	  name = "playlist_track",
	  joinColumns = @JoinColumn(name = "PlaylistId"),
	  inverseJoinColumns = @JoinColumn(name = "TrackId"))
	private Set<Tracks> m_trackss = new HashSet();

	@OneToMany(mappedBy = "m_playlists", cascade = CascadeType.DETACH)
	private Set<Playlist_track> m_playlist_tracks = new HashSet();

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PlaylistId"
		, nullable = false
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private java.lang.Integer m_PlaylistId;

	@Column(name = "Name"
		, length=2000000000
		, precision=2000000000
		, scale=10
	)
	private java.lang.String m_Name;

	public java.lang.Integer getPlaylistId()
	{
		return m_PlaylistId;
	}
	public void setPlaylistId(java.lang.Integer v_PlaylistId)
	{
		m_PlaylistId=v_PlaylistId;
	}
	public Set<Playlist_track> getPlaylist_tracks()
	{
		return m_playlist_tracks;
	}
	public void setPlaylist_tracks(Set<Playlist_track> v_playlist_tracks)
	{
		m_playlist_tracks=v_playlist_tracks;
	}
	public java.lang.String getName()
	{
		return m_Name;
	}
	public void setName(java.lang.String v_Name)
	{
		m_Name=v_Name;
	}

	public Set<Tracks> getTrackss()
	{
		return m_trackss;
	}
	public void setTrackss(Set<Tracks> v_trackss)
	{
		m_trackss=v_trackss;
	}
}
