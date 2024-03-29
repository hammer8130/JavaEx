package com.javaex.oop.goods.v2;

// v2
public class GoodsApp {
	public static void main(String[] args) {
		Goods camera = new Goods();
		Goods laptop = new Goods();
		Goods cup = new Goods();
		
		camera.name = "nikon";
		camera.price = 400_000;
		laptop.name = "LG그램";  //
		laptop.price = 900_000;
		cup.name = "머그컵";
		cup.price = 2_000;
		
		// 상품 정보 출력
		System.out.printf("%s, %,d원%n",camera.name, camera.price);
		System.out.printf("%s, %,d원%n",laptop.name, laptop.price);
		System.out.printf("%s, %,d원%n",cup.name, cup.price);
	}
}
