package com.javaex.basic.loop.practice;

public class MyStarHalfTreeForLoop {
	public static void main(String[] args) {
		// 개수에 따라 별을 출력하는 프로그램
		// for문 구성
		final int starMax = 6;
		
		System.out.println("================================");
		System.out.println("\t별 출력 프로그램");
		System.out.println("================================");
		// starMax개수만큼 줄 출력
		for (int row = 1; row <= starMax; row++) {
			// n번째 라인은 n개의 별을 가짐
			for (int starAmount = 1; starAmount <= row; starAmount++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
