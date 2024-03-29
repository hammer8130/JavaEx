package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx4 {
	public static void main(String[] args) {
		// 점수를 입력받아 등급을 표시하는 프로그램을 작성하시오
		// 스캐너 열기
		Scanner sc = new Scanner(System.in);
		
		// 점수를 입력받기
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		// 등급 분류하기
		String grade;
		if (score >= 90) {
			grade = "A등급";
		}
		else if (score >= 80) {
			grade = "B등급";
		}
		else if (score >= 70) {
			grade = "C등급";
		}
		else if (score >= 60) {
			grade = "D등급";
		}
		else {
			grade = "F등급";
		}
		
		// 등급을 표시하기
		System.out.println(grade);
		
		// 스캐너 닫기
		sc.close();
	}
}
