package com.javaex.jdbc.dao;

import java.util.List;

public interface AuthorDAO {
	// List - Select Query
	public List<AuthorVO> getList();
	public AuthorVO get(Long id); // PK로 객체 찾기
	public boolean insert(AuthorVO authorVo); // 레코드 삽입
	public boolean delete(Long id); // PK로 객체 찾기
	public boolean update(AuthorVO authorVo);
}
