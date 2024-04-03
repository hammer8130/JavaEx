package com.javaex.api.util.date;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
//		Calendar 불러오기 : .getInstance()를 통해 인스턴스 확보 가능
		Calendar now = Calendar.getInstance(); // 현재 날짜와 시간
		Calendar custom = Calendar.getInstance();
		
		// 시간 정보 설정
		custom.set(2012, 8,24); // 월 정보는 0부터 시작 -> 9월 24일
		
		// 상수를 이용한 날짜 정보 얻어오기
		int nowYear = now.get(Calendar.YEAR);
		int nowMonth = now.get(Calendar.MONTH)+1;
		int nowDate = now.get(Calendar.DATE);
		
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.%n",nowYear,nowMonth,nowDate);
//		=> Java특성상 월은 0부터.
		
		Calendar future = Calendar.getInstance();  // 현재 시간
//		미래의 시간
		future.add(Calendar.YEAR, 10); // 현재로부터 10년 추가
		System.out.printf("10년 후 오늘은 %d년 %d월 %d일 입니다.%n",
					future.get(Calendar.YEAR),
					future.get(Calendar.MONTH)+1,
					future.get(Calendar.DATE));
		
//		요일 정보 확인
		int dw = future.get(Calendar.DAY_OF_WEEK); //1부터 일요일 시작. ~6까지 
		System.out.println(dw); //2 == 월요일
	}

}
