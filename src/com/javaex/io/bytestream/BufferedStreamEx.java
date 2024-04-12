package com.javaex.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamEx {

	private static String rp = System.getProperty("user.dir")+"\\files\\";
	private static String source = rp+"img.jpg";
	private static String target = rp+"img_buffered_copy.jpg";
	public static void main(String[] args) {
		System.out.println("원본: "+source);
		System.out.println("복제본: "+target);
		
		// 스트림 열기
		try ( //주 스트림
			InputStream is = new FileInputStream(source);
			OutputStream os = new FileOutputStream(target);
		
			// 보조 스트림
//			실제 파일이 아니라 주 스트림으로부터 다시 끌어내다 쓴다.
			BufferedInputStream bis = new BufferedInputStream(is);
			BufferedOutputStream bos = new BufferedOutputStream(os);){
		
			byte data[] = new byte[1024]; // 실제 데이터를 저장하는 배열
			int size=0; // 읽어들인 데이터의 길이를 저장하는 변수
			while((size=bis.read(data))!=-1) {
				bos.write(data);
				System.out.println(size+"바이트 복사했습니다.");
			}
			
		}catch(FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
