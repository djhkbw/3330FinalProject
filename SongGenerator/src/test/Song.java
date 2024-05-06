package test;

public class Song {
	
	private String name;
	private Genre genre;
	private String artist;
	private double length;
	
	//constructor
	public Song(String name, Genre genre, String artist, double length) {
		this.name = name;
		this.genre = genre;
		this.artist = artist;
		this.length = length;
	}
	
	//Returns song info as string
	public String toString() {
		return "Song: [name: " + this.name + ", artist: " + this.artist + ", length: " + this.length + ", genre: " + this.genre + "]";
	}
	
	//getters & setters
	String getName() {
		return this.name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	Genre getGenre() {
		return this.genre;
	}
	void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	String getArtist() {
		return this.artist;
	}
	void setArtist(String artist) {
		this.artist = artist;
	}
	double getLength() {
		return this.length;
	}
	void setLength(double length) {
		this.length = length;
	}
}
