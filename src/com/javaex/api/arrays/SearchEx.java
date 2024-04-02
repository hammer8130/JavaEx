package com.javaex.api.arrays;

import java.util.Arrays;
import java.util.Collections;

public class SearchEx {

	public static void main(String[] args) {
		// 1. 기본 타입 검색
		basicSearch();
		
		// 2. 사용자 정의 객체의 검색
		customClassicSearch();
		
	}

	private static void basicSearch() {
		// Java Arrays의 검색 기능은 binarySearch 방식으로 구현
		int[] nums = {6,4,3,5,7,9,8,2,1,10};
		
		// 이진 검색 방식의 배열은 정렬이 되어 있어야 한다.
		Arrays.sort(nums);
		System.out.println("정렬된 배열:"+Arrays.toString(nums
				));
		int id = Arrays.binarySearch(nums, 8);
//								   검색 대상 배열
		System.out.println("8의 인덱스:"+id);
		
		// 참조 타입의 검색
		String[] data = {"Java","C","C++","Python","Linux"};
		Arrays.sort(data);
		// data 정렬
		System.out.println(Arrays.toString(data));
		id = Arrays.binarySearch(data, "Java");
		System.out.println("Java의 인덱스"+id);
		
	}
	
	private static void customClassicSearch() {
		Member m1 = new Member("홍길동");
		Member m2 = new Member("고길동");
		Member m3 = new Member("정우찬");
		Member m4 = new Member("이경민");
		Member[] m = {
				m1,m2,m3,m4
		};
		System.out.println("원본 배열:"+Arrays.toString(m));
		// binarySearch를 위한 정렬
		Arrays.sort(m);
		System.out.println(Arrays.toString(m));
		
		int id = Arrays.binarySearch(m, m3);
		System.out.println(m3+"의 인덱스"+id);
		
		
	}
}
