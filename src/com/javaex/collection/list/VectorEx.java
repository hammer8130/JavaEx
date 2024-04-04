package com.javaex.collection.list;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// Vector 선언
		Vector v = new Vector(); // 기본 벡터 버퍼 용량 10
		System.out.println("Size:"+v.size()+", Capacity:"+v.capacity());
		
		for(int i=0; i<10;i++) {
			// 요소 추가
			v.addElement(i);  // auto boxing  === Integer.valueOf(0)을 10번 반복 
//													--> head가 마지막으로 밀려남
		}
		
		System.out.println("Size:"+v.size()+", Capacity:"+v.capacity());
		
		// 허용량 초과]
		v.addElement(10); //10을 그 뒤에 Mapping, 버퍼 +1, 최종 Head의 위치는 +1
		
		System.out.println("Size:"+v.size()+", Capacity:"+v.capacity());
		
		
		int val = (Integer)v.elementAt(2); // Object를 Integer로 다시 재할당
//											  elementAt은 Object를 리턴한다.
		System.out.println(".elementAt(5):"+val);
		
		// 역참조(검색)
		// 객체의 인덱스 조회
		System.out.println(".indexOf(2)"+v.indexOf(2));
		System.out.println(".indexOf(20):"+v.indexOf(20)); // 없는 객체 -1
		
		// 객체 포함 여부: .contain  ( boolean )
		System.out.println(".contains(7):"+v.contains(7));    // t
		System.out.println(".contains(11):"+v.contains(11));  // f
		
		// 삭제 : .removeElement  ( boolean )
		System.out.println(".removeElement(7):"+v.removeElement(7));  //t
		System.out.println(".removeElement(11):"+v.removeElement(11));  //f  11이라는 요소가 없음
	
		for(int i=0;i<v.size();i++) {
			Integer item = (Integer)v.elementAt(i);
			System.out.print(item+" ");
		}  //삭제된 요소 포함 조회
		
		// Collection Framework 에선 루프의 개선이 필요
		// TODO : 루프 방식 개선
		System.out.println(); 
		
		System.out.println("Size:"+v.size()+", Capacity:"+v.capacity());
		
		// 버퍼 비우기
		v.clear();
		System.out.println("v="+v);
		System.out.println("Size:"+v.size()+", Capacity:"+v.capacity()); // Head를 원래대로,
//																		   즉, size = 0
		
		// Generic을 사용하여 코드 개선 가능
//		 ex) Number를 상속한 모든 객체를 담을 수 있는 Generic을 사용
		Vector<? super Number> v2 = new Vector<>(); // Number를 상속받은 클래스만 ( Number = 정수형 기본 데이터 타입)
		v2.addElement(Integer.valueOf(2024));     
		v2.addElement(Float.valueOf(3.14159f));
		System.out.println(v2);
//		v2.addElement("Vector"); // String 객체는 Number를 상속받지 않는 객체라 불가.
		
		// TODO : 개선된 방식으로 루프 돌리기
		
		
		
		Vector<Integer> v3 = new Vector<>();
//		    내부 데이터 fix         이곳엔 오로지 fix한 데이터만,
		
		
		
	}

}
