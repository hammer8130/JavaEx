package com.javaex.basic.types;

public class CastingEx {
	public static void main(String[] args) {
		// 암시적 캐스팅 (Promotion)
//		promotionEx();
		
		// 명시적 캐스팅 (Casting)
		castingEx();
	}
	
	public static void castingEx() {
		// 표현 범위가 넓은 자료형 -> 좁은 자료형으로의 변환
		// 데이터의 유실 위험 -> 반드시 강제 타입 변환이 필요
		double d = 123456.7890;
		System.out.println("d = " + d);
		
		float f = (float) d; //8바이트 실수 -> 4바이트 실수
		System.out.println("f = " + f);
		
		long l = (long) f;
		System.out.println("l = " + l); // 4바이트 실수 -> 8바이트 정수
		
		int i = (int) l;
		System.out.println(Integer.toBinaryString(i)); // 4바이트 실수 -> 8바이트 정수
		
		short s = (short) l;
		System.out.println("s = " + s); // 8바이트 정수 -> 2바이트 실수
		
		
	}
	
	public static void promotionEx() {
		// 표현 범위가 좁은 자료형 -> 넓은 자료형으로의 변환
		// 암묵적으로 자동 캐스팅 수행
		// byte -> short -> int -> long
		// -> float -> double
		byte b = 25;	// 1바이트 정수형
		System.out.println("bite b : " + b);
		
		short s = b;
		System.out.println("short s : " + s);
		
		int i = s;
		System.out.println("int i : " + i);
		
		long l = i;
		System.out.println("long l : " + l);
		
		float f = l;
		System.out.println("float f : " + f);
		
		double d = f;
		System.out.println("double b : " + d);
		
		char ch = 'A';
		short s2 = (short) ch; // unsigned int (2) -> short 2바이트 정수
		System.out.println("char -> short : " + s2);
		
	}
}
