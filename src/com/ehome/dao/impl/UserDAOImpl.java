package com.ehome.dao.impl;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ehome.common.MD5Create;
import com.ehome.dao.IUserDAO;
import com.ehome.entity.User;
import com.ehome.util.DBUtil;

public class UserDAOImpl implements IUserDAO {

	private DBUtil dbu = DBUtil.getInstance();


	@Override
	public String addUser(User user) throws NoSuchAlgorithmException,
			UnsupportedEncodingException, ClassNotFoundException, SQLException {
		String uname = user.getUsername();
		String[] pwds = user.getPwd();
		String pwd = pwds[0];
		pwd = MD5Create.getMd5(pwd);
		String birthday = user.getBirthday();
		String sex = user.getSex();
		String headshot = user.getHeadshot();
		String email = user.getEmail();
		String introduce = user.getIntroduce();
		String[] likes = user.getLike();
		String like = likes[0]+","+likes[1];
		String major = user.getMajor();
		try{
			String addString = "insert into users(username,pwd,sex,"
					+ "email,headshot,birthday,introduce,likes,major) values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement preStat = dbu.getPreparedStatement(addString);
			preStat.setString(1, uname);
			preStat.setString(2, pwd);
			preStat.setString(3, sex);
			preStat.setString(4, email);
			preStat.setString(5, headshot);
			preStat.setString(6, birthday);
			preStat.setString(7, introduce);
			preStat.setString(8, like);
			preStat.setString(9, major);
			int lines = preStat.executeUpdate();
			if (lines > 0) {
				String getUidString = "select uid from users where email=?";
				PreparedStatement preStat2 = dbu.getPreparedStatement(getUidString);
				preStat2.setString(1, email);
				ResultSet set = dbu.execQuery(preStat2);
				while (set.next()) {
					String uid = set.getString(1);
					return uid;
				}
			}
			return null;
		}finally{
			dbu.closeAll();
		}
	}

	

}
