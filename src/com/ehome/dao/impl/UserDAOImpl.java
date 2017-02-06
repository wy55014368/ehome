package com.ehome.dao.impl;

import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ehome.common.MD5Create;
import com.ehome.dao.IUserDAO;
import com.ehome.entity.Waybill;
import com.ehome.util.DBUtil;
import com.ehome.web.formbean.Login_User;
import com.ehome.web.formbean.User;

public class UserDAOImpl implements IUserDAO {
	// 单例模式实例化
	private DBUtil dbu = DBUtil.getInstance();

	// 注册时手机号码验证
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
		// 添加创建日期(类型bigInt)
		/*
		 * Date d = new Date(); SimpleDateFormat sdf = new SimpleDateFormat(
		 * "yyyy-MM-dd HH:mm:ss"); String createDate =sdf.format(d);
		 */
		long createDate = System.currentTimeMillis();
		// 添加上次修改时间(类型bigInt,暂时以创建时间代替)
		long lastModifiedTime = createDate;

		try {
			String addString = "insert into users(uname,password,phone,head,createDate,"
					+ "lastModifiedTime) values(?,?,?,?,?,?)";
			PreparedStatement preStat = dbu.getPreparedStatement(addString);
			preStat.setString(1, username);
			preStat.setString(2, pwd);
			preStat.setString(3, phoneNumber);
			preStat.setString(4, headshot);
			preStat.setLong(5, createDate);
			preStat.setLong(6, lastModifiedTime);
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
	public Login_User selectUser(Login_User login_user) throws ClassNotFoundException, SQLException,
			NoSuchAlgorithmException, UnsupportedEncodingException, UnknownHostException {
		String id_phoneNumber = login_user.getId_phoneNumber();
		String pwd = login_user.getPwd();
		pwd = MD5Create.getMd5(pwd);
		// 添加或修改最后登录日期（毫秒数）
		long lastLoginDate = System.currentTimeMillis();
		// 添加或修改最后登录IP
		InetAddress addr = InetAddress.getLocalHost();
		String lastLoginIp = addr.getHostAddress().toString();// 获得本机IP
		// String address=addr.getHostName().toString();//获得本机名称
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
				// 修改最后登录时间
				String updateString = "update users set lastLoginDate = ? where uid =? ";
				PreparedStatement preStat2 = dbu.getPreparedStatement(updateString);
				preStat2.setLong(1, lastLoginDate);
				preStat2.setString(2, id_phoneNumber);
				dbu.execUpdate(preStat2);
				// 修改最后登录IP
				String updateString2 = "update users set lastLoginIp = ? where uid =? ";
				PreparedStatement preStat3 = dbu.getPreparedStatement(updateString2);
				preStat3.setString(1, lastLoginIp);
				preStat3.setString(2, id_phoneNumber);
				dbu.execUpdate(preStat3);
				return validateUser;
			} else {
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
					// 修改最后登录时间
					String updateString = "update users set lastLoginDate = ? where uid =? ";
					PreparedStatement preStat3 = dbu.getPreparedStatement(updateString);
					preStat3.setLong(1, lastLoginDate);
					preStat3.setString(2, set2.getString(2));
					dbu.execUpdate(preStat3);
					// 修改最后登录IP
					String updateString2 = "update users set lastLoginIp = ? where uid =? ";
					PreparedStatement preStat4 = dbu.getPreparedStatement(updateString2);
					preStat4.setString(1, lastLoginIp);
					preStat4.setString(2, set2.getString(2));
					dbu.execUpdate(preStat4);

					return validateUser;
				}
			}
			return null;
		} finally {
			dbu.closeAll();
		}
	}

	//运单管理
	//根据运单号查询运单详情
	@Override
	public Waybill select_wd(String goodsWaybillId) throws ClassNotFoundException, SQLException {
		String selectString = "select wb_Id,wayPersonName,wayPersonNumber,consigneeName,"
				+ "consigneeNum,consigneeAddress,consignerName,consignerNumber,"
				+ "consignerAddress from Waybill where goodsWaybillId=?";
		PreparedStatement preStat = dbu.getPreparedStatement(selectString);
		preStat.setString(1, goodsWaybillId);
		ResultSet set = dbu.execQuery(preStat);
		if (set.next()) {
			Waybill wb = new Waybill();
			wb.setWb_Id(set.getString(1));
			wb.setGoodsWaybillId(goodsWaybillId);
			
			wb.setWayPersonName(set.getString(2));
			wb.setWayPersonNumber(set.getString(3));
			
			wb.setConsigneeName(set.getString(4));
			wb.setConsigneeNum(set.getString(5));
			wb.setConsigneeAddress(set.getString(6));
			
			wb.setConsignerName(set.getString(7));
			wb.setConsignerNumber(set.getString(8));
			wb.setConsignerAddress(set.getString(9));
			return wb;
		}
		return null;
	}

}
