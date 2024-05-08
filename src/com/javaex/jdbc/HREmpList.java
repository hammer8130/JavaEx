package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HREmpList {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		
		//	Connection, Statement, ResultSet
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			stmt = conn.createStatement();
			
//			String sql = "SELECT emp.first_name || ' ' || emp.last_name name," +
//							"mgr.first_name || ' ' || mgr.last_name " +
//							"FROM employees emp JOIN employees mgr " +
//							"ON emp.manager_id = mgr.employee_id " +
//							"ORDER BY name DESC";
			String sql = "SELECT emp.first_name || ' ' || emp.last_name name,";
				sql += "mgr.first_name || ' ' || mgr.last_name ";
				sql += "FROM employees emp JOIN employees mgr ";
				sql += "ON emp.manager_id = mgr.employee_id ";
				sql += "ORDER BY name DESC";
			System.out.println("Query:" + sql);
			
			rs = stmt.executeQuery(sql);	//	DB Cursor 반환
			
			//	ResultSet 순회
			while (rs.next()) {	
				String empName = rs.getString(1);	
				String mgrName = rs.getString(2);	//	rs.getString(2)
				
				System.out.printf("Name: %s, Manager:%s%n", empName, mgrName);
			}
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버를 로드하지 못했습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("SQLError!");
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (Exception e) {
				
			}
			try {
				stmt.close();
			} catch (Exception e) {
				
			}
			try {
				conn.close();
			} catch (Exception e) {
				
			}
		}
	}
}