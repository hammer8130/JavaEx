package com.javaex.api.objectclass.ex2;

//	두 객체의 내부 데이터의 같음을 확인하는 equals 메서드
public class Point { //extends java.lang.Object
	private int x;
	private int y;

	// 생성자
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	} //외부로부터 넘어온 x를 this를 통해 내부로.
	
	// toString : 객체 정보를 문자열로 출력할 때 호출되는 메서드
	@Override
	public String toString() {
		return "Point("+x+","+y+")";
	}
	
	// equals : 두 객체의 내부 데이터가 같음을 확인하는 메서드
	@Override
	public boolean equals(Object obj) {
		// 전달받은 parameter obj가 Point 인지 확인
		// Object -> Point 로 캐스팅
		if(obj instanceof Point) {
			Point other = (Point)obj;
			// 두 객체의 동등성
			// 두 객체의 x필드가 같고, y필드가 같아야 동등하다.
			return x ==other.x&&y==other.y;
//			if(this.x==other.x&&this.y==other.y) {
//				return true;
//			}else {
//				return false;
//			}
		}
		// obj가 Point가 아닌경우
		return super.equals(obj);  // 부모에게 비교방법을 위임
	}
}
