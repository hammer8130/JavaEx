package com.javaex.oop.song.v2;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;
	
	public Song(String artist, String title,String album,int year,String track, String composer) {
		this.artist=artist;
		this.title=title;
		this.album=album;
		this.year=year;
		this.track=track;
		this.composer=composer;
	}
	
	public String getArtist() {
		return artist;
	}
	
	
	
	public String getTitle() {
		return title;
	}
	
	
	
	public String getAlbum() {
		return album;
	}
	
	
	public int getYear() {
		return year;
	}
	
	
	public String getTrack() {
		return track;
	}
	
	
	
	public String getComposer() {
		return composer;
	}
	
	
	
	public void showInfo() {
		System.out.println(getArtist()+","+getTitle()+"( "+
						getAlbum()+","+getYear()+","+getTrack()+","+getComposer()+" )"
						);
	}
}
