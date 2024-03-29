package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx {
	public static void main(String[] args) {
		// 스캐너 열기
		Scanner sc = new Scanner(System.in);
		
		// 과목번호 입력
		int subjectNum;
		System.out.println("과목을 선택하세요");
		System.out.println("(1.자바\t2.C\t3.C++\t4.파이썬)");
		System.out.print("과목 번호 : ");
		subjectNum = sc.nextInt();
		
		// 조건분기 (switch)
		switch (subjectNum) {
		// 1일경우 R101
		case 1: {
			System.out.println("R101호입니다.");
			break;
		}
		// 2일경우 R202
		case 2: {
			System.out.println("R202호입니다.");
			break;
		}
		// 3일경우 R303
		case 3: {
			System.out.println("R303호입니다.");
			break;
		}
		// 4일경우 R404
		case 4: {
			System.out.println("R404호입니다.");
			break;
		}
		// 나머지 : 상담원에게 문의
		default:
			System.out.println("상담원에게 문의하세요");
			break;
		}
		
		// 스캐너 닫기
		sc.close();
		
	} 
}
