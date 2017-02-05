package com.ehome.dao;

import java.io.UnsupportedEncodingException;
import java.net.UnknownHostException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import com.ehome.web.formbean.Login_User;
import com.ehome.web.formbean.User;

public interface IUserDAO {

	boolean selectPhone(String phoneNumber) throws ClassNotFoundException, SQLException;
	//注册
	String addUser(User user) throws NoSuchAlgorithmException,
			UnsupportedEncodingException, ClassNotFoundException, SQLException;
	
	//登录
	Login_User selectUser(Login_User login_user) throws ClassNotFoundException, SQLException,
	NoSuchAlgorithmException, UnsupportedEncodingException, UnknownHostException;

}