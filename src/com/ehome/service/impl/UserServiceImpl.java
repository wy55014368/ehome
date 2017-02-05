package com.ehome.service.impl;

import java.io.UnsupportedEncodingException;
import java.net.UnknownHostException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import com.ehome.dao.IUserDAO;
import com.ehome.dao.impl.UserDAOImpl;
import com.ehome.service.IUserService;
import com.ehome.web.formbean.Login_User;
import com.ehome.web.formbean.User;


public class UserServiceImpl implements IUserService {

	private IUserDAO ud = new UserDAOImpl();

	//注册时手机号码
	@Override
	public boolean vali_phone(String phoneNumber) throws ClassNotFoundException, SQLException {
		boolean vali_phone = ud.selectPhone(phoneNumber);
		return vali_phone;
	}
	
	// 注册
	@Override
	public String register(User user) throws NoSuchAlgorithmException,
			UnsupportedEncodingException, ClassNotFoundException, SQLException {
		String uid = ud.addUser(user);
		return uid;
	}
	

	// 登入
	@Override
	public Login_User login(Login_User login_user) throws ClassNotFoundException, SQLException,
			NoSuchAlgorithmException, UnsupportedEncodingException, UnknownHostException {
		Login_User validateUser = ud.selectUser(login_user);
		if (validateUser != null)
			return validateUser;
		return null;
	}


	


}
