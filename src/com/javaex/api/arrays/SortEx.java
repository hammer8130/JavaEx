package com.javaex.api.arrays;

import java.util.Arrays;
import java.util.Collections;

// 사용자 정의 클래스를 sort 하고자 할 땐, Comparable 인터페이스를 구현 해야 한다.
class Member implements Comparable{
	String name;
	
	public Member(String name) {
		this.name=name;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		// 두 객체의 선후 관계를 비교해서 
		// -1,0,1 return
		// 비교 대상의 순서가 동일 : 0
		// 작은 경우 : -1
		// 큰 경우 : 1
		if(o instanceof Member) {
			// Member로 캐스팅 가능
			Member ot = (Member)o;
			// 대소 관계의 비교는 name 필드로 비교
			return name.compareTo(ot.name);
		}
		return 0;
	}
	
}
public class SortEx {

	public static void main(String[] args) {
//		1. 기본 정렬
		basicSort();
//		2. 역순 정렬
		basicDescSort();
//		3. 사용자 정의 클래스 정렬
		customClassSort();
	}

	private static void basicSort() {
		int [] scores = {80,50,30,90,75,88,77}; // 정수 타입
		System.out.println("배열 원본:"+Arrays.toString(scores));
		Arrays.sort(scores);
		System.out.println("오름차순 정렬:"+Arrays.toString(scores)); // Ascending
	}
	
	private static void basicDescSort() {
		Integer [] scores = {80,50,30,90,75,88,77}; // 클래스 타입
		Arrays.sort(scores,Collections.reverseOrder());
		System.out.println("내림차순 정렬:"+Arrays.toString(scores));
		
	}
	
	private static void customClassSort() {
		// 사용자 정의 클래스의 정렬
		Member[] members = {
				new Member("홍길동"),
				new Member("정우찬"),
				new Member("이경민"),
				new Member("고길동")				
		};
		System.out.println("원본 배열:"+Arrays.toString(members));
		Arrays.sort(members);
		
		System.out.println("오름차순:"+Arrays.toString(members));
		
		Arrays.sort(members,Collections.reverseOrder());
		System.out.println("내림차순:"+Arrays.toString(members));
		
	}
}

