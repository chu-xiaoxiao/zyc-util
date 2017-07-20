package com.zyc.md5;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

public class MD5 {
	public static void main(String[] args) {
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			BASE64Encoder base64Encoder = new BASE64Encoder();
			String newstr = base64Encoder.encode(messageDigest.digest("Zhangyuchen1016".getBytes("UTF-8")));
			System.out.println(check("Zhangyuchen1016", encodeByMd5("Zhangyuchen1015")));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	public static boolean check(String newstring,String oldstring) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		if(encodeByMd5(newstring).equals(oldstring)){
			return true;
		}else{
			return false;
		}
	}
	public static String encodeByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		MessageDigest messageDigest = MessageDigest.getInstance("MD5");
		BASE64Encoder base64Encoder =new BASE64Encoder();
		String newstring = base64Encoder.encode(messageDigest.digest(str.getBytes("UTF-8")));
		return newstring;
	}
}
