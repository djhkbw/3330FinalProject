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
		System.out.println("Enter a number for the genre \n(1 = Rock, 2 = Pop, 3 = Grunge, 4 = Classical, 5 = Electro, 6 = Jazz, 7 = Country): ");
		int genreInput;
		Genre genre = null;
		while(true) {
			try {
				genreInput = sc.nextInt();
				while (genreInput < 1 || genreInput > 7) {
					System.out.println("Enter a listed number for the genre:");	
					genreInput = sc.nextInt();
				}
				break;
			}catch(Exception e){
				System.out.println("Enter a listed number for the genre:");
				sc.next();
			}
		}
		if(genreInput == 1) {
			genre = Genre.ROCK;
		}
		if(genreInput == 2) {
			genre = Genre.POP;
		}
		if(genreInput == 3) {
			genre = Genre.GRUNGE;
		}
		if(genreInput == 4) {
			genre = Genre.CLASSICAL;
		}
		if(genreInput == 5) {
			genre = Genre.ELECTRO;
		}
		if(genreInput == 6) {
			genre = Genre.JAZZ;
		}
		if(genreInput == 7) {
			genre = Genre.COUNTRY;
		}
//		String genre = sc.nextLine();
//		if (genre.isEmpty()) {
//			System.out.println("Please enter a genre: ");
//			genre = sc.nextLine();
//		}
		System.out.println("Enter the artist: ");
		String artist = sc.nextLine();
		if (artist.isEmpty()) {
			System.out.println("Please enter an artist: ");
			artist = sc.nextLine();
		}
		System.out.println("Enter the duration: ");
		double duration;
		while(true) {
			try {
				duration = sc.nextDouble();
				while (duration == 0) {
					System.out.println("Enter the duration (example: 2.36):");
					duration = sc.nextDouble();
				}
				break;
			}catch(Exception e){
				System.out.println("Enter the duration (example: 2.36):");
				sc.next();
			}
		}
//		if (duration == 0) {
//			System.out.println("Please enter a duration: ");
//			duration = sc.nextDouble();
//		}
		System.out.println("Enter the song name to search: ");
		String searchSong = sc.nextLine();
		if (searchSong.isEmpty()) {
			System.out.println("Please enter a song name to search: ");
			searchSong = sc.nextLine();
		}
	
		sc.close();
	

		//save input to song object
		Song song2 = new Song(songName, genre, artist, duration);
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
