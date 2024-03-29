package com.javaex.basic.loop;

import java.util.Scanner;

public class WhileGuGu {
	public static void main(String[] args) {
		// 스캐너 열기
		Scanner sc = new Scanner(System.in);
		
		// 단 입력 받기
		System.out.print("단을 입력해주세요\n단 : ");
		int dan = sc.nextInt();
		
		int num = 1;
		// 1 ~ 9까지 while loop
		while(num < 10)
		{
			//	단 * num 출력
			System.out.println(dan + " * " + num + " = " + dan * num );
			num++;
		}
		
		// 스캐너 닫기
		sc.close();
	}
}
