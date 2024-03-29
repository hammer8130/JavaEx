package com.javaex.basic.types;

import java.util.Calendar;

public class ConstantEx {
	public static void main(String[] args) {
		// 상수 : 변하지 않는 수
		// 초기화, 조회 가능, 재할당 불가
		final double PI = 3.14159; // 상수의 이름은 모두 대문자, _로 단어 구분
		final int SPEED_LIMIT = 110;
		
		System.out.println(PI);
		System.out.println(SPEED_LIMIT);
		
		//재할당 불가
//		SPEED_LIMIT = 100;
		System.out.println("현재 제한 속도는 " + SPEED_LIMIT);
		System.out.println("제한 속도 " + SPEED_LIMIT + " 이하로 주행해 주세요");
		
		System.out.print(Calendar.JANUARY);
	}
}
