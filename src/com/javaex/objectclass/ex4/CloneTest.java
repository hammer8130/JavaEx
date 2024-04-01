package com.javaex.objectclass.ex4;

public class CloneTest {

	public static void main(String[] args) {
		Scoreboard s1 = new Scoreboard(new int[] {10,20,30,40});
		System.out.println("s1="+s1);
		
		Scoreboard s2 = s1.getClone();
		System.out.println("s2="+s2);
		
		System.out.println("s1==s2 ?"+(s1==s2)); // 다른 객체
		
		s1.getScores()[0] = 50; // 내부 참조 필드의 값을 변경
		System.out.println("s2="+s2);
		System.out.println("s1.scores == s2.scores ?"+
							(s1.getScores()==s2.getScores()));
		//s1과 s2의 scores는 다른 객체이다. 깊은 복제를 하면 복제에 영향이 없다.
		
		// s1.scores, s2.scores는 같은 참조 주소인가?
	}

}
