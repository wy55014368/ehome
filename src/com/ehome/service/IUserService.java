package com.ehome.service;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import com.ehome.web.formbean.User;

public interface IUserService {

	//注册
	String register(User user) throws NoSuchAlgorithmException,
			UnsupportedEncodingException, ClassNotFoundException, SQLException;
	//登录
	User login(User user) throws ClassNotFoundException, SQLException,
	NoSuchAlgorithmException, UnsupportedEncodingException;

	
}