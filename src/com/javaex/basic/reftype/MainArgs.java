package com.javaex.basic.reftype;

public class MainArgs {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.printf("args[%d] = %s%n",
					i, args[i]);

		}
	}
}
