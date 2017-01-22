package com.ehome.common;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;


public class MD5Create {

	public static String getMd5(String content)
			throws NoSuchAlgorithmException, UnsupportedEncodingException {
		
		// 用于加密的MessageDigest类型对象
		//并抛出异常：NoSuchAlgorithmException
		MessageDigest md5 = MessageDigest.getInstance("md5");
		// 转换为字节数组
		//并抛出异常：UnsupportedEncodingException
		byte[] before = content.getBytes("utf8");
		// 加密过程
		md5.update(before);
		// 生成加密后的字节数组
		byte[] after = md5.digest();

		// 把加密后的字节数组转换为字符串的操作
		// 十六进制转换适配器
		HexBinaryAdapter adapter = new HexBinaryAdapter();
		// 转换方法marshal,生成对应的字符串
		String md5String = adapter.marshal(after);
		return md5String; // abc123 -> E99A18C428CB38D5F260853678922E03
	}
}
