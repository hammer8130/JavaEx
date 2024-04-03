package com.javaex.api.generic;

public class BoxApp {

	public static void main(String[] args) {
//		내부에 오직 String만 저장 가능
		StringBox sb = new StringBox();
		sb.setContent("Generic");
		
		String rs = sb.getContent();
		System.out.println(rs);
		
		// 내부에 오직 Integer만 저장 가능한 클래스
		
		IntBox sb2 = new IntBox();
		sb2.setContent(7777);
		
		Integer rI = sb2.getContent(); 
		System.out.println(rI);
		
//		타입별로 처리할 수 있는 모든 객체를 만들어야 한다면..
//		-> Object로 처리할 수 있는 개체를 모든 객체를 처리할 수 있는 만능 클래스.
		
		ObjectBox ob = new ObjectBox();
		ob.setContent("Object Box");
		
		String obj = (String) ob.getContent(); // 내부데이터가 어떤건지 알기 위해서 casting을 해주어야 한다.
		System.out.println(obj);
		
		ob.setContent(2024);
		Integer oint = (Integer) ob.getContent();
		System.out.println(oint);
		// 문제점
//		1. setter에서 전달되는 매개변수의 타입을 제한 할 수 없다. Object이기 때문
//		2. 데이터를 받아올 때, casting이 필요하다. Object -> 실제 클래스로의 변형
		
//		String obj2 = (String) ob.getContent();
		
		
		// 잘못된 캐스팅은 오류
		
		//GenericBox
		//내부 데이터 타입을 외부의 객체화 시점에서 결정
		GenericBox<String> gb = new GenericBox<String>();
		// -> 내부 데이터를 String타입으로 결정
		gb.setContent("Generic Box");
//		gb.setContent(2024);  컴파일 시점에서 내부 입력 데이터 체크
		String objStr = gb.getContent();
		// 내부 저장 데이터가 지정 되어 있기 때문에, 캐스팅 불필요
		System.out.println(objStr);
	
		
		
		
	}
}
