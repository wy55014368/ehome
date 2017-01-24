package com.ehome.web.formbean;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.ehome.controller.CreateCode;
import com.ehome.service.IUserService;
import com.ehome.service.impl.UserServiceImpl;

public class Login_User {
	private String uname;
	private String uid;
	private String pwd;
	private String validateCode;
	private Map<String, String> errors = new HashMap<String, String>();

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getValidateCode() {
		return validateCode;
	}

	public void setValidateCode(String validateCode) {
		this.validateCode = validateCode;
	}

	public Map<String, String> getErrors() {
		return errors;
	}

	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}

	public Login_User(String uid, String pwd) {
		super();
		this.uid = uid;
		this.pwd = pwd;
	}

	public Login_User() {

	}
	public String getName() throws ClassNotFoundException, NoSuchAlgorithmException, UnsupportedEncodingException, SQLException{
		IUserService ius = new UserServiceImpl();
		Login_User login_user = ius.login(new Login_User(uid,pwd));
		if(login_user!=null){
			String uname = login_user.getUname();
			return uname;
		}else{
			return null;
		}
			
		
	}

	public boolean validate() throws ClassNotFoundException, NoSuchAlgorithmException, UnsupportedEncodingException, SQLException {
		String name = getName();
		boolean isValidate = true;
		if (name == null) {
			isValidate = false;
			errors.put("uid", "用户ID或密码输入错误");
			errors.put("pwd", "用户ID或密码输入错误");
		} else {
			errors.put("uid", "用户ID或密码输入正确");
			errors.put("pwd", "用户ID或密码输入正确");
		}

		// 验证码验证
		if (validateCode == null || validateCode.equals("")) {
			isValidate = false;
			errors.put("validateCode", "验证码不能为空");
		} else {
			if (!validateCode.equalsIgnoreCase(CreateCode.getCode())) {
				isValidate = false;
				errors.put("validateCode", "验证码输入错误");
			} else {
				errors.put("validateCode", "验证码输入正确");
			}
		}
		

		return isValidate;
	}

}
