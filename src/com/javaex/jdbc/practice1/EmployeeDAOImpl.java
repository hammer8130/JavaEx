package com.javaex.jdbc.practice1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDAOImpl implements EmployeeDAO {

	private Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";

			conn = DriverManager.getConnection(dburl, DatabaseConfig.DB_USER, DatabaseConfig.DB_PW);

		} catch (ClassNotFoundException e) {
			System.err.println("드라이버를 찾을 수 없습니다.");
			e.printStackTrace();
		}

		return conn;
	}

	@Override
	public List<EmployeeVO> getList() {
		List<EmployeeVO> li = new ArrayList<EmployeeVO>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			conn = getConnection();
			System.out.println("conn 성공");
			System.out.println("검색어를 입력하세요.");
			stmt = conn.createStatement();
			System.out.println("stmt 성공");
			String sql = "SELECT FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER,HIRE_DATE,SALARY FROM EMPLOYEES";
			rs = stmt.executeQuery(sql);
			System.out.println("rs 성공");
			while (rs.next()) {
				String fn = rs.getString(1);
				String ln = rs.getString(2);
				String mail = rs.getString(3);
				String pn = rs.getString(4);
				Date date = rs.getDate(5);

				EmployeeVO vo = new EmployeeVO(fn, ln, mail, pn, date);
				li.add(vo);
//				System.out.printf("%s\t%s: %s, %s, %s", fn, ln, mail, pn, date);
			}

		} catch (SQLException e) {
			System.err.println("SQL 에러!!!");
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (stmt != null)
					stmt.close();
				if (rs != null)
					rs.close();
			} catch (Exception e) {

			}

		}

		sc.close();
		return li;
	}
}
