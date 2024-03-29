package com.javaex.basics.operators;

public class BitOperEx {
	public static void main(String[] args) {
		// 비트 연산자 연습
//		bitOperTest();
		
		// 비트 시프트 연산자
		bitShiftTest();
	}
	
	public static void bitOperTest() {
		// 비트 연산자
		byte b1 = 0b1101; //13
		byte b2 = 0b0111; //7
		
		int result = b1 & b2;	// 비트 AND : 0101 = 5 
		System.out.println("b1 & b2 : " + Integer.toBinaryString(result));
		
		result = b1 | b2;		// 비트 OR : 1111 = 15
		System.out.println("b1 | b2 : " + Integer.toBinaryString(result));
		
		result = b1 ^ b2;		// 비트 XOR : 1010 = 10
		System.out.println("b1 ^ b2 : " + Integer.toBinaryString(result));
		
		result = ~b1;			// 비트 NOT : 0010 = 2가 아니라 바이트도 인트로 계산한다. 그래서 앞이 전부 1
		System.out.println("~b1 binary : " + Integer.toBinaryString(result));
		System.out.println("~b1 decimal : " + (result));
	}
	
	public static void bitShiftTest() {
		int val1 = 1;
		System.out.println("value : " + val1);
		
		// 왼쪽으로 1비트 이동 2 
		System.out.println("value << 1 : " + Integer.toBinaryString(val1 << 1));
		
		// 왼쪽으로 4비트 이동 16 
		System.out.println("value << 4 : " + Integer.toBinaryString(val1 << 4));
		
		int val2 = 0b1000;
		// 오른쪽으로 1비트 이동 0b0100 : 8 
		System.out.println("value2 >> 1 : " + Integer.toBinaryString(val2 >> 1));
		// 오른쪽으로 3비트 이동 0b0001 : 1 
		System.out.println("value2 >> 3 : " + Integer.toBinaryString(val2 >> 3));
	}
}
