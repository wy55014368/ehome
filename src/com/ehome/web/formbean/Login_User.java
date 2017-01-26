package com.ehome.web.formbean;

public class Login_User {
	private String uname;
	private String uid;
	private String phoneNumber;
	private String id_phoneNumber;
	private String pwd;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getId_phoneNumber() {
		return id_phoneNumber;
	}
	public void setId_phoneNumber(String id_phoneNumber) {
		this.id_phoneNumber = id_phoneNumber;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Override
	public String toString() {
		return "Login_User [id_phoneNumber=" + id_phoneNumber + ", pwd=" + pwd + "]";
	}
	
	


	
	


}
