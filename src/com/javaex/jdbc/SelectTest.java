package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {
		String dburl = "JDBC:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpw = "hr";
		// Connection, Statement, ResultSet
		// try - with - resources 문 ( 자동 자원 정리 )
		// AutoCloseable 인터페이스를 구현한 클래스들 사용 가능
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");			
		}catch(ClassNotFoundException e) {
			System.err.println("JDBC 드라이버 로드 실패!");
		}
		
		Connection conn = null;
		Statement stmt= null;
		ResultSet rs= null;
				
			
		try	{	
			conn = DriverManager.getConnection(dburl, dbuser,dbpw);
			stmt = conn.createStatement(); // 접속 데이터
			String sql = "SELECT department_id, department_name FROM departments";
			
			rs = stmt.executeQuery(sql);  // DB Cursor 반환
//												=> 레코드의 행을 가리키는 Cursor
			
			// ResultSet 순회
			while(rs.next()) {
				// 컬럼 계열 받아올 땐 getXXX(컬럼순서) or getXXX(컬럼 프로젝션 이름)
				int deptId = rs.getInt(1); // rs.getInt("department_id")
				String deptName = rs.getString(2); // rs.getString(2)
				
				System.out.printf("%d:%s%n", deptId, deptName);
			}
		}catch (SQLException e) {
			System.err.println("SQL 에러!!!");
		}finally {
			try {
				rs.close();
			}catch(Exception e) {
				
			}
			try {
				stmt.close();
			}catch(Exception e) {
				
			}
			try {
				conn.close();
			}catch(Exception e) {
				
			}
		}
	}
}
