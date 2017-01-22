package com.ehome.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import com.ehome.entity.User;
import com.ehome.service.IUserService;
import com.ehome.service.impl.UserServiceImpl;


public class Register extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("register_done");
		/*request.setCharacterEncoding("UTF-8");
		Goods g = WEBUtils.RequestToBean(request,Goods.class);
		
		boolean isValidate = g.validate();
		
		request.setAttribute("errors", g.getErrors());
		request.getRequestDispatcher("/WEB-INF/jsp/goods.jsp").forward(request, response);*/
		/*request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		Map<String, String[]> map = request.getParameterMap();
		
		User user = new User();
		PrintWriter out = response.getWriter();
		try {
			BeanUtils.populate(user, map);
			//System.out.println(user);
			String[] pwds = user.getPwd();
			String username = user.getUsername();
			System.out.println(username);
			System.out.println(pwds[0]);
			System.out.println(pwds[1]);
			
			if(username.equals("")){
				System.out.println("用户名不能为空");
				response.sendRedirect("/userManager/pages/register.html");
			}else{
				if(pwds[0].equals("")||(!pwds[0].equals(pwds[1]))){
					System.out.println("两次密码输入不一致或密码不能为空");
					response.sendRedirect("/userManager/pages/register.html");
				}else{
					
					System.out.println("注册成功");
					//将user对象保存到数据库中
					IUserService us = new UserServiceImpl();
					try {
						String uid= us.register(user);
						out.println("您好,您的编号是"+uid);
						out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
						out.println("<HTML>");
						out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
						out.println("  <BODY>");
						out.print("<a href='/userManager/pages/login.html'>现在去登录</a>");	
						out.println("  </BODY>");
						out.println("</HTML>");
						//注册成功后跳转到登入页面
						HttpSession session = request.getSession();
						session.setAttribute("uid", uid);
						session.setAttribute("pwd", pwds[0]);
						session.setAttribute("username", username);
					} catch (NoSuchAlgorithmException e) {
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					
				}
			}
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*try {
			DiskFileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload=new ServletFileUpload(factory);
			upload.setHeaderEncoding("UTF-8");
			Map<String, List<FileItem>> map = upload.parseParameterMap(request);
			//封装javabean
			User user = new User();
			BeanUtils.populate(user, map);
			System.out.println(user.getUsername());
		} catch (FileUploadException e1) {
			e1.printStackTrace();
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
