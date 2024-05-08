package com.javaex.jdbc.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DAOApp {

	public static void main(String[] args) {
		listAuthors();
		insertAuthors(); // 키보드로 이름, 정보받는다 -> dao -> insert
		listAuthors();
	}

	private static void listAuthors() {
		AuthorDAO dao = new AuthorDAOImplOracle();
		System.out.println("==========Authors==========");
		
		List<AuthorVO> list = dao.getList();
		if(list.size()>0) {
			// Iterator 순회
			Iterator<AuthorVO> it = list.iterator();
			while(it.hasNext()) {
				AuthorVO vo = it.next();
				System.out.printf("%d\t%s\t%s%n",vo.getAuthorId(),vo.getAuthorName(),vo.getAuthorDesc());
			}
		}else {
			System.out.println("데이터가 존재하지 않습니다.");
		}
	}
	
	private static void insertAuthors() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름:");
		String name = sc.nextLine();
		System.out.println("정보:");
		String desc = sc.nextLine();
		
		// 새로운 객체 생성
		AuthorVO vo = new AuthorVO(name, desc);
		
		AuthorDAO dao = new AuthorDAOImplOracle();
		boolean s = dao.insert(vo);
		
		System.out.println("Author Insert "+(s ?"성공":"다시해"));
		sc.close();
	}
}
