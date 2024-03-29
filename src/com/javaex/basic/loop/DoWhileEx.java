package com.javaex.basic.loop;

import java.util.Scanner;

public class DoWhileEx {
	// 정해지지 않은 수의 정수를 입력, 합산
	// 0이 입력되면 종료
	public static void main(String[] args) {
		// 합산 변수
		int total = 0 ;
		int num = 0;
		
		// 스캐너 열기
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요. [ 0이면 종료 ]");
		
		// 0이면 합산 종료
		do {
			// 스캐너로부터 정수 입력
			num = sc.nextInt();
			
			total += num;
			// 0이 아니면 입력 계속 받기
			System.out.println("합계 : " + total);
		} while (num != 0);
		
		// 스캐너 닫기
		sc.close();
		System.out.println("종료");
	}
}
