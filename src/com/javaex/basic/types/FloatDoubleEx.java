package com.javaex.basic.types;

public class FloatDoubleEx {
	public static void main(String[] args) {
		// float (4byte)
		// double (8byte) -> default
		float floatVar;
		double doubleVar;
		
		// 정밀도 체크
		floatVar = 0.12345678901234567890f;
		doubleVar = 0.12345678901234567890;
		
		System.out.println("float : " + floatVar);
		System.out.println("double : " + doubleVar);
		
		int intVar;
		intVar = 300_000_000;
		floatVar = 3E9f;
		doubleVar = 3e-9;
		
		System.out.println("intVar:" + intVar);
		System.out.println("floatVar:" + floatVar);
		System.out.println("doubleVar:" + doubleVar);
		
		// 부동 소숫점 계산의 유의점
		// float와 double형은 정밀도 포기하고 표현 범위만 넓힌 데이터
		System.out.println(0.1 * 3);
	}
}
