package com.javaex.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteArrayStreamEx {

	public static void main(String[] args) {
//		입력 소스
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};	
//		출력 타겟
		byte[] outSrc = null;
		System.out.println("입력 소스: "+Arrays.toString(inSrc));
		
		// 스트림들 열기
//		전통적 방식의 입출력 스트림 예외 처리
//		Autoclosable -> 자원 자동 해제
//		InputStream ip = null;
//		OutputStream op = null;
//		
//		
//		try - with - resource
//		// 이곳은 main method라서 throw를 해도 처리할 수가 없다. 따라서 try/catch로 묶을것.
//		try {
//		ip = new ByteArrayInputStream(inSrc);
//		op = new ByteArrayOutputStream();
//		
//		int data =0; // 입력 스트림으로부터 넘어올 데이터 저장 변수
//		
//		
//				while((data=ip.read())!=-1) {
//				System.out.println("Read data:"+data);
//				op.write(data); // 잠재적으로 io exception 발생 가능
//				}
//				
//			outSrc = ((ByteArrayOutputStream)op).toByteArray();
//			System.out.println("최종 결과: "+Arrays.toString(outSrc));
//				
//			} catch (IOException e) {
//				e.printStackTrace();
//			} catch (Exception e) { // 혹시 모를 예외 처리
//				e.printStackTrace();
//			} finally {
////				if(ip !=null)
////					try {
////						ip.close();
////					} catch (IOException e) {
////						e.printStackTrace();
////					}
////				if(op !=null)
////					try {
////						op.close();
////					} catch (IOException e) {
////						e.printStackTrace();
////					}
//				try {
//					
//				ip.close();
//				op.close();
//				}catch(IOException e) {
//					
//				}
//			}
		
		// AutoCloseable을 활용한 예외 처리: try - with -resource
		try (	// 자원 해제를 필요로 하는 객체를 초기화
			InputStream is = new ByteArrayInputStream(inSrc);
			OutputStream os = new ByteArrayOutputStream();  //매개 변수를 이용한 초기화만 try로 묶어준다.
				){
			int data=0; // 입력 스트림으로부터 임력된 데이터 저장할 변수
			
			while((data=is.read())!=-1) {
				System.out.println("Read data:"+ data);
				os.write(data);
			}
			
			outSrc = ((ByteArrayOutputStream)os).toByteArray();
			System.out.println("최종 결과: "+Arrays.toString(outSrc));
			
		} catch(IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
