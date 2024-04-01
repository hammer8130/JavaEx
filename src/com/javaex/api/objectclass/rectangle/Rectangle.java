package com.javaex.api.objectclass.rectangle;

public class Rectangle {
	private int width,height;
	
public Rectangle(int width,int height) {
	this.width=width;
	this.height=height;
}
@Override
public String toString() {
	return "Rectangle("+width+", "+height+")";
}
public int area() {
	return width*height;
}
@Override
public boolean equals(Object obj) {
	if(obj instanceof Rectangle) {
		Rectangle r = (Rectangle)obj;
		return area()==r.area();
	}
	return super.equals(obj);
}
}
