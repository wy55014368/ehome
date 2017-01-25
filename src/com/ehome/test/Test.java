package com.ehome.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.ehome.common.MD5Create;
import com.ehome.controller.CreateCode;
import com.ehome.web.formbean.User;

public class Test extends HttpServlet {

	/**
		 * The doGet method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to get.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.getRequestDispatcher("/page/tuihuo.html").forward(request, response);
		//response.sendRedirect("/ehome/page/tuihuo.html");	
		/*String headshot = request.getParameter("headshot");
		System.out.println(headshot);*/
		 /*Map<String, String[]> map = request.getParameterMap();
		 User user = new User();
		 try {
			BeanUtils.populate(user, map);
			System.out.println(user);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}*/
		/*String headshot = request.getParameter("headshot");
		System.out.println(headshot);*/
		/*String validateCode = request.getParameter("code");
		System.out.println(validateCode);
		PrintWriter w = response.getWriter();
		String tcode = CreateCode.getCode();
		if(tcode.equalsIgnoreCase(validateCode)){
			w.print(true);
		}else{
			w.print(false);
		}*/
		
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request,response);
	}

}
