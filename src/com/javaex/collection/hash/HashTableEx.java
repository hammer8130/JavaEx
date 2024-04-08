package com.javaex.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

class ClassRoom{
	private String subect;
	private String roomName;
	
	public ClassRoom(String subject) {
		// containsValue에서 사용하기 위한 생성자
		this.subect= subject;
	}
	
	public ClassRoom(String subect, String roomName) {
		super();
		this.subect = subect;
		this.roomName = roomName;
	}
	@Override
	public String toString() {
		return "ClassRoom [subect=" + subect + ", roomName=" + roomName + "]";
	}

	// 동등성 체크 로직
//	   1. subject의 hashCode를 전체 객체의 hashCode로
//	   2. subject의 값이 동일하면 전체 객체의 값도 같다.
//			==> 두 조건으로 동등성을 판단한다.
	@Override
	public int hashCode() {
		
		return subect.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ClassRoom) {
			ClassRoom c = (ClassRoom)obj;
			return subect.equals(c.subect);
		}
		return super.equals(obj);
	}
	
	
	
	
	
	
}
public class HashTableEx {

	public static void main(String[] args) {
		// Map 형 자료형
		// KeySet과 List의 복합 자료형
		// Key(KeySet)은 순서 없고, 중복 허용x
		// Value는 KEy를 통한 접근만 가능, 중복 허용
		
		Map<String, ClassRoom> map = new Hashtable<String, ClassRoom>();
		
		// 맵에 데이터 넣기 : put
		map.put("101", new ClassRoom("Java", "R101"));
		map.put("202", new ClassRoom("C", "R202"));
		map.put("303", new ClassRoom("Python", "R303"));
		map.put("404", new ClassRoom("Linux", "R404"));  
		System.out.println(map); //Key가 Set이기 때문에 삽입 순서는 없다.
		
		// 데이터 참조 : get
		System.out.println(map.get("303")); // Key를 통한 접근 가능
		
		// 데이터 변경 : put
		map.put("202", new ClassRoom("C#", "R202"));
		System.out.println(map.get("202"));
		
		// 특정 키를 포함하는가 여부
		System.out.println(map.containsKey("202")); // 키에 연결된 값 참조
		System.out.println(map.containsKey("505"));
		
		// 특정 값을 포함하고 있는지 확인
		System.out.println(map.containsValue("Java")); // false
//													  Java의 파라미터 클래스는 ClassRoom, 
//													map의 파라미터는 <String, ClassRoom> ==따라서 False
//										Java의 Complier는 String과 ClassRoom의 동등성 비교를 하지 못한다.
//										==>Subject의 hashcode를 클래스의 hashcode키로. == 값이 같다.
//												
		System.out.println(map.containsValue(new ClassRoom("Java")));
		
		System.out.println("============== Iterator");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			ClassRoom s = map.get(it.next());
			System.out.println(s);
		}
		
		map.clear();
		System.out.println(map);
	}

}
