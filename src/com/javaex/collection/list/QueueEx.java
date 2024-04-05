package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		//  - Interface
		Queue<Integer> q = new LinkedList<Integer>(); //실제 저장은 LinkedList()를 활용
		
		for(int i=0;i<10;i++) {
			q.offer(i);
			System.out.println("Queue:"+q);
		}
		System.out.println("Peek:"+q.peek()); // 출력 방향의 데이터 확인
		System.out.println("Poll:"+q.poll()); // 인출
		System.out.println("Queue:"+q);
		
		// poll 할 때는 비어있는지 체크.
		while(!q.isEmpty()) { // 큐가 비어있지 않으면
			System.out.println("Poll:"+q.poll());
			System.out.println("Queue:"+q);
		}
	}

}
