package com.javaex.functional.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Student{
	// 필드
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student(String name, int kor,int eng, int math) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}
	
	public int getTotal() {
		return kor+eng+math;
	}
	
	public double getAverage() {
		return getTotal()/3;
	}

	@Override
	public String toString() {
		return "학생 [이름=" + name + ", 국어=" + kor + ", 영어=" + eng + ", 수학=" + math + ", 총합="
				+ getTotal() + ", 평균=" + getAverage() + "]";
	}
	
	
}

public class StreamEx {

	public static void main(String[] args) {
		// 프리미티브 타입 스트림
		int scores[] = { 80, 100, 60, 50, 90, 70 };

		// 배열에서 Stream 뽑아내는 방법
		IntStream arrSt = Arrays.stream(scores);
//		System.out.println(arrSt);
		
		// 사용자 정의 클래스 타입 스트림
//		List<Student> stu = new ArrayList<Student>();
		List<Student> stu = new LinkedList<Student>();
		stu.add(new Student("정우찬", 80, 90, 95));
		stu.add(new Student("신지수", 80, 90, 95));
		stu.add(new Student("이대원", 84, 93, 90));
		stu.add(new Student("고길동", 81, 93, 88));
		stu.add(new Student("랄랄라", 20, 75, 80));
		
		// Collection Framework 클래스에선 .stream() 으로 스트림 추출 가능
		Stream<Student> objst = stu.stream();
//		System.out.println(objst);
		
		// 최종 연산 : forEach
		testForEach(scores,stu);
		testFillter(scores,stu);
		
		
		
	}
	private static void testForEach(int[] source, List<Student> lst) {
		// forEach -> 최종 연산, 스트림을 순회하면서 최종 처리
		System.out.println("============ stream forEach");
		// 배열의 순회
		for(int i=0;i<source.length;i++) {
			System.out.print(source[i]+" ");
		}
		System.out.println();
		
		// forEach 사용
//		source의 배열로부터 스트림 추출. 그러고 나서 순회함수로 전달해준다.
		Arrays.stream(source).forEach(n -> System.out.print(n+" "));
		System.out.println();
		
		// Collection 순회
		System.out.println();
		Iterator<Student> it = lst.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}
		
		// forEach
		System.out.println("==========forEach");
		lst.stream().forEach(obj -> System.out.println(obj));
	}
	
	private static void testFillter(int[] arr,List<Student> li) {
		// arr에서 점수가 70점 이상인 겻만 추출
		System.out.println("==========StreamFilter");
		System.out.println(Arrays.toString(arr));
		Arrays.stream(arr).filter(n -> n>=70).forEach(n-> System.out.print(n+" "));
		System.out.println();
		
		// List<Student> li에서 평균점수가 70점 이상인 것만 추출
		System.out.println("==========List에서 평균점수 70점 이상");
		li.stream().filter(obj -> obj.getAverage() >=70).forEach(obj -> System.out.println(obj));
		}
}
