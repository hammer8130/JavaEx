package com.javaex.basic.loop;

import java.util.Scanner;

public class ForLoopEx {
	public static void main(String[] args) {
		// 숫자를 입력받아 입력한 단의 구구단을 출력하세요. for문으로 작성

		// 스캐너 열기
		Scanner sc = new Scanner(System.in);
		
		// 숫자를 입력받기 
		System.out.println("단을 입력해주세요");
		System.out.println("단 : ");
		int num = sc.nextInt();
		
		// 입력한 숫자(단)의 구구단을 출력하세요. for문으로 작성
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
		
		// 스캐너 닫기
		sc.close();
	}
}
