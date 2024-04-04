package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		// List  객체x, Interface
		List<String> li = new LinkedList<String>();
		
		// 객체 추가 : .add
		// List 중복 삽입 허용
		li.add("최고다 우찬");
		li.add("최고다 우찬");
		li.add("최고다 파이썬");
		li.add("최고다 씨");
		
		System.out.println("li="+li);
		
		// 객체 삽입
		li.add(2,"해피우찬"); //2번째 data 뒤에 새로운 node를 추가
		System.out.println("li="+li);
		
		li.add("돈많은 백수");
		System.out.println("li="+li); // add 시 맨 뒤에 data 추가
		
		System.out.println("size:"+li.size());
//		System.out.println("capacity:"+li.capacity()); // Buffer 타입에만 capacity
		
		// 삭제 : 인덱스 삭제
		li.remove(2); // 기존 2번 인덱스의 링크 해제 및 그 다음 data와 링크 연결
		// 객체 삭제
		li.remove("최고다 우찬");
		System.out.println("li="+li);
		
		// TODO: List 순회
		
		// 비우기
		li.clear();
		System.out.println("li="+li);
		
		
	}

}
