package com.javaex.io.bytestream;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	// files의 경로 위치 
	private static String rootPath = System.getProperty("user.dir")+"\\src\\com\\javaex\\objectclass\\ex3\\";
	

	public static void main(String[] args) {
		  System.out.println("루트 경로:"+rootPath);
		  File f = new File(rootPath);
		  System.out.println(rootPath + ":"+(f.exists()?"존재":"없음"));
		  
		  // 정보 출력
		  printFileInfo(f);
		  
		  // 디렉터리 만들기
		  // files 디렉토리 아래 ==> files\\subdir\\subdir2 -> 디렉토리 생성
		  File newDir = new File(rootPath + "\\subdir\\subdir2"); // 파일(디렉토리) 정보
		  if(!newDir.exists()) { // 존재 여부 확인
			  if(newDir.mkdirs()) { // 실제 생성
				  System.out.println(newDir+"을 생성했습니다.");
			  }
		  }
		  printFileInfo(f);
		  
		  // 새로 생성한 files//subdir 디렉토리에 새파일 myfile.txt를 만들어 보자.
		  File newFile = new File(rootPath + "\\subdir\\myfile.txt");
		  // 파일 객체 생성 -> 정보객체 생성하는 것, 파일을 만드는 것은 아니다
		  if(!newFile.exists()) { // 존재 여부를 확인 후, 없으면 생성
			  try {
				newFile.createNewFile(); // 실제 파일 생성
			} catch (IOException e) {
				System.err.println("파일을 만들지 못했어요.");
			} 
		  }
		  // 목록 출력
		  printFileInfo(f);
		  
		  // 파일 삭제
		  newFile.delete();
	}
	
	private static void printFileInfo(File f) {
		System.out.println("---------");
		
		// 전달받은 파일 객체가 디렉토리인가?
		if(f.isDirectory()) { // 디렉토리면, 목록을 출력한다.
			System.out.println("디렉토리:"+f.getName());
			
			// 파일 목록 가져오기
			File[] files = f.listFiles(); // 파일 정보의 배열
			
			// 목록 정보 출력
			/*
			 * f rwx 파일명		파일사이즈
			 * d rwx 디렉토리명
			 */
			
			for(File fl : files) {
				System.out.print(fl.isDirectory()?"d":"f"+" ");
				System.out.print(fl.canRead()?"r":"."+" ");
				System.out.print(fl.canWrite()?"w":"."+" ");
				System.out.print(fl.canExecute()?"x":"."+" ");
				System.out.print(fl.isHidden()?"h":"."+" ");
				
				System.out.print(" "+fl.getName());  // 파일명 표시
				System.out.println("\t"+fl.length());
			}
		}else { // 파일 -> 간략정보
			System.out.println("File:");
			// 간략한 파일 정보
			System.out.print(f.getName()+"\t"); // 파일명
			System.out.print(f.canRead()?"r":".");
			System.out.print(f.canWrite()?"w":"."); 
			System.out.print(f.canExecute()?"x":"."); // 실행여부
			System.out.print(f.isHidden()?"h":".");
			System.out.println();
		}
		
	}
}
