package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElsePractice02 {

	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 과목번호 입력
		int subjectNum;
		System.out.println("과목을 선택하세요");
		System.out.println("(1.자바\t2.C\t3.C++\\t4.파이썬)");
		subjectNum = sc.nextInt();
		
		// 1일경우 R101
		if(subjectNum == 1)
		{
			System.out.println("R101호입니다.");
		}
		// 2일경우 R202
		else if (subjectNum == 2) 
		{
			System.out.println("R202호입니다.");
		}
		// 3일경우 R303
		else if (subjectNum == 3) 
		{
			System.out.println("R303호입니다.");
		}
		// 4일경우 R404
		else if (subjectNum == 4) 
		{
			System.out.println("R404호입니다.");
		}
		// 나머지 : 상담원에게 문의
		else {
			System.out.println("상담원에게 문의하세요");
		}

		// 스캐너 해제
		sc.close();
	}

}
