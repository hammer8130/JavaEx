package com.javaex.api.stringclass;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		// 문자열 기본
		stringBasic();
		// 문자열의 다양한 메서드
		usefulMethods();
	}

	private static void stringBasic() {
		String s1 = "Java"; // 소스코드상에 직접 입력된 값을 리터럴이라 부른다.
		String s2 = new String("Java"); // 힙 메모리에 직접 객체 생성
		String s3 = "Java"; // 리터럴

		// 리터럴과 new 객체 생성이 다르게 작동
		System.out.println(s1 == s2); // 주소 비교 : Literal vs new
		System.out.println(s1 == s3); // Literal vs Literal
		// 리터럴의 경우, 데이터가 같으면 같은 객체로 취급

		// 배열을 이용한 String 생성자
		char[] letters = { 'J', 'a', 'v', 'a' };
		String s4 = new String(letters);
		System.out.println(s4);

		// .valueOf 메서드 -> 기본 타입을 문자열로 변환
		String s5 = String.valueOf(2024); // int를 문자열로
		System.out.println(s5);

	}

	private static void usefulMethods() {
		String str = "Java Programming, OOP Programming";
		System.out.println("str:" + str);
		// 문자열 길이 확인 : .length()
		System.out.println(".length():" + str.length());
		// 인덱스 범위 : 0 ~ .length() -1

		// 변환 메서드
		System.out.println("toUpperCase:" + str.toUpperCase()); // 전부 대문자로 변환
		System.out.println("toLowerCase:" + str.toLowerCase());

		// 검색
		System.out.println("charAt:" + str.charAt(5)); // 5번 인덱스의 글자
		int index = 0;
		index = str.indexOf("Programming"); // str내 "Programming 위치 인덱스"

		System.out.println("1st search:" + index);
		index += "Programming".length(); // 검색 시작 위치를 뒤로 이동
		index = str.indexOf("Programming",index);  // 새로운 시작 위치에서 검색
		System.out.println("2nd search:"+index);
		index += "Programming".length();
		index = str.indexOf("Programming",index);  // 새로운 시작 위치에서 검색
		System.out.println("3rd search:"+index);   // 검색할 것이 없으면 -1
		
		index = str.lastIndexOf("Programming"); // 검색을 뒤에서부터 찾기
		System.out.println("last index:"+index);
		
		System.out.println("str:"+str);
		// 부분 문자열 추출 : substring
		System.out.println("substring:"+str.substring(5)); // 지정한 위치에서부터 끝가지
		System.out.println("substring:"+str.substring(5,17)); // 지정한 위치에서부터 위치까지
		
		// 치환; Replace, ReplaceAll
		System.out.println("replace:"+str.replace("Programming", "Coding"));
		
		String str2 = "            Hello              ";
		String str3 = ", Java";
		// 공백, 개행, 탭문자 ( whitespace ) 지우기
		String str4 = str2.trim();
		System.out.println(str4+str3);
		
		System.out.println("원본:"+str);
		// 문자열 데이터는 불변(immutable)이다.
		// 원본은 유지
		
		// 구분자로 분리 : split()
		String[] split = str.split(" ");  // 공백문자를 기준으로 문자열읇 분리
//		문자열 배열로 변환
		System.out.println(Arrays.toString(split));
		
		for(String data: split) {
			System.out.println("조각:"+data);
		}
		
		// 문자열 비교 메서드 : compareTo
		// 문자열 Unicode 비교
		// 같으면 0, 작으면 음수 , 크면 양수
		System.out.println("ABC".compareTo("ABD"));
		
	}
}
