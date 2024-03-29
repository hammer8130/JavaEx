package com.javaex.oop.song.v3;

// v3. this 생성자

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;
	
	public Song(String artist, String title) {
		this.artist=artist;
		this.title=title;
		System.out.println("title, artist 초기화");
	}
	
	public Song(String artist, String title,String album,int year,String track, String composer) {
		this(artist,title);
		this.album=album;
		this.year=year;
		this.track=track;
		this.composer=composer;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist=artist;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public void setAlbum(String album) {
		this.album=album;
	}
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year=year;
	}
	
	public String getTrack() {
		return track;
	}
	
	public void setTrack(String track) {
		this.track=track;
	}
	
	public String getComposer() {
		return composer;
	}
	
	public void setComposer(String composer) {
		this.composer=composer;
	}
	
	public void showInfo() {
		System.out.println(getArtist()+","+getTitle()+"( "+
						getAlbum()+","+getYear()+","+getTrack()+","+getComposer()+" )"
						);
	}
}
