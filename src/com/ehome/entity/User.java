package com.ehome.entity;

import java.util.Arrays;

public class User {

	private String username;
	private String[] pwd;
	private String sex;
	private String email;
	private String headshot;
	private String birthday;
	private String introduce;
	private String[] like;
	private String major;
	public User(String username, String[] pwd, String sex, String email, String headshot, String birthday,
			String introduce, String[] like, String major) {
		super();
		this.username = username;
		this.pwd = pwd;
		this.sex = sex;
		this.email = email;
		this.headshot = headshot;
		this.birthday = birthday;
		this.introduce = introduce;
		this.like = like;
		this.major = major;
	}
	public User(){
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String[] getPwd() {
		return pwd;
	}
	public void setPwd(String[] pwd) {
		this.pwd = pwd;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHeadshot() {
		return headshot;
	}
	public void setHeadshot(String headshot) {
		this.headshot = headshot;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String[] getLike() {
		return like;
	}
	public void setLike(String[] like) {
		this.like = like;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", pwd=" + Arrays.toString(pwd) + ", sex=" + sex + ", email=" + email
				+ ", headshot=" + headshot + ", birthday=" + birthday + ", introduce=" + introduce + ", like="
				+ Arrays.toString(like) + ", major=" + major + "]";
	}
	
	
	
	
	
	
	
	

}
