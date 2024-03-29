package com.javaex.oop.song.v3;

public class SongApp {

	public static void main(String[] args) {
		Song s1 = new Song("아이유","좋은날","Real",2010,"3번 track","이민수 작곡");
		Song s2 = new Song("BIGBANG","거짓말","Always",2007,"2번 track","G-DRAGON 작곡");
		Song s3 = new Song("버스커버스커","벚꽃엔딩","버스커버스커1집",2012,"4번 track","장범준 작곡");
		
		
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
	}

}
