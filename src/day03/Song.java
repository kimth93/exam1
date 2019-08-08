package day03;

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public void getTitle(String t) {
		title = t;
	}
	
	public void getArtist(String a) {
		artist = a;
	}
	
	public void getAlbum(String b) {
		album = b;		
	}
	
	public void getComposer(String c) {
		composer = c;
	}
	
	public void getYear(int y) {
		year = y;
	}
	public void getTrack(int t) {
		track = t;
		
	}
	
	
	public void show( ) {
		System.out.println(artist + title + "(" + album + ",");
		
	}
}
