package com.javaex.basic.types;

public class CharEx {
	public static void main(String[] args) {
		// char : 문자 1개의 유니코드를 저장 
		char ch1 = 'A';
		char ch2 = '한';
		// char chAdd;
		
		System.out.println("ch1 : " + ch1);
		System.out.println("ch2 : " + ch2);
		
		System.out.println(ch1 + ch2);
		
		String str = "A한";
		System.out.println("str : " + str);		
	}
}
