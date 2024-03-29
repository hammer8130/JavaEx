package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx3 {
	public static void main(String[] args) {
		//점수를 입력받아 입력된 수가 3의 배수인지 판별하는 프로그램을 작성하세요.
		//스캐너 만들기
		Scanner sc = new Scanner(System.in);
		
		//점수 입력받기 
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		//입력된 수가 3의 배수인지 판별
		boolean isThat3multi;
		
		if(score % 3 == 0)
		{
			isThat3multi = true;			
		}
		else
			isThat3multi = false;
		
		//판별 결과 출력 
		if (isThat3multi) {
			System.out.println("3의 배수입니다.");
		}
		else
		{
			System.out.println(score + "는 3의 배수가 아닙니다.");			
		}
		
		//스캐너 닫기 
		sc.close();
	}
}
