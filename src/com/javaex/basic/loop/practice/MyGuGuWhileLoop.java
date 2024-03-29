package com.javaex.basic.loop.practice;

public class MyGuGuWhileLoop {
	public static void main(String[] args) {
		// 2단부터 ~ 9단(차후에 편집 가능)까지 구구단을 출력하는 프로그램
		// while 문으로 출력 파트 구성
		final int guguMax = 9;
		
		System.out.println("======================================================");
		System.out.println("\t2단부터 ~ " + guguMax +"단까지 구구단을 출력하는 프로그램");
		System.out.println("======================================================");
		
		// 2단부터 시작
		int num1 = 2;
		int num2;
		
		while (num1 <= guguMax) {
			num2 = 1;
			while(num2 <= guguMax)
			{
				// num1 * num2 = result 출력
				System.out.print(num1 + " * " + num2 + " = " + (num1*num2) + "\t");
				num2++;	
			}
			System.out.println();
			num1++;
		}
	}
}
