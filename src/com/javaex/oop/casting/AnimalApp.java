package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		// UpCasting : 부모 타입으로 자식 객체를 참조하는 것.
		// (자동캐스팅)   참조 타입에 의해 설계된 것만 사용 가능.
		
		Animal dog1 = new Dog("Snoopy");
		
		dog1.eat();
		dog1.walk();
//		dog1.bark();  설계도에 있는 객체만 사용 가능. 
//		              즉, Upcasting 된 상태에선 자식의 메서드 사용 불가
		
		Dog dog2 = new Dog("Doogy");
		dog2.eat();
		dog2.walk();
		dog2.bark();
		
		// Downcasting : 명시적으로 타입을 지정해줘야 한다.
		// dog1을 bark() 하도록 해보기 
		((Dog)(dog1)).bark();
		
		{
			Dog pet = new Dog("Azi");
			pet.eat();
			pet.walk();
			pet.bark();
			
			pet = null;
			
//			pet = new Cat("냥냥이"); // 부모가 아닌 형제클래스 간 참조는 불가.
		}
		
		System.out.println("===================");
		{
			Animal pet = new Dog("Azi");
			pet.eat();
			pet.walk();
//			pet.bark();
			//현재 pet이 어떤 클래스의 instance인지 확인
			if(pet instanceof Dog) {  // Dog의 인스턴스면
				((Dog)pet).bark();
			}
			
			pet = null;
			
			pet = new Cat("아즈라엘");

			pet.eat();
			pet.walk();
//			pet.meow();
			
			if(pet instanceof Cat) {
				((Cat)pet).meow();
			}
		}
	}

}
