package test;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//create a song
		Song song1 = new Song("Song1", Genre.POP, "Artist1", 3.5);
		System.out.println(song1.toString());
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the song name: ");
		String songName = sc.nextLine();
		if (songName.isEmpty()) {
			System.out.println("Please enter a song name: ");
			songName = sc.nextLine();
		}
		System.out.println("Enter the genre: ");
		String genre = sc.nextLine();
		if (genre.isEmpty()) {
			System.out.println("Please enter a genre: ");
			genre = sc.nextLine();
		}
		System.out.println("Enter the artist: ");
		String artist = sc.nextLine();
		if (artist.isEmpty()) {
			System.out.println("Please enter an artist: ");
			artist = sc.nextLine();
		}
		System.out.println("Enter the duration: ");
		double duration = sc.nextDouble();
		if (duration == 0) {
			System.out.println("Please enter a duration: ");
			duration = sc.nextDouble();
		}
		System.out.println("Enter the song name to search: ");
		String searchSong = sc.nextLine();
		if (searchSong.isEmpty()) {
			System.out.println("Please enter a song name to search: ");
			searchSong = sc.nextLine();
		}
	
		sc.close();
	

		//save input to song object
		Song song2 = new Song(songName, Genre.valueOf(genre), artist, duration);
		System.out.println(song2.toString());
		//add song to playlist
		Playlist playlist1 = new Playlist();
		playlist1.addSong(song1);
		playlist1.addSong(song2);
		System.out.println(playlist1.toString());
		
		 //get total runtime of playlist
		System.out.println("Total runtime of playlist: " + playlist1.getTotalRuntime());
		
		//remove song from playlist
		playlist1.removeSong(song1);
		System.out.println(playlist1.toString());
		//search for song in playlist
		
		playlist1.searchSong(searchSong);

		System.out.println("searched song: " + searchSong);
		
		
		


		
	
		
		// //create a login
		// login user1 = new login("User1", "Password1");
		// System.out.println(user1.toString());
		// System.out.println("Enter your username: ");
		// String username1 = sc.nextLine();
		// System.out.println("Enter your password: ");
		// String password1 = sc.nextLine();

		
		// //prompt user to login

	

		
		// //check if the user is valid
		// if(user1.checkLogin(username1, password1)) {
		// 	System.out.println("Login successful");

		// }
		// else {
		// 	System.out.println("Login failed");
		// }
		



		

		
		
	
	

	}


}
