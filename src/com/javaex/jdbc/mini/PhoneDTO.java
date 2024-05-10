package com.javaex.jdbc.mini;

public class PhoneDTO {
	private int id;
	private String name;
	private String hp;
	private String tel;
	
	public PhoneDTO() {
		
	}
	
	public PhoneDTO(int id, String name, String hp, String tel) {
		super();
		this.id = id;
		this.name = name;
		this.hp = hp;
		this.tel = tel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	

}
