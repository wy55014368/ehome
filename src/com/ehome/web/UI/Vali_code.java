package com.ehome.web.UI;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ehome.controller.CreateCode;

public class Vali_code extends HttpServlet {

	//用于验证码是否输入正确(充当服务器)
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String validateCode = request.getParameter("code");
		PrintWriter w = response.getWriter();
		String tcode = CreateCode.getCode();
		if(tcode.equalsIgnoreCase(validateCode)){
			w.print(true);
		}else{
			w.print(false);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request,response);
	}

}
