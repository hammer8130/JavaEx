package com.javaex.io.bytestream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderEx {
// sangbuk.txt에서 포워드만 뽑아내기
	private static String rp = System.getProperty("user.dir")+"\\files\\";
	private static String source = rp+"sangbuk.txt";
	private static String target = rp+"sangbukText.txt";
	public static void main(String[] args) {
		try(
			Reader r = new FileReader(source);
			Writer w = new FileWriter(target);
				
			BufferedReader br = new BufferedReader(r);
			BufferedWriter bw = new BufferedWriter(w);
			){
			String line="";
			while((line=br.readLine())!=null) {
				if(line.toString().contains("포워드")) {
					bw.write(line);
					bw.newLine();
				}
				System.out.println("수정되었습니다.");
			}
		}catch(FileNotFoundException e) {
			
		}catch(IOException e) {
			
		}
		

	}

}
