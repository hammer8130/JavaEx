package com.javaex.basic.reftype;

public class StringFormatEx {
	public static void main(String[] args) {
		// %s : (문자열), %d : (10진수), %n : (개행)
		
		// __개의 __ 중에서 __개를 먹었다.
		String fruit = "사과";
		int total = 10;
		int eat = 3;
		
		System.out.printf("%d개의 %s 중에서 %d개를 먹었다.%n", // 포맷문자열
				total, fruit, eat);	// 순서 중요
		
		// %d의 천 단위 구분 기호 : %,d
		int amount = 1_234_567_890;
		System.out.printf("%,d%n", amount);
		
		// %f의 소숫점 아래 구분 기호 : %.2f (소숫점 2자리까지)
		double pi = Math.PI;
		System.out.printf("PI: %f%n", pi);
		System.out.printf("PI: %.2f%n", pi);
		
		// 포맷 형식은 String 형의 .formatted 메서드에서 구현됨
		String fmt = "%d개의 %s 중에서 %d개를 먹었다.%n";
		System.out.printf(fmt.formatted(10, "바나나", 2));
		
	}
}
