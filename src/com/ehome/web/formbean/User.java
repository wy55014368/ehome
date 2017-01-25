package com.ehome.web.formbean;

import java.util.HashMap;
import java.util.Map;

import com.ehome.controller.CreateCode;

public class User {

	private String username;
	private String pwd;
	private String rpwd;
	private String phoneNumber;
	private String validateCode;
	private String headshot;

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

	public String getRpwd() {
		return rpwd;
	}

	public void setRpwd(String rpwd) {
		this.rpwd = rpwd;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getValidateCode() {
		return validateCode;
	}

	public void setValidateCode(String validateCode) {
		this.validateCode = validateCode;
	}

	public String getHeadshot() {
		return headshot;
	}

	public void setHeadshot(String headshot) {
		this.headshot = headshot;
	}



	@Override
	public String toString() {
		return "User [username=" + username + ", pwd=" + pwd + ", phoneNumber=" + phoneNumber + ", headshot=" + headshot
				+ "]";
	}
	

}
