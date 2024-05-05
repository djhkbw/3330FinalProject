package test;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Playlist playlist = new Playlist();
		while(true) {
			//Explain program to user
			int usrInput = 0;
			System.out.println("Welcome to Song Generator!\n"
					+ "(1): Add a song to the playlist\n"
					+ "(2): Search current playlist for songs\n"
					+ "(3): Get the total runtime of the playlist\n"
					+ "(4): Remove a song from the playlist"
					+ "(5): See all songs included in the playlist\n"
					+ "(6): Get all songs of a certain genre\n"
					+ "(8): Get all songs of a certain artist\n"
					+ "(9): Get all songs below a certain length\n"
					+ "(10): Clear playlist");
			
			//get user input
			while(true) {
				try {
					Scanner sc=new Scanner(System.in);
					usrInput = sc.nextInt();
					while(usrInput < 1 || usrInput > 10) {
						System.out.println("Please enter bewteen 1 and 10:");
						usrInput = sc.nextInt();
					}
					break;
				}
				catch(Exception e){
					System.out.println("Please enter bewteen 1 and 10:");
				}
			}
			
			if(usrInput == 1) {
				addNewSongToPlaylist(playlist);
			}
			if(usrInput == 2) {
				
			}
			if(usrInput == 3) {
				
			}
			if(usrInput == 4) {
				
			}
			if(usrInput == 5) {
				playlist.printPlaylist();
			}
			if(usrInput == 6) {
				
			}
			if(usrInput == 7) {
				
			}
			if(usrInput == 8) {
				
			}
			if(usrInput == 9) {
				
			}
			if(usrInput == 10) {
				
			}
		}
	

//		//save input to song object
//		Song song2 = new Song(songName, genre, artist, duration);
//		System.out.println(song2.toString());
//		//add song to playlist
//		//Playlist playlist1 = new Playlist();
//		playlist1.addSong(song1);
//		playlist1.addSong(song2);
//		System.out.println(playlist1.toString());
//		
//		 //get total runtime of playlist
//		System.out.println("Total runtime of playlist: " + playlist1.getTotalRuntime());
//		
//		//remove song from playlist
//		playlist1.removeSong(song1);
//		System.out.println(playlist1.toString());
//		//search for song in playlist
//		
//		playlist1.searchSong(searchSong);
//
//		System.out.println("searched song: " + searchSong);
		
		
		


		
	
		
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
	
	public static void addNewSongToPlaylist(Playlist p) {
		Scanner sc=new Scanner(System.in);
		//Read in song name
		System.out.println("Enter the song name: ");
		String songName = sc.nextLine();
		if (songName.isEmpty()) {
			System.out.println("Please enter a song name: ");
			songName = sc.nextLine();
		}
		//read in genre
		System.out.println("Enter a number for the genre \n(1 = Rock, 2 = Pop, 3 = Grunge, 4 = Classical, 5 = Electro, 6 = Jazz, 7 = Country): ");
		int genreInput;
		Genre genre = null;
		//validate input
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
		//read in artist name
		System.out.println("Enter the artist: ");
		String artist = sc.nextLine();
		if (artist.isEmpty()) {
			System.out.println("Please enter an artist: ");
			artist = sc.nextLine();
		}
		//Read in duration and validate input
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
	
		sc.close();
		
		Song s = new Song(songName, genre, artist, duration);
		p.addSong(s);
	}
	

}
