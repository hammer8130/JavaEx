package com.javaex.project;

public class Name {

	private String name;
	private String phone;
	private String homephone;
	public Name(String name, String phone, String homephone) {
		this.name = name;
		this.phone = phone;
		this.homephone = homephone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getHomephone() {
		return homephone;
	}
	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}
	@Override
	public String toString() {
		return  name +"\t"+   phone +"\t"+  homephone ;
	}
	
	
	
}
