package com.javaex.basic.reftype;

public class EnumEx {
	// enum 메서드 테스트
	
	public static void main(String[] args) {
		Week today = Week.WESNESDAY;
		
		System.out.println(today);
		System.out.printf("Today is %s(%d)%n",
				today.name(),		// 열거 상수의 문자열 표현 
				today.ordinal());	// 열거 상수의 열거 객체내 표현
		
		String strWeek = "FRIDAY";
		Week obj = Week.valueOf(strWeek);
		
		System.out.printf("obj is %s(%d)%n",	 
				obj.name(), 
				obj.ordinal());
	}
}
