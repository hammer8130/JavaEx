package com.javaex.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionEx {
	// 정수 1개 입력
			// 100을 입력받은 정수로 나눔
			// 나눗셈 결과를 화면에 출력
	public static void main(String[] args) {
		double result=0;
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수1개를 입력하세요");
		
		try {
			num=scanner.nextInt();
			
			result=100/num;	
			
		}catch(InputMismatchException e) {
			System.err.println("숫자만 입력하세요");
		}catch(ArithmeticException e) {
			System.err.println("0으로는 나눌 수 없습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// 예외 유무 관계 없이 가장 마지막에 1회 실행
			// try 블록에서 설정된 시스템 자원 송출 해제
			System.out.println("예외처리 종료.");
		}
		System.out.println(result);
		
		scanner.close();
	}

}
