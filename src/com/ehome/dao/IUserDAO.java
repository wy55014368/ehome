package com.ehome.dao;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import com.ehome.web.formbean.User;

public interface IUserDAO {

	//注册
	String addUser(User user) throws NoSuchAlgorithmException,
			UnsupportedEncodingException, ClassNotFoundException, SQLException;
	
	//登录
	User selectUser(User user) throws ClassNotFoundException, SQLException,
	NoSuchAlgorithmException, UnsupportedEncodingException;

}