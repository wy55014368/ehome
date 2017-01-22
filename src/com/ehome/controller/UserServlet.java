package com.ehome.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 用于用户注册和登录跳转的servlet
 */
public class UserServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String goString = request.getParameter("m");
		if(goString.equals("login")){
			//页面跳转到登录页面register
			request.getRequestDispatcher("/WEB-INF/jsp/login_user.jsp").forward(request, response);
		}else if(goString.equals("register")){
			//页面跳转到注册页面
			request.getRequestDispatcher("/WEB-INF/jsp/register.jsp").forward(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request,response);
	}

}
