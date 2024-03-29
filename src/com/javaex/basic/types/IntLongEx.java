package com.javaex.basic.types;

public class IntLongEx {
	public static void main(String[] args) {
//		int형 변수 (4byte)
		int intVar1;
		int intVar2;
	
		intVar1 = 2024;
//		intVar2 = 1234567890123;	//out of range
		
		System.out.println(intVar1);
//		System.out.println(intVar2);
		
		
		// long형(8byte)
		long longVar1;
		long longVar2;

		longVar1 = 1234L;  
		longVar2 = 1234567890123L; // long 형 데이터 뒤에는 L
		
		System.out.println(longVar1);
		System.out.println(longVar2);
		
		long amount = 10_000_000_000_000L;
		System.out.println(amount);
		
		// 진법 표기 : 2진수, 8진수, 16진수
		int bin, oct, hex;
		bin = 0b1100;	// 2진수; 0b	
		oct = 072;		// 8진수; 0
		hex = 0xff;		// 16진수; 0x
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		
		//warnings 없애기용
		intVar2 = 0;
		System.out.println(intVar2);
		
	}
}
