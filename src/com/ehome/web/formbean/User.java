package com.ehome.web.formbean;

import java.util.HashMap;
import java.util.Map;

import com.ehome.controller.CreateCode;

public class User {

	private String username;
	private String pwd;
	private String rpwd;
	private String phoneNumber;
	private String validateCode;
	private String headshot;

	Map<String, String> errors = new HashMap<String, String>();

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getRpwd() {
		return rpwd;
	}

	public void setRpwd(String rpwd) {
		this.rpwd = rpwd;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getValidateCode() {
		return validateCode;
	}

	public void setValidateCode(String validateCode) {
		this.validateCode = validateCode;
	}

	public String getHeadshot() {
		return headshot;
	}

	public void setHeadshot(String headshot) {
		this.headshot = headshot;
	}

	public Map<String, String> getErrors() {
		return errors;
	}

	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}

	public boolean validate() {
		boolean isValidate = true;

		// 用户名输入验证
		if (username == null || username.equals("")) {
			isValidate = false;
			errors.put("username", "用户名不能为空");
		} else {
			if (!username.matches("^[\u4e00-\u9fa5]+$")) {
				isValidate = false;
				errors.put("username", "用户名只能是中文");
			} else {
				errors.put("username", "用户名合法");
			}
		}

		// 密码输入验证
		if (pwd == null || pwd.equals("")) {
			isValidate = false;
			errors.put("pwd", "密码不能为空");
		} else {
			if (!pwd.matches("^[\\da-zA-Z]*$")) {
				isValidate = false;
				errors.put("pwd", "密码只能是字母或数字");
			} else {
				if (pwd.length() < 6 || pwd.length() > 12) {
					isValidate = false;
					errors.put("pwd", "密码必须在6-12字符之间");
				} else {
					errors.put("pwd", "密码合法");
				}
			}
		}

		// 确认密码输入验证
		if (rpwd == null || rpwd.equals("")) {
			isValidate = false;
			errors.put("rpwd", "确认密码不能为空");
		} else {
			if (!rpwd.matches("^[\\da-zA-Z]*$")) {
				isValidate = false;
				errors.put("rpwd", "确认密码只能是字母或数字");
			} else {
				if (rpwd.length() < 6 || rpwd.length() > 12) {
					isValidate = false;
					errors.put("rpwd", "确认密码必须在6-12字符之间");
				} else {
					if(!pwd.equalsIgnoreCase(rpwd)){
						isValidate = false;
						errors.put("rpwd", "输入密码和确认密码不相同");
						errors.put("pwd", "输入密码和确认密码不相同");
					}else {
						errors.put("rpwd", "确认密码合法");
						errors.put("pwd", "密码合法");
					}
				}
			}
		}

		// 手机号码输入验证
		if (phoneNumber == null || phoneNumber.equals("")) {
			isValidate = false;
			errors.put("phoneNumber", "手机号码不能为空");
		} else {
			if (!phoneNumber.matches("^[\\d]*$")) {
				isValidate = false;
				errors.put("phoneNumber", "手机号码只能是数值");
			} else {
				if (phoneNumber.length() != 11) {
					isValidate = false;
					errors.put("phoneNumber", "手机号码必须在11个字符");
				} else {
					errors.put("phoneNumber", "手机号码合法");
				}
				
			}
		}
		
		//验证码验证
		if(!validateCode.equalsIgnoreCase(CreateCode.getCode())){
			isValidate = false;
			errors.put("validateCode", "验证码输入错误");
		}else {
			errors.put("validateCode", "验证码输入正确");
		}
		//头像上传验证
		if(!(headshot.contains(".jpg")||headshot.contains(".gif")||headshot.contains(".png"))){
			isValidate = false;
			errors.put("headshot", "头像后缀名必须是.jpg/.gif/.png");
		}else {
			errors.put("headshot", "头像上传合法");
		}

		return isValidate;

	}

	@Override
	public String toString() {
		return "User [username=" + username + ", pwd=" + pwd + ", phoneNumber=" + phoneNumber
				+ ", headshot=" + headshot +"]";
	}
	
	
}
