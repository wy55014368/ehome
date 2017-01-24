package com.ehome.service.impl;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import com.ehome.dao.IUserDAO;
import com.ehome.dao.impl.UserDAOImpl;
import com.ehome.service.IUserService;
import com.ehome.web.formbean.User;


public class UserServiceImpl implements IUserService {

	private IUserDAO ud = new UserDAOImpl();


	// 注册
	@Override
	public String register(User user) throws NoSuchAlgorithmException,
			UnsupportedEncodingException, ClassNotFoundException, SQLException {
		String uid = ud.addUser(user);
		return uid;
	}
	

	// 登入
	@Override
	public User login(User user) throws ClassNotFoundException, SQLException,
			NoSuchAlgorithmException, UnsupportedEncodingException {
		User validateUser = ud.selectUser(user);
		if (validateUser != null)
			return validateUser;
		return null;
	}


}
