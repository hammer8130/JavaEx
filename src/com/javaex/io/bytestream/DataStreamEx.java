package com.javaex.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {
	private static String rootPath = System.getProperty("user.dir")+"\\files\\";
	private static String filename = rootPath +"primitives.bin";
	
	// 기본 데이터 타입을 byte로 저장하는 보조 스트림
	public static void main(String[] args) {
		// DataOutputStream을 이용한 기본 데이터 저장
		writePrimitives();
		
		// DataInputStream을 이용한 기본 데이터 읽어오기
		readPrimitivies();

	}
	
	private static void writePrimitives() {
		try(
			// 주 스트림
			OutputStream os = new FileOutputStream(filename);
			// 보조 스트림
			DataOutputStream dos= new DataOutputStream(os);
			){
			dos.writeUTF("홍길동"); // 문자열을 저장하는 메서드
			dos.writeBoolean(true); // boolean 저장
			dos.writeInt(25); // int 저장
			dos.writeFloat(80.9f); // float 저장
			
			dos.writeUTF("정우찬");
			dos.writeBoolean(false);
			dos.writeInt(27);
			dos.writeFloat(71.1f);
			
			
		}catch(FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static void readPrimitivies() {
		try(
		InputStream is = new FileInputStream(filename);
		DataInputStream dis = new DataInputStream(is);
		){
		// 출력된 순서와 같은 순서
		for(int i=0;i<2;i++) {
			String s = dis.readUTF();
			boolean b = dis.readBoolean();
			int n = dis.readInt();
			float f = dis.readFloat();
			System.out.println(s);
			System.out.println(b);
			System.out.println(f);
			System.out.println(n);
		
		}
		}catch(EOFException e) {
			System.err.println("순서가 맞지 않습니다.");
		}catch(FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
