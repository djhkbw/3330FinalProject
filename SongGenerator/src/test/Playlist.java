package test;

import java.util.ArrayList;
import java.util.Collections;

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
	public void searchSong(String songName) {
		if(songList.size() == 0) System.out.println("The playlist is empty.");
		int count = 0;
		for(Song song : songList) {
			if(song.getName().equals(songName)) {
				System.out.println(song.toString());
				count++;
			}
//			int count = 0;
//			for (int i = 0; i < songList.size(); i++) {
//				Song currentSong = songList.get(i);
//				if (currentSong.getName().equals(songName)) {
//					System.out.println(currentSong.toString());
//					count++;
//				}
//			}
		}
		if(count == 0) {
			System.out.println("There are no songs in the playlist with that name.");
		}
	}
	
	//Gets the total runtime of the play list
	public float getTotalRuntime() {
		if(songList.size() == 0) System.out.println("The playlist is empty.");
		float total = 0;
		for(Song song : songList) {
			total += song.getLength();
		}
		return total;
	}
	//returns songs of certain artists in the play list
	public void getSongsByArtist(String artist) {
		if(songList.size() == 0) System.out.println("The playlist is empty.");
		int count = 0;
		for(Song song : songList) {
			if(song.getArtist().equals(artist)) {
				System.out.println(song.toString());
				count++;
			}
		}
		if(count == 0) {
			System.out.println("There are no songs in this playlist by that artist.");
		}
	}
	
	//returns songs below a certain length
	public void getSongsBelowLength(float length) {
		if(songList.size() == 0) System.out.println("The playlist is empty.");
		int count = 0;
		for(Song song : songList) {
			if(song.getLength() < length) {
				System.out.println(song.toString());
				count++;
			}
		}
		if(count == 0) {
			System.out.println("There were no songs in the playlist shorter than the given length.");
		}
	}
	
	//prints all songs longer than a given length
	public void getSongsAboveLength(double length) {
		if(songList.size() == 0) System.out.println("The playlist is empty.");
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
		if(songList.size() == 0) System.out.println("The playlist is empty.");
		for(Song song : songList) {
			System.out.println(song.toString());
		}
	}
	
	//Prints only songs of a certain genre;
	public void printByGenre(Genre genre) {
		if(songList.size() == 0) System.out.println("The playlist is empty.");
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

	public void removeSong(String songName) {
		if(songList.size() == 0) { 
			System.out.println("The playlist is empty.");
			return;
		}
		for (int i = 0; i < songList.size(); i++) {
			Song song = songList.get(i);
			if (song.getName().equals(songName)) {
				songList.remove(i);
				break; // Exit the loop after removing the song
			}
		}
	}
	
	// Shuffles the order of the songs in the playlist
	public void shufflePlaylist() {
		Collections.shuffle(songList);
		this.printPlaylist();
	}
	
	public void clearPlaylist() {
		songList.clear();
	}
}

