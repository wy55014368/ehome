package com.ehome.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ehome.web.formbean.Goods;
import com.ehome.util.WEBUtils;

public class GoodsServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Goods g = WEBUtils.RequestToBean(request,Goods.class);
		
		boolean isValidate = g.validate();
		
		request.setAttribute("errors", g.getErrors());
		request.getRequestDispatcher("/WEB-INF/jsp/goods.jsp").forward(request, response);
		
		
		
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request,response);
	}

}
