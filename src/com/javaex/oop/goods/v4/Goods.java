package com.javaex.oop.goods.v4;

// v2. private
public class Goods {
	// 필드 선언
	// instance 영역 
	private String name; // 상품명
	private int price;   // 가격

//	 생성자를 하나도 선언하지 않을 경우
//	 자바 컴파일러가 기본 생성자를 추가
//	 개발자가 생성자를 만들었을 경우, 기본 생성자는 추가 되지 않는다.
	
	// 모든 필드 생성자
	public Goods(String name, int price) {
		// 이 생성자는 객체 초기화를 담당한다
		this.name=name;
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
