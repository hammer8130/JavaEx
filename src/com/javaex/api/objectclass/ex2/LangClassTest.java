package com.javaex.api.objectclass.ex2;

public class LangClassTest {

	public static void main(String[] args) {
		String s1 = new String("정우찬");
		String s2 = new String("정우찬");
		
		System.out.println(s1==s2);  //참조 주소 비교  
		// 정우찬을 각기 다른 heap memory 에 저장했기 떄문에 값이 다르다
		System.out.println(s1.equals(s2));
		
		// 객체 설계시 내부 데이터 값을 비교하기 위한 로직을 equals 메서드에 정의 요망.
		Point p = new Point(10, 10);
		Point p2 = new Point(10, 10);
		
		System.out.println(p==p2);
		System.out.println(p.equals(p2));
	}

}
