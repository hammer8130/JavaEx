package com.javaex.basic.types;

public class VarEx {
	public static void main(String[] args) {
		int myAge;
		myAge = 52;
		
		System.out.print(myAge);
		
		int myAge2 = 62;
		int v1 = 10, v2 = 20, v3 = 30;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		v1 = v2 = v3 = 40;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		// warnings 제거용
		System.out.println(myAge2);
	}
}