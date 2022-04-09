package de.elbosso.generated.sqlshell;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "playlist_track"
/*	,indexes = {
		@Index(name= "sqlite_autoindex_playlist_track_1", columnList="PlaylistIdTrackId")
		@Index(name= "IFK_PlaylistTrackTrackId", columnList="TrackId")
	}*/
)
public class Playlist_track
{
	@Id
	@Column(name="ROWID")
	private String id;
	@ManyToOne
	@JoinColumn(name = "PlaylistId"
				, referencedColumnName = "PlaylistId"
	)
	private Playlists m_playlist_track_playlists;


	@ManyToOne
	@JoinColumn(name = "TrackId"
				, referencedColumnName = "TrackId"
	)
	private Tracks m_playlist_track_tracks;


	public Playlists getPlaylists()
	{
		return m_playlist_track_playlists;
	}
	public void setPlaylists(Playlists v_playlists)
	{
		m_playlist_track_playlists=v_playlists;
	}
	public Tracks getTracks()
	{
		return m_playlist_track_tracks;
	}
	public void setTracks(Tracks v_tracks)
	{
		m_playlist_track_tracks=v_tracks;
	}

}