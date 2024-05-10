package com.javaex.jdbc.mini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PhoneDAOImpl implements PhoneDAO{
	
	private Connection getConnection() throws SQLException{
		Connection conn = null;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		
		conn = DriverManager.getConnection(dburl,UserConfig.DB_USER,UserConfig.DB_PW);
		
		
		}catch(ClassNotFoundException e) {
			System.err.println("드라이버를 찾을 수 없습니다.");
			e.printStackTrace();
		}
		return conn;
	}

	@Override
	public List<PhoneDTO> getList() {
		List<PhoneDTO> list = new ArrayList<PhoneDTO>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			
			String sql = "SELECT ID,NAME,HP,tel \r\n"
					+ "FROM PHONE_BOOK";
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				Integer id = rs.getInt(1);
				String name = rs.getString(2);
				String hp = rs.getString(3);
				String tel = rs.getString(4);
			}
			
		}catch(SQLException e) {
			
		}
		return null;
	}

	@Override
	public boolean insert(PhoneDTO phoneDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(PhoneDTO phoneDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(PhoneDTO phoneDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PhoneDTO get(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
