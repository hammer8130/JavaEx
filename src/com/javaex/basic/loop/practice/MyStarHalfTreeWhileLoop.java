package com.javaex.basic.loop.practice;

public class MyStarHalfTreeWhileLoop {
	public static void main(String[] args) {
		// 개수에 따라 별을 출력하는 프로그램
		// while문 구성
		final int starMax = 6;
		
		System.out.println("================================");
		System.out.println("\t별 출력 프로그램");
		System.out.println("================================");
		
		int row = 1; 
		int starAmount;
		
		// starMax개수만큼 줄 출력
		while (row <= starMax) {
			// 별 시작 개수
			starAmount = 1;
			// n번째 라인은 n개의 별을 가짐
			while (starAmount <= row) {
				System.out.print("*");
				starAmount++;
			}
			
			System.out.println();
			row++;
		}
	}
}
