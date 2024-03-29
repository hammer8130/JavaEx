
	package com.javaex.oop.goods.v5;

//	this(): 현재 클래스 내부의 다른 생성자를 호출할 때 사용
public class Goods {
	// 필드 선언
	// instance 영역 
	private String name; // 상품명
	private int price;   // 가격


	
	// name 필드 생성자
	public Goods(String name) {
		this.name= name;
		System.out.println("name 필드 초기화 생성자");
	}
	
	// 전체 필드 생성자
	public Goods(String name, int price) {
		// 이 생성자는 객체 초기화를 담당한다
		this(name); // -> Goods(String name) 생성자 호출
		System.out.println("전체 필드 초기화 생성자");
		this.price=price;
	}
	
	
	
	//Getter Setter
	//Setter가 없으면, Read Only 필드를 만들수 있다.
	//Getter/Setter 모두 없으면, 내부 private 필드가 된다.
	
	public String getName() {
		// 메서드 영역
		return name;
	}
	
//	public void setName(String name) {
//		this.name = name;
//	}
	
	public int getPrice() {
		return price;
	}
	
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	public void showInfo() {
		System.out.printf("%s, %,d원%n",getName(), getPrice());
	}
}
