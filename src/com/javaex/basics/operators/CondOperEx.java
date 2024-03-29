package com.javaex.basics.operators;

public class CondOperEx {
	public static void main(String[] args) {
		int a = 10;
		
		// a가 짝수면 true, 홀수면 false 출력
		String result = ((a % 2) == 0)? "짝수" : "홀수";
		System.out.println(a + "는 " + result + "입니다.");
		
		int score = 50;
		
		String message;
		// score 가 80점 이상 : Good 
		// score 가 50이상 ~ 80미만 : Pass
		// score 가 50미만 : Fail
		message = (score >= 80) ? "Good" :
			(score >= 50) ? "Pass" : "Fail";
		System.out.println(score + "점은 " + message + "입니다.");
	}
}
