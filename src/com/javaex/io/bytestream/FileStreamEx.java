package com.javaex.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamEx {

	private static String rootPath = System.getProperty("user.dir")+"\\src\\com\\javaex\\oop\\tv\\";
	private static String source = rootPath+"img.jpg";
	private static String target = rootPath+"img copy.jpg";
	public static void main(String[] args) {
		System.out.println("rootPath:"+rootPath);
		System.out.println("원본 파일:"+source);
		System.out.println("타겟 파일:"+target);
		
		// 스트림 열기
		try {
		InputStream is = new FileInputStream(source);
		OutputStream os = new FileOutputStream(target);
		
//		BufferedInputStream bis = new BufferedInputStream(is);
//		BufferedOutputStream bos = new BufferedOutputStream(os);
		// 입력데이터 변수 만들기
		int data =0;
		
		while((data=is.read())!=-1) { // 더 읽어들일 데이터가 없으면 -1
			os.write(data);
			System.out.println("Read data:"+data);
		
		}
		System.out.println("파일을 복사했습니다.");
		// 데이터 읽기
		}catch(FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
