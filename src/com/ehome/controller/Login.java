package com.ehome.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import com.ehome.entity.ValidateUser;

public class Login extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("login_done");
		/*request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		String uid = (String) session.getAttribute("uid");
		String pwd = (String) session.getAttribute("pwd");
		String username = (String) session.getAttribute("username");
		Map<String, String[]> map = request.getParameterMap();
		ValidateUser user = new ValidateUser();
		
		PrintWriter writer = response.getWriter();
		try {
			BeanUtils.populate(user, map);
			String vuid = user.getUid();
			String vpwd = user.getPwd();
			if(uid.equals(vuid)&&pwd.equals(vpwd)){
				System.out.println("登入成功");
				session.setAttribute("username", username);
				response.sendRedirect("/userManager/home");
			}else{
				System.out.println("登入失败");
				response.sendRedirect("/userManager/pages/login.html");
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}*/
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request,response);
	}
}
