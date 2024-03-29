package com.javaex.exception;

import java.io.IOException;

public class ThrowsExceptEx {
	
	// CheckedException: 반드시 예외 처리 필요
	// try ~ catch
	// throw로 예외 던지기를 한 경우
	public static void main(String[] args) throws IOException {
	
		ThrowsExcept ex = new ThrowsExcept();
		try {
		ex.divide(100, 0);
		ex.executeRuntimeException();
		ex.executeExcept(); // CheckedException은 반드시~ 예외처리
		}catch(IOException e) {
//			e.printStackTrace();
			System.err.println(e.getMessage());
		}catch(CustomArithException e) {
			System.err.println("에러메세지:"+e.getMessage());
			// 상황 정보 확인
			System.out.println("나누어지는 수:"+e.getNum1());
			System.out.println("나누는 수:"+e.getNum2());
		}catch(RuntimeException e) {
			System.err.println(e.getMessage());
		}
		
	}
}
