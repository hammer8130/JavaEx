package com.javaex.jdbc.dao2;

import java.util.Iterator;
import java.util.List;

public class DaoApp {

	public static void main(String[] args) {
		AuthorDAO dao = new AuthorDAOImpl();
		List<AuthorVO> list = dao.getList();
		if(list.size()>0) {
			Iterator<AuthorVO> it = list.iterator();
			while(it.hasNext()) {
				AuthorVO a1 = it.next();
				
			}
		}
	}

}
