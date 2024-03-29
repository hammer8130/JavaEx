package com.javaex.oop.point.v4;

public class PointApp {
	public static void main(String[] args) {
		Point p1 = new Point(5,5);
		Point p2 = new Point(10,23);
		
		// 오버로딩된 메서드 호출
		p1.draw();
		p2.draw();
		
		p1.draw(1+1==3);
		p2.draw(1+1==3);
		
		ColorPoint cp = new ColorPoint("red");
		cp.draw();
		ColorPoint cp2 = new ColorPoint(10,10,"blue");
		cp2.draw();
		
		cp.draw(0%0==0);
		cp2.draw(1==2);
	
	}
}
