package com.javaex.objectclass.ex3;

public class CloneTest {

	public static void main(String[] args) {
		// 객체 생성
		Point p = new Point(10, 20);
		System.out.println("p="+p);
		
		// 객체 복제
		Point p2 = p; // 참조 복제
		
		// 얕은 복제
		Point p3 = p.getClone();
		
		System.out.println("p2="+p2);
		System.out.println("p3="+p3);
		
		System.out.println();
		
		//p의 내부 필드 변경
		p.setX(30);
		p.setY(100);
		System.out.println("p="+p);
		System.out.println("p2="+p2);
		// p3는 clone에 의해 메모리공간이 분리가 되었기 때문에
		// set으로 값이 담기지 않는걸 볼 수 있다.
		System.out.println("p3="+p3);
		
		
		// 참조 복제는 실제론 같은 객체
		// 데이터 보호를 위해 참조 복제 피하는 것이 좋다
	}

}
