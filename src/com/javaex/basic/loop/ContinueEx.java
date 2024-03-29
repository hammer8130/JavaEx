package com.javaex.basic.loop;

public class ContinueEx {
	// 1 ~ 20까지 루프
	// 2의 배수와 3의 배수는 출력 안함
	// 나버지는 출력
	public static void main(String[] args) {
		for(int i = 1; i <= 20; i++)
		{
			if((i % 2 == 0) || (i % 3 == 0))
				continue;
			
			System.out.println(i);
		}
		
		// 프로그램의 종료점을 이상하게 만드는거들 없이 코딩해보기(Continue, break)
//		for(int i = 1; i <= 20; i++)
//		{
//			if(!(i % 2 == 0) && !(i % 3 == 0))
//				System.out.println(i);
//		}
	}
}
