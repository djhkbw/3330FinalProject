package test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Song one = new Song("One", Genre.ROCK, "Joker", 1.28);
		 Song two = new Song("Two", Genre.POP, "Batman", 2.10);
		 Song three = new Song("Three", Genre.CLASSICAL, "Quinn", 3.50);
		 
		 Playlist jams = new Playlist();
		 jams.addSong(one);
		 jams.addSong(two);
		 jams.addSong(three);
		 
		 jams.printSongs();
		 System.out.println(jams.getTotalRuntime());
	}

}
