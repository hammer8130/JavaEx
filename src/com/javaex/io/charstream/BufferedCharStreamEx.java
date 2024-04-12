package com.javaex.io.charstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;


public class BufferedCharStreamEx {
	private static String rootPath = System.getProperty("user.dir")+"\\files\\";
	private static String source = rootPath + "last-leaf.txt";
	private static String target = rootPath + "leaf.txt";
	public static void main(String[] args) {
		
		System.out.println("원본 파일:"+source);
		System.out.println("필터 파일:"+target);
		
		try (
			//주 스트림 연결
			Reader is = new FileReader(source);
			Writer os = new FileWriter(target);
			
			//보조 스트림 연결
//			라인단위 문자열 작업 -> Buffer 기능 사용
			BufferedReader br = new BufferedReader(is);
			BufferedWriter bw = new BufferedWriter(os);){
			
			// 한 줄 단위로 읽고 쓰는데 특화
			String line=""; 
			while((line=br.readLine())!= null) { // 읽어들일 라인이 없으면 null
//				System.out.println(line);
				
				// leaf, leaves가 들어간 라인만 필터링
				if(line.toLowerCase().contains("leaf")||line.toLowerCase().contains("leaves")) {
//					System.out.println(line);
				// 필터링된 라인만 별도 저장
				bw.write(line);
				bw.newLine(); // 개행
				}
			}
				
			System.out.println("필터링완료!");
			
		}catch(FileNotFoundException e) {
			System.out.println("해당 파일을 찾을 수 없습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
