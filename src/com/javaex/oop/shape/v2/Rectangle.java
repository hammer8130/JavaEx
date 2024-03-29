package com.javaex.oop.shape.v2;

public class Rectangle extends Shape implements Drawable{
	
	private int width;
	private int height;
	
	public Rectangle(int x, int y ,int width, int height) {
		super(x,y);
		this.width=width;
		this.height=height;
	}
	
	public void draw() {
		System.out.printf("사각형[x=%s, y=%s, width=%s, height=%s]인 사각형을 만들었습니다.",x,y,width,height);
	}
	
	public double area() {
		double area = width*height;
		return area;
	}
}
