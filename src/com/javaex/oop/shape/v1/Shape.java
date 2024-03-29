package com.javaex.oop.shape.v1;

// 추상 클래스
//  - 자신이 객체화 될 수는 없다.
//  - 상속을 위한 부모 클래스에만 존재
//  - 안쪽에 추상 메서드를 가져야한다.
//	- 상속 받은 클래스는 선언된 추상 메서드 반드시 구현.
public abstract class Shape {
	// 필드
	protected int x;
	protected int y;
	
	public Shape(int x,int y) {
		this.x=x;
		this.y=y;
	}
	// 추상 메서드
	// -> 추상 클래스를 상속 받은 클래스에서 반드시 구현해야 한다.
	public abstract void draw(); //메서드의 구현부가 없다.
	public abstract double area();
	
}
