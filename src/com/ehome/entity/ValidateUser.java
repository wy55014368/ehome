package com.ehome.entity;

public class ValidateUser {
	private String uid;
	private String username;
	private String pwd;

	public ValidateUser(String uid, String username, String pwd) {
		super();
		this.uid = uid;
		this.username = username;
		this.pwd = pwd;
	}
	public ValidateUser(){
		
	}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "ValidateUser [uid=" + uid + ", username=" + username + ", pwd=" + pwd + "]";
	}
	
	
	
}
