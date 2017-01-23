package com.ehome.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ehome.util.WEBUtils;
import com.ehome.web.formbean.User;


public class Register extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		User g = WEBUtils.RequestToBean(request,User.class);
		
		boolean isValidate = g.validate();
		
		request.setAttribute("printCode", g.getValidateCode());
		request.setAttribute("errors", g.getErrors());
		request.getRequestDispatcher("/WEB-INF/jsp/register.jsp").forward(request, response);
		
	
	}
	

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request,response);
	}

}
