package com.javaex.api.wrapper;

public class WrapperEx {

	public static void main(String[] args) {
//		Wrapper 클래스
//		기본 타입을 포장하여 객체 형태로 저장하는 클래스 ( 포장클래스 )

		Integer i = new Integer(10); // deprecated
		Character c = new Character('c');

		// 기본 타입에 대응한 각각의 WrapperClass가 있다.
		Float f = Float.valueOf(3.14159f); // valueOf static 메서드. Java 1.5이상부터 지원
		Boolean b = Boolean.valueOf(true);

		Integer i2 = Integer.valueOf("2024"); // 숫자형태로 값을 전달해줌 , 숫자 x
		Double d2 = Double.valueOf("3.14159");
		Boolean b2 = Boolean.valueOf("false");

//		주의: 전달되는 파라미터의 문자열 형태는 해당 기본형의 형태

//		auto boxing
		Integer i3 = 10; // valueOf 생략
//		auto unboxing
		int result = i3 + 2;

		// parse 계열 메서드 : 문자열 이름, 특정 타입으로 변환, 다른 형태로 출력
		System.out.println(Integer.parseInt("-123")); // 문자열 -> 정수
		System.out.println(Integer.parseInt("10",16)); // 16진수 -> 정수
		System.out.println(Integer.toBinaryString(28)); // 28 -> 2진수 문자열로
		
		// 형변환
		System.out.println(i2.doubleValue());
		
		// 포장된 값의 비교
		Integer i4 = Integer.valueOf(2024);
		Integer i5 = Integer.valueOf(2024);
		System.out.println(i4==i5); // 여기선 auto boxing이 되지 않는다. 참조 주소만 비교
		
		// 언박싱 비교 (내부 데이터의 비교)
		System.out.println(i4.intValue()==i5.intValue()); // 값의 비교 true
		System.out.println(i4.equals(i5));
		
	}

}
