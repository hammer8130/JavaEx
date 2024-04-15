package com.javaex.io.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;import java.util.Scanner;

public class ScannerEx {

	private static String rp=System.getProperty("user.dir")+"\\files\\";
	private static String filename=rp+"thieves.txt";
	public static void main(String[] args) {
		
		File file = new File(filename);
		try {
			Scanner sc = new Scanner(file);
			String name;
			float height;
			float weight;
			while(sc.hasNextLine()) {
				name = sc.next();	// 문자열 토큰
				height = sc.nextFloat();	// 실수 토큰
				weight = sc.nextFloat();	// 실수 토큰
				System.out.printf("%s: 키:%.2f, 몸무게:%.2f%n",name,height,weight);
				sc.nextLine();
			}
		
		sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		

	}

}
