package com.javaex.exception;

public class ArrayExceptionEx {

	public static void main(String[] args) {
		
		
		try {
			int [] intArray = new int[] {3,6,9};
			System.out.println(intArray[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.err.println("Error:"+e.getMessage());
		}

	}

}
