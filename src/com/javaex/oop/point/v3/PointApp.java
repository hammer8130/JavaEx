package com.javaex.oop.point.v3;

public class PointApp {
	public static void main(String[] args) {
		Point p1 = new Point(5,5);
		Point p2 = new Point(10,23);
		
		// 오버로딩된 메서드 호출
		p1.draw();
		p2.draw();
		
		p1.draw(1+1==3);
		p2.draw(1+1==3                                                                                                                                     );
	}
}
