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
import com.ehome.web.formbean.Login_User;

public class Login extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		/*response.setCharacterEncoding("UTF-8");*/
		Map<String, String[]> map = request.getParameterMap();
		Login_User login_user = new Login_User();
		IUserService ius = new UserServiceImpl();
		PrintWriter pw = response.getWriter();
		try {
			BeanUtils.populate(login_user, map);
			Login_User return_user = ius.login(login_user);
			//下一步可以得到    用户名/用户ID/用户手机号
			if(return_user!=null){
				//pw.print(return_user.getUname());
				pw.print(return_user.getUid());
			}else{
				pw.print(return_user);
			}
				
			
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		/*request.setCharacterEncoding("UTF-8");
		//得到登录表单对象
		Login_User g = WEBUtils.RequestToBean(request,Login_User.class);
			try {
				String uname = g.getName();
				boolean validate = g.validate();
				if(!validate){
					request.setAttribute("success_login", "登录失败");
					request.setAttribute("errors", g.getErrors());
					request.getRequestDispatcher("/WEB-INF/jsp/login_user.jsp").forward(request, response);
				}else{
					request.setAttribute("success_login", "登录成功,"+uname+"您好!");
					request.setAttribute("errors", g.getErrors());
					request.getRequestDispatcher("/WEB-INF/jsp/login_user.jsp").forward(request, response);
					response.setContentType("text/html");
					response.setHeader("refresh", "1;/ehome/page/yonghuyundan.html");
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
	


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request,response);
	}
}
