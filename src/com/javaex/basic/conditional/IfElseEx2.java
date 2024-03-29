package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElseEx2 {

	public static void main(String[] args) {
		// 숫자를 입력, 숫자 > 0 : 양수, 숫자 < 0 : 음수, 숫자 == 0 : 0입니다
		
		//스캐너 열기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력 : ");
		
		//숫자 입력
		int num = sc.nextInt();
		
		//숫자 조건 분기
//		if(num > 0)
//		{
//			System.out.println("양수입니다.");
//			System.out.println("양수입니다.");
//		}
//		else if (num == 0) {
//			System.out.println("0입니다.");
//		}
//		else {
//			System.out.println("음수입니다.");			
//		}
		
//		중첩 if
		if(num == 0)
		{
			System.out.println("0입니다.");			
		}
		else {
			// 양수 아니면 음수
			if(num > 0)
			{
				System.out.println("양수입니다.");
			}
			else
			{
				System.out.println("음수입니다.");			
			}
		}
		
		//스캐너 닫기
		sc.close();		
	}

}