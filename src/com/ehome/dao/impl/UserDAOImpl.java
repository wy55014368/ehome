 package com.ehome.dao.impl;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ehome.common.MD5Create;
import com.ehome.dao.IUserDAO;
import com.ehome.util.DBUtil;
import com.ehome.web.formbean.Login_User;
import com.ehome.web.formbean.User;

public class UserDAOImpl implements IUserDAO {
	// 单例模式实例化
	private DBUtil dbu = DBUtil.getInstance();

	//注册时手机号码验证
	@Override
	public boolean selectPhone(String phoneNumber) throws ClassNotFoundException, SQLException {
		String selectString = "select uname from users where phone=?";
		PreparedStatement preStat = dbu.getPreparedStatement(selectString);
		preStat.setString(1, phoneNumber);
		ResultSet set = dbu.execQuery(preStat);
		if (set.next()) {
			return false;
		}
		return true;
	}
	
	// 注册
	@Override
	public String addUser(User user)
			throws NoSuchAlgorithmException, UnsupportedEncodingException, ClassNotFoundException, SQLException {
		String username = user.getUsername();
		String pwd = user.getPwd();
		pwd = MD5Create.getMd5(pwd);
		String phoneNumber = user.getPhoneNumber();
		String headshot = user.getHeadshot();
		try {
			String addString = "insert into users(uname,password,phone," + "head) values(?,?,?,?)";
			PreparedStatement preStat = dbu.getPreparedStatement(addString);
			preStat.setString(1, username);
			preStat.setString(2, pwd);
			preStat.setString(3, phoneNumber);
			preStat.setString(4, headshot);
			int lines = preStat.executeUpdate();
			if (lines > 0) {
				String getUidString = "select uid from users where phone=?";
				PreparedStatement preStat2 = dbu.getPreparedStatement(getUidString);
				preStat2.setString(1, phoneNumber);
				ResultSet set = dbu.execQuery(preStat2);
				while (set.next()) {
					String uid = set.getString(1);
					return uid;
				}
			}
			return null;
		} finally {
			dbu.closeAll();
		}
	}

	// 登入
	@Override
	public Login_User selectUser(Login_User login_user)
			throws ClassNotFoundException, SQLException, NoSuchAlgorithmException, UnsupportedEncodingException {
		String id_phoneNumber = login_user.getId_phoneNumber();
		String pwd = login_user.getPwd();
		pwd = MD5Create.getMd5(pwd);

		try {
			String selectString = "select uname,phone from users where uid=? and password=?";
			PreparedStatement preStat = dbu.getPreparedStatement(selectString);
			preStat.setString(1, id_phoneNumber);
			preStat.setString(2, pwd);
			ResultSet set = dbu.execQuery(preStat);
			if (set.next()) {
				Login_User validateUser = new Login_User();
				validateUser.setUid(id_phoneNumber);
				validateUser.setUname(set.getString(1));
				validateUser.setPhoneNumber(set.getString(2));
				return validateUser;
			}else{
				String selectString2 = "select uname,uid from users where phone=? and password=?";
				PreparedStatement preStat2 = dbu.getPreparedStatement(selectString2);
				preStat2.setString(1, id_phoneNumber);
				preStat2.setString(2, pwd);
				ResultSet set2 = dbu.execQuery(preStat2);
				if (set2.next()) {
					Login_User validateUser = new Login_User();
					validateUser.setUid(set2.getString(2));
					validateUser.setUname(set2.getString(1));
					validateUser.setPhoneNumber(id_phoneNumber);
					return validateUser;
				}
			}
			return null;
		} finally {
			dbu.closeAll();
		}
	}

	

}
