package com.javaex.jdbc.dao2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AuthorDAOImpl implements AuthorDAO{
	private Connection getcConnection() throws SQLException{
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			
			conn=DriverManager.getConnection(dburl,DatabaseConfig.DB_USER,DatabaseConfig.DB_PW);
		}catch (ClassNotFoundException e) {
			System.err.println("JDBC 드라이버를 찾을 수 없습니다.");
			e.printStackTrace();
		}
		return conn;
	}

	@Override
	public List<AuthorVO> getList() {
		List<AuthorVO> li = new ArrayList<AuthorVO>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn=getcConnection();
			stmt=conn.createStatement();
			String s1 = "SELECT AUTHOR_ID, AUTHOR_NAME, AUTHOR_DESC FROM AUTHOR";
			rs=stmt.executeQuery(s1);
			
			while(rs.next()) {
				Long id = rs.getLong(0);
				String name = rs.getString(1);
				String desc = rs.getString(2);
				
				AuthorVO vo = new AuthorVO(id, name, desc);
				li.add(vo);
			}
			
		}catch(SQLException e) {
			System.err.println("데이터를 불러오지 못했습니다.");
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)rs.close();
				if(stmt!=null)rs.close();
				if(rs!=null)rs.close();
			}catch(Exception e) {
				
			}
		}
		
		return li;
	}
}
