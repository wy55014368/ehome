package com.ehome.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DBpropertiesReader {

	private static Properties properties = null;
	
	static{
		properties = new Properties();
		InputStream input = DBpropertiesReader.class.getClassLoader().getResourceAsStream("db.properties");
		try {
			properties.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String get(String key){
		return properties.getProperty(key);
	}
}
