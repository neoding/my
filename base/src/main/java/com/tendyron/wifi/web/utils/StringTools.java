package com.tendyron.wifi.web.utils;

import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

/**
 * 
 * @author Dzb
 *
 */
public class StringTools extends StringUtils implements Serializable {


	private static final long serialVersionUID = 1892564414702536794L;

	/**
	 * 获取不带“-”的32位UUID
	 * 
	 * @return
	 */
	public static String randomUUID() {
		return UUID.randomUUID().toString().replace("-", "").toUpperCase();
	}

	/**
	 * 获取md5加密
	 * 
	 * @param str
	 * @return
	 */
	public static String Md5(String str) {
		return EncryptionTools.encryptByMD5(str).toUpperCase();
	}

	/**
	 * 正则校验
	 * 
	 * @param value
	 * @param regex
	 * @return
	 */
	public static boolean valRegex(String value, String regex) {
		if (value == null) {
			return false;
		}
		return value.matches(regex);
	}

	public static String toISO(String sIn) {
		if (sIn == null || sIn.equals(""))
			return sIn;
		try {
			return new String(sIn.getBytes(), "ISO-8859-1");
		} catch (UnsupportedEncodingException usex) {
			return sIn;
		}
	}

}
