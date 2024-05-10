package com.javaex.jdbc.dao2;

public class AuthorVO {
	private Long author_id;
	private String author_name;
	private String authr_desc;
	
	public AuthorVO() {
		
	}

	public AuthorVO(Long author_id, String author_name, String authr_desc) {
		super();
		this.author_id = author_id;
		this.author_name = author_name;
		this.authr_desc = authr_desc;
	}

	public AuthorVO(String author_name, String authr_desc) {
		super();
		this.author_name = author_name;
		this.authr_desc = authr_desc;
	}

	public Long getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(Long author_id) {
		this.author_id = author_id;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public String getAuthr_desc() {
		return authr_desc;
	}

	public void setAuthr_desc(String authr_desc) {
		this.authr_desc = authr_desc;
	}
	
	
}
