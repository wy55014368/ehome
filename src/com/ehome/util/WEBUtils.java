package com.ehome.util;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

public class WEBUtils {

	public static <T> T RequestToBean(HttpServletRequest request,Class<T> className){
		T bean;
		try {
			bean = className.newInstance();
			Enumeration<String> names = request.getParameterNames();
			while(names.hasMoreElements()){
				String name = names.nextElement();
				String value = request.getParameter(name);
				BeanUtils.setProperty(bean, name, value);
			}
			return bean;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}
}
