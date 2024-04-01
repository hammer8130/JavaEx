package com.javaex.api.objectclass.circle;

public class Circle {
	private int x,y,radius;
	
public Circle(int x,int y,int radius) {
	this.x=x;
	this.y=y;
	this.radius=radius;
}

@Override
public String toString() {
	return "Circle("+x+", "+y+", "+radius+")";
}
@Override
public boolean equals(Object obj) {
	if(obj instanceof Circle) {
		Circle c = (Circle)obj;
	return radius==c.radius;
	
}
	return false;
}
}
