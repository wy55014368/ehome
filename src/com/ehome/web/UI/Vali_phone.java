package com.ehome.web.UI;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ehome.service.IUserService;
import com.ehome.service.impl.UserServiceImpl;

public class Vali_phone extends HttpServlet {

	//用于验证用户是否已经注册过(通过手机号码唯一判定)
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IUserService ius = new UserServiceImpl();
		String phoneNumber = request.getParameter("phoneNumber");
		PrintWriter w = response.getWriter();
		try {
			boolean bool = ius.vali_phone(phoneNumber);
			w.print(bool);
		} catch (ClassNotFoundException e) {
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
