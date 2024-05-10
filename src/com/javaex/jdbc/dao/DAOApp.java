package com.javaex.jdbc.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DAOApp {

	public static void main(String[] args) {
		listAuthors();
		System.out.println();
//		insertAuthors(); // 키보드로 이름, 정보받는다 -> dao -> insert
//		updateAuthors();
//		getAuthor();
		deleteAuthor();
		System.out.println();
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
	
	private static void updateAuthors() {
		Scanner sc= new Scanner(System.in);
		System.out.println("변경할 레코드 ID:");
		Long authorId = Long.parseLong(sc.nextLine());
		System.out.println("이름:");
		String name= sc.nextLine();
		System.out.println("정보:");
		String desc = sc.nextLine();
		
		AuthorVO vo = new AuthorVO(authorId, name, desc);
		
		AuthorDAO dao = new AuthorDAOImplOracle();
		boolean s2 = dao.update(vo);
		
		System.out.println("Author Update "+(s2?"성공":"실패"));
		sc.close();
	}
	
	private static void getAuthor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("레코드 ID:");
		Long authorId = Long.parseLong(sc.nextLine());
		
		AuthorDAO dao = new AuthorDAOImplOracle();
		AuthorVO vo =dao.get(authorId);
		
		if(vo!=null) {
			System.out.printf("%d\t%s\t%s%n",vo.getAuthorId(),vo.getAuthorName(),vo.getAuthorDesc());
		}else {
			System.out.println("레코드를 찾지 못했습니다.");
		}
		sc.close();
	}
	
	private static void deleteAuthor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 ID:");
		Long authorId = Long.parseLong(sc.nextLine());
		
		
		AuthorDAO dao = new AuthorDAOImplOracle();
		boolean s = dao.delete(authorId);
		
		System.out.println("Author Delete "+(s?"성공":"실패"));
		sc.close();
	}
}
