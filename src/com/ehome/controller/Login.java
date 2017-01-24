package com.ehome.controller;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ehome.util.WEBUtils;
import com.ehome.web.formbean.Login_User;

public class Login extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//得到登录表单对象
		Login_User g = WEBUtils.RequestToBean(request,Login_User.class);
			try {
				String uname = g.getName();
				boolean validate = g.validate();
				if(!validate){
					request.setAttribute("success_login", "登录失败");
					request.setAttribute("errors", g.getErrors());
					request.getRequestDispatcher("/WEB-INF/jsp/login_user.jsp").forward(request, response);
				}else{
					/*request.setAttribute("success_login", "登录成功,"+uname+"您好!");
					request.setAttribute("errors", g.getErrors());
					request.getRequestDispatcher("/WEB-INF/jsp/login_user.jsp").forward(request, response);*/
					response.setContentType("text/html");
					response.setHeader("refresh", "1;/ehome/page/yonghuyundan.html");
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request,response);
	}
}
