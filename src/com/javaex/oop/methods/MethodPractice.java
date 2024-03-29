package com.javaex.oop.methods;

import java.util.Scanner;

public class MethodPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		printHelloMethod();
		
		printNumbers();
		
		System.out.printf("랜덤 : %d%n", getRandomNumber());
		
		System.out.printf("1~10까지 합 : %d%n", getSum());
		
		System.out.print("정수 하나 주세요 :");
		int num = sc.nextInt();
		printOddOrEven(num);
		
		System.out.println("문제 6)");
		System.out.print("문자열 조금 주세요 :");
		String str = sc.next();
		printStringLengh(str);
		
		System.out.println("문제 7)");
		System.out.print("큰 숫자 드려요\n숫자 하나 주세요 :");
		int num1 = sc.nextInt();
		System.out.print("숫자 하나 또 주세요 :");
		int num2 = sc.nextInt();
		System.out.println("큰 숫자 : " + getLargeNumber(num1, num2));
		
		System.out.println("문제 8)");
		System.out.println(concatenateStrings("문자 ", "주세요"));
		
		System.out.println("문제 9)");
		System.out.println("가변 인자 더하기(11~20) : "
				+ sumAll(11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
		
		System.out.println("문제 10)");
		System.out.println("가변 인자 말 더하기(가~사) : "
				+ concatenateStrings("가", "나", "다", "라", "마", "바", "사"));
		
		sc.close();
	}
	
//	문제1. 콘솔에 “Hello Method!”를 출력하는 메서드를 작성하세요.
	private static void printHelloMethod() {
		System.out.println("문제 1)");
		System.out.println("\"Hello Method!\"");
	}
	
//	문제2. 1부터 10까지의 숫자를 콘솔에 출력하는 메서드를 작성하세요
	private static void printNumbers() {
		System.out.println("문제 2)");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		} 	
		System.out.println();
	}
//	문제3. 0 ~ 100사이의 랜덤한 정수를 반환하는 메서드를 작성하세요.
	private static int getRandomNumber() {
		System.out.println("문제 3)");
		int rand = (int)(Math.random() * 101);
		
		return rand;
	}
	
//	문제4. 1부터 10까지의 합(55)을 반환하는 메서드를 작성하세요
	private static int getSum() {
		System.out.println("문제 4)");
		int sum = 0;
		
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		return sum;
	}
	
//	문제5. 정수를 하나 받아 그 정수가 짝수인지 홀수인지를 콘솔에 출력하는 메서드를 작성하세요.
	private static void printOddOrEven(int pValue) {
		System.out.println("문제 5)");
		boolean isOdd = pValue % 2 == 1 ? true : false;
		
		if(isOdd)
			System.out.println("홀수");
		else
			System.out.println("짝수");
	} 
	
//	문자열을 하나 받아 그 문자열의 길이를 콘솔에 출력하는 메서드를 작성하세요
	private static void printStringLengh(String pStr) {
		System.out.printf("입력한 문자열의 길이는 %d입니다%n",
				pStr.length());
	}
	
//	문제7. 두 정수를 받아 큰 수를 반환하는 메서드를 작성하세요
	private static int getLargeNumber(int pNum1, int pNum2) {
		int bigNum = pNum1;
		
		if (bigNum < pNum2) {
			bigNum = pNum2;
		}
		
		return bigNum;
	}
	
//	문제8. 문자열 두 개를 받아 하나로 합쳐 반환하는 메서드를 작성하세요
	private static String concatenateStrings(String pStr1, String pStr2) {
		
		return pStr1 + pStr2;
	} 
	
//	문제9. 가변인자로 전달된 모든 정수의 합을 반환하는 메서드를 작성하세요
	private static int sumAll(int ... pNums) {
		int sum = 0;
		
		for (int nValue : pNums) {
			sum += nValue;
		}
		
		return sum;
	}
	
//	문제10. 가변인자로 전달된 모든 문자열을 연결해서 반환하는 메서드를 작성하세요
	private static String concatenateStrings(String ... pStrings ) {
		String sumStr = "";
		
		for (String strValue : pStrings) {
			sumStr += strValue;
		}
		
		return sumStr;
	}
}
