package com.javaex.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestEx {

	private static String path = System.getProperty("user.dir")+"\\files\\";
	private static String source = path+"img.jpg";
	private static String target = path+"img copy2.jpg";
	public static void main(String[] args) {
		try(
			InputStream is = new FileInputStream(source);
			OutputStream os = new FileOutputStream(target);
				
			BufferedInputStream bis = new BufferedInputStream(is);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			){
			int data=0;
			while((data=bis.read())!=-1) {
				bos.write(data);
				System.out.println(data);
			}
		}catch(FileNotFoundException e) {
			
		}catch(IOException e) {
			
		}catch(Exception e) {
			
		}
		

	}

}
