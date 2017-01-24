 package com.ehome.dao.impl;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ehome.common.MD5Create;
import com.ehome.dao.IUserDAO;
import com.ehome.util.DBUtil;
import com.ehome.web.formbean.User;

public class UserDAOImpl implements IUserDAO {
	// 单例模式实例化
	private DBUtil dbu = DBUtil.getInstance();

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
	public User selectUser(User user)
			throws ClassNotFoundException, SQLException, NoSuchAlgorithmException, UnsupportedEncodingException {
		/*String uid = user.getUsername();
		String phoneNumber = user.getPhoneNumber();
		String pwd = user.getPwd();
		pwd = MD5Create.getMd5(pwd);

		try {
			String selectString = "select uname from users where uid=? and pwd=?";
			PreparedStatement preStat = dbu.getPreparedStatement(selectString);
			preStat.setString(1, uid);
			preStat.setString(2, pwd);
			ResultSet set = dbu.execQuery(preStat);
			if (set.next()) {
				User validateUser = new User();
				validateUser.setUid(uid);
				validateUser.setUname(set.getString(1));
				return validateUser;
			}
			return null;
		} finally {
			dbu.closeAll();
		}*/
		return null;
	}

}
