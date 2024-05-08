package com.javaex.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AuthorDAOImplOracle implements AuthorDAO {
	// 내부에서만 호출 가능한 메서드
	private Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			// 여기서 발생한 예외는 밖으로 던져준다.
			conn = DriverManager.getConnection(dburl, DatabaseConfig.DB_USER, DatabaseConfig.DB_PW);

		} catch (ClassNotFoundException e) {
			System.err.println("드라이버를 찾을 수 없습니다.");
			e.printStackTrace();
		}

		return conn;

	}

	@Override
	public List<AuthorVO> getList() {
		List<AuthorVO> list = new ArrayList<AuthorVO>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
		// 1. Connection
			conn = getConnection();
		// 2. Statement
			stmt = conn.createStatement();
		// 3. SQL Query 전송 -> ResultSet
			String sql = "SELECT AUTHOR_ID, AUTHOR_NAME, AUTHOR_DESC FROM AUTHOR";
			rs = stmt.executeQuery(sql);
		// 4. ResultSet 순회 -> 레코드를 AuthorVO로 변경 ==> List에 추가
			
			while(rs.next()) {
				Long authorId = rs.getLong(1);
				String authorName = rs.getString(2);
				String authorDesc = rs.getString(3);

				AuthorVO vo = new AuthorVO(authorId, authorName, authorDesc);
				list.add(vo);
				
			}
		// 5. List를 반환
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs !=null) rs.close();
				if (stmt !=null) stmt.close();
				if (conn !=null) conn.close();
			}catch (Exception e) {
			}
		}
		return list;
	}

	@Override
	public AuthorVO get(Long id) {
		
		return null;
	}

	@Override
	public boolean insert(AuthorVO authorVo) {
		Connection conn = null;
		PreparedStatement stmt = null;
		int insertedCount = 0; // INSERT 결과 영향받은 레코드 수 
		
		try {
			// 커넥션
			conn = getConnection();
			// 실행 계획 준비
			String sql = " INSERT INTO AUTHOR (author_id, author_name, author_desc) "
					+ " VALUES(seq_author_id.NEXTVAL,?,?) ";
			stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, authorVo.getAuthorName());
			stmt.setString(2, authorVo.getAuthorDesc());
			
			// 생성된 쿼리 수행
			insertedCount = stmt.executeUpdate();
		}catch(SQLException e) {
			System.err.println("update 실패!");
			e.printStackTrace();
		}finally {
			try {
				if(stmt !=null)stmt.close();
				if(conn !=null)conn.close();
			}catch (Exception e) {	
			}
		}
		
		return insertedCount==1; // insertedCount가 1인지 아닌지 판별 , 1이면 true
	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(AuthorVO authorVo) {
		// TODO Auto-generated method stub
		return false;
	}

}
