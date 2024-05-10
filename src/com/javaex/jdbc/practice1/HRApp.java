package com.javaex.jdbc.practice1;

import java.util.Iterator;
import java.util.List;

public class HRApp {

	public static void main(String[] args) {
		listEmployees();
	}
	
	private static void listEmployees() {
		EmployeeDAO dao = new EmployeeDAOImpl();
		
		List<EmployeeVO> li = dao.getList();
		if(li.size()>0) {
			Iterator<EmployeeVO> it = li.iterator();
			while(it.hasNext()) {
				EmployeeVO evo = it.next();
				System.out.printf("%s\t%s\t%s\t%s\t%s%n",evo.getFirst_name(),evo.getLast_name(),
						evo.getEmail(),evo.getPhone_number(),evo.getHire_date());
			}
		}else {
			System.out.println("데이터가 존재하지 않습니다.");
		}
	}

}
