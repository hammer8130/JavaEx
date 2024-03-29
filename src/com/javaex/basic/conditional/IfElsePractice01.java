package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElsePractice01 {
	public static void main(String[] args) {
		// 숫자를 입력 받아 양수/음수/0을 나누고
		// 양수일 경우 홀짝을 구분해주는 프로그램
		
		//스캐너 열기
		Scanner sc = new Scanner(System.in);
		//숫자 입력
		int input;
		
		System.out.print("숫자 입력 : ");
		input = sc.nextInt();
		
		boolean isOdd;
		//양수일때
		if(input > 0)
		{
			isOdd = (input % 2) == 1 ? true : false;
			
			//홀수면 홀수
			if(isOdd)
			{
				System.out.println("홀수입니다.");				
			}
			//짝수면 짝수
			else {
				System.out.println("짝수입니다.");
			}
		}
		//음수면 음수
		else if (input < 0) {
			System.out.println("음수입니다.");						
		}
		//0이면 0출력
		else {
			System.out.println("0입니다.");						
		}
		System.out.println();
		//스캐너 닫기
		sc.close();
	}
}
