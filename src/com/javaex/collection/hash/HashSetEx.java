package com.javaex.collection.hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;


class Student{
	String name;
	int id;
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
//	객체의 동등성 비교를 위한 두개의 관문
	// 1.hashCode()
	// 2.equals()
	@Override
	public int hashCode() {
		// 해시 함수의 Logic : 학번을 기준으로
		return id;
	}

//	값의 동일성 판별을 위한 equals()로 판별
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student ot = (Student)obj;
			return id==ot.id&&name.equals(ot.name);
//			return id==ot.id&&name==ot.name;
		}
		return super.equals(obj); // Object의 hashCode는 객체의 메모리 번지를 이용한다.
//								즉, 원래는 다 다른 hashCode를 가지고 있다.
	}
	

	
	
}

public class HashSetEx {

	public static void main(String[] args) {
		//1. HashSet 사용법 (기본타입)
//		usingHashSet();
		//2. 집합 연산
		setOperation();
		//3. HashSet 사용법 (객체자료형)
//		usingHashSetWithCusTom();
	}
	private static void usingHashSet() {
		HashSet<String> hs = new HashSet<String>();
		
		//요소 (객체) 추가
		hs.add("정우찬");
		hs.add("나는야");
		hs.add("부자다");
		hs.add("최고다");
		hs.add("정우찬");
		
		System.out.println("hs:"+hs);
		System.out.println("size:"+hs.size());
		
		//특정 객체 포함 여부
		System.out.println("부자다 포함? "+hs.contains("부자다")); // boolean 형태
		System.out.println("졸부다 포함? "+hs.contains("졸부다"));
		
		//순서가 없음 : 객체로 삭제 하는 방법만 제공
		//객체 삭제
		hs.remove("부자다");
		System.out.println("hs:"+hs);
		
	}
	private static void setOperation() {
		//집합 연산
		HashSet<Integer> numbers = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		System.out.println("전체집합:"+numbers);
		HashSet<Integer> odds = new HashSet<Integer>(Arrays.asList(3,1,5,7,9)); 
		System.out.println("홀수집합:"+odds);
		
		HashSet<Integer> evens = new HashSet<Integer>(Arrays.asList(6,2,4,8,10));
		System.out.println("짝수집합:"+evens);
		HashSet<Integer> nt = new HashSet<Integer>(Arrays.asList(3,6,9));
		System.out.println("3의 배수집합:"+nt);
		
		//교집합 : retainAll
		//원본 보호를 위해 복제 후 사용
		System.out.println("========= 교집합");
		HashSet<Integer> setA = (HashSet<Integer>)odds.clone();
		HashSet<Integer> setB = (HashSet<Integer>)nt.clone();
		System.out.println(setA);
		System.out.println(setB); // 순서가 달라진다?
		setA.retainAll(setB);
		System.out.println("odds와 nt의 교집합:"+setA);
		
		System.out.println(setA.equals(new HashSet<Integer>(Arrays.asList(3,9))));
		
		//합집합 : addAll()
		System.out.println("========= 합집합");
		setA=(HashSet<Integer>)odds.clone();
		setB=(HashSet<Integer>)evens.clone();
		System.out.println("setA:"+setA);
		System.out.println("setB:"+setB);
		setA.addAll(setB);
		System.out.println("odds와 nt의 합집합:"+setA);
		System.out.println(setA.equals(odds));
		//차집합 : removeAll()
		System.out.println("========= 차집합");
		setA=(HashSet<Integer>)numbers.clone();
		setB=(HashSet<Integer>)odds.clone();
		System.out.println("setA:"+setA);
		System.out.println("setB:"+setB);
		setA.removeAll(setB);
		System.out.println("전체집합과 odds의 차집합:"+setA);
		System.out.println(setA.equals(evens));	
	}
	
	private static void usingHashSetWithCusTom() {
		HashSet<Student> hs = new HashSet<Student>();
		
		Student s1= new Student("홍길동",10);
		Student s2= new Student("홍길동",20);
		Student s3= new Student("고길동",30); // s3와 s4는 다른객체이지만 , 동등객체
//											 따라서, 중복되지 않는 값을 저장하는 hash의 난점
//											==>equals()를 Override하여 사용해 두 객체가 같다는 로직 만들어야 함.
		Student s4= new Student("고길동",30); // s3 != s4 ==> 동등한 객체가 hash에 추가된다.
		hs.add(s1); hs.add(s2);
		hs.add(s3); hs.add(s4);
		
		System.out.println("학생부:"+hs);
		
	}
}
