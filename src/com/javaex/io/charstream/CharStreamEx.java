package com.javaex.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {
	private static String rootPath = System.getProperty("user.dir")+"\\files\\";
	private static String filename = rootPath +"char.txt";
	
	public static void main(String[] args) {
		// FileWriter
		writeFile();
		// FileReader
		readFile();
	}
	
	private static void writeFile() {
		// FileWriter를 이용해서 txt 파일 생성
		System.out.println("파일명: "+filename);
		
		// Stream Open
		try (Writer writer = new FileWriter(filename);){			
			// 텍스트 기록
			writer.write("하이미디어 아카데미\r\n");
			writer.write("우찬아 엉덩이 붙여라\r\n");
			writer.write("Java Master 2024.04");
			writer.flush(); 
//			writer.close();
		}catch(FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			
		}
		
	}
	
	private static void readFile() {
		System.out.println("파일명:"+filename);
		
		try(Reader reader = new FileReader(filename);){
			int data=0;
			String message="";
			// 2바이트 (char) 읽어서 -> int(정수형)으로 반환  ===> casting 필요
			while((data=reader.read())!=-1) {
				System.out.println("Read한 데이터: "+(char)data);
				message += (char)data;
			}
			System.out.println(message);
		}catch(FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다");
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
