package com.javaex.collection.list;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		//데이터 입력
		for(int i=0;i<10;i++) {
			stack.push(i);
			System.out.println("Stack:"+stack);
		}
		
		//가장 마지막 데이터 확인
		System.out.println("Peek:"+stack.peek());
		System.out.println("Stack:"+stack);
		
		//인출
		System.out.println("Pop:"+stack.pop());
		System.out.println("Stack:"+stack);
		
//		try {
//			
//		while(true) {
//			System.out.println("Pop:"+stack.pop());
//			System.out.println("Stack"+stack);
//		}
//		
//		}catch(EmptyStackException e) {
//			System.err.println("인덱스가 비었습니다.");
//		}
		
//		Stack 비어있는지 여부
		while(!stack.empty()) {  //비어 있지 않으면,  not boolean
			System.out.println("Pop:"+stack.pop());
			System.out.println("Stack:"+stack);
		}
		
	}

}
