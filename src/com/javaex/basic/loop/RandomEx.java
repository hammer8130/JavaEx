package com.javaex.basic.loop;

public class RandomEx {
	// 1~45 까지의 숫자중 임의의 6개의 숫자를 출력하세요
	// (중복체크는 하지 않음
	public static void main(String[] args) {
		int num[] = new int[6];
		int ran;
		
		// 1 ~ 45까지
		for (int i = 0; i < num.length; i++) {
			ran = (int)(Math.random() *45)+1;
			// 임의의 숫자 넣기
			num[i] = ran;
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
}
