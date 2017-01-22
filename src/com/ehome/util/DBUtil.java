package com.ehome.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {

	private Connection conn = null;
	private PreparedStatement  preStat = null;
	private ResultSet set = null;
	
	//单例模式
	private static DBUtil dbu = null;
	private DBUtil(){}
	public static DBUtil getInstance(){
		if(dbu == null)
			dbu = new DBUtil();
		return dbu;
	}
	/**
	 * 建立连接的方法
	 * @return 连接对象
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	private Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName(DBpropertiesReader.get("driver"));
		String address = DBpropertiesReader.get("address");
		String database = DBpropertiesReader.get("database");
		String ssl = DBpropertiesReader.get("ssl");
		String url = address+database+"?useSSL="+ssl;
		String user = DBpropertiesReader.get("user");
		String pwd = DBpropertiesReader.get("pwd");
		//建立连接：实例化connection 对象
		//使用驱动程序管理类DriverManager
		conn = DriverManager.getConnection(url, user, pwd);
		return conn;
	}
	/**
	 * 获取预编译对象的方法
	 * @param sql 预编译的SQL命令
	 * @return 预编译对象
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException{
		preStat = getConnection().prepareStatement(sql);
		return preStat;
	}
	/**
	 * 执行增删改的方法
	 * @param preStat 执行增删改语句的操作对象
	 * @return 返回影响的行数
	 * @throws SQLException
	 */
	public int execUpdate(PreparedStatement preStat) throws SQLException{
		return preStat.executeUpdate();
	}
	
	public ResultSet execQuery(PreparedStatement preStat) throws SQLException{
		set = preStat.executeQuery();
		return set;
	}
	
	public void closeSet() throws SQLException{
		if(set != null)
			set.close();
	}
	public void closePreStat() throws SQLException{
		if(preStat != null)
			preStat.close();
	}
	public void closeConn() throws SQLException{
		if(conn != null)
			conn.close();
	}
	
	public void closeAll() throws SQLException{
		closeSet();
		closePreStat();
		closeConn();
	}
	
	
	
	
	
	
	
	
	
}