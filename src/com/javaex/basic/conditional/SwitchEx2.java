package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx2 {
	// 1 ,3, 5, 7, 8, 10, 12 : 31일입니다.
	// 4, 6, 9, 11 : 30일입니다.
	// 나머지 (2월) :  28일입니다.
	public static void main(String[] args) {
		//월을 입력받아 해당 월의 일 수를 출력하는 프로그램
		//스캐너 열기
		Scanner sc = new Scanner(System.in);
		
		//월을 입력받기
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();
		String message;
		
		//해당 월의 일 수 찾기
		switch (month) {
		// 1 ,3, 5, 7, 8, 10, 12 : 31일입니다.
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		{
			message = "31일입니다.";
			break;
		}
		// 4, 6, 9, 11 : 30일입니다.
		case 4: 
		case 6:
		case 9:
		case 11:
		{
			message = "30일입니다.";
			break;
		}
		// 나머지 (2월) :  28일입니다.
		case 2:
		{
			message = "28일입니다.";
			break;
		}
		default:
			message = "1~12사이의 숫자를 입력해주세요.";
		}
		//찾은 월의 일수를 출력
		System.out.println(message);
		
		//스캐너 닫기
		sc.close();
	}
}
