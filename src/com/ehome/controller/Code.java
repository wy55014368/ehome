package com.ehome.controller;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Code extends HttpServlet {



	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		response.setHeader("content-type", "Image/jpeg");
		ImageIO.write(CreateCode.Create(), "jpg", response.getOutputStream());
		//得到上下文对象
		ServletContext sc =this.getServletContext();
		//调用静态方法，得到验证码
		String codeValue = CreateCode.getCode();
		//通过上下文对象设置 属性 ---以便验证
		sc.setAttribute("value", codeValue);
		
	}

}
