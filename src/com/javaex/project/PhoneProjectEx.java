package com.javaex.project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneProjectEx {

	private static String rp = System.getProperty("user.dir") + "\\files\\";
	private static String source = rp + "PhoneDB.txt";
	private static String target = rp+"test.txt";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*******************************");
		System.out.println("*        전화번호 관리 프로그램      *");
		System.out.println("*******************************");
		while (true) {
			System.out.println("1.리스트  2.등록  3.삭제  4.검색  5.종료");
			System.out.println("-------------------------------");
			System.out.print(">메뉴번호:");
			int num = sc.nextInt();

			try (Reader r = new FileReader(source); BufferedReader br = new BufferedReader(r);) {
				List<Name> l = new ArrayList<Name>();
				String line = "";
				int count = 0;
				while ((line = br.readLine()) != null) {
					String[] token = line.split(",");
					if (token.length == 3) {
						String name = token[0];
						String phone = token[1];
						String homephone = token[2];
						Name n = new Name(name, phone, homephone);
						l.add(n);
					}
				}

				switch (num) {

				case 1:
					System.out.println("<1.리스트>");
					for (Name name : l) {
						System.out.println((count++) + "." + name);
					}
					break;

				case 2:
					System.out.println("<2.등록>");
					System.out.print(">이름:");
					String name = sc.next();
					System.out.print(">휴대전화:");
					String phone = sc.next();
					System.out.print(">회사전화:");
					String homephone = sc.next();

					Name n2 = new Name(name, phone, homephone);
					l.add(n2);

					try (Writer w = new FileWriter(source);) {
						for (Name newname : l) {
							w.write(newname.getName() + ",");
							w.write(newname.getPhone() + ",");
							w.write(newname.getHomephone() + "\n");
						}
					}

					System.out.println("등록되었습니다.");
					break;

				case 3:
					System.out.println("<3.삭제>");
					System.out.print(">번호:");
					int deln = sc.nextInt();
					if (deln < l.size() && deln >= 0) {
						l.remove(deln);
						try (Writer w = new FileWriter(source);) {
							for (Name newname : l) {
								w.write(newname.getName() + ",");
								w.write(newname.getPhone() + ",");
								w.write(newname.getHomephone() + "\n");
							}
						}
					}
					System.out.println("삭제되었습니다.");
					break;

				case 4:
					System.out.println("<4.검색>");
					System.out.print(">이름:");
					String s = sc.next();
					
					try(
						Reader r2= new FileReader(source);
						Writer w2=new FileWriter(target);
							
						BufferedReader br2 = new BufferedReader(r2);
						BufferedWriter bw2 = new BufferedWriter(w2);
						){
						String line2 = "";
						while((line2=br2.readLine())!=null) {
							if(line2.contains(s)) {
								
									bw2.write(line2+ ",");
//									bw2.write(name2.getPhone() + ",");
//									bw2.write(name2.getHomephone() + "\n");
								System.out.println(line2);
							}
							
						}
					}
					break;

				case 5:
					System.out.println("*******************************");
					System.out.println("*           감사합니다           *");
					System.out.println("*******************************");
					break;
				default:
					System.out.println("[다시 입력해주세요.]");
					
				
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		
	}

}
