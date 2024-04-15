package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringTokenizerEx {

	private static String rp = System.getProperty("user.dir")+"\\files\\";
	private static String filename = rp+"thieves.txt";

	public static void main(String[] args) {
		System.out.println("원본"+filename);
		
		try(
			Reader r = new FileReader(filename);
			BufferedReader br = new BufferedReader(r);
			){
			String line="";
			while((line=br.readLine())!=null) {
				//Tokenizing
				StringTokenizer st = new StringTokenizer(line," ");
				while(st.hasMoreTokens()) {
					String s = st.nextToken();
					System.out.println("Token:"+s);
				}
			}
			br.close();
			
			
		}catch(FileNotFoundException e) {
			System.err.println("파일이 없습니다.");
		}catch(IOException e) {
		
		}catch(Exception e) {
			
		}

	}

}
