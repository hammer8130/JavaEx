package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElseEx {
	// 점수 입력, 60점 이상이면 합격입니다. 출력
	public static void main(String[] args) {
		// 스캐너 열기
		Scanner sc = new Scanner(System.in);
		int score;
		// 점수 입력 받기
		System.out.print("점수를 입력해주세요 : ");
		score = sc.nextInt();
		
		final int scoreGoal = 60;
		// 점수 비교
		if(score >= scoreGoal)
		{
			System.out.println("합격입니다.");
		}
		else
		{
			System.out.println("불합격입니다.");
		}
			

		// 스캐너 닫기
		sc.close();
		
	}

}
