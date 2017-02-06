package com.ehome.service;

import java.io.UnsupportedEncodingException;
import java.net.UnknownHostException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import com.ehome.entity.Waybill;
import com.ehome.web.formbean.Login_User;
import com.ehome.web.formbean.User;

public interface IUserService {

	//注册时手机号码验证(手机号码作为唯一验证身份)
	boolean vali_phone(String phoneNumber) throws ClassNotFoundException, SQLException;
	//注册
	String register(User user) throws NoSuchAlgorithmException,
			UnsupportedEncodingException, ClassNotFoundException, SQLException;
	//登录
	Login_User login(Login_User login_user) throws ClassNotFoundException, SQLException,
	NoSuchAlgorithmException, UnsupportedEncodingException, UnknownHostException;

	//运单管理
	//根据运单号查询运单详情
	Waybill select_wb(String goodsWaybillId) throws ClassNotFoundException, SQLException;
	
}