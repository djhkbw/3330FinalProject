package test;

import java.util.ArrayList;

public class Playlist {
	
	private ArrayList<Song> songList = new ArrayList<Song>();
	
	public Playlist() {}
	
	public Playlist(ArrayList<Song> list) {
		for(Song song : list) {
			songList.add(song);
		}
	}
	
	//adds a song to the play list
	public void addSong(Song s) {
		boolean duplicate = this.isDuplicate(s);
		if(!duplicate) {
			songList.add(s);
		}
	}
	
	//searches for a song in the play list
	public void searchSong(String name) {
		for(Song song : songList) {
			if(song.getName() == name) {
				System.out.println("Song found: " + song.toString());
			}
		}
	}
	
	//Gets the total runtime of the play list
	float getTotalRuntime() {
		float total = 0;
		for(Song song : songList) {
			total += song.getLength();
		}
		return total;
	}
	//returns songs of certain artists in the play list
	public void getSongsByArtist(String artist) {
		for(Song song : songList) {
			if(song.getArtist() == artist) {
				System.out.println(song.toString());
			}
		}
	}
	//returns songs below a certain length
	public void getSongsBelowLength(float length) {
		for(Song song : songList) {
			if(song.getLength() < length) {
				System.out.println(song.toString());
			}
		}
	}
	
	//prints all songs longer than a given length
	public void getSongsAboveLength(double length) {
		int count = 0;
		for(Song song : songList) {
			if(song.getLength() > length) {
				System.out.println(song.toString());
				count++;
			}
		}
		if(count == 0) {
			System.out.println("There are no songs in the playlist longer than the given length.");
		}
	}
	
	//Prints whole play list
	public void printPlaylist() {
		for(Song song : songList) {
			System.out.println(song.toString());
		}
	}
	
	//Prints only songs of a certain genre;
	public void printByGenre(Genre genre) {
		int count = 0;
		for(Song song : songList) {
			if(song.getGenre() == genre) {
				System.out.println(song.toString());
				count++;
			}
		}
		if(count == 0) {
			System.out.println("There are no songs of that genre in the playlist yet.");
		}
	}
	
	//Helper function
	private boolean isDuplicate(Song s) {
		boolean duplicate = false;
		for(Song song : songList) {
			if(song.getName() == s.getName() && song.getArtist() == s.getArtist()) {
				duplicate = true;
			}
		}
		return duplicate;
	}

	public void removeSong(Song songToRemove) {
		for (Song song : songList) {
			if (song.getName().equals(songToRemove.getName()) && song.getArtist().equals(songToRemove.getArtist())) {
				songList.remove(song);
				break; // Exit the loop after removing the song
			}
		}
	}
}
