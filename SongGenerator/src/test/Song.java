package test;

public class Song {
	
	private String name;
	private String genre;
	private String artist;
	
	public Song(String name, String genre, String artist) {
		this.name = name;
		this.genre = genre;
		this.artist = artist;
	}
	
	public String ToString() {
		return "Song: [name: " + this.name + ", artist: " + this.artist + ", genre: " + this.genre + "]";
	}
	
	String GetName() {
		return this.name;
	}
	void SetName(String name) {
		this.name = name;
	}
	
	String GetGenre() {
		return this.genre;
	}
	void SetGenre(String genre) {
		this.genre = genre;
	}
	
	String GetArtist() {
		return this.name;
	}
	void SetArtist(String artist) {
		this.artist = artist;
	}
}
