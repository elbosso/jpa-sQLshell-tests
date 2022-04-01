package de.elbosso.generated.sqlshell.chinook;

import javax.persistence.*;

@Entity
@Table(name = "playlist_track"
/*	,indexes = {
		@Index(name= "sqlite_autoindex_playlist_track_1", columnList="PlaylistIdTrackId")
		@Index(name= "IFK_PlaylistTrackTrackId", columnList="TrackId")
	}*/
)
public class Playlist_track
{

	@ManyToOne
	@JoinColumn(name = "PlaylistId", referencedColumnName = "PlaylistId")
	private Playlists m_playlists;


	@ManyToOne
	@JoinColumn(name = "TrackId", referencedColumnName = "TrackId")
	private Tracks m_tracks;


	public Playlists getPlaylists()
	{
		return m_playlists;
	}
	public void setPlaylists(Playlists v_playlists)
	{
		m_playlists=v_playlists;
	}
	public Tracks getTracks()
	{
		return m_tracks;
	}
	public void setTracks(Tracks v_tracks)
	{
		m_tracks=v_tracks;
	}

}
