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
	//removes a song from the play list
	public void removeSong(Song s) {
		for(Song song : songList) {
			if(song.getName() == s.getName() && song.getArtist() == s.getArtist()) {
				songList.remove(song);
			}
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
	
	//Prints whole play list
	public void printPlaylist() {
		//System.out.println("\n");
		for(Song song : songList) {
			System.out.println(song.toString());
		}
		//System.out.println("\n");
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
}
