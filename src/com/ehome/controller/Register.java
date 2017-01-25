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

import org.apache.commons.beanutils.BeanUtils;

import com.ehome.service.IUserService;
import com.ehome.service.impl.UserServiceImpl;
import com.ehome.web.formbean.User;


public class Register extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setCharacterEncoding("UTF-8");
		 IUserService ius = new UserServiceImpl();
		 PrintWriter w= response.getWriter();
		 Map<String, String[]> map = request.getParameterMap();
		 User user = new User();
		 try {
			BeanUtils.populate(user, map);
			String getId = ius.register(user);
			w.print(getId);
			
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		/*Map<String, String[]> map = request.getParameterMap();
		 User user = new User();
		 try {
			BeanUtils.populate(user, map);
			System.out.println(user);
			request.setCharacterEncoding("UTF-8");
			IUserService ius = new UserServiceImpl();
			//得到注册表单对象
			User g = WEBUtils.RequestToBean(request,User.class);
			
			boolean isValidate = g.validate();
			if(isValidate==false){
				request.setAttribute("success_register", "注册失败");
				request.setAttribute("errors", g.getErrors());
				//request.getRequestDispatcher("/WEB-INF/jsp/register.jsp").forward(request, response);
			}else{
				//验证成功，连接下一步操作
				try {
					String getId = ius.register(g);
					if(getId!=null){
						request.setAttribute("success_register", "注册成功，您的ID是："+getId);
						//request.getRequestDispatcher("/WEB-INF/jsp/register.jsp").forward(request, response);
					}
					
				} catch (NoSuchAlgorithmException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}*/
		/*request.setCharacterEncoding("UTF-8");
		IUserService ius = new UserServiceImpl();
		//得到注册表单对象
		User g = WEBUtils.RequestToBean(request,User.class);
		
		boolean isValidate = g.validate();*/
		//方案二：利用ajax返回验证信息
		
		//方案一：利用转发返回验证信息
		/*//验证失败，重新回到注册页面
		if(isValidate==false){
			request.setAttribute("success_register", "注册失败");
			request.setAttribute("errors", g.getErrors());
			request.getRequestDispatcher("/WEB-INF/jsp/register.jsp").forward(request, response);
		}else{
			//验证成功，连接下一步操作
			try {
				String getId = ius.register(g);
				if(getId!=null){
					request.setAttribute("success_register", "注册成功，您的ID是："+getId);
					request.getRequestDispatcher("/WEB-INF/jsp/register.jsp").forward(request, response);
				}
				
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}*/
			
	}
	

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request,response);
	}

}
